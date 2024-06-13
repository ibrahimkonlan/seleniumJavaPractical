import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TablePage {

    WebDriver driver;

    public TablePage(WebDriver driver) {this.driver = driver;};


    By table_name = By.id("//*[@id=\"post-1076\"]/div/figure/table/tbody/tr[1]/td[1]/strong");

    public void TableName() throws InterruptedException {
        driver.findElement(table_name).click();

    }
}
