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

Mobile.tap(findTestObject('Logout/Menu_Profil'), 0)

Mobile.scrollToText('Tentang Pijar Belajar', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Menu Profil/android.widget.TextView - Tentang Pijar Belajar'), 0)

Mobile.verifyElementText(findTestObject('Tentang Pijar Belajar/android.widget.TextView - Tentang Pijar Belajar'), 'Tentang Pijar Belajar')

Mobile.verifyElementText(findTestObject('Tentang Pijar Belajar/android.widget.TextView - Tentang Kami'), 'Tentang Kami')

Mobile.tap(findTestObject('Tentang Pijar Belajar/android.view.ViewGroup_back'), 0)

