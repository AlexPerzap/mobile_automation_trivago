package tests;

import org.springframework.context.annotation.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.DataPrivacyPolicyScreen;
import screens.SearchScreen;
import screens.WelcomeScreen;
import util.tests.BaseMobileTest;
import util.tests.DataProvider;

public class DataPrivacyPolicyTests extends BaseMobileTest {

	@Description(value = "test of something ID:0001")
	@Test(dataProvider = "getPrivacyPolicyExpectedText", dataProviderClass = DataProvider.class)
	public void DataPrivacyPolicyContentTest(String title, String paragraph1, String paragraph2, String paragraph3) {
		log.info("DataPrivacyPolicyContentTest begins");
		WelcomeScreen welcomeScreen = loadOnboardingScreen();
		DataPrivacyPolicyScreen dataPrivacyPolicyScreen = welcomeScreen.chooseLanguage();
		Assert.assertEquals(dataPrivacyPolicyScreen.getPageTitle(), title, "Title different from expected");
		Assert.assertEquals(dataPrivacyPolicyScreen.getParagraph1(), paragraph1, "Paragraph 1 different from expected");
		Assert.assertEquals(dataPrivacyPolicyScreen.getParagraph2(), paragraph2, "Paragraph 2 different from expected");
		Assert.assertEquals(dataPrivacyPolicyScreen.getParagraph3(), paragraph3, "Paragraph 3 different from expected");
		SearchScreen searchScreen = dataPrivacyPolicyScreen.acceptDataPrivacyPolicies();
		Assert.assertEquals(searchScreen.isElementAvailable(searchScreen.getSearchButton()),true,"The was not directed to landing view");
		log.info("DataPrivacyPolicyContentTest finished");

	}

	

}