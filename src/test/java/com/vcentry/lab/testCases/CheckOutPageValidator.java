package com.vcentry.lab.testCases;

import java.io.File;
import java.io.IOException;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.vcentry.lab.initializer.Initializer;
import com.vcentry.lab.initializer.Locator;
import com.vcentry.lab.inputReader.InputReader;
import com.vcentry.lab.pages.CheckoutPage;
import com.vcentry.lab.pages.HomePage;
import com.vcentry.lab.pages.LoginPage;
import com.vcentry.lab.screenshotGenerator.ScreenshotGenerator;

public class CheckOutPageValidator extends Initializer {
	@BeforeTest
	public void setup() throws IOException {
		//Initialize();
	}

	@Test(dataProvider = "CheckoutTest")
	public void validateCheckoutPage(String testData, String user, String password, String productname, String mobile,
			String email, String prodcat, String productQty, String purchaser, String GST, String Payment)
			throws IOException, InterruptedException {
		Initialize();
		log = reports.startTest("start " + testData, "validate -" + testData);
		log.log(LogStatus.PASS, testData+"- initialized");
		wd.get(envProp.getProperty("URL"));
		log.log(LogStatus.PASS, "URL loaded Successfully"); 
		/*
		 * step 1 wd.findElement(By.name("username")).sendKeys(
		 * "sibichandru1993@gmail.com");
		 * wd.findElement(By.name("password")).sendKeys("Password@123");
		 * wd.findElement(By.name("password")).submit();
		 */

		/*
		 * step 2 wd.findElement(By.name(locatorProp.getProperty(
		 * "LOGINPAGE_TYPE_USERNAME_NAME"))).sendKeys(
		 * "sibichandru1993@gmail.com");
		 * wd.findElement(By.name(locatorProp.getProperty(
		 * "LOGINPAGE_TYPE_PASSWORD_NAME"))).sendKeys("Password@123");
		 * wd.findElement(By.name(locatorProp.getProperty(
		 * "LOGINPAGE_TYPE_PASSWORD_NAME"))).submit();
		 */

		/*
		 * step 3
		 * Locator.getElementByName("LOGINPAGE_TYPE_USERNAME_NAME").sendKeys(
		 * "sibichandru1993@gmail.com");
		 * Locator.getElementByName("LOGINPAGE_TYPE_PASSWORD_NAME").sendKeys(
		 * "Password@123");
		 * Locator.getElementByName("LOGINPAGE_TYPE_PASSWORD_NAME").submit();
		 */

		LoginPage.enterUsername(user);
		LoginPage.enterPassword(password);
		LoginPage.clickLogin();
		log.log(LogStatus.PASS, "Login Successful");
		Thread.sleep(2000);
		wd.get(envProp.getProperty("LAB_URL"));
		Thread.sleep(2000);
		HomePage.clickFrameworkform();
		HomePage.clickSimpleform();
		CheckoutPage.enterProductName(productname);
		CheckoutPage.enterMobileNumber(mobile);
		CheckoutPage.enterEmailaddress(email);
		CheckoutPage.clickProductCategory(prodcat);
		CheckoutPage.enterProductquantity(productQty);
		CheckoutPage.enterPurchaserName(purchaser);
		// CheckoutPage.clickGST();
		CheckoutPage.clickGSTapplied(GST);
		// CheckoutPage.clickAvailablePaymentMethod(Payment);
		CheckoutPage.clickAvailablePaymentMethod(Payment);
		Thread.sleep(2000);
		CheckoutPage.clickPlaceorder();
		log.log(LogStatus.PASS, "CheckOutPage completed Successfully");
		

	}

	@DataProvider(name = "CheckoutTest")
	public static Object[][] getData() throws IOException {
		if (InputReader.verifyRunMode("CheckOutPageValidator")) {

			Object[][] data = InputReader.verifyMultiData("CheckOutPageValidator");

			return data;
		}
		return null;

	}

	@AfterMethod
	public void teardown(ITestResult r) throws IOException {
		
		// logout
		ScreenshotGenerator.generateScreenshot(r);
		HomePage.clickLogout();
		
	}

	
}
