package com.gorodovikov.OnlineStore.services;

import com.gorodovikov.OnlineStore.models.Product;
import com.gorodovikov.OnlineStore.repositories.StoreRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class StoreService {

    private final StoreRepository storeRepository;

    public List<Product> findAllProducts() {
        return storeRepository.findAll();
    }

    public Product findOneProduct(int id) {
        return storeRepository.findById(id).orElse(null);
    }

    @Transactional
    public void buyProduct(int id, Product product) {
        product.setId(id);
        product.setStockBalance(product.getStockBalance() - 1);
        storeRepository.save(product);
    }

}
