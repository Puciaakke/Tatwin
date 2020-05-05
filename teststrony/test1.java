package teststrony;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class test1 {
	WebDriver driver;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement passwordInput;
	
	@FindBy(xpath = "//input[@name='login']")	//input[@name='login']
	WebElement loginButton;

	@FindBy(xpath = "//input[@id='username']")  //input[@id='username']
	WebElement usernameInput;

	@FindBy(xpath = "//div[@class='error']")
	WebElement resultText;
	
	@FindBy(xpath = "//div[@id='case_login']//a")
	WebElement backButton;
	
	//@FindBy(xpath = "//a[@class='btn btn-outline-secondary']")
	//WebElement logginButton;
	
	//constructor
	public test1(WebDriver driver){
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	//methods
	public void enterUsername(String username){
		usernameInput.sendKeys(username);
	}
	 
	public void enterPassword(String password){
		passwordInput.sendKeys(password);
	}
	 
	public void login(){
		loginButton.click();
	}
	
	public String getResult(){
		return resultText.getText();
	}
	
	public void goBack(){
		backButton.click();
	}
	
}