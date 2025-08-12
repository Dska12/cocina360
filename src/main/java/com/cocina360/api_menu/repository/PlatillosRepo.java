package com.cocina360.api_menu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cocina360.api_menu.model.Platillos;

public interface PlatillosRepo extends JpaRepository<Platillos,Long> {
    
    
}
