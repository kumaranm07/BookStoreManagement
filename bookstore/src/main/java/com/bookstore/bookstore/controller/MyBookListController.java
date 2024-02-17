package com.bookstore.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookstore.bookstore.service.MyBookService;

@Controller
public class MyBookListController {
	
	@Autowired
	private MyBookService bookservice;
	
	
	@RequestMapping("/deleteMylist/{id}")
	public String deleteMyList(@PathVariable("id") int id) {
		bookservice.deleteById(id);
		return "redirect:/my_books";
	}
	
}
