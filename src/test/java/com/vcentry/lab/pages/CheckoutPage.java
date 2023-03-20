package com.vcentry.lab.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.vcentry.lab.initializer.Locator;

public class CheckoutPage {

	public static void enterProductName(String data) {
		Locator.getElementByID("CHECKOUTPAGE_TYPE_PRODUCT_ID").sendKeys(data);
	}

	public static void enterMobileNumber(String data) {
		Locator.getElementByID("CHECKOUTPAGE_TYPE_MOBILE_ID").sendKeys(data);
	}

	public static void enterEmailaddress(String data) {
		Locator.getElementByID("CHECKOUTPAGE_TYPE_EMAIL_ID").sendKeys(data);
	}

	public static void clickProductCategory(String data) {
		WebElement element = Locator.getElementByID("CHECKOUTPAGE_CLICK_PROCATEGORY_ID");
		Select s = new Select(element);
		s.selectByVisibleText(data);
	}

	public static void enterProductquantity(String data) {
		Locator.getElementByID("CHECKOUTPAGE_TYPE_PROQUANTITY_ID").sendKeys(data);
	}

	public static void enterPurchaserName(String data) {
		Locator.getElementByID("CHECKOUTPAGE_TYPE_PURCHASER_ID").sendKeys(data);
	}

	public static void clickGSTapplied(String data) {
		List<WebElement> element = Locator.getElementsByName("CHECKOUTPAGE_CLICK_GSTAPPLIED_NAME");
		for (int i = 0; i < element.size(); i++) {
			String input = element.get(i).getAttribute("value");
			if (input.equalsIgnoreCase(data)) {
				element.get(i).click();
			}

		}
	}

	public static void clickAvailablePaymentMethod(String data) {
		List<WebElement> element = Locator.getElementsByClassname("CHECKOUTPAGE_CLICK_AVAILABLEPAYMENET_CLASSS");
		for (int i = 0; i < element.size(); i++) {
			String input = element.get(i).getAttribute("name");
			if (input.equalsIgnoreCase(data)) {
				element.get(i).click();
			}

		}
	}
	public static void clickGST(){
		Locator.getElementByID("CHECKOUTPAGE_CLICK_GSTAPPLIED_NAME").click();
	}
	
	public static void clickCOD(){
		Locator.getElementByID("CHECKOUTPAGE_CLICK_COD_ID").click();
	}
	
	public static void clickPlaceorder() {
		Locator.getElementByName("CHECKOUTPAGE_CLICK_PLACEORDER_NAME").click();
	}

}