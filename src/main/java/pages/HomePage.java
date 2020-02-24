package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.casestudies.*;

public class HomePage extends BasePage {
    private Actions actions;
    private By closeSitePolicyButton = By.cssSelector(".tg-policy-button");
    private By seeOurWorkButton = By.cssSelector("[data-cy=home-page-slug-see-our-work]");
    private By contactUsButton = By.cssSelector("[data-cy=navbar-contact-us-button-desktop]");
    private By softwareDevelopmentButton = By.cssSelector("[data-cy=home-page-slug-software-development]");
    private By talentGenerationButton = By.cssSelector("[data-cy=home-page-slug-talent-generation]");
    private By apprenticeshipOverviewButton = By.cssSelector("[data-cy=home-page-slug-sales-program-details]");
    private By caseStudyButton = By.xpath("//a[text()[contains(.,\"read the case study\")]]");
    private By mistyCarouselCard = By.cssSelector("div[title=\"Misty Robotics\"]");
    private By vantageCarouselCard = By.cssSelector("div[title=\"Vantage\"]");
    private By eggplantCarouselCard = By.cssSelector("div[title=\"Eggplant\"]");
    private By mdSolutionsCarouselCard = By.cssSelector("div[title=\"MD Solutions\"]");
    private By pivotalCarouselCard = By.cssSelector("div[title=\"Pivotal\"]");

    public HomePage(WebDriver driver) {
        super(driver);
        actions = new Actions(driver);
    }

    public ResourceCenterPage clickSeeOurWorkButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(seeOurWorkButton));
        actions.moveToElement(driver.findElement(seeOurWorkButton)).click().perform();

        return new ResourceCenterPage(driver);
    }

    public ContactUsPage clickContactUsButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(contactUsButton));
        actions.moveToElement(driver.findElement(contactUsButton)).click().perform();

        return new ContactUsPage(driver);
    }

    public SoftwareDevelopmentPage clickSoftwareDevelopmentButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(softwareDevelopmentButton));
        actions.moveToElement(driver.findElement(softwareDevelopmentButton)).click().perform();

        return new SoftwareDevelopmentPage(driver);
    }

    public TalentGenerationPage clickTalentGenerationButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(talentGenerationButton));
        actions.moveToElement(driver.findElement(talentGenerationButton)).click().perform();

        return new TalentGenerationPage(driver);
    }

    public ApprenticeshipOverviewPage clickApprenticeshipOverviewButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(apprenticeshipOverviewButton));
        actions.moveToElement(driver.findElement(apprenticeshipOverviewButton)).click().perform();

        return new ApprenticeshipOverviewPage(driver);
    }

    public MistyRoboticsCaseStudyPage selectMistyAndClickCaseStudyButton() {
        clickMistyRoboticsCarouselCard();
        clickCaseStudyButton();

        return new MistyRoboticsCaseStudyPage(driver);
    }

    public VantageCaseStudyPage selectVantageAndClickCaseStudyButton() {
        clickVantageCarouselCard();
        clickCaseStudyButton();

        return new VantageCaseStudyPage(driver);
    }

    public EggplantCaseStudyPage selectEggplantAndClickCaseStudyButton() {
        clickEggplantCarouselCard();
        clickCaseStudyButton();

        return new EggplantCaseStudyPage(driver);
    }

    public MDSolutionsCaseStudyPage selectMDSolutionsAndClickCaseStudyButton() {
        clickMDSolutionsCarouselCard();
        clickCaseStudyButton();

        return new MDSolutionsCaseStudyPage(driver);
    }

    public PivotalCaseStudyPage selectPivotalAndClickCaseStudyButton() {
        clickPivotalCarouselCard();
        clickCaseStudyButton();

        return new PivotalCaseStudyPage(driver);
    }

    public void clickMistyRoboticsCarouselCard() {
        wait.until((ExpectedConditions.presenceOfElementLocated(mistyCarouselCard)));
        driver.findElement(mistyCarouselCard).click();
    }

    public void clickVantageCarouselCard() {
        wait.until((ExpectedConditions.presenceOfElementLocated(vantageCarouselCard)));
        driver.findElement(vantageCarouselCard).click();
    }

    public void clickEggplantCarouselCard() {
        wait.until((ExpectedConditions.presenceOfElementLocated(eggplantCarouselCard)));
        driver.findElement(eggplantCarouselCard).click();
    }

    public void clickMDSolutionsCarouselCard() {
        wait.until(ExpectedConditions.presenceOfElementLocated(mdSolutionsCarouselCard));
        driver.findElement(mdSolutionsCarouselCard).click();
    }

    public void clickPivotalCarouselCard() {
        wait.until(ExpectedConditions.presenceOfElementLocated(pivotalCarouselCard));
        driver.findElement(pivotalCarouselCard).click();
    }

    public void clickCloseSitePolicyButton() {
        driver.findElement(closeSitePolicyButton).click();
    }

    public void clickCaseStudyButton() {
        actions.moveToElement(driver.findElement(caseStudyButton)).click().perform();
    }
    public class ContactUsForm {
        // TODO: Fill with form functionality...
    }
}
