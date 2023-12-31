package com.samsung.samsung.domain.product.dto;

import com.samsung.samsung.domain.product.entity.Product;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
public class ProductDto {
    @NoArgsConstructor
    @Data
    public static class Request{
        private String price;

        private Double roi;

        public Product toEntity() {
            return Product.builder()
                    .price(price)
                    .roi(roi)
                    .build();
        }

        public Request(Product product) {
            this.price= product.getPrice();
            this.roi= product.getRoi();
        }
    }
    @NoArgsConstructor
    @Data
    public static class Response{
        private String name;
        private String price;

        private Double roi;

        public Response(Product product) {
            this.name= product.getName();
            this.price= product.getPrice();
            this.roi= product.getRoi();
        }
    }
}
