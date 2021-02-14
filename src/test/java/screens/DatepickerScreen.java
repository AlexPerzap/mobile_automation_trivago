package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

public class DatepickerScreen extends BaseScreen {

    public DatepickerScreen (AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Seleccionar fechas\")")
    private AndroidElement dateSelection;
    @AndroidFindBy(id = "com.trivago:id/activityDatesSelectionCalendarApplyTextView")
    private AndroidElement confirmarFechas_Button;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"noviembre\")")
    private AndroidElement noviembre;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout[2]")
    private AndroidElement startDate;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout[6]")
    private AndroidElement endDate;

    public void selectADateRange(){
        log.info("It selects the given date range");
        //scrollToText("nov");
        //scroll("noviembre", 10);

        scrollDown(5);
        click(startDate);
        click(endDate);
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
}
