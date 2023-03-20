package com.vcentry.lab.initializer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.vcentry.lab.utils.ReportOptimizer;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Initializer {
	/**
	 * @author New
	 * @created_date = 18th march 2023
	 * @purpose = to initialize the report variables
	 * 
	 */

	public static ExtentReports reports;
	public static ExtentTest log;
	public static boolean isReport=true;
	/**
	 * @author New
	 * @created_date = 3rd march 2023
	 * @purpose = to initialize the environmental variables
	 * 
	 */
	public static Properties envProp = null;
	/**
	 * @author New
	 * @created_date = 3rd march 2023
	 * @purpose = to initialize the locator variables
	 * 
	 */
	public static Properties locatorProp = null;

	public static WebDriver wd = null;

	/**
	 * @author New
	 * @created_date = 3rd march 2023
	 * @purpose = to initialize the env.properties and locator.properties files
	 * @throws IOException
	 */
	public static void Initialize() throws IOException {
		
		if(isReport){
			ReportOptimizer.optimizeReport();
			System.err.println("inside");
		reports = new ExtentReports("D:/Program Files/workspace/workspace/H2_DDDTest/report/index.html");
		isReport=false;
		}
		
		envProp = new Properties();
		envProp.load(new FileInputStream(new File("src/test/resources/com/vcentry/lab/config/env.properties")));

		locatorProp = new Properties();
		locatorProp.load(new FileInputStream(new File("src/test/resources/com/vcentry/lab/config/locator.properties")));
		
		if(wd==null){
		if(envProp.get("BROWSER").equals("chrome")){
		WebDriverManager.chromedriver().setup();
		wd = new ChromeDriver();
		}
		else if(envProp.get("BROWSER").equals("firefox")){
			WebDriverManager.firefoxdriver().setup();
			wd = new FirefoxDriver();
			}
		else if(envProp.get("BROWSER").equals("IE")){
			WebDriverManager.iedriver().setup();
			wd = new InternetExplorerDriver();
			}	
		}
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wd.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}
}
