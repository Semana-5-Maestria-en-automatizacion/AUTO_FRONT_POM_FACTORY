package co.sofka.automation.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;

public class PaginaDashboard extends PageObject {

    @FindBy(css = "table tbody tr[role='button']")
    private WebElementFacade primeraFilaTicket;

    public boolean tieneFichasListadas() {
        try {
            return primeraFilaTicket.waitUntilVisible().isVisible();
        } catch (Exception e) {
            return false;
        }
    }

    public void hacerClicEnPrimerTicket() {
        WebElementFacade fila = primeraFilaTicket.waitUntilVisible();
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", fila);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", fila);
    }
}
