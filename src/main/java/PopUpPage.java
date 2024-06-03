import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PopUpPage extends formFieldsPage {

    public PopUpPage(WebDriver driver) {
        super(driver);
    }

    By alertPopupButton = By.cssSelector("button[id=\"alert\"]");
    By confirmPopupButton = By.cssSelector("button[id=\"confirm\"]");
    By verifyPopup = By.id("confirmResult");
    By promptPopup = By.cssSelector("button[id=\"prompt\"]");
    By prompt = By.id("promptResult");

    public void AlertPopUp() throws InterruptedException {
        driver.findElement(alertPopupButton).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
    }


    public void ConfirmPopUp() throws InterruptedException {
        driver.findElement(confirmPopupButton).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);

    }

    public void VerifyPopupText() throws InterruptedException {
        WebElement myTest1 = driver.findElement(verifyPopup);
        String print = myTest1.getText();
        Thread.sleep(2000);
        System.out.println(print);
        if (!"OK it is!".equals(print)) {
            throw new AssertionError("Unable to verify popup text");

        }

    }

    public void PromptPopup() throws InterruptedException {
        driver.findElement(promptPopup).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Haruna");
        Thread.sleep(2000);
        alert.accept();
    }
    public void verifyPromptPopup() throws InterruptedException {
        WebElement myTest2 = driver.findElement(prompt);
        String print = myTest2.getText();
        System.out.println(print);
        if (!"Nice to meet you, Haruna!".equals(print)) {
            throw new AssertionError("Unable to verify popup text");
        }
    }
}