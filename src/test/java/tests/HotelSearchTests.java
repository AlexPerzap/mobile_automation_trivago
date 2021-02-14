package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import screens.DatepickerScreen;
import screens.SearchScreen;
import util.tests.BaseMobileTest;

public class HotelSearchTests extends BaseMobileTest {

    @Test//(dataProvider = "getDataForHotelSearchTest", dataProviderClass = DataProvider.class)
    @Parameters({"languageVariant", "destination", "dateRange"})
    public void HotelSearchFunctionalityTest(String languageVariant, String destination, String dateRange){
        log.info("HotelSearchFunctionalityTest begins.");
        log.info("It sets up a initial profile.");
        SearchScreen initialLandingView = initialOnboarding(languageVariant);
        initialLandingView.getSearchInput().click();
        initialLandingView.sendKeys(initialLandingView.getEditableSearchInput(), destination);
        DatepickerScreen datepickerScreen = initialLandingView.goToChooseADateRage();
        Assert.assertEquals(datepickerScreen.getDateSelection().getText(), "Seleccionar fechas", "The 'Seleccionar fechas' view is not displayed.");
        log.info("It has validated the 'Seleccionar fechas' view is displayed.");
        Assert.assertTrue(datepickerScreen.getConfirmarFechas_Button().isEnabled(),"The 'Confirmar fechas' button is disabled.");
        log.info("It has validated the 'Confirmar fechas' button is enabled.");
        datepickerScreen.selectADateRange();
        Assert.assertTrue(datepickerScreen.getConfirmarFechas_Button().isEnabled(),"The 'Confirmar fechas' button is disabled.");
        log.info("It has validated the 'Confirmar fechas' button is enabled after selecting a date range different from the default one.");
        SearchScreen searchResultsView = datepickerScreen.confirmDateRangeSelected();
        Assert.assertEquals(searchResultsView.getSearchResultsInput().getText(), destination, "The search input text does not contain " + destination + ".");
        log.info("It has validated the search input text matches the selected destination.");
        Assert.assertEquals(searchResultsView.getSelectedDateRange().getText(), dateRange, "The search input text does not contain " + destination + ".");
        log.info("It has validated the date range matches the one selected.");
        log.info("HotelSearchFunctionalityTest has finished.");
    }
}
