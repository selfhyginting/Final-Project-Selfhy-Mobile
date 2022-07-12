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

CucumberKW.runFeatureFile('Include/features/MP-10 Selfhy - TC Toolbar.feature')

Mobile.startApplication('C:\\Users\\095048\\Katalon Studio\\FinalProject-Mobile\\APK\\app-debug.apk', true)

Mobile.tap(findTestObject('Object Repository/Toolbar/android.widget.TextView'), 0)

Mobile.getText(findTestObject('Object Repository/Toolbar/android.widget.TextView - Help'), 0)

Mobile.getText(findTestObject('Object Repository/Toolbar/android.widget.TextView - This Bank App Demo was made by Mike Banks. Soon, this dialog will give the user help, depending on where they are in the app'), 
    0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Toolbar/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Toolbar/android.widget.TextView - App Settings'), 0)

Mobile.closeApplication()

