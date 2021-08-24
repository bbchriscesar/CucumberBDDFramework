package stepDefinitions;

import baseLibrary.FunctionsLibrary;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObjects.LoginPage;
import pageObjects.ToolbarLinks;

public class CommonSteps {
    public WebDriver driver;
    public LoginPage lp;
    public ToolbarLinks tbl;
    public FunctionsLibrary functions;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ ".\\src\\test\\Resources\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/newtours/");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    @Given("^user is already at the homepage$")
    public void user_is_already_at_the_homepage() {
        lp = new LoginPage(driver);
    }

    @And("^user logs in using Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void user_logs_in_using_username_and_password(String username, String password) {
        lp.enterUsername(username);
        lp.enterPassword(password);
        lp.clickSubmitBtn();
    }

    @And("^homepage title is \"([^\"]*)\"$")
    public void homepage_title_is(String expected) {
        Assert.assertEquals(expected, driver.getTitle());
    }

    @Then("^page title is \"([^\"]*)\"$")
    public void page_title_is(String expected) {
        Assert.assertEquals(expected, driver.getTitle());
    }

    @Then("^toolbar link is visible$")
    public void toolbar_link_is_visible() {
        tbl = new ToolbarLinks(driver);
        tbl.verifyLnkSignOnPresence();
        tbl.verifyLnkRegisterPresence();
        tbl.verifyLnkSupportPresence();
        tbl.verifyLnkContactPresence();
    }
}
