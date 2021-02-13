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
    private AndroidElement confirmarFechasButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"noviembre\")")
    private AndroidElement noviembre;

    public void chooseADateRange(){
        //scrollToText("noviembre");
        scrollDown(6);
    }



    public AndroidElement getDateSelection() {
        return dateSelection;
    }

    public AndroidElement getConfirmarFechasButton() {
        return confirmarFechasButton;
    }

    @Override
    public void alertControl(){}
}
