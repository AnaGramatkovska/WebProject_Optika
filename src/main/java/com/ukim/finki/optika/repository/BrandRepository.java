package com.ukim.finki.optika.repository;

import com.ukim.finki.optika.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {
    void deleteByName(String name);
}
