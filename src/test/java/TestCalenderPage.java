import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCalenderPage {

    WebDriver driver;

    @BeforeTest
    public void BeforeTest(){
        driver = new ChromeDriver();
        driver.get("https://practice-automation.com/calendars/");
        driver.manage().window().maximize();
    }
    @Test
    public void Calendar() throws InterruptedException{
        CalendarPage calendar = new CalendarPage(driver);
        calendar.SelectDate();
        calendar.clickSubmit();
    }
}
