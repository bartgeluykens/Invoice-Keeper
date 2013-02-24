package be.bartgeluykens.invoice.jbehave.steps;

import be.bartgeluykens.invoice.jbehave.pages.InvoicePageFactory;
import be.bartgeluykens.invoice.jbehave.pages.InvoiceWebDriver;
import org.apache.commons.lang.NotImplementedException;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class ViewAllInvoicesStory {
    
    private InvoiceWebDriver home;

    public ViewAllInvoicesStory(InvoicePageFactory invoicePageFactory){
        home = invoicePageFactory.newHome();
    }
    
    @Given("I am on the main-page of the invoice website")
    public void loggedOnToTheMainPage() {
      home.go();
    }

    @When("I click on view all invoices")
    public void clickOnAllInvoices() {
        throw new NotImplementedException("This step is not implemented yet");
    }

    @Then("I should see all invoices")
    public void iCanClickAnInvoice() {
      throw new NotImplementedException("This step is not implemented yet");
    }

}
