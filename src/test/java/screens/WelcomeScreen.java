package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import util.screens.BaseScreen;

import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;

public class WelcomeScreen extends BaseScreen {

    public WelcomeScreen(AndroidDriver<AndroidElement>driver) {
        super(driver);
    }

    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(id = "com.trivago:id/activityPlatformSelectionConfirmButton")
    private AndroidElement confirmLanguageButton;

    public OnboardingPrivacyPolicyScreen chooseLanguageVariantBasedOnCountry(String country){
        scrollToText(country);
        log.info("has been chosen as language.");
        String automator = "new UiSelector().textContains(\"%s\")";
        AndroidElement selectedCountry = driver.findElementByAndroidUIAutomator(String.format(automator, country));
        click(selectedCountry);
        click(confirmLanguageButton);
        return new OnboardingPrivacyPolicyScreen(driver);
    }

}


