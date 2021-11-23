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

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.back()

WebUI.click(findTestObject('Object Repository/PostAAdd/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/button_POST YOUR AD'))

WebUI.click(findTestObject('Object Repository/PostAAdd/Page_Posting ad on Bikroy.com  Bikroy.com/div_Sell something'))

WebUI.click(findTestObject('Object Repository/PostAAdd/Page_Posting ad on Bikroy.com  Bikroy.com/button_Sell an item, property or service'))

WebUI.click(findTestObject('Object Repository/PostAAdd/Page_Posting ad on Bikroy.com  Bikroy.com/button_Mobiles'))

WebUI.click(findTestObject('Object Repository/PostAAdd/Page_Posting ad on Bikroy.com  Bikroy.com/div_Mobile Phones'))

WebUI.click(findTestObject('Object Repository/PostAAdd/Page_Posting ad on Bikroy.com  Bikroy.com/button_Rajshahi'))

WebUI.click(findTestObject('Object Repository/PostAAdd/Page_Posting ad on Bikroy.com  Bikroy.com/button_New Market'))

WebUI.click(findTestObject('Object Repository/PostAAdd/Page_Posting ad on Bikroy.com  Bikroy.com/span'))

WebUI.click(findTestObject('Object Repository/PostAAdd/Page_Posting ad on Bikroy.com  Bikroy.com/span'))

WebUI.click(findTestObject('Object Repository/PostAAdd/Page_Posting ad on Bikroy.com  Bikroy.com/span_Brand_dd-button-icon--3Sg-h dd-button-_6e0de8'))

WebUI.click(findTestObject('Object Repository/PostAAdd/Page_Posting ad on Bikroy.com  Bikroy.com/span_Brand_dd-button-icon--3Sg-h dd-button-_5d4b58'))

WebUI.click(findTestObject('Object Repository/PostAAdd/Page_Posting ad on Bikroy.com  Bikroy.com/span_Hide Phone Number(s)_label-text-span--2LWsk'))

WebUI.click(findTestObject('Object Repository/PostAAdd/Page_Posting ad on Bikroy.com  Bikroy.com/div_Post ad'))

WebUI.click(findTestObject('Object Repository/PostAAdd/Page_Posting ad on Bikroy.com  Bikroy.com/span_Brand_dd-button-icon--3Sg-h dd-button-_6e0de8'))

WebUI.click(findTestObject('Object Repository/PostAAdd/Page_Posting ad on Bikroy.com  Bikroy.com/li_Acer'))

WebUI.click(findTestObject('Object Repository/PostAAdd/Page_Posting ad on Bikroy.com  Bikroy.com/button_Model_dd-button-wrapper--28F_E dd-bu_d2484c'))

WebUI.click(findTestObject('Object Repository/PostAAdd/Page_Posting ad on Bikroy.com  Bikroy.com/li_beTouch E100'))

WebUI.click(findTestObject('Object Repository/PostAAdd/Page_Posting ad on Bikroy.com  Bikroy.com/span_Features (optional)_label-text-span--2LWsk'))

WebUI.closeBrowser()

