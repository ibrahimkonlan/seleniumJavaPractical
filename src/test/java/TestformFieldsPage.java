import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestformFieldsPage {
        WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        driver = new ChromeDriver();
        driver.get("https://practice-automation.com/form-fields/");
        driver.manage().window().maximize();
    }

    @Test
    public void Name() throws InterruptedException {
        formFieldsPage formFields = new formFieldsPage(driver);
        formFields.NameField("Philip");
        formFields.SelectDrink();
        formFields.SelectColor();
        formFields.SelectSiblings();
        formFields.selectAnimal();
        formFields.EnterEmail("www.akos@gmail.com");
        formFields.setTextMessage("this is a demo");
        formFields.clickSubmit();
    }

    @AfterTest
    public void afterTest(){
        driver.quit();
    }

}
