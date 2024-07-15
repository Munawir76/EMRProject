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

WebUI.delay(2)

WebUI.click(findTestObject('Master/Master MCU/Master Paket/01-Input-Form-Tarif/input_Harga Beli_r10'))

WebUI.clearText(findTestObject('Master/Master MCU/Master Paket/01-Input-Form-Tarif/input_Harga Beli_r10'))

WebUI.setText(findTestObject('Master/Master MCU/Master Paket/01-Input-Form-Tarif/input_Harga Beli_r10'), '200000')

WebUI.click(findTestObject('Master/Master MCU/Master Paket/01-Input-Form-Tarif/input_Harga Jual_r11'))

WebUI.setText(findTestObject('Master/Master MCU/Master Paket/01-Input-Form-Tarif/input_Harga Jual_r11'), '300000')

WebUI.click(findTestObject('Master/Master MCU/Master Paket/01-Input-Form-Tarif/input_Harga Beli_r12'))

WebUI.setText(findTestObject('Master/Master MCU/Master Paket/01-Input-Form-Tarif/input_Harga Beli_r12'), '400000')

WebUI.click(findTestObject('Master/Master MCU/Master Paket/01-Input-Form-Tarif/input_Harga Jual_r13'))

WebUI.setText(findTestObject('Master/Master MCU/Master Paket/01-Input-Form-Tarif/input_Harga Jual_r13'), '500000')

WebUI.setText(findTestObject(null), '')

WebUI.setText(findTestObject(null), '')

WebUI.setText(findTestObject(null), '')

WebUI.setText(findTestObject(null), '')

WebUI.setText(findTestObject(null), '')

