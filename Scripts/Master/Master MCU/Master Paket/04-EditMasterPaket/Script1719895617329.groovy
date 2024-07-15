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

WebUI.callTestCase(findTestCase('Master/Master MCU/Master Paket/02-DetailMasterPaket'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Master/Master MCU/Master Paket/IconButtonEdit'))

WebUI.click(findTestObject('Master/Master MCU/Master Paket/InputNamaPaketEdit'))

WebUI.setText(findTestObject('Master/Master MCU/Master Paket/InputNamaPaketEdit'), 'edit paket')

WebUI.setText(findTestObject('Master/Master MCU/Master Paket/InputJenisPaketEdit'), 'umum')

WebUI.sendKeys(findTestObject('Master/Master MCU/Master Paket/InputJenisPaketEdit'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Master/Master MCU/Master Paket/InputGudangEdit'), 'bedah')

WebUI.sendKeys(findTestObject('Master/Master MCU/Master Paket/InputGudangEdit'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Master/Master MCU/Master Paket/InputTarifCBGEdit'), 'keperawatan')

WebUI.sendKeys(findTestObject('Master/Master MCU/Master Paket/InputTarifCBGEdit'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Master/Master MCU/Master Paket/InputFormMCUEdit'), 'pasien')

WebUI.sendKeys(findTestObject('Master/Master MCU/Master Paket/InputFormMCUEdit'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Master/Master MCU/Master Paket/InputKeteranganEdit'))

WebUI.setText(findTestObject('Master/Master MCU/Master Paket/InputKeteranganEdit'), 'keterangan edit')

WebUI.click(findTestObject('Master/Master MCU/Master Paket/ButtonSimpanCreate'), FailureHandling.STOP_ON_FAILURE)

