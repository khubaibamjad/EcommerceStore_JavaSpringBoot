package com.example.ecommerce.controller;


import com.example.ecommerce.DTOs.CreateProductDTO;
import com.example.ecommerce.DTOs.ProductDTO;
import com.example.ecommerce.repository.ProductRepository;
import com.example.ecommerce.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductRepository productRepository, ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/add")
    public ResponseEntity<ProductDTO> create(@Valid @RequestBody CreateProductDTO request) {
        return ResponseEntity.ok(productService.create(request));
    }

    @PostMapping("/all")
    public ResponseEntity<List<ProductDTO>>getAll()
    {
        return ResponseEntity.ok(productService.getAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getById(@PathVariable int id)
    {
        return ResponseEntity.ok(productService.getByID(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductDTO> update(@PathVariable int id, @Valid @RequestBody CreateProductDTO request)
    {
        return ResponseEntity.ok(productService.update(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete (@PathVariable int id)
    {
        productService.delete(id);
        return ResponseEntity.ok("Product Deleted Sucesfully");
    }

    @GetMapping("/search")
    public ResponseEntity<List<ProductDTO>> search (@RequestParam String keyword)
    {
        return ResponseEntity.ok(productService.searchProducts(keyword));
    }

    @GetMapping("/category/{categoryId}")
    public ResponseEntity<List<ProductDTO>> getByGategory(@PathVariable int categoryId)
    {
        return ResponseEntity.ok(productService.getByCategoryId(categoryId));
    }
}
