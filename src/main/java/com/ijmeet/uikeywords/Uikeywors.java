package com.ijmeet.uikeywords;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Uikeywors {
	
 public   RemoteWebDriver driver;
 
 private static Uikeywors uikeywors;
	static{	
		uikeywors=new Uikeywors();
	}
	
	public static Uikeywors getInstance() {
		return uikeywors;
	}

 
 public void openBrowser(String browserName) {
	if(browserName.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if(browserName.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	else if(browserName.equalsIgnoreCase("microsoft edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	else {
		System.err.println("invalid browser name"+browserName);
	}
}
 
 public RemoteWebDriver getDriver() {
	 return driver; 
  }
 
 public void Openurl( String url) {
		driver.get(url);
	}
}
