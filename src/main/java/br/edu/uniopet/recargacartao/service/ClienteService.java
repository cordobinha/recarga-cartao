package br.edu.uniopet.recargacartao.service;

import br.edu.uniopet.recargacartao.Cliente;
import br.edu.uniopet.recargacartao.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;
    public Cliente create (Cliente cliente) {

        Cliente  clienteAux = new Cliente();

        if (cliente != null){
           clienteAux = repository.save(cliente);

        }

        return clienteAux;
    }

    public List<Cliente> findAll() {
        return repository.findAll();
    }

    public Cliente getById(Integer id){
        Cliente cliente = new Cliente();

        if(id != null && id >0){
            cliente = repository.findById(id).orElse(null);
        }

        return cliente;

    }

    public Cliente getByNome(String nome){

        Cliente cliente = new Cliente();

        if(nome != null){
            cliente = repository.findByNome(nome);
        }
        return cliente;

    }

    public Cliente getByEmail(String Email) {

        Cliente cliente = new Cliente();

        if (Email != null) {
            cliente = repository.findByEmail(Email);
        }
        return cliente;
    }


    public Cliente getBycpf(String cpf) {

        Cliente cliente = new Cliente();

        if (cpf != null) {
            cliente = repository.findByCpf(cpf);
        }
        return cliente;


    }
}
