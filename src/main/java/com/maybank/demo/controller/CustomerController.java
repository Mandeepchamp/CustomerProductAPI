package com.maybank.demo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.maybank.demo.model.Customer;
import com.maybank.demo.service.CustomerService;

import java.util.List;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Customer Controller", description = "APIs for managing customers")
@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    private final CustomerService service;
    private static final Logger logger = LoggerFactory.getLogger(CustomerService.class);


    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @Operation(summary = "Get all customers", description = "Fetch all customer records from the database")
    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomers() {
    	logger.info("Fetching all customers get All customer details method");
        return ResponseEntity.ok(service.getAllCustomers());
    }

    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
    	logger.info(" customers creation :");
        return ResponseEntity.ok(service.createCustomer(customer));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
    	logger.info(" customers details updated by id :");
    	return ResponseEntity.ok(service.updateCustomer(id, customer));
    }
}

