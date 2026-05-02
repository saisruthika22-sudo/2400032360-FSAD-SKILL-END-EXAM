package com.klef.fsad.exam.service;

import java.util.List;
import com.klef.fsad.exam.model.Invoice;

public interface InvoiceService {

    Invoice addInvoice(Invoice invoice);

    List<Invoice> getAllInvoices();

    Invoice getInvoiceById(Long id);
}
