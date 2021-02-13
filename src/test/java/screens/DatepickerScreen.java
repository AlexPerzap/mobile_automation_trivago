package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

public class DatepickerScreen extends BaseScreen {

    public DatepickerScreen (AndroidDriver<AndroidElement> driver) {
        super(driver);
        //alertControl();
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Seleccionar fechas\")")
    private AndroidElement dateSelection;
    @AndroidFindBy(id = "com.trivago:id/activityDatesSelectionCalendarApplyTextView")
    private AndroidElement confirmarFechas_Button;

    //@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"noviembre\")")
    //private AndroidElement noviembre;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout[2]")
    private AndroidElement date1;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout[6]")
    private AndroidElement date2;

    public void selectADateRange(){
        log.info("It selects the given date range");
        scrollDown(6);
        click(date1);
        click(date2);
        //click(confirmarFechas_Button);
        //log.info("It validates the 'Confirmar fechas' button is enabled");
    }

    public SearchScreen confirmDateRangeSelected(){
        log.info("It clicks on 'confirmar fechas' button.");
        click(confirmarFechas_Button);
        return new SearchScreen(driver);
    }



    public AndroidElement getDateSelection() {
        return dateSelection;
    }

    public AndroidElement getConfirmarFechas_Button() {
        return confirmarFechas_Button;
    }

    @Override
    public void alertControl(){}
}
