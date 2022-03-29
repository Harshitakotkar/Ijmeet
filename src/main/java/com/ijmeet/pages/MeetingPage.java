package com.ijmeet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ijmeet.uikeywords.Uikeywors;

public class MeetingPage {
	
	Uikeywors keyword=Uikeywors.getInstance();
	
	public MeetingPage(){//intilize the page objects

		PageFactory.initElements(keyword.getDriver(),this);
	}
	
	
	public String titleofmeetingpage() {
		return keyword.getDriver().getTitle();
	}

	@FindBy(xpath="//div[@class=\"audio-preview\"]")
	WebElement audiobutton;
	
	
	public void clickaudiobtn() {
		audiobutton.click();
	}
}
