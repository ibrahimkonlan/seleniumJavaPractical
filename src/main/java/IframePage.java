import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IframePage extends SliderPage{

    WebDriver driver;

    public IframePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    By IFramePage1 = By.cssSelector("iframe[id=\"frame2\"]");
    By IFramePage2 = By.xpath("/html/body/div[4]/div[2]/div[3]/button[2]");
    By subscribe = By.xpath(("//span[text()='Subscribe']"));

    public void SelectIFramePage1() throws InterruptedException {
        WebElement iframeElement1 = driver.findElement(IFramePage1);
        driver.switchTo().frame((iframeElement1));
        Thread.sleep(2000);
    }

    public void handlingIFramePage() throws InterruptedException {
        WebElement  frame2 = driver.findElement(IFramePage2);
        Thread.sleep(3000);
        frame2.click();

    }
    public void subscribeIFramePage() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(subscribe).click();
    }
}
