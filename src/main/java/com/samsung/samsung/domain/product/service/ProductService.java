package com.samsung.samsung.domain.product.service;

import com.samsung.samsung.domain.product.dto.ProductDto;
import com.samsung.samsung.domain.product.entity.Product;
import com.samsung.samsung.domain.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    public List<ProductDto.Response> findByAll() {
        List<Product> products = productRepository.findAll();
        return products.stream()
                .map(ProductDto.Response::new)
                .collect(Collectors.toList());
    }
}
