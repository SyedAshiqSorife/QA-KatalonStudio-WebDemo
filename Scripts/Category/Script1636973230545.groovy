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

WebUI.back(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Categories/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/p_Mobiles'))

WebUI.click(findTestObject('Object Repository/Categories/Page_Mobiles and Accessories for Sale in Ba_9e2890/div_Mobiles'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Categories/Page_Mobiles and Accessories for Sale in Ba_9e2890/div_Mobiles'), 
    0)

WebUI.click(findTestObject('Object Repository/Categories/Page_64,737 Electronics Items for Sale in B_feb075/button_Post Ad_btn--1gFez default--T8kE3 sm_6f34c8'))

WebUI.click(findTestObject('Object Repository/Categories/Page_Mobiles and Accessories for Sale in Ba_9e2890/a_All ads_gtm-market-logo'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Categories/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/div_Electronics64,738 ads'))

WebUI.click(findTestObject('Object Repository/Categories/Page_64,737 Electronics Items for Sale in B_feb075/div_Electronics'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Categories/Page_64,737 Electronics Items for Sale in B_feb075/div_Electronics'), 
    0)

WebUI.click(findTestObject('Object Repository/Categories/Page_64,737 Electronics Items for Sale in B_feb075/button_Post Ad_btn--1gFez default--T8kE3 sm_6f34c8'))

WebUI.click(findTestObject('Object Repository/Categories/Page_64,737 Electronics Items for Sale in B_feb075/a_All ads_gtm-market-logo'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Categories/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/div_Home  Living32,736 ads'))

WebUI.click(findTestObject('Object Repository/Categories/Page_32,736 Home and Living Items for Sale _24eba2/div_Home  Living'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Categories/Page_32,736 Home and Living Items for Sale _24eba2/div_Home  Living'), 
    0)

WebUI.click(findTestObject('Object Repository/Categories/Page_32,736 Home and Living Items for Sale _24eba2/button_Post Ad_btn--1gFez default--T8kE3 sm_6f34c8'))

WebUI.click(findTestObject('Object Repository/Categories/Page_32,736 Home and Living Items for Sale _24eba2/a_All ads_gtm-market-logo'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Categories/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/a_Vehicles25,112 ads'))

WebUI.click(findTestObject('Object Repository/Categories/Page_Buy  Sell Vehicles in Bangladesh  Bikroy.com/div_Vehicles'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Categories/Page_Buy  Sell Vehicles in Bangladesh  Bikroy.com/div_Vehicles'), 
    0)

WebUI.click(findTestObject('Object Repository/Categories/Page_Buy  Sell Vehicles in Bangladesh  Bikroy.com/button_Post Ad_btn--1gFez default--T8kE3 sm_6f34c8'))

WebUI.click(findTestObject('Object Repository/Categories/Page_Buy  Sell Vehicles in Bangladesh  Bikroy.com/a_All ads_gtm-market-logo'))

WebUI.click(findTestObject('Object Repository/Categories/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/div_Pets  Animals18,892 ads'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Categories/Page_Pets and Animals for Sale in Banglades_55bd39/div_Pets  Animals'))

WebUI.verifyElementPresent(findTestObject('Categories/Page_Pets and Animals for Sale in Banglades_55bd39/div_Pets  Animals'), 
    0)

WebUI.click(findTestObject('Object Repository/Categories/Page_Pets and Animals for Sale in Banglades_55bd39/button_Post Ad_btn--1gFez default--T8kE3 sm_6f34c8'))

WebUI.click(findTestObject('Object Repository/Categories/Page_Pets and Animals for Sale in Banglades_55bd39/a_All ads_gtm-market-logo'))

WebUI.click(findTestObject('Object Repository/Categories/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/a_Property18,015 ads'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Categories/Page_Property  Real Estate for Sale and Ren_155c42/div_Property'))

WebUI.verifyElementPresent(findTestObject('Categories/Page_Property  Real Estate for Sale and Ren_155c42/div_Property'), 
    0)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Categories/Page_Property  Real Estate for Sale and Ren_155c42/button_Post Ad_btn--1gFez default--T8kE3 sm_6f34c8'))

WebUI.click(findTestObject('Object Repository/Categories/Page_Property  Real Estate for Sale and Ren_155c42/a_All ads_gtm-market-logo'))

WebUI.click(findTestObject('Object Repository/Categories/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/a_Fashion  Beauty11,565 ads'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Categories/Page_Fashion and Beauty Products for Sale i_a6555c/div_Fashion  Beauty'))

WebUI.verifyElementPresent(findTestObject('Categories/Page_Fashion and Beauty Products for Sale i_a6555c/div_Fashion  Beauty'), 
    0)

WebUI.click(findTestObject('Object Repository/Categories/Page_Fashion and Beauty Products for Sale i_a6555c/button_Post Ad_btn--1gFez default--T8kE3 sm_6f34c8'))

WebUI.click(findTestObject('Object Repository/Categories/Page_Fashion and Beauty Products for Sale i_a6555c/a_All ads_gtm-market-logo'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Categories/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/div_Hobbies, Sports  Kids6,919 ads'))

WebUI.click(findTestObject('Object Repository/Categories/Page_Hobby, Sport and Kids Items for Sale i_0b8248/div_Hobbies, Sports  Kids'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Categories/Page_Hobby, Sport and Kids Items for Sale i_0b8248/div_Hobbies, Sports  Kids'), 
    0)

WebUI.click(findTestObject('Object Repository/Categories/Page_Hobby, Sport and Kids Items for Sale i_0b8248/button_Post Ad_btn--1gFez default--T8kE3 sm_6f34c8'))

WebUI.click(findTestObject('Object Repository/Categories/Page_Hobby, Sport and Kids Items for Sale i_0b8248/a_All ads_gtm-market-logo'))

WebUI.click(findTestObject('Object Repository/Categories/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/div_Business  Industry2,836 ads'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Categories/Page_Business and Industrial items for sale_3d7b0a/div_Business  Industry'))

WebUI.verifyElementPresent(findTestObject('Categories/Page_Business and Industrial items for sale_3d7b0a/div_Business  Industry'), 
    0)

WebUI.click(findTestObject('Object Repository/Categories/Page_Business and Industrial items for sale_3d7b0a/button_Post Ad_btn--1gFez default--T8kE3 sm_6f34c8'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Categories/Page_Business and Industrial items for sale_3d7b0a/a_All ads_gtm-market-logo'))

WebUI.click(findTestObject('Object Repository/Categories/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/p_Education'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Categories/Page_Educational services and tutorials in _0f21a5/div_Education'))

WebUI.verifyElementPresent(findTestObject('Categories/Page_Educational services and tutorials in _0f21a5/div_Education'), 
    0)

WebUI.click(findTestObject('Object Repository/Categories/Page_Educational services and tutorials in _0f21a5/button_Post Ad_btn--1gFez default--T8kE3 sm_6f34c8'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Categories/Page_Educational services and tutorials in _0f21a5/a_All ads_gtm-market-logo'))

WebUI.click(findTestObject('Object Repository/Categories/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/a_Essentials1,798 ads'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Categories/Page_Buy Essentials Products Online in Bang_36679e/div_Essentials'))

WebUI.verifyElementPresent(findTestObject('Categories/Page_Buy Essentials Products Online in Bang_36679e/div_Essentials'), 
    0)

WebUI.click(findTestObject('Object Repository/Categories/Page_Buy Essentials Products Online in Bang_36679e/button_Post Ad_btn--1gFez default--T8kE3 sm_6f34c8'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Categories/Page_Buy Essentials Products Online in Bang_36679e/a_All ads_gtm-market-logo'))

WebUI.click(findTestObject('Object Repository/Categories/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/a_Jobs1,587 ads'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Categories/Page_1 Job Portal for Entry-level and Skill_5327cb/h1_Browse Jobs'))

WebUI.click(findTestObject('Object Repository/Categories/Page_1 Job Portal for Entry-level and Skill_5327cb/h1_Browse Jobs'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Categories/Page_1 Job Portal for Entry-level and Skill_5327cb/a_Back to Bikroy_gtm-market-logo'))

WebUI.click(findTestObject('Object Repository/Categories/Page_1 Job Portal for Entry-level and Skill_5327cb/a_Back to Bikroy'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Categories/Page_Buy, Rent, Find or Sell Anything on Bi_4e00bc/a_All ads_gtm-market-logo'))

WebUI.click(findTestObject('Object Repository/Categories/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/div_Services989 ads'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Categories/Page_Best Local Service Providers in Bangla_4e8d6f/div_Services'))

WebUI.click(findTestObject('Object Repository/Categories/Page_Best Local Service Providers in Bangla_4e8d6f/button_Post Ad_btn--1gFez default--T8kE3 sm_6f34c8'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Categories/Page_Best Local Service Providers in Bangla_4e8d6f/a_All ads_gtm-market-logo'))

WebUI.click(findTestObject('Object Repository/Categories/Page_Bikroy.com - Electronics, Cars, Proper_7b12fe/span_46 ads'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Categories/Page_Overseas Job Opportunities  Bikroy.com/div_Overseas Jobs'))

WebUI.verifyElementPresent(findTestObject('Categories/Page_Overseas Job Opportunities  Bikroy.com/div_Overseas Jobs'), 0)

WebUI.click(findTestObject('Object Repository/Categories/Page_Overseas Job Opportunities  Bikroy.com/button_Post Ad_btn--1gFez default--T8kE3 sm_6f34c8'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Categories/Page_Overseas Job Opportunities  Bikroy.com/a_All ads_gtm-market-logo'))

WebUI.delay(2)

WebUI.closeBrowser()

