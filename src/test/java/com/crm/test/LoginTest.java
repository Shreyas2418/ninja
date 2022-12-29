package com.crm.test;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.crm.base.ExcelReader;
import com.crm.base.Keywords;

public class LoginTest {
	
	@Test
	public void loginTest() {
		Keywords key = new Keywords();
		ArrayList testData = ExcelReader.getTestData("D://test//sfLogin.xlsx");
		for (int i = 0; i < testData.size(); i++) {
			if(testData.get(i).equals("open")) {
				key.open();
			}
			if(testData.get(i).equals("url")) {
				String httpUrl = testData.get(i+1).toString();
				key.url(httpUrl);
			}
			if(testData.get(i).equals("click1")) {
				String objectName = testData.get(i+2).toString();
				key.click1(objectName);
			}
			if(testData.get(i).equals("input")) {
				String data = testData.get(i+1).toString();
				String pass = testData.get(i+2).toString();
				key.input(data,pass);
			}
			if(testData.get(i).equals("click2")) {
				String objectName = testData.get(i+2).toString();
				key.click2(objectName);
			}
			if(testData.get(i).equals("click3")) {
				String objectName = testData.get(i+2).toString();
				key.click3(objectName);
			}
			if(testData.get(i).equals("click4")) {
				String objectName = testData.get(i+2).toString();
				key.click4(objectName);
			}
		}
	}
}
