package com.qa.objRepository;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.annotations.Test;

public class CapturingAllTrendingNewsInYahoo {
@FindBys({@FindBy(tagName="a")})
List<WebElement> we;
public void  A(){
	for(int i=1;i<we.size();i++){
		System.out.println(we.get(i).getText());
	}
}
@Test
public void BTest(){
	System.setProperty("webdriver.edge.driver", "./src/main/resources/Resources/MicrosoftWebDriver.exe");
	WebDriver d=new EdgeDriver();
	d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	d.get("https://www.yahoo.com");
	CapturingAllTrendingNewsInYahoo a=new CapturingAllTrendingNewsInYahoo();
	a.A();
	d.close();
}
}
