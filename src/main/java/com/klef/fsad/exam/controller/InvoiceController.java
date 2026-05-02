
package com.klef.fsad.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.fsad.exam.model.Invoice;
import com.klef.fsad.exam.service.InvoiceService;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {

    @Autowired
    private InvoiceService service;

    // POST - Add Invoice
    @PostMapping("/add")
    public Invoice addInvoice(@RequestBody Invoice invoice) {
        return service.addInvoice(invoice);
    }

    // GET - All Invoices
    @GetMapping("/all")
    public List<Invoice> getAllInvoices() {
        return service.getAllInvoices();
    }

    // GET - By ID
    @GetMapping("/{id}")
    public Invoice getInvoiceById(@PathVariable Long id) {
        return service.getInvoiceById(id);
    }
}
