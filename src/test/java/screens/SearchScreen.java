package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

public class SearchScreen extends BaseScreen {

    public SearchScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.trivago:id/fragmentHomeExpandedDealformDestinationTextView")
    private AndroidElement searchInput;
    @AndroidFindBy(id = "com.trivago:id/activitySearchDestinationSearchEditText")
    private AndroidElement editableSearchInput;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Cartagena\").resourceIdMatches(\".*searchDestinationTitleTextView\")")
    private AndroidElement cartagenaOption;
    @AndroidFindBy(id = "com.trivago:id/fragmentHomeExpandedDealformSearchTextView")
    private AndroidElement searchButton;
    @AndroidFindBy(id = "com.trivago:id/fragmentHotelSearchResultsExpandedDealformDestinationTextView")
    private AndroidElement searchResultsInput;
    @AndroidFindBy(id = "com.trivago:id/fragmentHotelSearchResultsExpandedDealformCalendarTextView")
    private AndroidElement selectedDateRange;
    @AndroidFindBy(id = "com.trivago:id/action_home")
    private AndroidElement homeButton;
    @AndroidFindBy(id = "com.trivago:id/action_discover")
    private AndroidElement discoverButton;
    @AndroidFindBy(id = "com.trivago:id/action_favourites")
    private AndroidElement favoritesButton;
    @AndroidFindBy(id = "com.trivago:id/action_settings")
    private AndroidElement settingsButton;

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

    public AndroidElement getSelectedDateRange() {
        return selectedDateRange;
    }

    public AndroidElement getSearchResultsInput() {
        return searchResultsInput;
    }

    public boolean areAllFourBottomButtonsDisplayed(){
        if(
        isElementAvailable(homeButton) &
        isElementAvailable(discoverButton) &
        isElementAvailable(favoritesButton) &
        isElementAvailable(settingsButton)
        ){
            return true;
        }else{
            return false;
        }
    }

    public SettingsScreen goToSettings(){
        click(settingsButton);
        log.info("It goes to Settings screen.");
        return new SettingsScreen(driver);
    }

}
