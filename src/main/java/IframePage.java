import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IframePage extends formFieldsPage{

    WebDriver driver;

    public IframePage(WebDriver driver) {
        super(driver);
    }

    By IFramePage1 = By.xpath("iframe[id=\"frame2\"]");
    By IFramePage2 = By.xpath("/html/body/div[4]/div[2]/div[3]/button[2]");

    public void selectIFramePage1(){
        driver.switchTo().frame(IFramePage1);
    }


    public void handlingIFramePage() {
        driver.findElement(IFramePage2).click();
    }
}
