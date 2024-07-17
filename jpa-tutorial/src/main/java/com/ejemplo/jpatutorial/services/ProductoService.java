package com.ejemplo.jpatutorial.services;

import java.util.List;

import com.ejemplo.jpatutorial.model.Producto;

public interface ProductoService {
	List<Producto> seach();
	List<Producto> findById(int id);
	List<Producto> findByNombre(String nombre);
	List<Producto> findByPrecio(Double precio);
	List<Producto> findByPrecioBetween(Double preciomin, Double preciomax);
}

