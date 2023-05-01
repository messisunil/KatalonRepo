import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.goibibo.com/')

WebUI.click(findTestObject('Object Repository/goibibo/Page_Goibibo - Best Travel Website. Book Ho_c2e78c/span_Daily Steal Deals  Special Discounts_l_c0692f'))

WebUI.click(findTestObject('Object Repository/goibibo/Page_Goibibo - Best Travel Website. Book Ho_c2e78c/p_Enter city or airport'))

WebUI.setText(findTestObject('Object Repository/goibibo/Page_Goibibo - Best Travel Website. Book Ho_c2e78c/input_text'), 
    'ba')

WebUI.click(findTestObject('Object Repository/goibibo/Page_Goibibo - Best Travel Website. Book Ho_c2e78c/span_Bengaluru, India'))

WebUI.setText(findTestObject('Object Repository/goibibo/Page_Goibibo - Best Travel Website. Book Ho_c2e78c/input_text'), 
    'de')

WebUI.click(findTestObject('Object Repository/goibibo/Page_Goibibo - Best Travel Website. Book Ho_c2e78c/span_New Delhi, India'))

WebUI.click(findTestObject('Object Repository/goibibo/Page_Goibibo - Best Travel Website. Book Ho_c2e78c/span_Departure_DayPicker-NavButton DayPicke_8e3f9a'))

WebUI.click(findTestObject('Object Repository/goibibo/Page_Goibibo - Best Travel Website. Book Ho_c2e78c/div_214,589'))

WebUI.click(findTestObject('Object Repository/goibibo/Page_Goibibo - Best Travel Website. Book Ho_c2e78c/span_Done'))

WebUI.click(findTestObject('Object Repository/goibibo/Page_Goibibo - Best Travel Website. Book Ho_c2e78c/span_Travellers  Class_sc-eFegNN csJIKZ'))

WebUI.click(findTestObject('Object Repository/goibibo/Page_Goibibo - Best Travel Website. Book Ho_c2e78c/li_business'))

WebUI.click(findTestObject('Object Repository/goibibo/Page_Goibibo - Best Travel Website. Book Ho_c2e78c/a_Done'))

WebUI.click(findTestObject('Object Repository/goibibo/Page_Goibibo - Best Travel Website. Book Ho_c2e78c/span_SEARCH FLIGHTS'))

WebUI.closeBrowser()

