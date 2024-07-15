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

WebUI.callTestCase(findTestCase('MCU/Registrasi MCU/MCU Personal/Daftar Registrasi/01-GetAllDataRegistrasiPersonal'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(0)

WebUI.click(findTestObject('MCU/Registrasi MCU/MCU Personal/Daftar Registrasi/ButtonBuatRegistrasi'))

WebUI.click(findTestObject('MCU/Registrasi MCU/MCU Personal/Input Registrasi/InputTanggalRegistrasiCreate'))

WebUI.setText(findTestObject('MCU/Registrasi MCU/MCU Personal/Input Registrasi/InputTanggalRegistrasiCreate'), '30/07/2024')

WebUI.sendKeys(findTestObject('MCU/Registrasi MCU/MCU Personal/Input Registrasi/InputTanggalRegistrasiCreate'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('MCU/Registrasi MCU/MCU Personal/Input Registrasi/InputDokterCreate'), 'ari mulyani')

WebUI.sendKeys(findTestObject('MCU/Registrasi MCU/MCU Personal/Input Registrasi/InputDokterCreate'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('MCU/Registrasi MCU/MCU Personal/Input Registrasi/InputPaketCreate'), 'paket asesmen')

WebUI.sendKeys(findTestObject('MCU/Registrasi MCU/MCU Personal/Input Registrasi/InputPaketCreate'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('MCU/Registrasi MCU/MCU Personal/Input Registrasi/InputKeteranganCreate'))

WebUI.setText(findTestObject('MCU/Registrasi MCU/MCU Personal/Input Registrasi/InputKeteranganCreate'), 'registrasi mcu personal using otomasi')

WebUI.click(findTestObject('MCU/Registrasi MCU/MCU Personal/Input Registrasi/ButtonCariPasien'))

WebUI.delay(2)

WebUI.click(findTestObject('MCU/Registrasi MCU/MCU Personal/Input Registrasi/Cari Pasien/InputNamaPasien'))

WebUI.setText(findTestObject('MCU/Registrasi MCU/MCU Personal/Input Registrasi/Cari Pasien/InputNamaPasien'), 'rahmawati')

WebUI.click(findTestObject('MCU/Registrasi MCU/MCU Personal/Input Registrasi/Cari Pasien/InputNIK'))

WebUI.setText(findTestObject('MCU/Registrasi MCU/MCU Personal/Input Registrasi/Cari Pasien/InputNIK'), '3671026607810001')

WebUI.click(findTestObject('MCU/Registrasi MCU/MCU Personal/Input Registrasi/Cari Pasien/ButtonCari'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('MCU/Registrasi MCU/MCU Personal/Input Registrasi/Cari Pasien/IconPilih'))

WebUI.delay(1)

WebUI.click(findTestObject('MCU/Registrasi MCU/MCU Personal/Input Registrasi/Cari Pasien/ButtonTanpaAntrean'))

WebUI.setText(findTestObject('MCU/Registrasi MCU/MCU Personal/Input Registrasi/InputPerusahaanCreate'), 'hd finance')

WebUI.sendKeys(findTestObject('MCU/Registrasi MCU/MCU Personal/Input Registrasi/InputPerusahaanCreate'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('MCU/Registrasi MCU/MCU Personal/Input Registrasi/InputAsuransiCreate'), 'ace life')

WebUI.sendKeys(findTestObject('MCU/Registrasi MCU/MCU Personal/Input Registrasi/InputAsuransiCreate'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('MCU/Registrasi MCU/MCU Personal/Input Registrasi/ButtonSimpan'), FailureHandling.STOP_ON_FAILURE)

