package br.edu.uniopet.recargacartao.repository;

import br.edu.uniopet.recargacartao.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer> {

    Cliente findByNome(String nome);
    Cliente findByEmail(String Email);
    Cliente findByCpf (String cpf);

}
