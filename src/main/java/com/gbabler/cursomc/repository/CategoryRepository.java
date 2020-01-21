package com.gbabler.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gbabler.cursomc.domain.CategoryDomain;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryDomain, Integer>{

}
