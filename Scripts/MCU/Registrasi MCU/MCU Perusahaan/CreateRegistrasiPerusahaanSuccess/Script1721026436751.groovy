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

WebUI.callTestCase(findTestCase('Login/01-LoginSuccessfully'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Helper/SSO-Login/01-Dev'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Helper/Sidebar/MCU/MCU'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Helper/Sidebar/MCU/RegistrasiMCU'))

WebUI.delay(1)

WebUI.click(findTestObject('Helper/Sidebar/MCU/Registrasi MCU/RegistrasiPerusahaan'))

WebUI.delay(1)

WebUI.click(findTestObject('MCU/Registrasi MCU/Registrasi Perusahaan/InputTanggalCreate'))

WebUI.setText(findTestObject('MCU/Registrasi MCU/Registrasi Perusahaan/InputTanggalCreate'), '31/07/2024')

WebUI.sendKeys(findTestObject('MCU/Registrasi MCU/Registrasi Perusahaan/InputTanggalCreate'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('MCU/Registrasi MCU/Registrasi Perusahaan/InputDokterCreate'), 'arif budiman')

WebUI.sendKeys(findTestObject('MCU/Registrasi MCU/Registrasi Perusahaan/InputDokterCreate'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('MCU/Registrasi MCU/Registrasi Perusahaan/InputPerusahaanCreate'), 'astra international')

WebUI.sendKeys(findTestObject('MCU/Registrasi MCU/Registrasi Perusahaan/InputPerusahaanCreate'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('MCU/Registrasi MCU/Registrasi Perusahaan/InputAsuransiCreate'), 'pt. toyota')

WebUI.sendKeys(findTestObject('MCU/Registrasi MCU/Registrasi Perusahaan/InputAsuransiCreate'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('MCU/Registrasi MCU/Registrasi Perusahaan/InputKeteranganCreate'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('MCU/Registrasi MCU/Registrasi Perusahaan/InputKeteranganCreate'), 'registrasi perusahaan using otomasi')

WebUI.click(findTestObject(null))

