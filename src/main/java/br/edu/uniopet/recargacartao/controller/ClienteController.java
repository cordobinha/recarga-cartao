package br.edu.uniopet.recargacartao.controller;

import br.edu.uniopet.recargacartao.Cliente;
import br.edu.uniopet.recargacartao.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController  {

    @Autowired
    private ClienteService service;

    @PostMapping("/cliente/create")
    public Cliente create (@RequestBody Cliente cliente){

        return service.create(cliente);
    }

    @GetMapping("/cliente/all")
    public List<Cliente>findByAll(){

        return service.findAll();
    }

    @GetMapping("/cliente/{id}")
    public Cliente findById(@PathVariable Integer id){
        return service.getById(id);
    }

    @PostMapping("/cliente/nome")
    public Cliente getByNome(@RequestBody String nome) {
        return service.getByNome(nome);
    }

    @PostMapping("/cliente/email")
    public Cliente getByEmail(@RequestBody String email) {
        return service.getByEmail(email);
    }

    @PostMapping("/cliente/cpf")
    public Cliente getBycpf(@RequestBody String cpf) {
        return service.getBycpf(cpf);


    }

    }
