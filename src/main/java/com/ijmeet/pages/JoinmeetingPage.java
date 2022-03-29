package com.ijmeet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ijmeet.Baseframework.Baseclass;
import com.ijmeet.uikeywords.Uikeywors;

public class JoinmeetingPage extends Baseclass {
Uikeywors keyword=Uikeywors.getInstance();
	
	public JoinmeetingPage(){//intilize the page objects

		PageFactory.initElements(keyword.getDriver(),this);
	}
	
	@FindBy(xpath="//input[@id=\"username\"]")
	WebElement name;
	

	@FindBy(xpath="//input[@id=\"meetingid\"]")
	WebElement meetingid;
	
    @FindBy(xpath="//input[@id=\"passcode\"]")
    WebElement passcode;
    
	@FindBy(xpath="//button[@id=\"before_start\"]")
	WebElement joinmeeting;
	
	public void clickonjoinmeeting(String Name, String Meetingid) {
		 name.sendKeys(Name);
		 meetingid.sendKeys(Meetingid);
		 joinmeeting.click();
	}


	public void clickonjoinmeetingbutton(String Passcode) {
		 passcode.sendKeys(Passcode);
		
		 joinmeeting.click();
	}

}
