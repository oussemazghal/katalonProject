import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

class NewTestListener {
    /**
     * Executes before every test case starts.
     * Ensures the user is logged out before starting a test case.
     */
    @BeforeTestCase
    def beforeTestCase(TestCaseContext testCaseContext) {
        println "Starting Test Case: ${testCaseContext.getTestCaseId()}"
        
        // Verify if user is logged in and log out if necessary
        try {
            if (WebUI.verifyElementPresent(findTestObject('Object Repository/LogoutButton'), 5, FailureHandling.OPTIONAL)) {
                WebUI.click(findTestObject('Object Repository/LogoutButton'))
                println "User logged out successfully before test case."
            } else {
                println "No user was logged in."
            }
        } catch (Exception e) {
            println "Error during logout check: ${e.message}"
        }
    }
    
    /**
     * Executes after every test case ends.
     * Prints test case ID and status, and handles post-test cleanup if needed.
     */
    @AfterTestCase
    def afterTestCase(TestCaseContext testCaseContext) {
        println "Finished Test Case: ${testCaseContext.getTestCaseId()}"
        println "Status: ${testCaseContext.getTestCaseStatus()}"
        
        // Additional cleanup logic if required
    }
    
    /**
     * Executes before a test suite starts.
     */
    @BeforeTestSuite
    def beforeTestSuite(TestSuiteContext testSuiteContext) {
        println "Starting Test Suite: ${testSuiteContext.getTestSuiteId()}"
    }
    
    /**
     * Executes after a test suite ends.
     */
    @AfterTestSuite
    def afterTestSuite(TestSuiteContext testSuiteContext) {
        println "Finished Test Suite: ${testSuiteContext.getTestSuiteId()}"
    }
}
