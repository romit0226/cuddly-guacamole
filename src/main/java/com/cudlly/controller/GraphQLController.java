package com.cudlly.controller;

import com.cudlly.entity.Product;
import com.cudlly.entity.ProductInput;
import com.cudlly.model.ProductDto;
import com.cudlly.repository.ProductRepo;
import com.cudlly.service.ProductService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class GraphQLController {

    private final ProductService productService;

    private final ProductRepo productRepo;

//    @PostConstruct
//    public void init(){
//        Product product1= Product.builder()
//                .name("Sample Product")
//                .description("This is a sample product")
//                .price(java.math.BigDecimal.valueOf(19.99))
//                .category("Sample Category")
//                .brand("Sample Brand")
//                .stockQuantity(100)
//                .active(true)
//                .weight(1.5)
//                .dimensions("10x5x2")
//                .color("Red")
//                .material("Plastic")
//                .rating(4.5)
//                .reviewsCount(10)
//                .build();
//
//        Product product2= Product.builder()
//                .name("Sample Product2")
//                .description("This is a sample product")
//                .price(java.math.BigDecimal.valueOf(19.99))
//                .category("Sample Category1")
//                .brand("Sample Brand")
//                .stockQuantity(100)
//                .active(true)
//                .weight(1.5)
//                .dimensions("10x5x2")
//                .color("Red")
//                .material("Plastic")
//                .rating(4.5)
//                .reviewsCount(10)
//                .build();
//
//        productRepo.save(product1);
//        productRepo.save(product2);
//
//    }


    @QueryMapping
    public List<Product> products() {
        return productRepo.findAll();
    }

    @QueryMapping
    public Product productById(@Argument Long id) {
        return productRepo.findById(id).orElse(null);
    }

    @QueryMapping
    public List<ProductDto> productsByCategory(@Argument String category) {
        return productService.getProductsByCategory(category);
    }

    @MutationMapping
    public Product createProduct(@Argument ProductInput product) {
        Product entity = Product.builder()
                .sku(product.getSku())
                .name(product.getName())
                .category(product.getCategory())
                .price(product.getPrice())
                .active(product.getActive())
                .build();
        return productRepo.save(entity);
    }
}
