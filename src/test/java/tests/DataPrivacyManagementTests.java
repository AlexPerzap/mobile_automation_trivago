package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import screens.DataPrivacyManagementScreen;
import screens.SearchScreen;
import screens.SettingsScreen;
import util.tests.BaseMobileTest;
import util.tests.DataProvider;

public class DataPrivacyManagementTests extends BaseMobileTest {

    @Test(dataProvider = "getPrivacyManagementExpectedText_Spanish", dataProviderClass = DataProvider.class)
    public void DataPrivacyManagementTest(String expectedOpeningText, String expectedMoreInfoText, String languageVariant){
        log.info("DataPrivacyManagementTest begins.");
        log.info("It sets up a initial profile.");
        SearchScreen initialLandingView = initialOnboarding(languageVariant);
        SettingsScreen settingsScreen = initialLandingView.goToSettings();
        Assert.assertTrue(settingsScreen.isManageDataPrivacyOptionDisplayed(), "The Settings view is not displayed.");
        log.info("It has validated the Settings view is displayed.");
        DataPrivacyManagementScreen dataPrivacyManagementScreen = settingsScreen.goToDataPrivacySettingsScreen();
        Assert.assertTrue(dataPrivacyManagementScreen.isPrivacyManagementDisplayed(), "The Privacy Management view is not displayed.");
        log.info("It has validated the Privacy Management view is displayed.");
        Assert.assertEquals(dataPrivacyManagementScreen.getOpeningText(), expectedOpeningText, "The expected opening text is not displayed");
        log.info("It has validated the expected opening text is displayed.");
        Assert.assertEquals(dataPrivacyManagementScreen.getMoreInfoText(), expectedMoreInfoText, "The expected 'more info' text is not displayed");
        log.info("It has validated the expected 'more info' text is displayed.");
        SettingsScreen backToSettingsScreen = dataPrivacyManagementScreen.save();
        Assert.assertTrue(backToSettingsScreen.isManageDataPrivacyOptionDisplayed(), "The Settings view is not displayed.");
        log.info("It has validated the Settings view is displayed again after clicking the Privacy Management save button.");
        log.info("DataPrivacyManagementTest has finished.");
    }
}
