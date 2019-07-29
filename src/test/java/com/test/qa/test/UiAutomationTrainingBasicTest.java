package com.test.qa.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.test.qa.pageobjects.pages.ABTestPage;
import com.test.qa.pageobjects.pages.CheckBoxPage;
import com.test.qa.pageobjects.pages.DropDownPage;
import com.test.qa.pageobjects.pages.ForgotPasswordPage;
import com.test.qa.pageobjects.pages.HomePage;
import com.test.qa.pageobjects.pages.LoginPage;
import com.test.qa.pageobjects.pages.LoginSecurePage;
import com.test.qa.pageobjects.utils.Constants;
import com.test.qa.testdata.UserDetailsDataProvider;
import com.test.qa.utils.TestBase;

/**
 * UiAutomationTrainingBasicTest.java - class to execute Tests Created by
 * SrirankanK on 10/3/2018.
 */
public class UiAutomationTrainingBasicTest extends TestBase {

	/**
	 * Verify Home Page Displayed
	 */
	@Test(groups = "REGRESSION", priority = 1)
	public void testVerifyHomePage() {
		softAssert = new SoftAssert();
		softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
		HomePage.clickLink(Constants.AB_TEST_LINK);
		ABTestPage.waitTillHeaderLoad();
		softAssert.assertTrue(ABTestPage.isABTestPageDisplayed(), "Home Page is not Displayed");
		ABTestPage.navigateBack();
		softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
		softAssert.assertAll();

		//Todo - Verify HomePage is displayed
		//Todo - Click Home Page Link
		//Todo - Wait Till Page Loads
		//Todo - Verify ABTest Page is displayed
		//Todo - Navigate Back to Home Page
		//Todo - Verify HomePage is displayed
	}

	/**
	 * Verify Home Page Displayed Slow
	 */
	@Test(groups = "REGRESSION", priority = 2)
	public void testVerifyHomePage2() {
		softAssert = new SoftAssert();
		softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
		HomePage.clickLink(Constants.LOGIN_LINK);
		ABTestPage.waitTillHeaderLoad();
		softAssert.assertTrue(ABTestPage.isABTestPageDisplayed(), "Home Page is not Displayed");
		ABTestPage.navigateBack();
		softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
		softAssert.assertAll();
	}

	/**
	 * Verify Check Box
	 */
	@Test(groups = "REGRESSION", priority = 3)
	public void testVerifyCheckBox() {
		softAssert = new SoftAssert();
		softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
		HomePage.clickLink(Constants.CHECK_BOX_LINK);
		softAssert.assertTrue(CheckBoxPage.isCheckBox1Displayed(), "CheckBox1 is not Displayed");
		softAssert.assertTrue(CheckBoxPage.isCheckBox2Displayed(), "CheckBox2 is not Displayed");
		CheckBoxPage.checkCheckBox1();
		softAssert.assertTrue(CheckBoxPage.isCheckBox1Checked(), "CheckBox1 is not Checked");
		CheckBoxPage.unCheckCheckBox1();
		softAssert.assertFalse(CheckBoxPage.isCheckBox1Checked(), "CheckBox1 is Checked");
		CheckBoxPage.checkCheckBox2();
		softAssert.assertTrue(CheckBoxPage.isCheckBox2Checked(), "CheckBox2 is not Checked");
		CheckBoxPage.unCheckCheckBox2();
		softAssert.assertFalse(CheckBoxPage.isCheckBox2Checked(), "CheckBox2 is Checked");
		CheckBoxPage.navigateBack();
		softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
		softAssert.assertAll();



        //Todo - Verify HomePage is displayed
        //Todo - Click Check Box Link
        //Todo - Wait Till Page Loads
        //Todo - Verify Check Box 1 is displayed
        //Todo - Verify Check Box 2 is displayed
        //Todo - Check Check Box 1
        //Todo - Verify Check Box 1 is Checked
        //Todo - Uncheck Check Box 1
        //Todo - Verify Check Box 1 is Unchecked
        //Todo - Check Check Box 2
        //Todo - Verify Check Box 2 is Checked
        //Todo - Uncheck Check Box 2
        //Todo - Verify Check Box 2 is Unchecked
        //Todo - Navigate Back to Home Page
        //Todo - Verify HomePage is displayed
	}

	/**
	 * Verify Drop Down
	 */
	@Test(groups = "REGRESSION", priority = 4)
	public void testVerifyDropDown() {
		softAssert = new SoftAssert();
		softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
		HomePage.clickLink(Constants.DROP_DOWN_LINK);
		softAssert.assertTrue(DropDownPage.isDropDownDisplayed(), "Drobdownpage is not Displayed");
		DropDownPage.getSelectedOption();
		DropDownPage.setDropDownOption(Constants.OPTION_1);





        //Todo - Verify HomePage is displayed
        //Todo - Click Drop Down Link
        //Todo - Wait Till Page Loads
        //Todo - Verify Drop Down is displayed
        //Todo - Select Drop Down Option 1
        //Todo - Verify Drop Down Option 1 selected
        //Todo - Select Drop Down Option 2
        //Todo - Verify Drop Down Option 2 selected
	}

