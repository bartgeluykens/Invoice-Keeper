package be.bartgeluykens.invoice.jbehave.pages;

import org.jbehave.web.selenium.WebDriverProvider;

public class InvoicePageFactory {

    private final WebDriverProvider webDriverProvider;

    public InvoicePageFactory(WebDriverProvider webDriverProvider) {
        this.webDriverProvider = webDriverProvider;
    }

    public InvoiceWebDriver newHome() {
        return new InvoiceWebDriver(webDriverProvider);
    }

}
