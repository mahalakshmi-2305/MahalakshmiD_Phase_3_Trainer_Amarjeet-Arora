package com.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.ProductDao;
import com.model.Product;

@Service
public class ProductService {

	@Autowired
	private ProductDao pdao;

	
	public  Product addProduct(String productName, String productDesc, int price, String stock,
			String shippingdetails, byte[] productphoto) {
		return pdao.save(new Product(productName,productDesc,price,stock,shippingdetails,productphoto));

	}
	
	public List<Product> addProducts(List<Product> products){
		return pdao.saveAll(products);
	}

	public List<Product> listAll() {
		return pdao.findAll();
	}
	
//	public Product updateProduct(Product product) {
//        Product existingProduct = pdao.findById(product.getProductId()).orElse(null);
//        existingProduct.setProductName(product.getProductName());
//        existingProduct.setProductDesc(product.getProductDesc());
//        existingProduct.setStock(product.getStock());
//        existingProduct.setPrice(product.getPrice());
//        return pdao.save(existingProduct);
//    }
	
	
//	public Product create(Product product) {
//        // To ensure the item ID remains unique,
//        // use the current timestamp.
//        Product copy = new Product(
////                new Date().getTime(),
//                product.getProductName(),
//                product.getProductDesc(),
//                product.getPrice(),
//                product.getStock(),
//                product.getShippingdetails(),
//                product.getProductphoto()
//        );
//        return pdao.save(copy);
//    }
//	
//	
//	
//	public Optional<Product> update(Integer productId, Product newProduct) {
//        // Only update an item if it can be found first.
//        return pdao.findById(productId)
//                .map(oldProduct -> {
//                   Product updated = oldProduct.updateWith(newProduct);
//                   return pdao.save(updated);
//                });
//    }

	
	public Product update(Product product) {
		return pdao.save(product);
	}

	 public String deleteProduct(int productId) {
	        pdao.deleteById(productId);
	        return "product removed !! " + productId;
	    }

	
	

}
