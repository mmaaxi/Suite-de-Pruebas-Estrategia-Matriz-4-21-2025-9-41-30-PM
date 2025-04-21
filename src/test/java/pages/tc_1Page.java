import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class tc_1Page {
    WebDriver driver;
    By executeStrategyButton = By.id("executeStrategyBtn");
    By successMessage = By.id("successMsg");

    public tc_1Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToStrategyPage() {
        driver.get("http://example.com/strategy-page");
    }

    public void executeStrategy() {
        driver.findElement(executeStrategyButton).click();
    }

    public boolean isStrategyExecutedSuccessfully() {
        return driver.findElement(successMessage).isDisplayed();
    }
}