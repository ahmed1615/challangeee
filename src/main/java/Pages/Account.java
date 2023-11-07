package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Account extends MainClass{

    public Account(WebDriver driver) {
        super(driver);
    
    }
    @FindBy (xpath = "//label[contains(text(),'Email or phone number')]")
    public WebElement emailUsername;

    @FindBy(name = "password")
    WebElement Password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement SignInButton;
    
    @FindBy(xpath = "(//div[@class='inputError'])[1]")
    public WebElement EmailError;

    @FindBy(xpath = "(//div[@class='inputError'])[2]")
    public WebElement passwordError;

    @FindBy(className = "ui-message-contents")
    public WebElement BadEmailFormatError;

    public void FillUserNameAndPassword(String email, String password){
        filladdvalue(emailUsername, email);
        filladdvalue(Password, password);
        clickOnButton(SignInButton);
    }

    public void fillpassword(String password){
        filladdvalue(Password, password);
    }
    public void clickOnSignButton(){
        clickOnButton(SignInButton);
    }
}
