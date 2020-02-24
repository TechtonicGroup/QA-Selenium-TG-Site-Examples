package buttons;

import base.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HomePageButtonTests extends BaseTest {

    @BeforeClass
    public void localSetup() {
        System.out.println("Local BeforeClass");
        homePage.clickCloseSitePolicyButton();
    }

    @Test
    public void testSeeOurWorkButton() {
        var resourceCenterPage = homePage.clickSeeOurWorkButton();

        assertEquals(resourceCenterPage.getH1Text(), "TECHTONIC RESOURCE CENTER", "Incorrect page H1 header text");
        assertEquals(windowManager.getCurrentUrl(), baseUrl + "/resources/resource-center", "Incorrect url path");
    }

    @Test
    public void testContactUsButton() {
        var contactUsPage = homePage.clickContactUsButton();

        assertEquals(contactUsPage.getH1Text(), "ACCELERATED SOFTWARE DELIVERY & SCALABLE ONSHORE TALENT", "Incorrect page H1 header text");
        assertEquals(windowManager.getCurrentUrl(), baseUrl + "/contact-us", "Incorrect url path");
    }

    @Test
    public void testSoftwareDevelopmentButton() {
        var softwareDevelopmentPage = homePage.clickSoftwareDevelopmentButton();

        assertEquals(softwareDevelopmentPage.getH1Text(), "PREMIER ONSHORE SOFTWARE DEVELOPMENT", "Incorrect page H1 header text");
        assertEquals(windowManager.getCurrentUrl(), baseUrl + "/solutions/software-development", "Incorrect url path");
    }

    @Test
    public void testTalentGenerationButton() {
        var talentGenerationPage = homePage.clickTalentGenerationButton();

        assertEquals(talentGenerationPage.getH1Text(), "TALENT GENERATION", "Incorrect page H1 header text");
        assertEquals(windowManager.getCurrentUrl(), baseUrl + "/solutions/talent-generation", "Incorrect url path");
    }

    @Test
    public void testApprenticeshipOverviewButton() {
        var apprenticeshipOverviewPage = homePage.clickApprenticeshipOverviewButton();

        assertEquals(apprenticeshipOverviewPage.getH1Text(), "TECHTONIC APPRENTICESHIP", "Incorrect page H1 header text");
        assertEquals(windowManager.getCurrentUrl(), baseUrl + "/apprenticeships/overview", "Incorrect url path");
    }

    @Test
    public void testReadCaseStudyButtonWhenMistyRoboticsIsSelected() {
        var mistyRoboticsCaseStudyPage = homePage.selectMistyAndClickCaseStudyButton();
        windowManager.switchToNewTab();

        assertEquals(mistyRoboticsCaseStudyPage.getH2Text(), "MISTY ROBOTICS", "Incorrect page H2 header text");
        assertEquals(windowManager.getCurrentUrl(), baseUrl + "/resources/resource-center/misty-robotics", "Incorrect url path");
    }

    @Test
    public void testReadCaseStudyButtonWhenVantageIsSelected() {
        var vantageCaseStudyPage = homePage.selectVantageAndClickCaseStudyButton();
        windowManager.switchToNewTab();

        assertEquals(vantageCaseStudyPage.getH2Text(), "VANTAGE", "Incorrect page H2 header text");
        assertEquals(windowManager.getCurrentUrl(), baseUrl + "/resources/resource-center/vantage", "Incorrect url path");
    }

    @Test
    public void testReadCaseStudyButtonWhenEggplantIsSelected() {
        var eggplantCaseStudyPage = homePage.selectEggplantAndClickCaseStudyButton();
        windowManager.switchToNewTab();

        assertEquals(eggplantCaseStudyPage.getH2Text(), "EGGPLANT", "Incorrect page H2 header text");
        assertEquals(windowManager.getCurrentUrl(), baseUrl + "/resources/resource-center/eggplant", "Incorrect url path");
    }

    @Test
    public void testReadCaseStudyButtonWhenMDSolutionsIsSelected() {
        var mdSolutionsCaseStudyPage = homePage.selectMDSolutionsAndClickCaseStudyButton();
        windowManager.switchToNewTab();

        assertEquals(mdSolutionsCaseStudyPage.getH2Text(), "MD SOLUTIONS", "Incorrect page H2 header text");
        assertEquals(windowManager.getCurrentUrl(), baseUrl + "/resources/resource-center/md-solutions", "Incorrect url path");
    }

    @Test
    public void testReadCaseStudyButtonWhenPivotalIsSelected() {
        var pivotalCaseStudyPage = homePage.selectPivotalAndClickCaseStudyButton();
        windowManager.switchToNewTab();

        assertEquals(pivotalCaseStudyPage.getH2Text(), "PIVOTAL", "Incorrect page H2 header text");
        assertEquals(windowManager.getCurrentUrl(), baseUrl + "/resources/resource-center/pivotal", "Incorrect url path");
    }
}
