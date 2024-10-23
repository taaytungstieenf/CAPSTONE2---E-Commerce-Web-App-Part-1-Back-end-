package com.taenguyen.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customers") // This line creates table name in MySQL database, it means there will be a `customers` table created in `bookshop_db`
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // make the `id` field to become foreign key
    private Long id; // create `id` field

    @Column(name = "customer_name") // create `customer_name` field
    private String name;

    @Column(name = "customer_email") // etc
    private String email;

    @Column(name = "customer_phone") // etc
    private String phone;

    @Column(name="customer_address", nullable = false, unique = true) // etc
    private String address;
}
