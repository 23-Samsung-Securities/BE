package com.samsung.samsung.domain.apartment.repository;

import com.samsung.samsung.domain.apartment.entity.Apartment;
import com.samsung.samsung.domain.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApartmentRepository extends JpaRepository<Apartment,Long> {
}
