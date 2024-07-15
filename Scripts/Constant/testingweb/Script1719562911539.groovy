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

WebUI.navigateToUrl('http://192.168.0.62:7010/auth/signin')

WebUI.setText(findTestObject('Object Repository/Constant/Page_Sign In/input_NIK_nik'), '12345')

WebUI.setEncryptedText(findTestObject('Object Repository/Constant/Page_Sign In/input_Kata Sandi_kata-sandi'), 'byQhuHhORutkR/qQEDRmlw==')

WebUI.sendKeys(findTestObject('Object Repository/Constant/Page_Sign In/input_Kata Sandi_kata-sandi'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Constant/Page_Sign In/p_E-Medical Record V2'))

WebUI.click(findTestObject('Object Repository/Constant/Page_Rumah Sakit An-Nisa Tangerang/span_Medical Check Up'))

WebUI.click(findTestObject('Object Repository/Constant/Page_Rumah Sakit An-Nisa Tangerang/span_Registrasi MCU'))

WebUI.click(findTestObject('Object Repository/Constant/Page_Rumah Sakit An-Nisa Tangerang/span_Registrasi MCU Perusahaan'))

WebUI.click(findTestObject('Object Repository/Constant/Page_Rumah Sakit An-Nisa Tangerang/input__end_date'))

WebUI.click(findTestObject('Object Repository/Constant/Page_Rumah Sakit An-Nisa Tangerang/div_31'))

WebUI.click(findTestObject('Object Repository/Constant/Page_Rumah Sakit An-Nisa Tangerang/button_Cari'))

WebUI.click(findTestObject('Object Repository/Constant/Page_Rumah Sakit An-Nisa Tangerang/path'))

WebUI.click(findTestObject('Object Repository/Constant/Page_Rumah Sakit An-Nisa Tangerang/button_Browse File'))

