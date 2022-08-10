package com.hrms.lib;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class General extends Global {
public void openApplication(){
	System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.navigate().to(url);
	System.out.println("Application is opened");
}
public void login() {
	driver.findElement(By.name(txt_loginname)).sendKeys(un);
	driver.findElement(By.name(txt_Password)).sendKeys(pw);
	driver.findElement(By.name(btn_login)).click();
	System.out.println("login is completed");	
}
public void logout() {
	driver.findElement(By.linkText(link_logout)).click();
	System.out.println("log out is completed");
}
public void closeApplication() {
driver.close();	
}
public void enterFrame() {
	driver.switchTo().frame(frm_empinfo);
	System.out.println("enter into frame");
}
public void exitFrame() {
	driver.switchTo().defaultContent();
	System.out.println("exit to frame");
}
	public void addNewEmp() {
	driver.findElement(By.xpath(Add_btn)).click();
	driver.findElement(By.name(txt_empFN)).sendKeys(FN);
	driver.findElement(By.name(txt_empLN)).sendKeys(LN);
	driver.findElement(By.name(txt_empNN)).sendKeys(NN);
	driver.findElement(By.id(save_btn)).click();
	System.out.println("new emp is added");	
	}
	
}

