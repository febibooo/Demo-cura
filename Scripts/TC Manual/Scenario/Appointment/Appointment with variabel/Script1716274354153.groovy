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

WebUI.callTestCase(findTestCase('TC Manual/Reuseable TC/block_Login by menu toggle'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object spy/Make appointment page/dropdown_Facility'), 0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Object spy/Make appointment page/dropdown_Facility'), facility, 
    false)



if(hospital_readmission==true) {
	WebUI.check(findTestObject('Object spy/Make appointment page/check_Apply for hospital readmission'))
}

def healthcare_programswitch (select_radio) {
	switch (select_radio) {
		case 'medicare':
			println(select_radio)
			WebUI.click(findTestObject('Object spy/Make appointment page/radio_Medicare'))
			break
		case 'medicaid':
			println(select_radio)
			WebUI.click(findTestObject('Object spy/Make appointment page/radio_Medicaid'))
			break
		case 'none':
			println(select_radio)
			WebUI.click(findTestObject('Object spy/Make appointment page/radio_None'))
			break
		default:
			println(select_radio)
			WebUI.click(findTestObject('Object spy/Make appointment page/radio_None'))
			break
	}
}