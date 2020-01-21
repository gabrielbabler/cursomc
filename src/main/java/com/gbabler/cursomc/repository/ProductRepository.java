package com.gbabler.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gbabler.cursomc.domain.ProductDomain;

@Repository
public interface ProductRepository extends JpaRepository<ProductDomain, Integer>{

}
