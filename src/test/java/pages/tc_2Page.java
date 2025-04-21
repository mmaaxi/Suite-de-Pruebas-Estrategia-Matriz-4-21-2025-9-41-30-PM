package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_2Page {

    private WebDriver driver;
    private By executeMatrixButton = By.id("executeMatrixButton");
    private By matrixResult = By.id("matrixResult");

    public tc_2Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToMatrixPage() {
        driver.get("http://example.com/matrix");
    }

    public void executeMatrix() {
        driver.findElement(executeMatrixButton).click();
    }

    public boolean isMatrixGeneratedCorrectly() {
        return driver.findElement(matrixResult).isDisplayed();
    }
}