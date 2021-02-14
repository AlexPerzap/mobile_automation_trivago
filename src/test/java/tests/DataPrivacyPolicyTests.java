package tests;

import org.testng.Assert;
import org.testng.annotations.*;
import screens.OnboardingPrivacyPolicyScreen;
import screens.SearchScreen;
import util.tests.BaseMobileTest;
import util.tests.DataProvider;

public class DataPrivacyPolicyTests extends BaseMobileTest {

	@Test(dataProvider = "getPrivacyPolicyExpectedText_Spanish", dataProviderClass = DataProvider.class)
	public void DataPrivacyPolicyContentTest(String title, String paragraph1, String paragraph2, String paragraph3, String languageVariant) {
		log.info("DataPrivacyPolicyContentTest begins");
		log.info(languageVariant);
		OnboardingPrivacyPolicyScreen onboardingPrivacyPolicyScreen = welcomeScreen.chooseLanguageVariantBasedOnCountry(languageVariant);
		Assert.assertEquals(onboardingPrivacyPolicyScreen.getPageTitle(), title, "Title different from expected");
		Assert.assertEquals(onboardingPrivacyPolicyScreen.getParagraph1(), paragraph1, "Paragraph 1 different from expected");
		Assert.assertEquals(onboardingPrivacyPolicyScreen.getParagraph2(), paragraph2, "Paragraph 2 different from expected");
		Assert.assertEquals(onboardingPrivacyPolicyScreen.getParagraph3(), paragraph3, "Paragraph 3 different from expected");
		SearchScreen initialLandingView = onboardingPrivacyPolicyScreen.acceptDataPrivacyPolicies();
		Assert.assertEquals(initialLandingView.isElementAvailable(initialLandingView.getSearchButton()),true,"The was not directed to landing view");
		log.info("DataPrivacyPolicyContentTest finished");

	}




	

}