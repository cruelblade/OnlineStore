package com.gorodovikov.OnlineStore.repositories;

import com.gorodovikov.OnlineStore.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends JpaRepository<Product, Integer> {
}
