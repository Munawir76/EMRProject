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

WebUI.callTestCase(findTestCase('Master/Master MCU/Master Paket/01-GetAllMasterPaket'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Master/Master MCU/Master Paket/ButtonTambah'))

WebUI.click(findTestObject('Master/Master MCU/Master Paket/InputNamaPaketCreate'))

WebUI.setText(findTestObject('Master/Master MCU/Master Paket/InputNamaPaketCreate'), 'Paket testing new')

WebUI.delay(1)

WebUI.click(findTestObject('Master/Master MCU/Master Paket/InputKodePaketCreate'))

WebUI.setText(findTestObject('Master/Master MCU/Master Paket/InputKodePaketCreate'), 'kode-123')

WebUI.delay(1)

WebUI.setText(findTestObject('Master/Master MCU/Master Paket/InputJenisPaketCreate'), 'non')

WebUI.sendKeys(findTestObject('Master/Master MCU/Master Paket/InputJenisPaketCreate'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.setText(findTestObject('Master/Master MCU/Master Paket/InputTarifCBGCreate'), 'konsultasi')

WebUI.sendKeys(findTestObject('Master/Master MCU/Master Paket/InputTarifCBGCreate'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.setText(findTestObject('Master/Master MCU/Master Paket/InputFormMCUCreate'), 'form mcu (dokter)')

WebUI.sendKeys(findTestObject('Master/Master MCU/Master Paket/InputFormMCUCreate'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('Master/Master MCU/Master Paket/InputKeteranganCreate'))

WebUI.setText(findTestObject('Master/Master MCU/Master Paket/InputKeteranganCreate'), 'keterangan testing create new')

WebUI.delay(2)

WebUI.click(findTestObject('Master/Master MCU/Master Paket/ButtonSimpanCreate'))

