package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Product;
import com.service.ProductService;

@Controller
@RequestMapping
public class ResApp {
	
	@Autowired
	private ProductService pservice;
	
	@GetMapping("/adminlogin")
	public String login(){
		return "adminlogin";
	}
	
	
	@GetMapping("/addproduct")
	public String register(){
		return "addproduct";
	}
	
	@GetMapping("/admindashboard")
	public String admindashboard(){
		return "admindashboard";
	}
	
	@GetMapping("/updateproduct")
	public String updateProduct(){
		return "updateproduct";
	}
	
	@GetMapping("/updatepage")
	public String updatePage(){
		return "updatepage";
	}
	
	@PostMapping("/deleteproduct")
	public String deleteProduct(){
		return "deleteproduct";
	}
	
	@GetMapping("/deleteproduct")
	public String deleteProduct1(){
		return "deleteproduct";
	}
	
	
	@GetMapping("/productslist")
		public String listProducts(Model model) {
	    List<Product> listProducts = pservice.listAll();
	    model.addAttribute("listProducts", listProducts);
	     
	    return "productslist";
	}
	
	
	
	

}
