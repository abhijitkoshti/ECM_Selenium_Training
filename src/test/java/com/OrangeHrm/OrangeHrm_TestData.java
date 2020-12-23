package com.OrangeHrm;

import org.testng.annotations.DataProvider;

public class OrangeHrm_TestData {
	
	//-------------------------------------------- This is to read Excel Data------------

		@DataProvider(name = "LoginExcelData")
		public Object[][] Authentication() throws Exception{
			ReadDataFromExcel_xls excel = new ReadDataFromExcel_xls();
			//String RelativePath = System.getProperty("user.dir");
			Object[][] testObjArray = excel.getExcelData("C:\\Selenium_Training\\workspace\\OrangeHrm_Demo\\OrangeHrm_TestData.xls","SignIn");
			//Object[][] testObjArray = excel.getExcelData(RelativePath+"\\OrangeHrm_TestData.xls","SignIn");
			System.out.println(testObjArray);
			return testObjArray;

		}
	

}
