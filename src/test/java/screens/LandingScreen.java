package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

public class LandingScreen extends BaseScreen {

    public LandingScreen (AndroidDriver<AndroidElement> driver) {
        super(driver);
        //alertControl();
    }


    @AndroidFindBy(id = "com.trivago:id/fragmentHomeExpandedDealformDestinationTextView")
    private AndroidElement searchInput;
    @AndroidFindBy(id = "com.trivago:id/activitySearchDestinationSearchEditText")
    private AndroidElement editableSearchInput;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Cartagena\").resourceIdMatches(\".*searchDestinationTitleTextView\")")
    private AndroidElement cartagenaOption;

    @AndroidFindBy(id = "com.trivago:id/fragmentHomeExpandedDealformSearchTextView")
    private AndroidElement searchButton;

    public AndroidElement getSearchInput() {
        return searchInput;
    }

    public AndroidElement getEditableSearchInput() {
        return editableSearchInput;
    }

    public DatepickerScreen goToChooseADateRage() {
        cartagenaOption.click();
        return new DatepickerScreen(driver);
    }

    public AndroidElement getSearchButton() {
        return searchButton;
    }





    @Override
    public void alertControl() {}
}
