package be.bartgeluykens.invoice.web.pages;

import be.bartgeluykens.invoice.model.Invoice;
import be.bartgeluykens.invoice.service.InvoiceService;
import org.apache.wicket.AttributeModifier;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.markup.repeater.data.DataView;
import org.apache.wicket.markup.repeater.data.ListDataProvider;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.spring.injection.annot.SpringBean;

public class HomePage extends WebPage {

  @SpringBean
  InvoiceService invoiceService;

	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
		super(parameters);

    add(new DataView<Invoice>("invoice-table", new ListDataProvider(invoiceService.getAll()))
       {
           private static final long serialVersionUID = 1L;

         @Override
          protected void populateItem(final Item<Invoice> item)
          {
              Invoice invoice = item.getModelObject();

              item.add(new Label("shop"       , invoice.getShop()));
              item.add(new Label("invoice-date", invoice.getInvoiceDate()));
          }

       });

		// TODO Add your page's components here

    }
}
