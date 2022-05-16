package com.multitenant.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multitenant.bean.City;

public interface CityRepository extends JpaRepository<City,Long> {

    City findByName(String name);

    void deleteByName(String name);
}
