import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.lang.model.element.Name;

public class TestModalPage {

    WebDriver driver;


    @BeforeTest
    public void beforeTest(){
        driver = new ChromeDriver();
        driver.get("https://practice-automation.com/modals/");
        driver.manage().window().maximize();
    }
    @Test
    public void ModalPage()throws InterruptedException{
        ModalPage simple = new ModalPage(driver);
        simple.SimplelModal();
        simple.ConfirmModal();
        simple.FormModal();
        simple.ModalName();
        simple.EnterEmail();
        simple.setTextMessage("This is a simple modal page");
        simple.ClickSubmit();
    }
}
