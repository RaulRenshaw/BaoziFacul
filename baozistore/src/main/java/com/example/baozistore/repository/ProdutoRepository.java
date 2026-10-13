package com.example.baozistore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.baozistore.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
