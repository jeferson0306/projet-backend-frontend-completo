package com.cursomcspring.repositories;

import com.cursomcspring.domain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

    //Basta criar o repository da superclasse, não precisa criar das subclasses
}