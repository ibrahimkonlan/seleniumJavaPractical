import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class TablePage extends ModalPage{

    WebDriver driver;

    public TablePage(WebDriver driver) {
        super(driver);
        this.driver = driver;};


    By Oranges = By.xpath("//td[contains(text(),'$3.99')]");
    By Marbles = By.xpath("//td[contains(text(),'$1.25')]");

    public void TableName() throws InterruptedException {
        WebElement oranges = driver.findElement(Oranges);
        String Item = oranges.getText();
        System.out.println(Item);
        if (!"$3.99".equals(Item)) {
            throw new AssertionError("Unexpected price message: " + Item);

        };


//
//        WebElement marbles = driver.findElement(Marbles);
//        System.out.println(Item);
//        String Item2 = marbles.getText();
//        if (!"$1.25".equals(Item2));
//        throw new AssertionError("Unexpected price message: " + Item);

    }

}
