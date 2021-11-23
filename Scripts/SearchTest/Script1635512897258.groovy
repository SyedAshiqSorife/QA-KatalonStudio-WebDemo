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

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/SearchTest/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/input_All of Bangladesh_query'), 
    'dell laptop')

WebUI.click(findTestObject('Object Repository/SearchTest/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/button_All of Bangladesh_btn--1gFez default_01becf'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('SearchTest/Page_Dell Laptop in Bangladesh  Bikroy.com/div_Next'), 0)

WebUI.click(findTestObject('Object Repository/SearchTest/Page_Dell Laptop in Bangladesh  Bikroy.com/div_Next'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/SearchTest/Page_Dell Laptop in Bangladesh  Bikroy.com/span_URGENT_label-text-span--2LWsk'))

WebUI.click(findTestObject('Object Repository/SearchTest/Page_Dell Laptop in Bangladesh  Bikroy.com/span_URGENT_label-text-span--2LWsk'))

WebUI.click(findTestObject('Object Repository/SearchTest/Page_Dell Laptop in Bangladesh  Bikroy.com/span_Filter ads by_label-text-span--2LWsk'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/SearchTest/Page_Dell Laptop in Bangladesh  Bikroy.com/span_Filter ads by_label-text-span--2LWsk'))

WebUI.click(findTestObject('Object Repository/SearchTest/Page_Dell Laptop in Bangladesh  Bikroy.com/button_All'))

WebUI.click(findTestObject('Object Repository/SearchTest/Page_Dell Laptop in Bangladesh  Bikroy.com/span_All_dd-button-icon--1m72e dd-button-ic_f8bcc5'))

WebUI.click(findTestObject('Object Repository/SearchTest/Page_Dell Laptop in Bangladesh  Bikroy.com/div_Dell laptop i3-10 gen newRajshahi, Lapt_527bc8'))

WebUI.click(findTestObject('Object Repository/SearchTest/Page_Dell laptop i3-10 gen new in Chhota Ba_0c0dac/h1_Dell laptop i3-10 gen new'))

WebUI.verifyElementPresent(findTestObject('Object Repository/SearchTest/Page_Dell laptop i3-10 gen new in Chhota Ba_0c0dac/h1_Dell laptop i3-10 gen new'), 
    0)

WebUI.closeBrowser()

