package com.klef.fsad.exam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsad.exam.model.Invoice;
import com.klef.fsad.exam.repository.InvoiceRepository;
import com.klef.fsad.exam.service.InvoiceService;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    private InvoiceRepository repository;

    @Override
    public Invoice addInvoice(Invoice invoice) {
        return repository.save(invoice);
    }

    @Override
    public List<Invoice> getAllInvoices() {
        return repository.findAll();
    }

    @Override
    public Invoice getInvoiceById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
