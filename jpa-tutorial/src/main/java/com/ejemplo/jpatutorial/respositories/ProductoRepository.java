package com.ejemplo.jpatutorial.respositories;

import org.springframework.data.repository.CrudRepository;

import com.ejemplo.jpatutorial.model.Producto;

import java.util.List;

public interface ProductoRepository extends CrudRepository<Producto, Integer> {
	List<Producto> findByNombre(String nombre);

	List<Producto> findByPrecio(Double precio);

	List<Producto> findById(int id);

	List<Producto> findByPrecioBetween(Double preciomin, Double preciomax);

}