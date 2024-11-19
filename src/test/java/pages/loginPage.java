package pages;

import org.checkerframework.common.reflection.qual.ForName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage {

	@FindBy(xpath = "//a[text() = 'Login']")
	WebElement Login;
	
	@FindBy(name = "email")
	WebElement email;
	
	@FindBy(name = "password")
	WebElement pwd;
}
