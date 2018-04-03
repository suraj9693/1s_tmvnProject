package com.qa.objRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;


public class FindBysUse_ObjRepsitry {
@FindBys({@FindBy(xpath="//a")})
List<WebElement> we;
public void aaaa(){
	for(int i=1;i<we.size();i++){
		System.out.println(we.get(i).getText());
	}
}
}

