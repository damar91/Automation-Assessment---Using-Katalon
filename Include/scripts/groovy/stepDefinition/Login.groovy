package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable


import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

public class Login {
	@Given("User already on login page")
	public void user_already_on_login_page() {
		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		WebUI.navigateToUrl('https://www.saucedemo.com/v1/')

		WebUI.verifyElementPresent(findTestObject('Login/btn_login'), 10)
	}

	@When("User input valid email")
	public void user_input_valid_email() {
		WebUI.setText(findTestObject('Login/field_email'), 'standard_user')
	}

	@When("User input valid password")
	public void user_input_valid_password() {
		WebUI.setText(findTestObject('Login/field_password'), 'secret_sauce')
	}

	@When("User click button login")
	public void user_click_button_login() {
		WebUI.click(findTestObject('Login/btn_login'))
	}

	@Then("User should be successfully logged in")
	public void user_should_be_successfully_logged_in() {
		WebUI.closeBrowser()
	}

	@When("User input invalid password")
	public void user_input_invalid_password() {
		WebUI.setText(findTestObject('Login/field_password'), 'failed')
	}

	@Then("User should not be logged in")
	public void user_should_not_be_logged_in() {
		WebUI.callTestCase(findTestCase('Login/Step Definition/User Login - Error Massage'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.closeBrowser()
	}

	@When("User click button menu")
	public void user_click_button_menu() {
		WebUI.click(findTestObject('Product/btn_menu'))
	}

	@When("User click button logout")
	public void user_click_button_logout() {
		WebUI.verifyElementPresent(findTestObject('Login/btn_logout'), 10)

		WebUI.click(findTestObject('Login/btn_logout'))
	}

	@Then("User should be successfully logged out")
	public void user_should_be_successfully_logged_out() {
		WebUI.verifyElementPresent(findTestObject('Login/btn_login'), 10)

		WebUI.closeBrowser()
	}
}
