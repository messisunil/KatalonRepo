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

WebUI.navigateToUrl('https://www.ebay.com/')

WebUI.click(findTestObject('Object Repository/ebay/Page_Electronics, Cars, Fashion, Collectibl_475ffe/button_Shop by category'))

WebUI.click(findTestObject('Object Repository/ebay/Page_Electronics, Cars, Fashion, Collectibl_475ffe/a_Cell phones  accessories'))

WebUI.click(findTestObject('Object Repository/ebay/Page_Cell Phones, Smartphones, Smart Watche_d1fc43/a_Cell Phones  Smartphones'))

WebUI.click(findTestObject('Object Repository/ebay/Page_Cell Phones  Smartphones for Sale - Bu_63dd06/span_See All'))

WebUI.click(findTestObject('Object Repository/ebay/Page_Cell Phones  Smartphones for Sale - Bu_63dd06/span_Screen Size'))

WebUI.click(findTestObject('Object Repository/ebay/Page_Cell Phones  Smartphones for Sale - Bu_63dd06/input_Screen Size_c3-subPanel-Screen20Size__1d2ff0'))

WebUI.click(findTestObject('Object Repository/ebay/Page_Cell Phones  Smartphones for Sale - Bu_63dd06/div_Price'))

WebUI.setText(findTestObject('Object Repository/ebay/Page_Cell Phones  Smartphones for Sale - Bu_63dd06/input__x-textrange__input x-textrange__input--from'), 
    '1000')

WebUI.setText(findTestObject('ebay/Page_Cell Phones  Smartphones for Sale - Bu_63dd06/Page_Cell Phones  Smartphones for Sale - Buy New  Used Phones - eBay/input__x-textrange__input x-textrange__input--to'), 
    '2000')

WebUI.click(findTestObject('Object Repository/ebay/Page_Cell Phones  Smartphones for Sale - Bu_63dd06/div_Item Location'))

WebUI.click(findTestObject('Object Repository/ebay/Page_Cell Phones  Smartphones for Sale - Bu_63dd06/input_US Only_location'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/ebay/Page_Cell Phones  Smartphones for Sale - Bu_63dd06/button_Apply'))

WebUI.click(findTestObject('Object Repository/ebay/Page_6 Inch or More Cell Phones  Smartphone_cc3d63/button_3 filters applied'))

WebUI.verifyTextPresent('Screen Size: 6 in or More', false)

WebUI.verifyTextPresent('Price: $1,000.00 to $2,000.00', false)

WebUI.verifyTextPresent('Item Location: North America', false)

WebUI.closeBrowser()

