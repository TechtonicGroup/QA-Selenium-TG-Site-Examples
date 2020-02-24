package base;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.HomePage;
import utils.EventReporter;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;

public class BaseTest {
    protected EventFiringWebDriver driver;
    protected HomePage homePage;
    protected String baseUrl = "http://staging.techtonic.com";
    protected WindowManager windowManager;

    @BeforeClass
    public void globalSetUp() {
        System.out.println("Global BeforeClass");
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));
        driver.register(new EventReporter());
        driver.manage().window().maximize();
        windowManager = new WindowManager(driver);

        goHome();
    }

    @BeforeMethod
    public void goHome() {
        System.out.println("Global BeforeMethod");
        driver.get(baseUrl);
        homePage = new HomePage(driver);
        windowManager.closeExtraTabs();
    }

    @AfterMethod
    public void recordFailure(ITestResult result) {
        System.out.println("Global AfterMethod");
        if(ITestResult.FAILURE == result.getStatus()) {
            var camera = (TakesScreenshot) driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);

            try {
                Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
                System.out.println("Screenshot taken: " + screenshot.getAbsolutePath());
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }

    @AfterClass
    public void globalTearDown() {
        System.out.println("Global AfterClass");
        driver.quit();
    }

    public WindowManager getWindowManager() {
        return windowManager;
    }

    private ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
//        options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
//        options.setHeadless(true);
        return options;
    }

}
