package be.bartgeluykens;

import be.bartgeluykens.invoice.web.application.InvoiceWebApplication;
import be.bartgeluykens.invoice.web.pages.HomePage;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Simple test using the WicketTester
 */
public class TestHomePage
{
	private WicketTester tester;

	@Before
	public void setUp()
	{
		tester = new WicketTester(new InvoiceWebApplication());
	}

	@Test
  @Ignore
	public void homepageRendersSuccessfully()
	{
		//start and render the test page
		tester.startPage(HomePage.class);

		//assert rendered page class
		tester.assertRenderedPage(HomePage.class);
	}
}
