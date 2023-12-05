package com.samsung.samsung.domain.product.controller;

import com.samsung.samsung.domain.product.dto.ProductDto;
import com.samsung.samsung.domain.product.service.ProductService;
import com.samsung.samsung.global.response.BaseResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    @GetMapping("/list")
    public BaseResponse<List<ProductDto.Response>> getProductList(){
        List<ProductDto.Response> productList = productService.findByAll();
        return BaseResponse.onSuccess(productList);
    }
    @GetMapping("/list/{type}")
    public BaseResponse<List<ProductDto.Response>> getProductLikeList(@PathVariable("type") String type){
        List<ProductDto.Response> productList = productService.findByAll();
        return BaseResponse.onSuccess(productList);
    }
}
