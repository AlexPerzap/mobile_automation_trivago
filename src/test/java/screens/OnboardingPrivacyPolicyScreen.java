package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

public class OnboardingPrivacyPolicyScreen extends BaseScreen {

    public OnboardingPrivacyPolicyScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.trivago:id/activityCookieConsentContentTitleTextView")
    private AndroidElement privacyPoliciesTitle;
    @AndroidFindBy(id = "com.trivago:id/activityCookieConsentContentBody1TextView")
    private AndroidElement paragraph1;
    @AndroidFindBy(id = "com.trivago:id/activityCookieConsentContentBody2TextView")
    private AndroidElement paragraph2;
    @AndroidFindBy(id = "com.trivago:id/activityCookieConsentContentBody3TextView")
    private AndroidElement paragraph3;
    @AndroidFindBy(id = "com.trivago:id/activityCookieConsentContentAcceptButton")
    private AndroidElement acceptDataPrivacyPoliciesButton;

    public String getPageTitle() {
        log.info("It validates the Data Privacy Policy title text");
        return privacyPoliciesTitle.getText();
    }

    public String getParagraph1() {
        log.info("It validates the Data Privacy Policy paragraph 1 content");
        return paragraph1.getText();
    }

    public String getParagraph2() {
        log.info("It validates the Data Privacy Policy paragraph 2 content");
        return paragraph2.getText();
    }

    public String getParagraph3() {
        log.info("It validates the Data Privacy Policy paragraph 3 content");
        return paragraph3.getText();
    }

    public SearchScreen acceptDataPrivacyPolicies() {
        log.info("It accepts the privacy policies and it goes to the landing search screen.");
        click(acceptDataPrivacyPoliciesButton);
        return new SearchScreen(driver);
    }

}
