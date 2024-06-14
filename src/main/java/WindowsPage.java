import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class WindowsPage extends TablePage {

    private String originalWindowHandle;
    private WebDriverWait wait;

    public WindowsPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    By newTabButton = By.cssSelector("button[onclick=\"newTab()\"");
    By replaceWithTabButton = By.cssSelector("button[onclick=\"newWindowSelf()\"");
    By newWindowButton = By.cssSelector("button[onclick=\"newWindow()\"]");
    By toggleWindowButton = By.cssSelector("button[id=\"search_toggle\"]");
    By search = By.cssSelector("input[type=\"search\"]");
    By closeButton = By.cssSelector("button[class=\"jetpack-instant-search__overlay-close\"]");


    public void NewTab() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(newTabButton));
        driver.findElement(newTabButton).click();
        switchToNewWindow("https://automatenow.io/");
        driver.getTitle();
    }


    public void ReplaceWindow() throws InterruptedException {
        switchToNewWindow("https://automatenow.io/");
        wait.until(ExpectedConditions.elementToBeClickable(replaceWithTabButton));
        driver.findElement(replaceWithTabButton).click();
        wait.until(ExpectedConditions.elementToBeClickable(toggleWindowButton));
        driver.findElement(toggleWindowButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(search));
        WebElement pressEnter = driver.findElement(search);
        pressEnter.sendKeys("Rest Assured");
        Thread.sleep(2000);
        pressEnter.sendKeys(Keys.ENTER);
        driver.findElement(closeButton).click();
        driver.quit();
    }

    public void NewWindow() throws InterruptedException {

    }
    private void switchToNewWindow(String url) throws InterruptedException {
        Set<String> allWindows = driver.getWindowHandles();
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(originalWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }
}