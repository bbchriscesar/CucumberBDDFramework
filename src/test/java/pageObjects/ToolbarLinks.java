package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolbarLinks {
    public WebDriver driver;

    public ToolbarLinks(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='login.php']")
    @CacheLookup
    public WebElement lnkSignOn;

    @FindBy(xpath = "(//a[@href='register.php'])[1]")
    @CacheLookup
    public WebElement lnkRegister;

    @FindBy(xpath = "(//a[@href='support.php'])[5]")
    @CacheLookup
    public WebElement lnkSupport;

    @FindBy(xpath = "(//a[@href='support.php'])[6]")
    @CacheLookup
    public WebElement lnkContact;

    public void clickSignOnLnk() {
        lnkSignOn.click();
    }

    public void clickRegisterLnk() {
        lnkRegister.click();
    }

    public void clickSupportLnk() {
        lnkSupport.click();
    }

    public void clickContactLnk() {
        lnkContact.click();
    }

    public void verifyLnkSignOnPresence() {
        lnkSignOn.isDisplayed();
        String linkName = lnkSignOn.getText();
        System.out.println(linkName);
    }

    public void verifyLnkRegisterPresence() {
        lnkRegister.isDisplayed();
        String linkName = lnkRegister.getText();
        System.out.println(linkName);
    }

    public void verifyLnkSupportPresence() {
        lnkSupport.isDisplayed();
        String linkName = lnkSupport.getText();
        System.out.println(linkName);
    }

    public void verifyLnkContactPresence() {
        lnkContact.isDisplayed();
        String linkName = lnkContact.getText();
        System.out.println(linkName);
    }
}
