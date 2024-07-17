package com.ejemplo.jpatutorial.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.jpatutorial.model.Producto;
import com.ejemplo.jpatutorial.respositories.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {
	
	@Autowired
	private ProductoRepository productoRepository;

	@Override
	public List<Producto> seach() {
		return (List<Producto>) productoRepository.findAll();
		
	}
	
	@Override
	public List<Producto> findById(int id) {
		return (List<Producto>) productoRepository.findById(id);
		
	}
	
	@Override
	public List<Producto> findByNombre(String nombre) {
		return (List<Producto>) productoRepository.findByNombre(nombre);
		
	}
	
	@Override
	public List<Producto> findByPrecio(Double precio){
		return (List<Producto>) productoRepository.findByPrecio(precio);
	}
	
	@Override
	public List<Producto> findByPrecioBetween(Double preciomin, Double preciomax) {
		return productoRepository.findByPrecioBetween(preciomin, preciomax);
	}

}
