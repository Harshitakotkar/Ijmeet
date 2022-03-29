package com.ijmeet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ijmeet.uikeywords.Uikeywors;

public class Homepage {
	
Uikeywors keyword=Uikeywors.getInstance();
	
	public Homepage(){//intilize the page objects

		PageFactory.initElements(keyword.getDriver(),this);
	}

	@FindBy(xpath="//a[text()=\" Join Meeting \"]")
	WebElement joinmeeting;
	
	public void clickjoinmeetingtab() {
		joinmeeting.click();
	}
	
}
