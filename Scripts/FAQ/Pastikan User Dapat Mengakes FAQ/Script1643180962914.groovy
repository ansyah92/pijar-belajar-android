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

Mobile.scrollToText('FAQ', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Menu Profil/android.widget.TextView - FAQ'), 0)

//Mobile.verifyElementText(findTestObject('FAQ/android.widget.TextView - FAQ'), 'FAQ')
Mobile.tap(findTestObject('FAQ/android.widget.TextView - Apa itu Pijar Belajar'), 0)

Mobile.tap(findTestObject('FAQ/android.widget.TextView - Apa itu Pijar Belajar'), 0)

Mobile.tap(findTestObject('FAQ/android.widget.TextView - Siapa Yang Menggunakan Pijar Belajar'), 0)

Mobile.tap(findTestObject('FAQ/android.widget.TextView - Siapa Yang Menggunakan Pijar Belajar'), 0)

Mobile.tap(findTestObject('FAQ/android.widget.TextView - Mengapa harus menggunakan Pijar Belajar'), 0)

Mobile.tap(findTestObject('FAQ/android.widget.TextView - Mengapa harus menggunakan Pijar Belajar'), 0)

Mobile.tap(findTestObject('FAQ/android.widget.TextView - Apa saja layanan dari Pijar Pijar Belajar'), 0)

Mobile.tap(findTestObject('FAQ/android.widget.TextView - Apa saja layanan dari Pijar Pijar Belajar'), 0)

Mobile.tap(findTestObject('FAQ/android.widget.TextView - Kemana saya bisa menghubungi layanan pelanggan Pijar Belajar'), 
    0)

Mobile.tap(findTestObject('FAQ/android.widget.TextView - Kemana saya bisa menghubungi layanan pelanggan Pijar Belajar'), 
    0)

