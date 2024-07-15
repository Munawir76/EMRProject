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

WebUI.callTestCase(findTestCase('MCU/Registrasi MCU/MCU Perusahaan/GetAllDataRegisterPerusahaan'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('MCU/Registrasi MCU/Registrasi Perusahaan/InputTanggalAkhirFilter'))

WebUI.setText(findTestObject('MCU/Registrasi MCU/Registrasi Perusahaan/InputTanggalAkhirFilter'), '31/07/2024')

WebUI.sendKeys(findTestObject('MCU/Registrasi MCU/Registrasi Perusahaan/InputTanggalAkhirFilter'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('MCU/Registrasi MCU/Registrasi Perusahaan/ButtonCariFilter'))

WebUI.click(findTestObject('MCU/Registrasi MCU/Registrasi Perusahaan/ButtonIconEdit'))

WebUI.uploadFile(findTestObject('Constant/Page_Rumah Sakit An-Nisa Tangerang/button_Browse File'), "D:\\Data\\Data testing\\data testing costume.xlsx")

WebUI.getAttribute(findTestObject('Constant/Page_Rumah Sakit An-Nisa Tangerang/button_Browse File'), 'value')

