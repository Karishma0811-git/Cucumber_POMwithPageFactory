package pages;

import Base.BaseSetUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;
    @FindBy(id = "user-name")
    private WebElement username;
    @FindBy(id = "password")
    private WebElement password;
    @FindBy(id = "login-button")
    private WebElement loginButton;
    public LoginPage(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }
    public LoginPage getUsername(String username) {
        this.username.sendKeys(username);
        return this;
    }
    public LoginPage getPassword(String password) {
        this.password.sendKeys(password);
        return this;
    }
    public HomePage getLoginButton() {
        this.loginButton.click();
        return new HomePage(driver);
    }



}
