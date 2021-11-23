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

WebUI.delay(2)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/LoginFailed/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/a_Login'))

WebUI.click(findTestObject('Object Repository/LoginFailed/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/button_Continue with Email'))

WebUI.setText(findTestObject('Object Repository/LoginFailed/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/input_Order online and get items delivered _34cf3f'), 
    'ashiq13@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/LoginFailed/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/input_Email_password'), 
    'RigbBhfdqOBGo8utFS/9HA==')

WebUI.click(findTestObject('Object Repository/LoginFailed/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/button_Login'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/LoginFailed/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/div_exclamation_svg__st0filld95e46The email_6865d4'))

WebUI.verifyElementPresent(findTestObject('Object Repository/LoginFailed/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/div_exclamation_svg__st0filld95e46The email_6865d4'), 
    0)

WebUI.click(findTestObject('Object Repository/LoginFailed/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/button_Copyright  Saltside Technologies_btn_5f2256'))

WebUI.closeBrowser()

