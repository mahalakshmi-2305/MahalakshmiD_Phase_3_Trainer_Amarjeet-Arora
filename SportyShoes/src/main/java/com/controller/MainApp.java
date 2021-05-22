package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.model.Product;
import com.service.AdminLoginService;
import com.service.ProductService;



@RestController
public class MainApp {      

	@Autowired
	private AdminLoginService service;
	
	@Autowired
	private ProductService pservice;

	//Admin login	
	@PostMapping(value="/adminlogin")
	public String adminLogin(@RequestParam("name") String name,@RequestParam("pass") String pass) 
	{
		if(service.loginValid(name, pass)) {
			             
			return "<html>"+"<head><style>#h1{color:green} body{background-color:skyblue}</style></head>"+"<body>"+"<h1 id=h1>"+"Successfully Login"+"</h1>"+"<a href=admindashboard>"+"Back"+"</a>"+"</body>"+"</html>";
			
		}
				
		return "<html>"+"<head><style>#h1{color:red} body{background-color:skyblue}</style></head>"+"<body>"+"<h1 id=h1>"+"Username or Password incorrect!"+"</h1>"+"<a href=adminlogin>"+"Back"+"</a>"+"</body>"+"</html>";
		
	}
	
	
//	@RequestMapping(value="/search",method = RequestMethod.GET)
//	public String search() {
//				
//		return "productsearch";
//	
//	}
//	
	//Add product
	@PostMapping("/addproduct")
	public Product addProduct(@RequestParam(name="pname",defaultValue = "SportyShoe") String productName ,@RequestParam(name="pdesc",defaultValue = "Running Shoes For")  String productDesc,@RequestParam(name="pprice",defaultValue = "549") int price,@RequestParam(name="pstock",defaultValue = "Available")  String stock,@RequestParam(name="pship",defaultValue = "Free Delivery") String shippingdetails,@RequestParam(name="pphoto",defaultValue = "")  byte[] productphoto) {
		return pservice.addProduct(productName,productDesc,price,stock,shippingdetails,productphoto);
		
	}
		
	

//	 
//	 @PutMapping("/updateproduct/{id}")
//	    public ResponseEntity<Product> update(
//	            @PathVariable("productId") Integer productId,
//	            @RequestBody Product updatedItem) {
//
//	        Optional<Product> updated = pservice.update(productId, updatedItem);
//
//	        return updated
//	                .map(value -> ResponseEntity.ok().body(value))
//	                .orElseGet(() -> {
//	                    Product created = pservice.create(updatedItem);
//	                    URI location = ServletUriComponentsBuilder.fromCurrentRequest()
//	                            .path("/{id}")
//	                            .buildAndExpand(created.getProductId())
//	                            .toUri();
//	                    return ResponseEntity.created(location).body(created);
//	                });
//	    }
	

	
	//update product
	@PutMapping("/updateproduct")
	public String updateProduct(@ModelAttribute("product") Product product) {
		pservice.update(product);
		return "product updated";
	}

	
	//Delete product
	 @DeleteMapping("/deleteproduct")
	    public String deleteProduct(@PathVariable int id) {
	        return pservice.deleteProduct(id);
	    }
	 
	 	
	
}
