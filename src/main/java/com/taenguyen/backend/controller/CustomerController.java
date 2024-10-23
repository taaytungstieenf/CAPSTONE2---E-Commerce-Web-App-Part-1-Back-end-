package com.taenguyen.backend.controller;

import com.taenguyen.backend.dto.CustomerDto;
import com.taenguyen.backend.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    private CustomerService customerService;

    // Build Add Customer REST API
    @PostMapping
    public ResponseEntity<CustomerDto> createCustomer(@RequestBody CustomerDto customerDto) {
        CustomerDto savedCustomer = customerService.createCustomer(customerDto);
        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
    }

    // Build Get Customer REST API
    @GetMapping("{id}")
    public ResponseEntity<CustomerDto> getCustomersById(@PathVariable("id") Long customerId) {
        CustomerDto customerDto = customerService.getCustomerById(customerId);
        return ResponseEntity.ok(customerDto);
    }

    // Build Get All Customers REST API
    @GetMapping
    public ResponseEntity<List<CustomerDto>> getAllCustomers() {
        List<CustomerDto> customers = customerService.getAllCustomers();
        return ResponseEntity.ok(customers);
    }

    // Build Update Customer REST API
    @PutMapping("{id}")
    public ResponseEntity<CustomerDto> updateCustomer(@PathVariable("id") Long customerId, @RequestBody CustomerDto updatedCustomer) {
        CustomerDto customerDto = customerService.updateCustomer(customerId, updatedCustomer);
        return ResponseEntity.ok(customerDto);
    }

    // Build Delete Employee REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable("id") Long customerId) {
        customerService.deleteCustomer(customerId);
        return ResponseEntity.ok("Customer deleted successfully");
    }
}
