package com.ind.pageObjects;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndusindHomepage {

	WebDriver ldriver;
	public static String personalLoanUrl="https://www.kotak.com/en/personal-banking/loans/personal-loan.html";

	public static String EMIUrl="https://www.kotak.com/en/personal-banking/loans/personal-loan/personal-loan-emi-calculator.html";

	public IndusindHomepage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}

	//Pop-Up
    @FindBy(xpath="(//a[@class='close'])[1]") WebElement Popup;

        public WebElement getPopup() {
            return Popup;


        }
	
      //click on Explore Product 
        
        //@FindBy(xpath="//li[@class='dropdown analytics-links']") WebElement exploreProduct;
        @FindBy(xpath="(//ul[@class='main-nav'])/li[4]/a") WebElement exploreProduct;

        public WebElement getExploreProduct() {
            return exploreProduct;
        }

        //mouse Hoverin on Loan
        @FindBy(xpath="(//*[contains(text(),'Loans')])[2]") WebElement mouseHoverLoan;
        
        
        public WebElement getMouseHoverLoan() {
            return mouseHoverLoan;
        }
        
        //click on personal loan
        @FindBy(xpath="(//li[@class='nav-item dropdown dropdown-animate menu-item-has-children menu-item-has-mega-menu'])[1]") WebElement personalL;
        

        public WebElement getPersonalL() {
            return personalL;
        }

        //click on loan
        @FindBy(xpath="//ul[@class='tabs-list drop-tabs-list']//li[4]")WebElement loan;
        public WebElement getLoan() {
            return loan;
        }

        //click on personal loan 
        @FindBy(xpath="(//*[contains(text(),'Vehicle Loans')])[1]") WebElement personalLoan;
        public WebElement getPersonalLoan() {
            return personalLoan;
        }
        
        //click on two wheeler icon 
            @FindBy(xpath="(//*[contains(text(),'Two Wheelers')])[1]") WebElement twowheelericon;
            public WebElement gettwowheelericon() {
                return twowheelericon;
            }

	//click on EMI Calculator tab 
	@FindBy(xpath="//a[@id='loanCalculate']") WebElement EMICalculator;

	public WebElement getEMICalculator() {
		return EMICalculator;


	}
	//loan requirment
	@FindBy(xpath="//*[@id='loanAmount']") WebElement loanAmount;

	public WebElement getLoanAmount() {
		return loanAmount;
	}
	//interest rate 
	@FindBy(xpath="(//span[@class='vehicleLoanPrincipleError'])[1]")WebElement error;

	public WebElement getError() {
		return error;
	}

	//loan amount 
	@FindBy(xpath="//input[@id='yr']") WebElement Loan_Amount;

	public WebElement getLoan_Amount() {
		return Loan_Amount;
	}

	 //get EMI amount 
	@FindBy(xpath="//p[@class='f48 emi_value']")WebElement EMIamount;

	public WebElement getEMIamount() {
		return EMIamount;
	}
	
	//get Principal amount for assertion 
	@FindBy(xpath="//p[@class='f24 total_principal']") WebElement principal_amt;

	public WebElement getPrincipal_amt() {
		return principal_amt;
	}
	
	//get interest payable for assertion 
	@FindBy(xpath="//p[@class='f24 total_interest']") WebElement interest_payable;

	public WebElement getInterest_payable() {
		return interest_payable;
	}

    //get total payment 
	@FindBy(xpath="//p[@class='f24 total_payment']") WebElement total_payment;

	public WebElement getTotal_payment() {
		return total_payment;
	}

	
	//footer display
	@FindBy(xpath="//footer[@class='footer']") WebElement footer;

	public WebElement getFooter()
	{
		return footer;
	}

	//logo is display 
	@FindBy(xpath="//img[@class=' lazyloaded'][1]")WebElement logo;

	public WebElement getLogo() {
		return logo;
	}
	
	
}