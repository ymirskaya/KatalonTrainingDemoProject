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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dashboard-q.nabp.pharmacy/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_NABP/span_Access CPE Monitor, exam          appl_fec1e7'))

WebUI.setText(findTestObject('Object Repository/Page_NABP/input_processing_Username'), username)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_NABP/input_Forgot EmailUsername_Password'), 'l/sfTfc/4RiDvNTar50pxA==')

WebUI.click(findTestObject('Object Repository/Page_NABP/button_Log In'))

WebUI.click(findTestObject('Object Repository/Page_NABP/div_Browse and purchase CPE Activities need_2eddb2'))

WebUI.click(findTestObject('Object Repository/Page_NABP/mat-icon_arrow_forward'))

WebUI.click(findTestObject('Object Repository/Page_NABP/div_shopping_basketAdd to Basket'))

WebUI.click(findTestObject('Object Repository/Page_NABP/button_shopping_basket1'))

WebUI.click(findTestObject('Object Repository/Page_NABP/span_Checkout'))

WebUI.click(findTestObject('Object Repository/Page_NABP/span_Confirm and Pay'))

WebUI.setText(findTestObject('Object Repository/Page_NABP/input_PAYMENT DETAILS_mat-input-0'), 'Test')

WebUI.setText(findTestObject('Object Repository/Page_NABP/input_First Name_mat-input-1'), 'Testym')

WebUI.click(findTestObject('Object Repository/Page_NABP/input_Last Name_mat-input-2'))

WebUI.setText(findTestObject('Object Repository/Page_NABP/input_Last Name_mat-input-2'), '5220 0275 4333 1199')

WebUI.click(findTestObject('Object Repository/Page_NABP/div_Expiration Month_mat-select-arrow ng-tn_086cef'))

WebUI.click(findTestObject('Object Repository/Page_NABP/span_August'))

WebUI.click(findTestObject('Object Repository/Page_NABP/div_Expiration Year_mat-select-arrow ng-tns_e923c9'))

WebUI.click(findTestObject('Object Repository/Page_NABP/span_2021'))

WebUI.setText(findTestObject('Object Repository/Page_NABP/input_Expiration Year_mat-input-3'), '123')

WebUI.click(findTestObject('Object Repository/Page_NABP/div_Place Order_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Page_NABP/span_Place Order'))

WebUI.click(findTestObject('Object Repository/Page_NABP/button_OK'))

WebUI.closeBrowser()

