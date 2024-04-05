package com.product.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.product.entities.Product;
import com.product.services.Service;

@Controller
public class HomeController {

	@RequestMapping(path = "/home")
	public void home() {
		
	}
	
	@RequestMapping("/error-page")
	public void error() {
		System.out.println("In error controller");
	}
	
	@RequestMapping("/add-product")
	public void product() {
		
	}
	
	
	@RequestMapping(path = "/create-product", method = RequestMethod.POST)
	public String create(@ModelAttribute("product") Product product, Model model) {
		Service.saveProduct(product);
		model.addAttribute("product", product);
		return "redirect:/home";
	}
	
	
	@RequestMapping("/product-list")
	public void productList() {
		
	}
	
	@RequestMapping("/delete-product")
	public String deleteAProduct(@RequestParam("p_id") int id) {
		Service.deleteAProduct(Service.getProduct(id));
		return "redirect:/home";
	}
	
	
	@RequestMapping("/edit-prod")
	public void editProduct() {
		
	}
	
	
	@RequestMapping("/edit-product")
	public String updateAProduct(
			@RequestParam("p_id") int id, 
			@RequestParam("name") String name, 
			@RequestParam("description") String description,
			@RequestParam("price") long price,
			Product product
			) 
	{
		product.setId(id);
		product.setName(name);
		product.setDescription(description);
		product.setPrice(price);
		
		Service.updateAProduct(product);
		return "redirect:/home";
	}
	
	
	@RequestMapping("/view-product")
	public void viewProduct() {
		
	}
}
