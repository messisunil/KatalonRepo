import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When




public class LoginPara {
	@Given("navigate to actitime login page")
	public void navigate_to_actitime_login_page() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://demo.actitime.com/login.do')
	}
	
	@When("enter (.*) and (.*)")
	public void enter_username_and_password(String username, String password) {
		WebUI.setText(findTestObject('Object Repository/jenkins/Page_actiTIME - Login/input_trainee_username'), username)
		WebUI.setText(findTestObject('Object Repository/jenkins/Page_actiTIME - Login/input_trainee_pwd'), password)
	}
	
	@And("click on login button")
	public void click_on_login_button() {
		WebUI.click(findTestObject('Object Repository/jenkins/Page_actiTIME - Login/div_Login'))
	}
	
	@Then("Homepage will be displayed and logout from the actitime")
	public void homepage_will_be_displayed_and_logout_from_the_actitime() {
		WebUI.click(findTestObject('Object Repository/jenkins/Page_actiTIME - Enter Time-Track/a_Logout'))
	}
	
	@And("close the browser")
	public void close_the_browser() {
		WebUI.closeBrowser()
	}
}
