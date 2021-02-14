package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

public class SettingsScreen extends BaseScreen {

    public SettingsScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.trivago:id/fragmentSettingsConstraintLayout")
    private AndroidElement configurationLayout;
    @AndroidFindBy(id = "com.trivago:id/fragmentSettingsManageMyDataTextView")
    private AndroidElement manageDataPrivacyOption;

    public boolean isManageDataPrivacyOptionDisplayed(){
        if(isElementAvailable(manageDataPrivacyOption)){
            return true;
        }else{
            return false;
        }
    }

    public DataPrivacyManagementScreen goToDataPrivacySettingsScreen() {
        scrollToText("Configurar privacidad de datos");
        click(manageDataPrivacyOption);
        log.info("It goes to Data Privacy Management screen.");
        return new DataPrivacyManagementScreen(driver);
    }

}
