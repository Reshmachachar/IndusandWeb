package com.ind.testCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.ind.Base.TestBase;
import com.ind.pageObjects.IndusindHomepage;
import com.ind.utilities.ExtentListeners;
import com.ind.utilities.TestData;
public class IndusindTestNegative extends TestBase {
	TestData testdata;
	ExtentListeners e=new ExtentListeners();
//An_ExtentReport extentTest=new An_ExtentReport();
	public static IndusindHomepage homepage;
	@Test
	public void TC01_ExplorePoduct() throws Exception
	{
		driver.get(baseUrl);
		e.test.log(Status.INFO,"Base URL open successfully");
		homepage=new IndusindHomepage(driver);
		//close pop-up
        Thread.sleep(2300);
        homepage.getPopup().click();
		
      //click on explore product 
        Actions act=new Actions(driver);
        Thread.sleep(2300);
        act.moveToElement(homepage.getPersonalL()).perform();

        //click on loan 
        Thread.sleep(2300);
        act.moveToElement(homepage.getMouseHoverLoan()).perform();
        e.test.log(Status.INFO,"Click on loan is success");

        //click on vehicle loan 
        homepage.getPersonalLoan().click();
        e.test.log(Status.INFO,"Click on Personalloan is success");

        //click on two wheeler icon

        homepage.gettwowheelericon().click();
        e.test.log(Status.INFO,"Click on Two wheeler is success");
        
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", " ");
         Thread.sleep(2000);
		//click on EMI Calculator 
                 
					
		try {
			testdata = new TestData();
			double p=testdata.Principal;
			double r=testdata.rate;
		
		    int principal = (int)Math.round(p);
		    System.out.println("value of principal"+principal);

			//get loan Data from excel file 
		
		    homepage.getLoanAmount().clear();
			homepage.getLoanAmount().sendKeys(String.valueOf(r));
		    e.test.log(Status.INFO,"principal value enter successfully");
			
			//click on calculate
			homepage.getEMICalculator().click();
            String actual=homepage.getError().getText();

		Assert.assertFalse(true, actual);
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	
	}

	public	static double emi_calculator(double p,double r, double t)
	{
		double emi;

		r = r / (12 * 100); 
		t = t * 12; 
		emi = (p * r * (float)Math.pow(1 + r, t)) 
				/ (float)(Math.pow(1 + r, t) - 1);
		return emi;
	}
}












