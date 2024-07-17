package com.ejemplo.jpatutorial.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.jpatutorial.model.Producto;
import com.ejemplo.jpatutorial.services.ProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RestController
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("productos")
	public List<Producto> search(){
		return productoService.seach();
	}
	
	@GetMapping("productos/{id}")
	public List<Producto> searchById(@PathVariable int id) {
		return productoService.findById(id);
    }
	
	@GetMapping("productos/nombre/{nombre}")
	public List<Producto> searchByNombre(@PathVariable String nombre){
		return productoService.findByNombre(nombre);
	}
	
	@GetMapping("productos/precio/{precio}")
	public List<Producto> searchByDescripcion(@PathVariable Double precio){
		return productoService.findByPrecio(precio);
	}
	
	@GetMapping("productos/searchByPrecio")
    public ResponseEntity<List<Producto>> searchByPrecio(
            @RequestParam("preciomin") Double preciomin,
            @RequestParam("preciomax") Double preciomax) {
        List<Producto> productos = productoService.findByPrecioBetween(preciomin, preciomax);
        return ResponseEntity.ok(productos);
    }

}