	/**
	 * Verify Forgot Password
	 */


		@Test(groups = "REGRESSION", priority = 5)
		public void testVerifyForgotPassword() {
			softAssert = new SoftAssert();
			softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
			HomePage.clickLink(Constants.FORGOT_PASSWORD_LINK);
			ForgotPasswordPage.setEmail(Constants.SAMPLE_MAIL);
			ForgotPasswordPage.clickSubmit();
			softAssert.assertEquals(ForgotPasswordPage.getMessage(),Constants.EMAIL_RESULT,  "Message are not equal");
			softAssert.assertAll();
	}

	/**
	 * Verify Login Valid Scenario
	 */
	@Test(groups = "REGRESSION", priority = 6)
	public void testVerifyLogin() {
		softAssert = new SoftAssert();
		softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
		HomePage.clickLink(Constants.LOGIN_LINK);
		softAssert.assertTrue(LoginPage.isLoginPageDisplayed(), "Login Page is not Displayed");
		LoginPage.setUseraName(Constants.LOGIN_USER_NAME);
		LoginPage.setPassword(Constants.LOGIN_PASSWORD);
		LoginPage.clickSubmit();
		softAssert.assertTrue(LoginSecurePage.isLoginSecurePageDisplayed(), "Login Secure Page is not Displayed");
		softAssert.assertTrue(LoginSecurePage.isLoginAlertDisplayed(), "Alert Message is not displayed");
		softAssert.assertEquals(LoginSecurePage.getLoginAlertMessage(), Constants.LOGIN_SUCCESS_MSG, "Messages are not equal");
		LoginSecurePage.clickLogout();
		softAssert.assertTrue(LoginPage.isLoginPageDisplayed(), "Login Page is not Displayed");
		softAssert.assertTrue(LoginPage.isAlertMessageDisplayed(), "Alert Message is not displayed");
		softAssert.assertTrue(LoginPage.getAlertMessage().contains(Constants.LOGOUT_SUCCESS_MSG), "Messages are not equal");
		softAssert.assertAll();











        //Todo - Verify HomePage is displayed
        //Todo - Click Login Link
        //Todo - Set Username and Password
        //Todo - Click Submit
        //Todo - Verify Login Secure Page Displayed
        //Todo - Verify Login Alert Displayed
        //Todo - Verify Login  Alert Message
        //Todo - Click Logout
        //Todo - Verify Login Page Displayed
        //Todo - Verify Logout Alert Displayed
        //Todo - Verify Logout  Alert Message
	}

	/**
	 * Verify Login Invalid Scenario
	 */
	@Test(groups = "REGRESSION", priority = 7, dataProvider ="MultipleUserDetails", dataProviderClass = UserDetailsDataProvider.class)
	public void testVerifyLogin2(String username, String password) {
		softAssert = new SoftAssert();
		softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
		HomePage.clickLink(Constants.LOGIN_LINK);
		softAssert.assertTrue(LoginPage.isLoginPageDisplayed(), "Login Page is not Displayed");
		LoginPage.setUseraName(username);
		LoginPage.setPassword(password);
		LoginPage.clickSubmit();
		softAssert.assertTrue(LoginPage.isLoginPageDisplayed(),"Login page is not displayed");
		softAssert.assertTrue(LoginPage.isAlertMessageDisplayed(),"Alert message is not displayed");
		softAssert.assertTrue(LoginPage.getAlertMessage().contains(Constants.LOGIN_INVALID_MSG), "Messages are not equal");
		softAssert.assertAll();
	}
	@Test(groups = "REGRESSION", priority = 8, dataProvider ="MultipleUserDetails2", dataProviderClass = UserDetailsDataProvider.class)
	public void testVerifyLogin3(String username, String password,String status) {
		softAssert = new SoftAssert();
		softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
		HomePage.clickLink(Constants.LOGIN_LINK);
		softAssert.assertTrue(LoginPage.isLoginPageDisplayed(), "Login Page is not Displayed");
		LoginPage.setUseraName(username);
		LoginPage.setPassword(password);
		LoginPage.clickSubmit();
		softAssert.assertTrue(LoginPage.isLoginPageDisplayed(),"Login page is not displayed");
		softAssert.assertTrue(LoginPage.isAlertMessageDisplayed(),"Alert message is not displayed");
		softAssert.assertTrue(LoginPage.getAlertMessage().contains(status), "Messages are not equal");
		softAssert.assertAll();
	}


}
