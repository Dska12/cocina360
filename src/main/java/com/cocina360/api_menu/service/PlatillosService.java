package com.cocina360.api_menu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cocina360.api_menu.model.Platillos;
import com.cocina360.api_menu.repository.PlatillosRepo;

@Service
public class PlatillosService {

    @Autowired
    private PlatillosRepo platillosRepo;

    public List<Platillos> listarPlatillos(){
        return platillosRepo.findAll();
    }

    public Platillos nuevoPlatillo(Platillos platillo){
        return platillosRepo.save(platillo);
    }

    public void eliminar(Long id){
        this.platillosRepo.deleteById(id);
    }

    public Optional<Platillos> buscarXId(Long id){
        return platillosRepo.findById(id);
    }
    
}
