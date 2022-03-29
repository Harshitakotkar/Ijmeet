package com.ijmeet.Baseframework;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.ijmeet.uikeywords.Uikeywors;

public class Baseclass {
	public  static WebDriver driver;
	Uikeywors keyword=Uikeywors.getInstance();
	
	@BeforeMethod
	public void lauchbrowser() {
	 keyword.openBrowser("chrome");
	}
	
	
}
