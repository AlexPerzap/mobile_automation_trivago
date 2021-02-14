package util.tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import screens.SearchScreen;
import screens.WelcomeScreen;
import util.ConfigCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


/**
 * Base class for Test classes.
 * 
 * @author helberth.bolivar
 *
 */
public abstract class BaseMobileTest {

	protected WelcomeScreen welcomeScreen;
	public static AndroidDriver<AndroidElement> driver;
	public Logger log = Logger.getLogger(BaseMobileTest.class);

	public void setUpStartApp() {
		log.info("It launches the initial 'Welcome' screen");
		welcomeScreen = new WelcomeScreen(getDriver());
	}

	/**
	 * SetUp before to run suite of test.
	 * 
	 * @author Arley.Bolivar
	 * 
	 */
	@BeforeMethod(alwaysRun = true)
	public void environmentSetUp() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		ConfigCapabilities.deviceSetUp(capabilities);
		ConfigCapabilities.applicationSetUp(capabilities);
		try {
			driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		} catch (MalformedURLException exception) {
			exception.printStackTrace();
		}
		setUpStartApp();
	}

	/**
	 * Close the application after completing the test.
	 * 
	 * @author Arley.Bolivar
	 * 
	 */
	@AfterMethod(alwaysRun = true)
	public void mobileApplicationEnd() {
		//getDriver().removeApp("com.trivago");
		driver.quit();
	}

	/**
	 * return the driver.
	 * 
	 * @author Arley.Bolivar
	 * 
	 * @return driver
	 */
	public AndroidDriver<AndroidElement> getDriver() {
		return driver;
	}

	/**
	 * return SignUpOrLogInScreen after close the alerts.
	 * 
	 * @author Arley.Bolivar
	 * 
	 * @return SignUpOrLogInScreen
	 */


	protected SearchScreen initialOnboarding(String country) {
		return welcomeScreen.chooseLanguageVariantBasedOnCountry(country).acceptDataPrivacyPolicies();
	}

	protected WelcomeScreen loadOnboardingScreen() {
		return welcomeScreen;
	}

}
