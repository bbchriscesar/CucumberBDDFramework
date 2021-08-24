package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "userName")
    @CacheLookup
    public WebElement inputUsername;

    @FindBy(name = "password")
    @CacheLookup
    public WebElement inputPassword;

    @FindBy(name = "submit")
    @CacheLookup
    public WebElement btnSubmit;

    public void enterUsername(String username) {
        inputUsername.clear();
        inputUsername.sendKeys(username);
    }

    public void enterPassword(String password) {
        inputPassword.clear();
        inputPassword.sendKeys(password);
    }

    public void clickSubmitBtn() {
        btnSubmit.click();
    }

}
