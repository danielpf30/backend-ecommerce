package br.com.daniel.catalogo.service;

import br.com.daniel.catalogo.entity.Product;
import br.com.daniel.catalogo.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> listarTodos(){
        return productRepository.findAll();
    }

    public Product salvar(Product product){
        return productRepository.save(product);
    }
}
