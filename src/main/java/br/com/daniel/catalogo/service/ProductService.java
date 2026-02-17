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

    public List<Product> listAll(){
        return productRepository.findAll();
    }

    public List<Product> findAllByCategory(String category){
        return productRepository.findByCategory(category);
    }

    public Product save(Product product){
        return productRepository.save(product);
    }

    public Product update(Product product){
        if (product.getId()!=null && product.getId()!=0){
            return productRepository.save(product);
        }
        return null;
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
