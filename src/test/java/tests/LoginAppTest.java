package tests;

import org.springframework.context.annotation.Description;
import org.testng.annotations.Test;

import screens.LoginScreen;
import screens.WelcomeScreen;
import util.tests.BaseMobileTest;

public class LoginAppTest extends BaseMobileTest {

//	/**
//	 * Verify something.
//	 */
	@Description(value = "test of something ID:0001")
	@Test()
	public void DataPrivacyPolicyContentTest() {
		log.info("testOfSomething");
		WelcomeScreen welcomeScreen = loadOnboardingScreen();

		log.info("funciona");
	}

	

}