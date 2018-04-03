package com.qa.Finaltest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.qa.genericLib.BaseClass;
import com.qa.genericLib.ExcellLib;
import com.qa.objRepository.VtigerWithGenericData;

public class VtigerGeneric extends BaseClass{
@Test(dataProvider="getData")
public void vtigerTest(String un, String pwd){
	System.out.println("Running Test");
	VtigerWithGenericData v=PageFactory.initElements(d, VtigerWithGenericData.class);
	v.login(un, pwd);
	v.errorMessage();
	
}
@DataProvider
public Object[][] getData() throws Exception{
	ExcellLib e=new ExcellLib();
	Object[][] ob=new Object[5][2];
	for(int i=0;i<ob.length;i++){
		ob[i][0]=e.getExcelData("Sheet1", i, 0);
		ob[i][1]=e.getExcelData("Sheet1", i, 1);
	}
	return ob;
}
}
