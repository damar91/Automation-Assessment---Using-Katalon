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

public class Product {

	@Given("User already logged in")
	public void user_already_logged_in() {
		WebUI.callTestCase(findTestCase('Login/Pages/LGN001 - User Login With Valid Credential'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User choose product")
	public void user_choose_product() {
		WebUI.callTestCase(findTestCase('Product/Step Definition/Product - Choose Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click add to cart button")
	public void user_click_add_to_cart_button() {
		WebUI.callTestCase(findTestCase('Product/Step Definition/Product - Click Add To Cart'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click cart icon")
	public void user_click_cart_icon() {
		WebUI.callTestCase(findTestCase('Product/Step Definition/Product - Click Cart Icon'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Products should be successfully added to the cart")
	public void products_should_be_successfully_added_to_the_cart() {
		WebUI.closeBrowser()

	}

	@When("User click button remove")
	public void user_click_button_remove() {
		WebUI.callTestCase(findTestCase('Product/Step Definition/Product - Remove Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Products should be successfully removed from the cart")
	public void products_should_be_successfully_removed_from_the_cart() {
		WebUI.closeBrowser()
	}

	@When("User click button checkout")
	public void user_click_button_checkout() {
		WebUI.callTestCase(findTestCase('Product/Step Definition/Product - Click Button Checkout'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input first name")
	public void user_input_first_name() {
		WebUI.callTestCase(findTestCase('Product/Step Definition/Product - Input Field First Name'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input last name")
	public void user_input_last_name() {
		WebUI.callTestCase(findTestCase('Product/Step Definition/Product - Input Field Last Name'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input postal code")
	public void user_input_postal_code() {
		WebUI.callTestCase(findTestCase('Product/Step Definition/Product - Input Field Postal Code'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User button continue")
	public void user_button_continue() {
		WebUI.callTestCase(findTestCase('Product/Step Definition/Product - Click Button Continue'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User button finish")
	public void user_button_finish() {
		WebUI.callTestCase(findTestCase('Product/Step Definition/Product - Click Button Finish'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("The order was successfully placed and a notification of order success appeared")
	public void the_order_was_successfully_placed_and_a_notification_of_order_success_appeared() {
		WebUI.callTestCase(findTestCase('Product/Step Definition/Order Success Notification'), [:], FailureHandling.STOP_ON_FAILURE)

        WebUI.closeBrowser()

	}
}
