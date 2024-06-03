import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class formFieldsPage {
    WebDriver driver;
    //constructor
public formFieldsPage(WebDriver driver) {
    this.driver = driver;
}
    By box = By.id("name");
    By checkbox = By.id("drink1");
    By findRadioButton = By.cssSelector("input[id=\"color1\"]");
    By siblings  = By.cssSelector("select[name=\"siblings\"] ");
    By animal = By.xpath("//li[contains(text(), \"Horsefly\")]");
    By Email = By.cssSelector("input[id=\"email\"]");
    By textMessage = By.cssSelector ("textarea[id=\"message\"]");
    By submit = By.xpath("//button[contains(text(), \"Submit\")]");

    public void NameField(String Name) throws InterruptedException {
      WebElement firstname=driver.findElement(box);
      Thread.sleep(2000);
      firstname.sendKeys(Name);
    }
    public void SelectDrink() throws InterruptedException {
      WebElement drink=driver.findElement(checkbox);
      drink.click();
      Thread.sleep(5000);
    }
    public void SelectColor() throws InterruptedException {

        WebElement radioButton = driver.findElement(findRadioButton);
        scrollToElement(findRadioButton);
        Thread.sleep(2000);
        radioButton.click();
        Thread.sleep(5000);
    }
    public void SelectSiblings() throws InterruptedException {
        Select dropdown = new Select(driver.findElement(siblings));
        dropdown.selectByVisibleText("Maybe");
    }

    public void selectAnimal() throws InterruptedException {
        WebElement FastAnimal = driver.findElement(animal);
        System.out.println(FastAnimal.getText());
    }
    public void EnterEmail(String email) throws InterruptedException {
        driver.findElement(Email).sendKeys(email);
        Thread.sleep(2000);
    }

    public void setTextMessage(String message) throws InterruptedException {
        WebElement text = driver.findElement(textMessage);
        scrollToElement(textMessage);
        text.sendKeys(message);
        Thread.sleep(2000);
    }
    public void clickSubmit() throws InterruptedException {
        WebElement click = driver.findElement(submit);
        scrollToElement(submit);
        Thread.sleep(2000);
                click.click();
                //accept notifications
                driver.switchTo().alert().accept();
    }


    private void scrollToElement(By locator){
        WebElement element = driver.findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", element);
    }
}
