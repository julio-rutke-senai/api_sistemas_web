package br.edu.senai.sc.locadora.repository;

import br.edu.senai.sc.locadora.entity.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {

    List<Carro> findCarrosByModeloContaining(String modelo);
}
