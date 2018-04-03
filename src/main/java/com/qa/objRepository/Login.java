package com.qa.objRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.genericLib.Constants;

public class Login {
@FindBy(name="user_name")
WebElement un;
@FindBy(name="user_password")
WebElement pwd;
@FindBy(id="submitButton")
WebElement loginBtn;
@FindBy(xpath="//div[@class='errorMessage']")
WebElement errMsg;
public void login(){
//	un.clear();
	un.sendKeys(Constants.un);
//	pwd.clear();
	pwd.sendKeys(Constants.pwd);
	loginBtn.click();
}
public String errorMessage(){
	try{
	String data=errMsg.getText();
	return data;
	}catch(Throwable s){
		System.out.println("Correct Cridential");
	}
	return "";
}
}
