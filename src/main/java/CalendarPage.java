import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalendarPage {
    WebDriver driver;

    public CalendarPage(WebDriver driver) {
        this.driver = driver;
    }
    By SelectDate = By.id("g1065-selectorenteradate");
    By submit = By.xpath("//button[contains(text(), \"Submit\")]");


    public void SelectDate() throws InterruptedException {
        driver.findElement(SelectDate).sendKeys("2024-05-27");
        Thread.sleep(5000);


        }
        public void clickSubmit() throws InterruptedException {
            WebElement clickButton = driver.findElement(submit);
            clickButton.click();
            Thread.sleep(5000);
        }
    }

