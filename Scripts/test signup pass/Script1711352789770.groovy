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

WebUI.navigateToUrl('http://54.254.53.26:8080/')

WebUI.click(findTestObject('Object Repository/Page_Homepage/Profile'))

WebUI.setText(findTestObject('Object Repository/Page_Sign Up/input_Login_email'), email)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign Up/input_Email_password_1'), password)

WebUI.click(findTestObject('Object Repository/Page_Sign Up/button_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_/html_katalonfont-familymonospacefont-size13_6a6dcb'), '{"msg":"User does not exist"}')

WebUI.openBrowser('')

WebUI.navigateToUrl('http://54.254.53.26:8080/admin')

