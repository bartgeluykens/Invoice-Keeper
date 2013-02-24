package be.bartgeluykens.invoice.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * @Autor bart
 * Omschrijving:
 * Aangemaakt op: 2/24/13
 */

@Entity
@Table (name = "invoice")
public class Invoice {

  @Id
  @Getter
  @Setter
  @Column(name ="id")
  @SequenceGenerator(name = "sq_invoice", sequenceName = "sq_invoice", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_invoice")
  Integer Id;

  @Getter
  @Setter
  @Column(name="shop")
  String shop;

  @Getter
  @Setter
  @Column(name="description")
  String description;


  @Getter
  @Setter
  @Column(name="invoice_date")
  Date invoiceDate;


  @Getter
  @Setter
  @Column(name="guarentee_end_date")
  Date guarenteeEndDate;


}
