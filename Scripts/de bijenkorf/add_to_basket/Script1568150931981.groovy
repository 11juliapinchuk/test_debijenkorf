import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication('nl.debijenkorf')

int timeout = 5;
Mobile.scrollToText('Kleding')
Mobile.tap(findTestObject('android.widget.TextView0 - Kleding'), timeout)

Mobile.scrollToText('jeans')
Mobile.tap(findTestObject('android.widget.TextView0 - jeans'), timeout)

Mobile.tap(findTestObject('android.widget.TextView0 - DENHAM'), timeout)

Mobile.scrollToText('In winkelmand')
Mobile.tap(findTestObject('android.widget.Button0 - In winkelmand'), timeout)

Mobile.tap(findTestObject('android.widget.TextView0 - W29L32'), timeout)

Mobile.tap(findTestObject('android.widget.FrameLayout0'), timeout)

Mobile.verifyElementExist(findTestObject('android.widget.ImageView0'), timeout, FailureHandling.STOP_ON_FAILURE)
Mobile.tap(findTestObject('android.widget.ImageView0'), timeout)

Mobile.closeApplication()

