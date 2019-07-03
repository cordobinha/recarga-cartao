package br.edu.uniopet.recargacartao.repository;

import br.edu.uniopet.recargacartao.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer> {

    @Query("select c from Cliente c where c.nome = ?1")
    Cliente findByNome(String nome);
    @Query("select c from Cliente c where c.email = ?1")
    Cliente findByEmail(String Email);
    @Query("select c from Cliente c where c.cpf = ?1")
    Cliente findByCpf (String cpf);
}
