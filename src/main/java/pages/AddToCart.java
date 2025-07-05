package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {

    private WebDriver driver;
    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[2]/div[3]/button")
    private WebElement clickAddToCart;

    @FindBy(xpath = "//*[@class=\"svg-inline--fa fa-shopping-cart fa-w-18 fa-3x \"]")
    private WebElement openCart;

    @FindBy(xpath = "//*[@id=\"item_0_title_link\"]/div")
    private WebElement displayCartLabel;

    @FindBy(id="item_0_title_link")
    private WebElement isProductInCart;

    public AddToCart(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public AddToCart getClickAddToCart() {
        this.clickAddToCart.click();
        return this;
    }
    public AddToCart getOpenCart() {
        this.openCart.click();
        return this;
    }
    public boolean getDisplayCartLabel() {
        return displayCartLabel.isDisplayed();
    }
    public boolean getIsProductInCart() {
        return isProductInCart.isDisplayed();
    }
}
