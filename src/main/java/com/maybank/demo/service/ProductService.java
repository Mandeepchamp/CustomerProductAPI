package com.maybank.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.maybank.demo.model.Product;
import com.maybank.demo.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Cacheable(value = "customers")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Long productId, Product updatedProduct) {
        Product product = productRepository.findById(productId).orElseThrow(
            () -> new RuntimeException("Product not found with ID: " + productId));
        product.setBookTitle(updatedProduct.getBookTitle());
        product.setBookPrice(updatedProduct.getBookPrice());
        product.setBookQuantity(updatedProduct.getBookQuantity());
        return productRepository.save(product);
    }

    public void deleteProduct(Long productId) {
        productRepository.deleteById(productId);
    }
}

