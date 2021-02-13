package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import util.screens.BaseScreen;

import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;

public class WelcomeScreen  extends BaseScreen {

    public WelcomeScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
        //alertControl();
    }

    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Colombia\")")
    private AndroidElement colombianSpanishOption;
    @AndroidFindBy(id = "com.trivago:id/activityPlatformSelectionConfirmButton")
    private AndroidElement confirmLanguageButton;


    /*public DataPrivacyPolicyScreen chooseLanguage(){
        log.info("It chooses as language:");
        scrollToText("Colombia (Español)");
        click(colombianSpanishOption);
        click(confirmLanguageButton);
        return new DataPrivacyPolicyScreen(driver);
    }*/



    @Override
    public void alertControl() {
    }
}




