import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSliderPage {

    WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        driver = new ChromeDriver();
        driver.get("https://practice-automation.com/slider/");
        driver.manage().window().maximize();
    }

    @Test
    public void slider() throws InterruptedException{
        SliderPage slider = new SliderPage(driver);
        slider.setSlider();
    }
}
