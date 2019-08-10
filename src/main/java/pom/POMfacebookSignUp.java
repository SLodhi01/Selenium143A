package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;
import generics.excelLibrary;

public class POMfacebookSignUp extends BasePage implements AutoConstant
{
	//Declaration
	@FindBy(xpath="//input[@type='text']")
	private WebElement firstNameTextfield;
	
	@FindBy (xpath="//input[@name='lastname']")
	private WebElement lastNameTextfield;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement emailTextfield;
	
	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement newPasswordTextfield;
	
	@FindBy(xpath="//select[@name='birthday_month']")
	private WebElement  birthdayMonthDropDownList;
	
	@FindBy(xpath="//select[@name='birthday_day']")
	private WebElement birthdayDayDropDownList;
	
	@FindBy (xpath="//select[@name='birthday_year']")
	private WebElement birthdayYearDropDown;
	
	@FindBy(xpath="(//input[@type='radio'])[1]")
	private WebElement femaleRadioButton;
	
	//@FindBy(xpath="(//button[@type='submit'])[1]")
	//private WebElement signUpTab;
	
	//Initialization
	
	public POMfacebookSignUp (WebDriver driver)
	{
     
		PageFactory.initElements(driver, this);
	}
	 //Utilization
	
	public void signUp() throws IOException
	{
		firstNameTextfield.sendKeys(excelLibrary.getCellValue(excel_path, "Sheet1", 1, 0));// here we called class name and class method of excelLibrary 
		lastNameTextfield.sendKeys(excelLibrary.getCellValue(excel_path, "Sheet1", 1, 1));
		emailTextfield.sendKeys(excelLibrary.getCellValue(excel_path, "Sheet1", 1, 2));
		newPasswordTextfield.sendKeys(excelLibrary.getCellValue(excel_path, "Sheet1", 1, 3));
		selectbyvisibletext(birthdayMonthDropDownList, "Oct");
		selectbyvisibletext(birthdayDayDropDownList, "20");
		selectbyvisibletext(birthdayYearDropDown, "2001");
		femaleRadioButton.click();
		//signUpTab.click();
	}
}

