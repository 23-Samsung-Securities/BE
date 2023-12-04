package com.samsung.samsung.domain.apartment.service;

import com.samsung.samsung.domain.apartment.dto.ApartmentDto;
import com.samsung.samsung.domain.apartment.entity.Apartment;
import com.samsung.samsung.domain.apartment.repository.ApartmentRepository;
import com.samsung.samsung.domain.product.dto.ProductDto;
import com.samsung.samsung.domain.product.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ApartmentService {

    private final ApartmentRepository apartmentRepository;
    public List<ApartmentDto.Response> findByAll() {
        List<Apartment> apartmentList = apartmentRepository.findAll();
        return apartmentList.stream()
                .map(ApartmentDto.Response::new)
                .collect(Collectors.toList());
    }
}
