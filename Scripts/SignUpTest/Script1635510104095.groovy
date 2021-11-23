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

WebUI.click(findTestObject('Object Repository/SignUpTest/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/button_Accept'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/SignUpTest/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/a_Login'))

WebUI.click(findTestObject('Object Repository/SignUpTest/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/button_Continue with Email'))

WebUI.click(findTestObject('Object Repository/SignUpTest/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/button_Sign up'))

WebUI.setText(findTestObject('Object Repository/SignUpTest/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/input_Order online and get items delivered _b87915'), 
    'ashiq')

WebUI.setText(findTestObject('Object Repository/SignUpTest/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/input_Name_email'), 
    'ashiq14@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/SignUpTest/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/input_Email_password'), 
    'RigbBhfdqOCSCzYcP4LkSw==')

WebUI.setEncryptedText(findTestObject('Object Repository/SignUpTest/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/input_Password_password-confirm'), 
    'RigbBhfdqOCSCzYcP4LkSw==')

WebUI.click(findTestObject('Object Repository/SignUpTest/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/button_Sign up_1'))

WebUI.click(findTestObject('Object Repository/SignUpTest/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/div_Congratulations Your have successfully _baa30f'))

WebUI.verifyElementPresent(findTestObject('SignUpTest/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/div_Congratulations Your have successfully _baa30f'), 
    0)

WebUI.closeBrowser()

