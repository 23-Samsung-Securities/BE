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

        private String roi;

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
        private String price;

        private String roi;

        public Response(Product product) {
            this.price= product.getPrice();
            this.roi= product.getRoi();
        }
    }
}
