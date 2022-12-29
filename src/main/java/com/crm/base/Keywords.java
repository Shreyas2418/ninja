package com.crm.base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keywords {
	ChromeDriver driver;
	FileInputStream fis;
	Properties prop;
	public void open() {
		try {
			System.setProperty("webdriver.chrome.driver", "D://selenium files//chromedriver.exe");
			driver = new ChromeDriver();
			
			fis = new FileInputStream("D:\\New folder\\crmApp_4\\src\\main\\java\\com\\crm\\base\\objectRepository.properties");
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void url(String httpUrl) {
		driver.get(httpUrl);
	}

	public void click1(String objectName) {
		driver.findElement(By.xpath(prop.getProperty(objectName))).click();
		
	}

	public void input(String data, String pass) {
		driver.findElement(By.xpath(prop.getProperty(pass))).sendKeys(data);
		
	}

	public void click2(String objectName) {
		driver.findElement(By.xpath(prop.getProperty(objectName))).click();
		
	}

	public void click3(String objectName) {
		driver.findElement(By.xpath(prop.getProperty(objectName))).click();
		
	}

	public void click4(String objectName) {
		driver.findElement(By.xpath(prop.getProperty(objectName))).click();
		
	}
	
	
}
