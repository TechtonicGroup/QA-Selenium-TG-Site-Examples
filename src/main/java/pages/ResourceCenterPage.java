package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ResourceCenterPage extends BasePage {
    private By pageH1 = By.tagName("h1");

    public ResourceCenterPage(WebDriver driver) {
        super(driver);
    }

    public String getH1Text() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(pageH1));
        System.out.println(driver.findElement(pageH1).getText());

        return driver.findElement(pageH1).getText();
    }
}
