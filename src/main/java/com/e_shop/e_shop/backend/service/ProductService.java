package com.e_shop.e_shop.backend.service;

import com.e_shop.e_shop.backend.model.Product;
import com.e_shop.e_shop.backend.model.dao.ProductDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductDAO productDAO;

    public ProductService(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }


    public List<Product> getProducts() {
        return productDAO.findAll();
    }
}
