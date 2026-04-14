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

WebUI.openBrowser('https://www.saucedemo.com/')

WebUI.setText(findTestObject('RP_005_ENDTOENDTEST/Page_Swag Labs/input_Username'), 'standard_user')

WebUI.setEncryptedText(findTestObject('RP_005_ENDTOENDTEST/Page_Swag Labs/input_Password'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('RP_005_ENDTOENDTEST/Page_Swag Labs/input_login-button'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('RP_005_ENDTOENDTEST/Page_Swag Labs/span_Name (A to Z)Name (A to Z)Name (Z to A)Pric'))

WebUI.click(findTestObject('RP_005_ENDTOENDTEST/Page_Swag Labs/div_ProductsName (A to Z)Name (A to Z)Name (Z to'))

WebUI.selectOptionByValue(findTestObject('RP_005_ENDTOENDTEST/Page_Swag Labs/select_Name (A to Z)Name (Z to A)Price (low to h'), 
    'lohi', false)

WebUI.click(findTestObject('RP_005_ENDTOENDTEST/Page_Swag Labs/button_add-to-cart-sauce-labs-onesie'))

WebUI.selectOptionByValue(findTestObject('RP_005_ENDTOENDTEST/Page_Swag Labs/select_Name (A to Z)Name (Z to A)Price (low to h'), 
    'hilo', false)

WebUI.click(findTestObject('RP_005_ENDTOENDTEST/Page_Swag Labs/button_add-to-cart-sauce-labs-fleece-jacket'))

WebUI.selectOptionByValue(findTestObject('RP_005_ENDTOENDTEST/Page_Swag Labs/select_Name (A to Z)Name (Z to A)Price (low to h'), 
    'az', false)

WebUI.click(findTestObject('RP_005_ENDTOENDTEST/Page_Swag Labs/button_add-to-cart-sauce-labs-backpack'))

WebUI.click(findTestObject('RP_005_ENDTOENDTEST/Page_Swag Labs/span_Name (A to Z)Name (A to Z)Name (Z to A)Pric'))

WebUI.selectOptionByValue(findTestObject('RP_005_ENDTOENDTEST/Page_Swag Labs/select_Name (A to Z)Name (Z to A)Price (low to h'), 
    'za', false)

WebUI.click(findTestObject('RP_005_ENDTOENDTEST/Page_Swag Labs/button_add-to-cart-test.allthethings()-t-shirt-('))

WebUI.click(findTestObject('RP_005_ENDTOENDTEST/Page_Swag Labs/span_4'))

WebUI.click(findTestObject('RP_005_ENDTOENDTEST/Page_Swag Labs/button_checkout'))

WebUI.setText(findTestObject('RP_005_ENDTOENDTEST/Page_Swag Labs/input_First Name'), 'XL SMART TEST ADD BANYAK ITEM')

WebUI.setText(findTestObject('RP_005_ENDTOENDTEST/Page_Swag Labs/input_Last Name'), 'NURIZAL')

WebUI.setText(findTestObject('RP_005_ENDTOENDTEST/Page_Swag Labs/input_Zip_Postal Code'), '76767')

WebUI.click(findTestObject('RP_005_ENDTOENDTEST/Page_Swag Labs/input_continue'))

WebUI.click(findTestObject('RP_005_ENDTOENDTEST/Page_Swag Labs/button_finish'))

WebUI.click(findTestObject('RP_005_ENDTOENDTEST/Page_Swag Labs/button_back-to-products'))

WebUI.click(findTestObject('RP_005_ENDTOENDTEST/Page_Swag Labs/button_react-burger-menu-btn'))

WebUI.click(findTestObject('RP_005_ENDTOENDTEST/Page_Swag Labs/a_logout_sidebar_link'))

WebUI.closeBrowser()

