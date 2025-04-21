package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.tc_2Page;
import static org.junit.Assert.assertTrue;

public class tc_2Steps {

    private WebDriver driver;
    private tc_2Page matrixPage;

    public tc_2Steps() {
        this.driver = Hooks.getDriver();
        matrixPage = new tc_2Page(driver);
    }

    @Given("el usuario se encuentra en la página de la matriz")
    public void el_usuario_se_encuentra_en_la_pagina_de_la_matriz() {
        matrixPage.navigateToMatrixPage();
    }

    @When("el usuario ejecuta la matriz")
    public void el_usuario_ejecuta_la_matriz() {
        matrixPage.executeMatrix();
    }

    @Then("la matriz se genera correctamente")
    public void la_matriz_se_genera_correctamente() {
        assertTrue("La matriz no se ha generado correctamente", matrixPage.isMatrixGeneratedCorrectly());
    }
}