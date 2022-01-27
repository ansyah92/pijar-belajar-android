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

WebUI.callTestCase(findTestCase('Login/Pastikan User Dapat Melakukan Login Sesudah Install Aplikasi'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Mata Pelajaran', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Home Page/android.widget.TextView - Mata Pelajaran'), 'Mata Pelajaran')

Mobile.scrollToText('Latihan UNBK & UTBK', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Home Page/android.widget.TextView - Latihan UNBK  UTBK'), 'Latihan UNBK & UTBK')

Mobile.scrollToText('Spesial Buat Kamu', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Home Page/android.widget.TextView - Spesial Buat Kamu'), 'Spesial Buat Kamu')

Mobile.scrollToText('Artikel & Berita', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Home Page/android.widget.TextView - Artikel  Berita'), 'Artikel & Berita')

