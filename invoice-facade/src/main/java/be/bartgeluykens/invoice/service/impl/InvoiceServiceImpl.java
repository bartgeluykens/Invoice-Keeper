package be.bartgeluykens.invoice.service.impl;

import be.bartgeluykens.invoice.dao.InvoiceDao;
import be.bartgeluykens.invoice.model.Invoice;
import be.bartgeluykens.invoice.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Autor bart
 * Omschrijving:
 * Aangemaakt op: 2/24/13
 */
@Transactional
public class InvoiceServiceImpl implements InvoiceService {

  @Autowired
  InvoiceDao invoiceDao;

  public List<Invoice> getAll() {
    return invoiceDao.getAll();
  }

}
