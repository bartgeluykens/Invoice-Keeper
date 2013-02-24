package be.bartgeluykens.invoice.dao.impl;

import be.bartgeluykens.invoice.dao.InvoiceDao;
import be.bartgeluykens.invoice.model.Invoice;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Autor bart
 * Omschrijving:
 * Aangemaakt op: 2/24/13
 */
@Repository
public class InvoiceDaoImpl extends GenericDaoImpl<Invoice> implements InvoiceDao {

  public List<Invoice> getAll(){
      Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Invoice.class);
        return criteria.list();
    }

}
