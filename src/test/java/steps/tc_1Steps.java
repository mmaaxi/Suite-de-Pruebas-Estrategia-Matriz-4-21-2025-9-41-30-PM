import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class tc_1Steps {
    WebDriver driver;
    tc_1Page strategyPage;

    @Given("el usuario está en la página de estrategias")
    public void el_usuario_esta_en_la_pagina_de_estrategias() {
        strategyPage = new tc_1Page(driver);
        strategyPage.navigateToStrategyPage();
    }

    @When("el usuario ejecuta la estrategia")
    public void el_usuario_ejecuta_la_estrategia() {
        strategyPage.executeStrategy();
    }

    @Then("la estrategia se ejecuta correctamente")
    public void la_estrategia_se_ejecuta_correctamente() {
        assertTrue(strategyPage.isStrategyExecutedSuccessfully());
    }
}