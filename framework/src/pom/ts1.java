package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ts1{
	
	@FindBy(name="login")
	private WebElement lgn_btn;
	
	public ts1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login_btn()
	{
		lgn_btn.click();
	}
	

}
