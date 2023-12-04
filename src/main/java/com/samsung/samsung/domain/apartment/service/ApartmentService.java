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
    public Long findByHome(Long id, int goalYear){
        //(현재 집 시세 - 현재 자산) / (수익 - 필수 소비 금액)
        Apartment apartment = apartmentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 아파트가 존재하지 않습니다."));
        long apartmentPrice = Long.parseLong(apartment.getPrice());
        long result = (apartmentPrice - 200000000) / (400 - 80);
        return result;
    }
}
