package com.ijmeet.pagestests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ijmeet.Baseframework.Baseclass;
import com.ijmeet.pages.Homepage;
import com.ijmeet.pages.JoinmeetingPage;
import com.ijmeet.pages.MeetingPage;
import com.ijmeet.uikeywords.Uikeywors;

public class JoinmeetingPageTest extends Baseclass {
	Uikeywors keyword = Uikeywors.getInstance();

	@Test(enabled = false)
	public void verifyuserjoinmeeting() throws InterruptedException {
		keyword.Openurl("https://ijmeet.com/app?csrt=15384107620939558850");
		/*
		 * Homepage page=new Homepage(); page.clickjoinmeetingtab();
		 */
		JoinmeetingPage page1 = new JoinmeetingPage();
		Thread.sleep(2000);
		page1.clickonjoinmeeting("harshu", "cdfe0b2");
		page1.clickonjoinmeetingbutton("git123");
		MeetingPage page2 = new MeetingPage();
		String actual = page2.titleofmeetingpage();
		Assert.assertEquals(actual, "IJmeet", "Testcase is passed");

	}

	@Test
	public void verifyuseraudiobuttonclickable() throws InterruptedException {
		keyword.Openurl("https://ijmeet.com/app?csrt=15384107620939558850");
		/*
		 * Homepage page=new Homepage(); page.clickjoinmeetingtab();
		 */
		JoinmeetingPage page1 = new JoinmeetingPage();
		Thread.sleep(2000);
		page1.clickonjoinmeeting("harshu", "cdfe0b2");
		page1.clickonjoinmeetingbutton("git123");
		MeetingPage page2 = new MeetingPage();
		page2.clickaudiobtn();

	}
}
