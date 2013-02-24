package be.bartgeluykens.invoice.web.application;

import be.bartgeluykens.invoice.web.pages.HomePage;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;

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
    getComponentInstantiationListeners().add(new SpringComponentInjector(this));
		// add your configuration here
	}
}
