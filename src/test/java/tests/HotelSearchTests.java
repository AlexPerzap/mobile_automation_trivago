package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import screens.DatepickerScreen;
import screens.SearchScreen;
import util.tests.BaseMobileTest;
import util.tests.DataProvider;

public class HotelSearchTests extends BaseMobileTest {

   /* @BeforeMethod
    public LandingScreen initialProfileSetup(){

        return landingScreen;
    }*/

    @Test(dataProvider = "getDataForHotelSearchTest", dataProviderClass = DataProvider.class)
    public void HotelSearchFunctionalityTest(String city, String dateRange){
        log.info("HotelSearchFunctionalityTest begins.");
        log.info("It sets up a initial profile.");
        SearchScreen landingView = initialProfileSetup();

        landingView.getSearchInput().click();
        landingView.sendKeys(landingView.getEditableSearchInput(), city);
        DatepickerScreen datepickerScreen = landingView.goToChooseADateRage();
        Assert.assertEquals(datepickerScreen.getDateSelection().getText(), "Seleccionar fechas", "The 'Seleccionar fechas' view is not displayed.");
        log.info("It has validated the 'Seleccionar fechas' view is displayed.");
        Assert.assertTrue(datepickerScreen.getConfirmarFechas_Button().isEnabled(),"The 'Confirmar fechas' button is disabled.");
        log.info("It has validated the 'Confirmar fechas' button is enabled.");
        datepickerScreen.selectADateRange();

        Assert.assertTrue(datepickerScreen.getConfirmarFechas_Button().isEnabled(),"The 'Confirmar fechas' button is disabled.");
        log.info("It has validated the 'Confirmar fechas' button is enabled after selecting a date range different from the default one.");
        SearchScreen searchResultsView = datepickerScreen.confirmDateRangeSelected();
        Assert.assertEquals(searchResultsView.getSearchResultsInput().getText(), city, "The search input text does not contain " + city + ".");
        log.info("It has validated the search input text matches the selected city.");
        Assert.assertEquals(searchResultsView.getSelectedDateRange().getText(), dateRange, "The search input text does not contain " + city + ".");
        log.info("It has validated the date range matches the one selected.");
        log.info("HotelSearchFunctionalityTest has finished.");
    }
}
