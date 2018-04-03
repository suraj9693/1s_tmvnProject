package com.qa.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverCommLib {
	Actions a=new Actions(BaseClass.d);
public void waitForPageLoad(){
	BaseClass.d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
public void moveToElement(WebElement we){
	a.moveToElement(we).perform();
}
public void selectClass(WebElement we,String we1){
	Select s=new Select(we);
	s.selectByVisibleText(we1);
}
public void okAlert(){
	Alert a1=BaseClass.d.switchTo().alert();
	a1.accept();
}
public void cancelAlert(){
	Alert a1=BaseClass.d.switchTo().alert();
	a1.dismiss();
}
public void getTextAlert(){
	Alert a1=BaseClass.d.switchTo().alert();
	String data=a1.getText();
	System.out.println(data);
}

}
