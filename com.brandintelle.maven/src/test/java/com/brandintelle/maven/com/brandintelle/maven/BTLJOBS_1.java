package com.brandintelle.maven.com.brandintelle.maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BTLJOBS_1 extends BI_Login_Logout_BaseClass {
	@Test (priority = 2)
	public void BTLapp() throws Exception {
		logger = extent.createTest("BTL App Launching");
		driver.findElement(By.xpath("//*[@id=\"m_quicksearch\"]/m-portlet/div/div[3]/perfect-scrollbar/div/div[1]/div/div/div[1]")).click();

		Thread.sleep(3000);

		driver.switchTo().frame(0);

		Actions action = new Actions(driver);
		//			
		WebElement sidebar = driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[2]"));
		action.moveToElement(sidebar).build().perform();
		//			
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"minimizeSidebar\"]"));
		action.moveToElement(menu).click().perform();

		Thread.sleep(4000);
	}
	@Test (priority = 3)
	public void BTLJOB () throws Exception {
		logger = extent.createTest("BTL Job Create");

		Actions action1 = new Actions(driver);
		WebElement myjob = driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div[2]/app-sidebar/div[2]/ul/li[2]/a"));
		action1.moveToElement(myjob).click().perform();
		Thread.sleep(3000);

		WebElement createJob = driver.findElement(By.partialLinkText("Create Job"));
		action1.moveToElement(createJob).click().perform();
		//jobowner
		WebElement jobowner = driver.findElement(By.xpath("//*[@id=\"tab1\"]/div[2]/div[1]/div/span/button"));
		jobowner.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"dtJobOwnerList_filter\"]/label/input")).sendKeys("abhishek");
		WebElement seljobown = driver.findElement(By.xpath("//*[@id=\"dtJobOwnerList\"]/tbody/tr/td[2]"));
		seljobown.click();
		//period 
		WebElement periodfrom = driver.findElement(By.xpath("//*[@id=\"tab1\"]/div[3]/div[1]/div/input"));
		periodfrom.click();
		WebElement periodto = driver.findElement(By.xpath("//*[@id=\"tab1\"]/div[3]/div[2]/div/input"));
		periodto.click();
		//jobname
		WebElement jobname = driver.findElement(By.xpath("//*[@id=\"tab1\"]/div[6]/div[1]/div/input"));
		jobname.sendKeys("Sanyuktaa");
		//costcenter
		WebElement clkcc = driver.findElement(By.xpath("//*[@id=\"tab1\"]/div[6]/div[2]/div/span/button"));
		clkcc.click();
		WebElement costcenter = driver.findElement(By.xpath("//*[@id=\"dtCostCentreList_filter\"]/label/input"));
		costcenter.sendKeys("HUMAN RESOURCES");
		WebElement selectcc = driver.findElement(By.xpath("//*[@id=\"dtCostCentreList\"]/tbody/tr[1]/td[3]"));
		selectcc.click();
		//brand
		WebElement brand = driver.findElement(By.xpath("//*[@id=\"tab1\"]/div[7]/div[1]/div/span/button/i"));
		brand.click();
		WebElement serbrand = driver.findElement(By.xpath("//*[@id=\"dtBrandList_filter\"]/label/input"));
		serbrand.sendKeys("Brand 1");
		WebElement selbrand = driver.findElement(By.xpath("//*[@id=\"dtBrandList\"]/tbody/tr[3]/td[2]"));
		selbrand.click();
		//type
		WebElement type = driver.findElement(By.xpath("//*[@id=\"tab1\"]/div[7]/div[3]/div/span/button"));
		type.click();
		WebElement sertype = driver.findElement(By.xpath("//*[@id=\"dtTypeList_filter\"]/label/input"));
		sertype.sendKeys("bug");
		WebElement seltype = driver.findElement(By.xpath("//*[@id=\"dtTypeList\"]/tbody/tr/td"));
		seltype.click();
		//campaign
		WebElement campaign = driver.findElement(By.xpath("//*[@id=\"tab1\"]/div[10]/div[1]/div/span/button"));
		campaign.click();
		WebElement sercamp = driver.findElement(By.xpath("//*[@id=\"dtCampaignList_filter\"]/label/input"));
		sercamp.sendKeys("April month");
		WebElement selcamp = driver.findElement(By.xpath("//*[@id=\"dtCampaignList\"]/tbody/tr/td[2]"));
		selcamp.click();
		//Activity
		WebElement activity = driver.findElement(By.xpath("//*[@id=\"tab1\"]/div[10]/div[2]/div/span/button"));
		activity.click();
		WebElement seractivity = driver.findElement(By.xpath("//*[@id=\"dtActivityList_filter\"]/label/input"));
		seractivity.sendKeys("TT");	
		WebElement selactivity = driver.findElement(By.xpath("//*[@id=\"dtActivityList\"]/tbody/tr[1]/td"));
		selactivity.click();
		//Market
		WebElement market = driver.findElement(By.xpath("//*[@id=\"tab1\"]/div[11]/div[1]/div/span/button[1]"));
		market.click();
		WebElement sermarket = driver.findElement(By.xpath("//*[@id=\"dtMarketList_filter\"]/label/input"));
		sermarket.sendKeys("Delhi");
		WebElement Selmarket = driver.findElement(By.xpath("//*[@id=\"dtMarketList\"]/tbody/tr/td[2]"));
		Selmarket.click();
		//Description 
		WebElement description = driver.findElement(By.xpath("//*[@id=\"tab1\"]/div[13]/div/textarea"));
		description.sendKeys("TT");
		//vendor
		WebElement vendor = driver.findElement(By.xpath("//*[@id=\"btnShowVendors\"]"));
		vendor.click();
		WebElement servendor = driver.findElement(By.xpath("//*[@id=\"dtVendorList_filter\"]/label/input"));
		servendor.sendKeys("aarti");
		WebElement selvendor = driver.findElement(By.xpath("//*[@id=\"dtVendorList\"]/tbody/tr[2]/td[2]"));
		selvendor.click();
		//JobDetailsNext
		WebElement Next1 = driver.findElement(By.xpath("//*[@id=\"wizardForm\"]/div[3]/button[2]"));
		Next1.click();
		Thread.sleep(3000);	
	}
	@Test (priority = 4)
	public void BTLSUBActivity () throws Exception {
		logger = extent.createTest("BTL add subactivity");

		WebElement clknew = driver.findElement(By.xpath("//*[@id=\"tab2\"]/div/div[1]/div/button"));
		clknew.click();
		
		Thread.sleep(5000);	

		//select sub activity
		WebElement subactivity = driver.findElement(By.xpath("//*[@id=\"tab2\"]/div/div[2]/div[1]/div/span/button"));
		subactivity.click();
		WebElement sersubact = driver.findElement(By.xpath("//*[@id=\"dtSubActivityList_filter\"]/label/input"));
		sersubact.sendKeys("Testing");
		Thread.sleep(5000);	

		WebElement selsubact = driver.findElement(By.xpath("//*[@id=\"dtSubActivityList\"]/tbody/tr[1]/td[2]"));
		selsubact.click();
		Thread.sleep(5000);	
		//Quantity
		WebElement quantity = driver.findElement(By.xpath("//*[@id=\"tab2\"]/div/div[2]/div[3]/div[1]/div/input"));
		quantity.sendKeys("1000");
		//rate
		WebElement rate = driver.findElement(By.xpath("//*[@id=\"tab2\"]/div/div[2]/div[3]/div[2]/div/input"));
		rate.sendKeys("10");
		//save
		WebElement save = driver.findElement(By.xpath("//*[@id=\"tab2\"]/div/div[2]/button[1]"));
		save.click();
		//sub activity next
		WebElement Next2 = driver.findElement(By.xpath("//*[@id=\"wizardForm\"]/div[3]/button[2]"));
		Next2.click();
		Thread.sleep(3000);
	}
	@Test (priority = 5)
	public void Taxcommission () throws Exception{
		logger = extent.createTest("BTL add tax & commission");

		Thread.sleep(5000);	

		//Terms and Condition
		WebElement TC = driver.findElement(By.xpath("//*[@id=\"tab3\"]/div[7]/div[2]/div[1]/span/button"));
		TC.click();
		WebElement sertc = driver.findElement(By.xpath("//*[@id=\"dtTermsList_filter\"]/label/input"));
		sertc.sendKeys("100");
		
		Thread.sleep(5000);	

		WebElement seltc = driver.findElement(By.xpath("//*[@id=\"dtTermsList\"]/tbody/tr/td[2]"));
		seltc.click();
		//remark
		WebElement remark = driver.findElement(By.xpath("//*[@id=\"tab3\"]/div[7]/div[3]/div/textarea"));
		remark.sendKeys("ABCD");
		//Attachments
		WebElement attachments = driver.findElement(By.xpath("//*[@id=\"tab3\"]/div[7]/div[2]/div[3]/div/div[1]/div/label"));
		attachments.click();
		Thread.sleep(4000);
		
		// to Exe standalone application
       Runtime.getRuntime().exec("E:\\Automation testing\\AutoITWorkspace\\FileUpload_BTLJOB.exe");		
		Thread.sleep(4000);
		WebElement seldoctype = driver.findElement(By.xpath("//*[@id=\"tab3\"]/div[7]/div[2]/div[3]/div/div[2]/div[2]/table/tbody/tr/td[2]/div[2]/ng-multiselect-dropdown/div/div[1]/span"));
		seldoctype.click();
		WebElement agencydoc = driver.findElement(By.xpath("//*[@id=\"tab3\"]/div[7]/div[2]/div[3]/div/div[2]/div[2]/table/tbody/tr/td[2]/div[2]/ng-multiselect-dropdown/div/div[3]/ul[2]/li[1]/div"));
		agencydoc.click();
		WebElement taxcommnext = driver.findElement(By.xpath("//*[@id=\"wizardForm\"]/div[3]/button[2]"));
		taxcommnext.click();
		
	}
	@Test (priority = 6)
	public void Review() {
		logger = extent.createTest("Open Review");

		WebElement review = driver.findElement(By.xpath("//*[@id=\"wizardForm\"]/div[3]/button[3]"));
		review.click();
			
	}
	@Test(priority = 7)
	public void savejobpopup() {
		logger = extent.createTest("BTL Job Saving");

		WebElement SJpopup = driver.findElement(By.xpath("/html/body/div/div/button[1]"));
		SJpopup.click();
	}
}

// //*[@id="wizardForm"]/div[3]/button[2]

//for (int i =1; i<=3; i++){
// thread.sleep
// button.click()
//}
