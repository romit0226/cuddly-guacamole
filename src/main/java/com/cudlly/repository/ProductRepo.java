package com.cudlly.repository;

import com.cudlly.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {
    @Query(value = "SELECT * FROM products WHERE category = ?1", nativeQuery = true)
    List<Product> findByCategory(String category);
}
