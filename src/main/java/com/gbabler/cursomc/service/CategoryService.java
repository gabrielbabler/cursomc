package com.gbabler.cursomc.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gbabler.cursomc.domain.CategoryDomain;
import com.gbabler.cursomc.model.CategoryResponse;
import com.gbabler.cursomc.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired 
	private CategoryRepository categoryRepository;
	
	public List<CategoryResponse> findAll() {
		return categoryRepository.findAll().stream()
				.map(CategoryDomain::toResponse)
				.collect(Collectors.toList());
	}
	public CategoryResponse findById(Integer id) {
		Optional<CategoryDomain> findById = categoryRepository.findById(id);
		
		if(!findById.isPresent()) {
			
		}
		return CategoryResponse.builder()
				.id(findById.get().getId())
				.name(findById.get().getName())
				.build();
	}
}
