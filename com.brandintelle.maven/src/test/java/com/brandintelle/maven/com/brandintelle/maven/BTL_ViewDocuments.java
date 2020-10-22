package com.brandintelle.maven.com.brandintelle.maven;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BTL_ViewDocuments extends BI_Login_Logout_BaseClass{

	@Test (priority = 8)
	public void viewdocuments() throws Exception {
		logger = extent.createTest("BTL Documenet View");

	
		WebElement docview = driver.findElement(By.xpath("//*[@id=\"dtjobList\"]/tbody/tr[1]/td[1]/div/button"));
		docview.click();
		WebElement clkdoc = driver.findElement(By.xpath("//*[@id=\"docdownload\"]/a"));
		clkdoc.click();
		Thread.sleep(3000);
		WebElement clkdrop = driver.findElement(By.xpath("//*[@id=\"accordion\"]/div/a/div/h4/i"));
		clkdrop.click();
		WebElement download = driver.findElement(By.xpath("//*[@id=\"collapseTwo0\"]/div/div/table/tbody/tr/td[4]/a/i"));
		download.click();
		Thread.sleep(3000);
		WebElement cutviewdoc = driver.findElement(By.xpath("//*[@id=\"myJobAttachment\"]/div/div/div[1]/button"));
		cutviewdoc.click();
		Thread.sleep(3000);
		WebElement closeapp = driver.findElement(By.xpath("//*[@id=\"m-header\"]/div[2]/div/div/div[2]/span[5]/img"));
		closeapp.click();
		
		
	}
	
	
}
