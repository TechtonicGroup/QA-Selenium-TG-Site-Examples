package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver) {
        this.driver = driver;
        this.navigate = driver.navigate();
    }

    public void goBack() {
        navigate.back();
    }

    public void goForward() {
        navigate.forward();
    }

    public void refreshPage() {
        navigate.refresh();
    }

    public void goTo(String url) {
        navigate.to(url);
    }

    public void switchToTab(String tabTitle) {
        var windows = driver.getWindowHandles();

        System.out.println("Number of tabs: " + windows.size());
        System.out.println("Window handles:");
        windows.forEach(System.out::println);

        for (String window : windows) {
            System.out.println("Switching to window: " + window);
            driver.switchTo().window(window);

            System.out.println("Current window title: " + driver.getTitle());

            if(tabTitle.equals(driver.getTitle())) {
                break;
            }
        }
    }

    public void switchToNewTab() {
        var windows = driver.getWindowHandles();

        windows.forEach(driver.switchTo()::window);
    }

    public void closeExtraTabs() {
        var windowHandlesArray = driver.getWindowHandles().toArray();
        if(windowHandlesArray.length > 1) {
            System.out.println("Number of tabs: " + windowHandlesArray.length);
            System.out.println("Window handles:");
            for (Object window : windowHandlesArray) {
                System.out.println(window.toString());
            }

            for (int i = windowHandlesArray.length; i > 1; i--) {
                driver.switchTo().window(windowHandlesArray[i - 1].toString()).close();
            }

            driver.switchTo().window(windowHandlesArray[0].toString());
        }
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl().toString();
    }
}
