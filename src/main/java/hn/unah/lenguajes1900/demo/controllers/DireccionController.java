package hn.unah.lenguajes1900.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.demo.entities.Direccion;
import hn.unah.lenguajes1900.demo.services.Impl.DireccionServiceImpl;

@RestController
@RequestMapping("/examen2")
public class DireccionController {
    
    @Autowired
    private DireccionServiceImpl direccionServiceImpl;

    @PostMapping("/direccion/crear/{dni}")
    public Direccion creaDireccion(@RequestBody Direccion direccion, @PathVariable String dni){
        return this.direccionServiceImpl.creaDireccion(direccion, dni);
    }
}
