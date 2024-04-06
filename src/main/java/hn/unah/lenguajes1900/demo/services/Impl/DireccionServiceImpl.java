package hn.unah.lenguajes1900.demo.services.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.demo.entities.Cliente;
import hn.unah.lenguajes1900.demo.entities.Direccion;
import hn.unah.lenguajes1900.demo.repositories.ClienteRepository;
import hn.unah.lenguajes1900.demo.repositories.DireccionRepository;
import hn.unah.lenguajes1900.demo.services.DireccionService;

@Service
public class DireccionServiceImpl implements DireccionService{

    @Autowired
    private DireccionRepository direccionRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Direccion creaDireccion(Direccion direccion, String dni) {
        Optional<Cliente> clienteDni= clienteRepository.findById(dni);
       if(clienteRepository.existsById(dni)){
            Cliente cliente = clienteDni.get();
            direccion.setCliente(cliente);
            return this.direccionRepository.save(direccion);
       }
       return null;
    }
    
}
