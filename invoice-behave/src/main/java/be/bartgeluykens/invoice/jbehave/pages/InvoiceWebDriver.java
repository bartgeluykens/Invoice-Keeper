package be.bartgeluykens.invoice.jbehave.pages;

import org.jbehave.web.selenium.WebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;

public class InvoiceWebDriver extends WebDriverPage {

    public InvoiceWebDriver(WebDriverProvider webDriverProvider) {
        super(webDriverProvider);
    }

    public void go() {
        get("http://localhost:8080");
      try {
      Thread.sleep(5000);
      } catch (Exception ex) {}
    }

    public void go(String section) {
        go();
        findElement(By.xpath("//a[@title = '" + section + "']")).click();
    }

    public void search(String thing) {
        findElement(By.id("search-facet")).click();
        findElement(By.className("all")).click();
        findElement(By.id("search-query")).sendKeys(thing);
        findElement(By.id("search_submit")).click();
    }

    public void goToBuySection() {
        findElement(By.linkText("Buy")).click();
    }
    
    
}
