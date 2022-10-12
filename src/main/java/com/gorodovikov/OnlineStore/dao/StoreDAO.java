package com.gorodovikov.OnlineStore.dao;

import com.gorodovikov.OnlineStore.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StoreDAO {

    JdbcTemplate jdbcTemplate;

    @Autowired
    public StoreDAO(JdbcTemplate jdbcTemplate) { this.jdbcTemplate = jdbcTemplate;}


    public List<Product> findAllProducts() {
        return jdbcTemplate.query("SELECT * FROM product", new BeanPropertyRowMapper<>(Product.class));
    }
}
