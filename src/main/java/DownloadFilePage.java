import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DownloadFilePage extends WindowsPage {

    public DownloadFilePage(WebDriver driver) {
        super(driver);
    }
    By downloadFile = By.cssSelector("a[rel=\"nofollow\"]");

    public void getDownload_File() {
        driver.findElement(downloadFile).click();
    }
}
