package com.vcentry.lab.initializer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locator extends Initializer {

	public static WebElement getElementByName(String key) {
		try {
			WebElement elem = wd.findElement(By.name(locatorProp.getProperty(key)));
			return elem;
		} catch (Exception e) {
			System.out.println("Alert: unable to find element by name - " + key + " - " + e.getMessage());
		}
		return null;

	}

	public static WebElement getElementByID(String key) {
		try {
			WebElement elem = wd.findElement(By.id(locatorProp.getProperty(key)));
			return elem;
		} catch (Exception e) {
			System.out.println("Alert: unable to find element by ID - " + key + " - " + e.getMessage());
		}
		return null;

	}

	public static WebElement getElementByXpath(String key) {
		try {
			WebElement elem = wd.findElement(By.xpath(locatorProp.getProperty(key)));
			return elem;
		} catch (Exception e) {
			System.out.println("Alert: unable to find element by Xpath - " + key + " - " + e.getMessage());
		}
		return null;

	}

	public static WebElement getElementByCSS(String key) {
		try {
			WebElement elem = wd.findElement(By.cssSelector(locatorProp.getProperty(key)));
			return elem;
		} catch (Exception e) {
			System.out.println("Alert: unable to find element by cssSelector - " + key + " - " + e.getMessage());
		}
		return null;

	}

	public static WebElement getElementByLinktext(String key) {
		try {
			WebElement elem = wd.findElement(By.linkText(locatorProp.getProperty(key)));
			return elem;
		} catch (Exception e) {
			System.out.println("Alert: unable to find element by linkText - " + key + " - " + e.getMessage());
		}
		return null;
	}

	public static WebElement getElementByPartialLinkText(String key) {
		try {
			WebElement elem = wd.findElement(By.partialLinkText(locatorProp.getProperty(key)));
			return elem;
		} catch (Exception e) {
			System.out.println("Alert: unable to find element by partial link text- " + key + " - " + e.getMessage());
		}
		return null;
	}

	public static WebElement getElementByClassname(String key) {
		try {
			WebElement elem = wd.findElement(By.className(locatorProp.getProperty(key)));
			return elem;
		} catch (Exception e) {
			System.out.println("Alert: unable to find element by className - " + key + " - " + e.getMessage());
		}
		return null;
	}

	public static WebElement getElementBytagName(String key) {
		try {
			WebElement elem = wd.findElement(By.tagName(locatorProp.getProperty(key)));
			return elem;
		} catch (Exception e) {
			System.out.println("Alert: unable to find element by tagName - " + key + " - " + e.getMessage());
		}
		return null;
	}

	public static List<WebElement> getElementsByName(String key) {
		try {
			List<WebElement> elem = wd.findElements(By.name(locatorProp.getProperty(key)));
			return elem;
		} catch (Exception e) {
			System.out.println("Alert: unable to find element by name - " + key + " - " + e.getMessage());
		}
		return null;

	}

	public static List<WebElement> getElementsByID(String key) {
		try {
			List<WebElement> elem = wd.findElements(By.id(locatorProp.getProperty(key)));
			return elem;
		} catch (Exception e) {
			System.out.println("Alert: unable to find element by id - " + key + " - " + e.getMessage());
		}
		return null;

	}

	public static List<WebElement> getElementsByXpath(String key) {
		try {
			List<WebElement> elem = wd.findElements(By.xpath(locatorProp.getProperty(key)));
			return elem;
		} catch (Exception e) {
			System.out.println("Alert: unable to find element by xpath- " + key + " - " + e.getMessage());
		}
		return null;

	}

	public static List<WebElement> getElementsByCSS(String key) {
		try {
			List<WebElement> elem = wd.findElements(By.cssSelector(locatorProp.getProperty(key)));
			return elem;
		} catch (Exception e) {
			System.out.println("Alert: unable to find element by css selector - " + key + " - " + e.getMessage());
		}
		return null;

	}

	public static List<WebElement> getElementsLinktext(String key) {
		try {
			List<WebElement> elem = wd.findElements(By.linkText(locatorProp.getProperty(key)));
			return elem;
		} catch (Exception e) {
			System.out.println("Alert: unable to find element by linkText- " + key + " - " + e.getMessage());
		}
		return null;

	}

	public static List<WebElement> getElementsByPartiallinktext(String key) {
		try {
			List<WebElement> elem = wd.findElements(By.partialLinkText(locatorProp.getProperty(key)));
			return elem;
		} catch (Exception e) {
			System.out.println("Alert: unable to find element by partial link text - " + key + " - " + e.getMessage());
		}
		return null;

	}

	public static List<WebElement> getElementsByClassname(String key) {
		try {
			List<WebElement> elem = wd.findElements(By.className(locatorProp.getProperty(key)));
			return elem;
		} catch (Exception e) {
			System.out.println("Alert: unable to find element by class name- " + key + " - " + e.getMessage());
		}
		return null;

	}

	public static List<WebElement> getElementsByTagname(String key) {
		try {
			List<WebElement> elem = wd.findElements(By.tagName(locatorProp.getProperty(key)));
			return elem;
		} catch (Exception e) {
			System.out.println("Alert: unable to find element by tag name- " + key + " - " + e.getMessage());
		}
		return null;

	}
}
