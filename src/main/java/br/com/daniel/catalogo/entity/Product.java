package br.com.daniel.catalogo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import java.math.BigDecimal;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome é obrigatório!!")
    @Column(nullable = false)
    private String name;

    @Size(min = 10, message = "A descrição deve ter no minimo 10 caracteres!!")
    private String description;

    @NotBlank(message = "Informe qual a categoria!!")
    @Size(min = 1, max = 20, message = "No minimo 1 e no maximo 20 caracteres!!")
    private String category;

    @NotNull
    @PositiveOrZero(message = "O preço não pode ser negativo!!")
    @Column(nullable = false)
    private BigDecimal price;
}
