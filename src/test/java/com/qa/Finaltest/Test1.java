package com.qa.Finaltest;

import org.testng.annotations.Test;

import com.qa.genericLib.BaseClass;
import com.qa.genericLib.WebDriverScreenshot;

public class Test1 extends BaseClass {
@Test
public void ATest(){
	System.out.println("Running test 1");
}
@Test
public void BTest() throws Exception{
	System.out.println("Running test 2");
	WebDriverScreenshot we=new WebDriverScreenshot();
	we.screenshot("Check");
}
}
