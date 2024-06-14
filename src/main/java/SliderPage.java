import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SliderPage extends DownloadFilePage {


    WebDriver driver;
    public SliderPage(WebDriver driver) {
        super(driver);
    }

    public void setSlider() {
        WebElement slider = driver.findElement(By.cssSelector("input[id = 'slideMe']"));
        Actions action = new Actions(driver);
        action.dragAndDropBy(slider,3,0).build().perform();


    }
}
