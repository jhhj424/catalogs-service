package com.example.catalogsservice.entity;

import org.springframework.data.repository.CrudRepository;

public interface CatalogRepository extends CrudRepository<Catalog, Long> {
    Catalog findByProductId(String productId);
}
