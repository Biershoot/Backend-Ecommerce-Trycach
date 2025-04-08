package com.tutienda.ecommerce.service;

import com.tutienda.ecommerce.model.Product;
import com.tutienda.ecommerce.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

import java.nio.channels.FileChannel;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    public Optional<Product> updateProduct(Long id, Product updatedProduct) {
        return repository.findById(id).map(existingProduct -> {
            existingProduct.setName(updatedProduct.getName());
            existingProduct.setDescription(updatedProduct.getDescription());
            existingProduct.setPrice(updatedProduct.getPrice());
            existingProduct.setStock(updatedProduct.getStock());
            existingProduct.setImageUrl(updatedProduct.getImageUrl());
            return repository.save(existingProduct);
        });
    }

    public boolean deleteProduct(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}

