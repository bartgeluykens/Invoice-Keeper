package be.bartgeluykens.invoice.dao;

import be.bartgeluykens.invoice.model.Invoice;
import org.hibernate.Criteria;

import java.util.List;

/**
 * @Autor bart
 * Omschrijving:
 * Aangemaakt op: 2/24/13
 */


public interface InvoiceDao extends GenericDao<Invoice> {
  public List<Invoice> getAll() ;
}
