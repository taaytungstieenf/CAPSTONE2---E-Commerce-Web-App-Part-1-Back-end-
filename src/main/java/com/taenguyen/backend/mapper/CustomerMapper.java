package com.taenguyen.backend.mapper;


import com.taenguyen.backend.dto.CustomerDto;
import com.taenguyen.backend.entity.Customer;

public class CustomerMapper {
    public static CustomerDto toCustomerDto(Customer customer) {
        return new CustomerDto(
                customer.getId(),
                customer.getName(),
                customer.getPhone(),
                customer.getEmail(),
                customer.getAddress()
        );
    }
    public static Customer toCustomer(CustomerDto customerDto) {
        return new Customer(
                customerDto.getId(),
                customerDto.getName(),
                customerDto.getPhone(),
                customerDto.getEmail(),
                customerDto.getAddress()
        );
    }
}
