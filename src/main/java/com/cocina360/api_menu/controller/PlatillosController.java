package com.cocina360.api_menu.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cocina360.api_menu.model.Platillos;
import com.cocina360.api_menu.service.PlatillosService;

@RestController
@RequestMapping("/api/platillos")
public class PlatillosController {

    @Autowired
    private PlatillosService platillosService;

    @GetMapping
    public List<Platillos> listarPlatillos(){
        return platillosService.listarPlatillos();
    }

    @PostMapping()
    public Platillos platilloNuevo(@RequestBody Platillos platillo){
        return platillosService.nuevoPlatillo(platillo);
    }


    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        this.platillosService.eliminar(id);
    }

    @GetMapping("/{id}")
    public Optional<Platillos> platilloXId(@PathVariable Long id){
        return platillosService.buscarXId(id);
    }

    
}
