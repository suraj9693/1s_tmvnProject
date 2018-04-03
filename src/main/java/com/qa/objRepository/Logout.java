package com.qa.objRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.genericLib.WebDriverCommLib;



public class Logout {
@FindBy(xpath="//span[text()=' Administrator']/../../td[2]/img")
WebElement we;
@FindBy(xpath="//a[text()='Sign Out']")
WebElement we1;
public void logout(){
	WebDriverCommLib w=new WebDriverCommLib();
	w.moveToElement(we);
	we1.click();
}
}
