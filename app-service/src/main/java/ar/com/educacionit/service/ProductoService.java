package ar.com.educacionit.service;

import java.util.List;

import ar.com.educacionit.app.domain.Producto;

public interface ProductoService {
	
	public List<Producto> findAll();
	
	public Producto getById(Long idProducto);
	
	public Producto getByCodigo(String codigo);
	
	public Producto deleteProducto(Long id);
	
	public Producto updateProducto(Producto producto);
	
	
}
