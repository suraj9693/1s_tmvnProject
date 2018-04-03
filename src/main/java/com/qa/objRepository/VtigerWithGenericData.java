package com.qa.objRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

import com.qa.genericLib.BaseClass;

public class VtigerWithGenericData {
	SoftAssert s=new SoftAssert();
	@FindBy(name="user_name")
	WebElement unn;
	@FindBy(name="user_password")
	WebElement pwdd;
	@FindBy(id="submitButton")
	WebElement loginBtn;
	@FindBy(xpath="//div[@class='errorMessage']")
	WebElement errMsg;
	public void login(String un, String pwd){
		unn.clear();
		unn.sendKeys(un);
		pwdd.clear();
		pwdd.sendKeys(pwd);
		loginBtn.click();
	}
	public String errorMessage(){
		try{
		System.out.println(errMsg.getText());
		return null;
		}catch(Throwable r){
			if(BaseClass.d.getTitle().equals("Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM")){
				System.out.println("Correct Cridential");
			}else{
				System.out.println("incorrect cridentials");
			}
		}
		return null;
	}
	}
