package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import screens.SearchScreen;
import util.tests.BaseMobileTest;

public class NavigationBarElementsTests extends BaseMobileTest {

    @Test
    @Parameters({"languageVariant"})
    public void NavigationBarElementsAvailabilityTest(String languageVariant){
        log.info("NavigationBarElementsAvailabilityTest begins.");
        log.info("It sets up a initial profile.");
        SearchScreen initialLandingView = initialOnboarding(languageVariant);
        boolean allFourDisplayed = initialLandingView.areAllFourBottomButtonsDisplayed();
        Assert.assertTrue(allFourDisplayed,"Not all four action buttons at the bottom of the screen are displayed.");
        log.info("It has validated all four action buttons at the bottom of the screen are displayed.");
        log.info("NavigationBarElementsAvailabilityTest has finished.");
    }
}
