package hn.unah.lenguajes1900.demo.services.Impl;

// import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.demo.entities.Cliente;
// import hn.unah.lenguajes1900.demo.entities.Cuentas;
import hn.unah.lenguajes1900.demo.repositories.ClienteRepository;
// import hn.unah.lenguajes1900.demo.repositories.CuentasRepository;
import hn.unah.lenguajes1900.demo.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    // @Autowired
    // private CuentasRepository cuentasRepository;

    @Override
    public Cliente crearCliente(Cliente cliente) {
        if (!this.clienteRepository.findById(cliente.getDni()).isPresent()) {
            // List<Cuentas> cuentas = this.cuentasRepository.
            return this.clienteRepository.save(cliente);
        }else{
            return null;
        }
    }
    
}
