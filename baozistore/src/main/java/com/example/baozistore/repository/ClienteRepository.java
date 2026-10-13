package com.example.baozistore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.baozistore.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
