import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestPopUpPage {
    WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        driver = new ChromeDriver();
        driver.get("https://practice-automation.com/popups/");
        driver.manage().window().maximize();
    }

    @Test
    public void PopUps() throws InterruptedException {
        PopUpPage alert = new PopUpPage(driver);
        alert.AlertPopUp();
        alert.ConfirmPopUp();
        alert.VerifyPopupText();
        alert.PromptPopup();
        alert.verifyPromptPopup();
    }
}
