package stepDefinitions;

import Base.BaseSetUp;
import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.AddToCart;
import pages.HomePage;
import pages.LoginPage;
import pages.Logout;

public class ShoppingSteps {

    private WebDriver driver;
    AddToCart addToCart;
    Logout logout;

    @Given("user login with valid username and password")
    public void user_login_with_valid_username_and_password() {
        this.driver = Hooks.getDriver();
        LoginPage loginPage = new LoginPage(driver);
         loginPage.getUsername("performance_glitch_user\n")
                .getPassword("secret_sauce")
                .getLoginButton();
         HomePage homePage = new HomePage(driver);
        String pageTitle = homePage.verifyPageTitle();
        Assert.assertEquals(pageTitle, "Swag Labs");}
    @When("user search for a product and add a product to the cart")
    public void user_search_for_a_product_and_add_a_product_to_the_cart() {
        addToCart = new AddToCart(driver);
        addToCart.getClickAddToCart();
        boolean displayCartLabel = addToCart.getDisplayCartLabel();
        Assert.assertTrue("Cart label is displayed.", displayCartLabel);}
    @Then("user go to the cart verify the product is added")
    public void user_go_to_the_cart_verify_the_product_is_added() {
        this.addToCart.getOpenCart();
        boolean productDisplayed =this.addToCart.getIsProductInCart();
        Assert.assertTrue(productDisplayed);}
    @Then("logout from the application")
    public void logout_from_the_application() {
        logout = new Logout(driver);
        logout.getClickOpenMenu();
        logout.getLogoutButton();
    }


}
