package com.ijmeet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ijmeet.uikeywords.Uikeywors;

public class HostmeetingPage {
	
Uikeywors keyword=Uikeywors.getInstance();
	
	public HostmeetingPage(){//intilize the page objects

		PageFactory.initElements(keyword.getDriver(),this);
	}
	
	
 @FindBy(xpath="//a[@class=\"button button--light\"]")
 WebElement tryitfor14daystab;
	
	public void clickontryfreebutton() {
		tryitfor14daystab.click();
	}
	
	
}
