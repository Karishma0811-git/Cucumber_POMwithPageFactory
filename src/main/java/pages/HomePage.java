package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    @FindBy(id = "//*[@id=\"inventory_filter_container\"]/div")
    private WebElement displayProductLabel;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String verifyPageTitle() {
        return driver.getTitle();
    }

    public boolean displayProductLabel() {
        return displayProductLabel.isDisplayed();
    }
}
