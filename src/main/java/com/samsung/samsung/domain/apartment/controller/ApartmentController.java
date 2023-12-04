package com.samsung.samsung.domain.apartment.controller;

import com.samsung.samsung.domain.apartment.dto.ApartmentDto;
import com.samsung.samsung.domain.apartment.entity.Apartment;
import com.samsung.samsung.domain.apartment.service.ApartmentService;
import com.samsung.samsung.domain.product.dto.ProductDto;
import com.samsung.samsung.global.response.BaseResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/apartment")
@RequiredArgsConstructor
public class ApartmentController {
    private final ApartmentService apartmentService;
    @GetMapping("/list")
    public BaseResponse<List<ApartmentDto.Response>> getProductList(){
        List<ApartmentDto.Response> apartmentList = apartmentService.findByAll();
        return BaseResponse.onSuccess(apartmentList);
    }
    @GetMapping("/{apartment-Id}/{goal-Year}")
    public BaseResponse<Long> getMyHomeResult(@PathVariable("apartment-Id") Long id , @PathVariable("goal-Year") int goalYear){
        return BaseResponse.onSuccess(apartmentService.findByHome(id , goalYear));
    }
//TODO
// 1) type별 product 주는걸로 API 변경
// 2) 내집마련 계산해서 보내주는 API
// 3) 배포..
}
