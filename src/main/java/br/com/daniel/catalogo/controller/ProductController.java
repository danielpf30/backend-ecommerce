package br.com.daniel.catalogo.controller;

import br.com.daniel.catalogo.entity.Product;
import br.com.daniel.catalogo.service.ProductService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> List() {
        return productService.listAll();
    }

    @GetMapping("/category/{category}")
    public List<Product> ListByCategory(@PathVariable String category){
        return productService.findAllByCategory(category);
    }

    @PostMapping
    public Product save(@RequestBody Product product) {
        productService.save(product);
        return product;
    }

    @PutMapping
    public Product update(@RequestBody Product product) {
        return productService.update(product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        productService.delete(id);
    }
}
