package be.bartgeluykens.invoice.web.application;

import be.bartgeluykens.HomePage;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;

/**
 * Application object for your invoice application. If you want to run this application without deploying, run the Start class.
 * 
 * @see be.bartgeluykens.Start#main(String[])
 */
public class InvoiceWebApplication extends WebApplication
{    	
	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	@Override
	public Class<? extends WebPage> getHomePage()
	{
		return HomePage.class;
	}

	/**
	 * @see org.apache.wicket.Application#init()
	 */
	@Override
	public void init()
	{
		super.init();

		// add your configuration here
	}
}
