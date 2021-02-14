package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

public class DataPrivacyManagementScreen extends BaseScreen {

    public DataPrivacyManagementScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Configurar privacidad de datos\")")
    private AndroidElement privacyManagementTitle;
    @AndroidFindBy(id = "com.trivago:id/activityDataManagerTitleTextView")
    private AndroidElement openingText;
    @AndroidFindBy(id = "com.trivago:id/activityDataManagerAppsFlyerTextView")
    private AndroidElement appsFlyerText;
    @AndroidFindBy(id = "com.trivago:id/activityDataManagerAppsFlyerCheckbox")
    private AndroidElement appsFlyerCheckbox;
    @AndroidFindBy(id = "com.trivago:id/activityDataManagerFirebaseTextView")
    private AndroidElement gtmFirebaseText;
    @AndroidFindBy(id = "com.trivago:id/activityDataManagerFirebaseCheckbox")
    private AndroidElement gtmFirebaseCheckbox;
    @AndroidFindBy(id = "com.trivago:id/activityDataManagerFacebookTextView")
    private AndroidElement facebookText;
    @AndroidFindBy(id = "com.trivago:id/activityDataManagerFacebookCheckbox")
    private AndroidElement facebookCheckbox;
    @AndroidFindBy(id = "com.trivago:id/activityDataManagerLearnMoreTextView")
    private AndroidElement moreInfoText;
    @AndroidFindBy(id = "com.trivago:id/activityDataManagerSaveButton")
    private AndroidElement saveButton;

    public boolean isPrivacyManagementDisplayed(){
        if(isElementAvailable(privacyManagementTitle) &
        isElementAvailable(openingText) &
        isElementAvailable(appsFlyerCheckbox) & isElementAvailable(appsFlyerText) &
        isElementAvailable(gtmFirebaseCheckbox) & isElementAvailable(gtmFirebaseText) &
        isElementAvailable(facebookCheckbox) & isElementAvailable(facebookText) &
        isElementAvailable(moreInfoText) &
        isElementAvailable(saveButton)
        ){
            return true;
        }else{
            return false;
        }
    }

    public String getOpeningText() {
        return openingText.getText();
    }

    public String getMoreInfoText() {
        return moreInfoText.getText();
    }

    public SettingsScreen save() {
        click(saveButton);
        log.info("It goes to Settings screen.");
        return new SettingsScreen(driver);
    }

}
