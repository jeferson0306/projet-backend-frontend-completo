package com.cursomcspring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursomcspring.domain.Categoria;
import com.cursomcspring.repositories.CategoriaRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Optional<Categoria> find(Integer id) throws ObjectNotFoundException { 
		 Optional<Categoria> obj = repo.findById(id); 
		if (obj == null) { 
		 throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
		 + ", Tipo: " + Categoria.class.getName()); 
		 } 
		return obj; 
		}
}