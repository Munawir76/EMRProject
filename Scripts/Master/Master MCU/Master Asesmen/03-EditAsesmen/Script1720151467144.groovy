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

WebUI.callTestCase(findTestCase('Master/Master MCU/Master Asesmen/01-GetAllMasterAsesmen'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Master/Master MCU/Master Asesmen/IconEditAsesmen'))

WebUI.delay(1)

WebUI.setText(findTestObject('Master/Master MCU/Master Asesmen/StatusEditMandatory'), 'tidak')

WebUI.sendKeys(findTestObject('Master/Master MCU/Master Asesmen/StatusEditMandatory'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Master/Master MCU/Master Asesmen/InputNilaiUmum'))

WebUI.setText(findTestObject('Master/Master MCU/Master Asesmen/InputNilaiUmum'), '12')

WebUI.delay(2)

WebUI.click(findTestObject('Master/Master MCU/Master Asesmen/ButtonSimpanEdit'))

WebUI.takeFullPageScreenshot()

