package com.qa.genericLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class WebDriverScreenshot {
public void screenshot(String s) throws IOException{
	EventFiringWebDriver efw=new EventFiringWebDriver(BaseClass.d);
	File src=efw.getScreenshotAs(OutputType.FILE);
	File des=new File("./src/test/resources/Screenshots/"+s+".png");
	FileUtils.copyFile(src, des);
	
}
}
