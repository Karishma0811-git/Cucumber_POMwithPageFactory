package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

    WebDriver driver;
    @FindBy(id="logout_sidebar_link")
    private WebElement logoutButton;

    @FindBy(xpath = "//*[@id=\"menu_button_container\"]/div/div[3]/div/button")
    private WebElement clickOpenMenu;

    public Logout(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public Logout getLogoutButton() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", logoutButton);
        return this;
    }

    public Logout getClickOpenMenu() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", clickOpenMenu);
        return this;
    }
}
