package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import static io.appium.java_client.pagefactory.LocatorGroupStrategy.*;
import util.screens.BaseScreen;


/**
 * Object of the first screen that appears when we open the application.
 * 
 * @author Arley.Bolivar
 *
 */

public class TutorialScreen extends BaseScreen {

	/**
	 * Constructor method.
	 *
	 * @author Arley.Bolivar
	 * @param driver the driver
	 */
	public TutorialScreen(AndroidDriver<AndroidElement> driver) {
		super(driver);
	}

	@AndroidFindBy(uiAutomator = ".className(\"android.widget.Button\").text(\"OK\")")
	private AndroidElement updatePopUp;


    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageButton\").descriptionContains(\"Close\")",priority = 1)
    private AndroidElement alertsPopUps;
	

	/**
	 * @author Hans.Marquez
	 *
	 * @description: Returns the DashBoard screen after after handling
	 *               popUps.
	 *
	 * @return DashBoardScreen
	 */
	public DashBoardScreen handleAlerts() {
		alertControl();
		return new DashBoardScreen(driver);
	}
	

	/**
	 * Alert control.
	 */
	@Override
	public void alertControl() {
		log.info("Closing pop ups in the Tutorial Page");
		if( isElementAvailable(updatePopUp,5))
			click(updatePopUp);

		click(alertsPopUps);

		log.info("Pop ups closed in the tutorial page");
	}

}
