package com.samsung.samsung.domain.apartment.dto;

import com.samsung.samsung.domain.apartment.entity.Apartment;
import com.samsung.samsung.domain.product.entity.Product;
import jakarta.persistence.Column;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ApartmentDto {
    @NoArgsConstructor
    @Data
    public static class Request{
        private Double longitude;

        private Double latitude;

        private String address;

        private String apartmentName;

        public Apartment toEntity() {
            return Apartment.builder()
                    .longitude(longitude)
                    .latitude(latitude)
                    .address(address)
                    .apartmentName(apartmentName)
                    .build();
        }

        public Request(Apartment apartment) {
            this.longitude = apartment.getLongitude();
            this.latitude = apartment.getLatitude();
            this.address = apartment.getAddress();
            this.apartmentName = apartment.getApartmentName();
        }
    }
    @NoArgsConstructor
    @Data
    public static class Response{
        private Long apartmentId;
        private Double longitude;

        private Double latitude;

        private String address;

        private String apartmentName;

        private String price;

        public Response(Apartment apartment) {
            this.apartmentId=apartment.getApartmentId();
            this.longitude = apartment.getLongitude();
            this.latitude = apartment.getLatitude();
            this.address = apartment.getAddress();
            this.apartmentName = apartment.getApartmentName();
            this.price = apartment.getPrice();
        }
    }
}
