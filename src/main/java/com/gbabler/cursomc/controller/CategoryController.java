package com.gbabler.cursomc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gbabler.cursomc.model.CategoryResponse;
import com.gbabler.cursomc.service.CategoryService;

import javassist.tools.rmi.ObjectNotFoundException;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@GetMapping
	public ResponseEntity<List<CategoryResponse>> getAllCategories() {
		return ResponseEntity.ok(categoryService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CategoryResponse> getCategoryById(
			@PathVariable Integer id) throws ObjectNotFoundException {
		return ResponseEntity.ok(categoryService.findById(id));
	}
}
