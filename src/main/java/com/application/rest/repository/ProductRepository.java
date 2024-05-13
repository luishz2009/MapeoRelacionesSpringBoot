package com.application.rest.repository;

import com.application.rest.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    //Utilizamos cualquiera de los dos metodos

    //JPQL: lenguaje propio de JPA para manejar sentencias sql
    @Query("SELECT p FROM Product p WHERE p.price BETWEEN ?1 AND ?2")
    List<Product> findProductByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice);

    //Query methods
    List<Product> findProductByPriceBetween(BigDecimal minPrice, BigDecimal maxPrice);
}
