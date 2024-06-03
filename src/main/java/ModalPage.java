import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.http.Message;
import org.openqa.selenium.remote.http.TextMessage;

import javax.lang.model.element.Name;

public class ModalPage extends formFieldsPage{

    public ModalPage(WebDriver driver){super(driver);}
    private void scrollToElement(By locator){
        WebElement element = driver.findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", element);
    }

        By simpleModalButton = By.cssSelector("button[id=\"simpleModal\"]");
        By confirm =By.cssSelector("div[id=\"pum-1318\"] div[class=\"pum-content popmake-content\"]");
        By close = By.cssSelector("div[id=\"pum-1318\"] button[class=\"pum-close popmake-close\"]");
        By formModal = By.cssSelector("button[id=\"formModal\"]");
        By box = By.cssSelector("input[name=\"g1051-name\"]");
        By Email = By.cssSelector("input[name=\"g1051-email\"]");
        By textMessage = By.cssSelector("textarea[id=\"contact-form-comment-g1051-message\"]");
        By submit = By.cssSelector(" p[class=\"contact-submit\"] button[type=\"submit\"]");


        public void SimplelModal() throws InterruptedException {
            driver.findElement(simpleModalButton).click();
            Thread.sleep(2000);

    }
        public void ConfirmModal() throws InterruptedException {
            WebElement Confirm = driver.findElement(confirm);
            String Text_message = Confirm.getText();
            System.out.println(Text_message);
            if(!"Hi, I’m a simple modal.".equals(Text_message)){
                throw new AssertionError("Wrong message" + Text_message);
            }
            driver.findElement(close).click();
}
public void FormModal() throws InterruptedException {
            WebElement movedown = driver.findElement(formModal);
            Thread.sleep(2000);
            scrollToElement(formModal);
            Thread.sleep(2000);
                    movedown.click();
}
public void ModalName() throws InterruptedException {
    WebElement modalName = driver.findElement(box);
    modalName.sendKeys("Haruna Ibrahim Konlan");
    Thread.sleep(2000);
}
public void EnterEmail() throws InterruptedException {
            WebElement email = driver.findElement(Email);
            email.sendKeys("haruna@gmail.com");
            Thread.sleep(2000);
}
public void setTextMessage(String Message) throws InterruptedException {
            WebElement setMessage = driver.findElement(textMessage);
            setMessage.sendKeys("Message " + Message);
            Thread.sleep(2000);


}
public void ClickSubmit() throws InterruptedException {
            WebElement click = driver.findElement(submit);
            scrollToElement(submit);
            Thread.sleep(2000);
            click.click();
            Thread.sleep(2000);


//    driver.switchTo().alert().accept();

}


}

