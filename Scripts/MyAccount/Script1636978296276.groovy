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

WebUI.navigateToUrl('https://bikroy.com/')

WebUI.click(findTestObject('Object Repository/MyAccount/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/a_Login'))

WebUI.click(findTestObject('Object Repository/MyAccount/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/span_Continue with Email'))

WebUI.setText(findTestObject('Object Repository/MyAccount/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/input_View and manage your ads at your conv_67423c'), 
    'ashiq25@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/MyAccount/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/input_Email_password'), 
    'ok2TY79hyqM=')

WebUI.click(findTestObject('Object Repository/MyAccount/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/button_Login'))

WebUI.click(findTestObject('Object Repository/MyAccount/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/a_My account'))

WebUI.click(findTestObject('Object Repository/MyAccount/Page_My Ads - Bikroy.com/a_My membership'))

WebUI.click(findTestObject('Object Repository/MyAccount/Page_Bikroy.com/h2_My Membership'))

WebUI.verifyElementPresent(findTestObject('MyAccount/Page_Bikroy.com/h2_My Membership'), 0)

WebUI.click(findTestObject('Object Repository/MyAccount/Page_Bikroy.com/a_Favorites'))

WebUI.click(findTestObject('Object Repository/MyAccount/Page_My Favorites - Bikroy.com/h2_Favorites'))

WebUI.verifyElementPresent(findTestObject('MyAccount/Page_My Favorites - Bikroy.com/h2_Favorites'), 0)

WebUI.click(findTestObject('Object Repository/MyAccount/Page_My Favorites - Bikroy.com/span_My account'))

WebUI.click(findTestObject('Object Repository/MyAccount/Page_My Ads - Bikroy.com/a_Settings'))

WebUI.click(findTestObject('Object Repository/MyAccount/Page_Account setting - Bikroy.com/a_My account'))

WebUI.click(findTestObject('Object Repository/MyAccount/Page_My Ads - Bikroy.com/a_My Profile'))

WebUI.verifyElementPresent(findTestObject('MyAccount/Page_My Ads - Bikroy.com/a_My Profile'), 0)

WebUI.click(findTestObject('Object Repository/MyAccount/Page_Bikroy.com/span_My account'))

WebUI.click(findTestObject('Object Repository/MyAccount/Page_My Ads - Bikroy.com/a_Profile Database'))

WebUI.click(findTestObject('Object Repository/MyAccount/Page_Bikroy.com/a_My account'))

WebUI.closeBrowser()

