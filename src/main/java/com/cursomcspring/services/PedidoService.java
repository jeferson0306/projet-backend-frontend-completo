package com.cursomcspring.services;

import com.cursomcspring.domain.Pedido;
import com.cursomcspring.repositories.PedidoRepository;
import javassist.tools.rmi.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;

	public Optional<Pedido> find(Integer id) throws ObjectNotFoundException {
		 Optional<Pedido> obj = repo.findById(id);
		if (obj == null) { 
		 throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
		 + ", Tipo: " + Pedido.class.getName());
		 } 
		return obj; 
		}
}