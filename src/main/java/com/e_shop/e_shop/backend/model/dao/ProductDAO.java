package com.e_shop.e_shop.backend.model.dao;

import com.e_shop.e_shop.backend.model.Product;
import org.springframework.data.repository.ListCrudRepository;

public interface ProductDAO extends ListCrudRepository<Product, Long> {
}
