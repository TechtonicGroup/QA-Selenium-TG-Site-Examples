package pages.casestudies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class MistyRoboticsCaseStudyPage extends BasePage {
    private By pageH2 = By.xpath("//div/h2");

    public MistyRoboticsCaseStudyPage(WebDriver driver) {
        super(driver);
    }

    public String getH2Text() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(pageH2));
        System.out.println(driver.findElement(pageH2).getText());

        return driver.findElement(pageH2).getText();
    }
}
