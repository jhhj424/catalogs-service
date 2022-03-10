package com.example.catalogsservice.service;

import com.example.catalogsservice.entity.Catalog;
import com.example.catalogsservice.entity.CatalogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class CatalogServiceImpl implements CatalogService {
    CatalogRepository catalogRepository;

    @Override
    public Iterable<Catalog> getAllCatalogs() {
        return catalogRepository.findAll();
    }
}
