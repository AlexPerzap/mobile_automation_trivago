package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import screens.DatepickerScreen;
import screens.LandingScreen;
import util.tests.BaseMobileTest;
import util.tests.DataProvider;

public class HotelSearchTests extends BaseMobileTest {

   /* @BeforeMethod
    public LandingScreen initialProfileSetup(){

        return landingScreen;
    }*/

    @Test(dataProvider = "getDataForHotelSearchTest", dataProviderClass = DataProvider.class)
    public void HotelSearchFunctionalityTest(String city, String dateRange){
        LandingScreen landingScreen = initialProfileSetup();
        landingScreen.getSearchInput().click();
        landingScreen.sendKeys(landingScreen.getEditableSearchInput(), city);
        DatepickerScreen datepickerScreen = landingScreen.goToChooseADateRage();
        Assert.assertEquals(datepickerScreen.getDateSelection().getText(), "Seleccionar fechas", "The 'Seleccionar fechas' view is not displayed");
        log.info("It validates if the 'Confirmar fechas' button is unabled");
        Assert.assertTrue(datepickerScreen.getConfirmarFechasButton().isEnabled(),"The 'Confirmar fechas' button is enabled");
        datepickerScreen.chooseADateRange();
        //landingScreen.getSearchButton().click();
    }
}
