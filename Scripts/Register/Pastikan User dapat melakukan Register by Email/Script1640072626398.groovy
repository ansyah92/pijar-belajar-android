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

Mobile.startApplication(GlobalVariable.apk_path, false)

Mobile.verifyElementText(findTestObject('Register By Email/android.widget.TextView - Hai, Sobat Pijar'), 'Hai, Sobat Pijar!')

Mobile.tap(findTestObject('Register By Email/Button-Next1'), 0)

Mobile.verifyElementText(findTestObject('Register By Email/android.widget.TextView - Kapanpun dan Dimanapun'), 'Kapanpun dan Dimanapun')

Mobile.tap(findTestObject('Register By Email/Button-Next2'), 0)

Mobile.verifyElementText(findTestObject('Register By Email/android.widget.TextView - Yuk Mulai Belajar'), 'Yuk Mulai Belajar!')

Mobile.tap(findTestObject('Register By Email/Button - Daftar'), 0)

Mobile.verifyElementText(findTestObject('Register By Email/android.widget.TextView - Yuk, Daftar'), 'Yuk, Daftar!')

Mobile.setText(findTestObject('Register By Email/Field - Email'), 'nayla@yopmail.com', 0)

Mobile.tap(findTestObject('Register By Email/Button - Lanjutkan'), 0)

Mobile.verifyElementText(findTestObject('Register By Email/android.widget.TextView - Masukkan Kode Verifikasi'), 'Masukkan Kode Verifikasi')

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Register By Email/android.widget.TextView - Isi Profilmu'), 'Isi Profilmu')

Mobile.setText(findTestObject('Register By Email/Filed - Nama Lengkap'), 'Nayla', 0)

Mobile.setText(findTestObject('Register By Email/Field - No Telepon'), '897762514412', 0)

Mobile.setText(findTestObject('Register By Email/Field -  Password'), '12345678', 0)

Mobile.tap(findTestObject('Register By Email/Button - Eye'), 0)

Mobile.tap(findTestObject('Register By Email/Button - Lanjutkan 2'), 0)

Mobile.verifyElementText(findTestObject('Register By Email/android.widget.TextView - Isi Pendidikan'), 'Isi Pendidikan')

Mobile.tap(findTestObject('Register By Email/Button- Kelas 1'), 0)

Mobile.tap(findTestObject('Register By Email/Button - Kelas 8'), 0)

Mobile.tap(findTestObject('Register By Email/Button - Kelas 12 IPS'), 0)

Mobile.tap(findTestObject('Register By Email/Button - Selesai'), 0)

