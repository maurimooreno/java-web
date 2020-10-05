package ar.com.educacionit.service.impl;

import java.util.List;

import ar.com.educacionit.app.domain.Producto;
import ar.com.educacionit.dao.ProductoRepository;
import ar.com.educacionit.dao.exceptions.GenericException;
import ar.com.educacionit.dao.hibernate.impl.ProductoRepositoryHibernateImpl;
import ar.com.educacionit.service.ProductoService;

public class ProductoServiceImpl implements ProductoService {
	
	private ProductoRepository productoRespository;
	
	public ProductoServiceImpl() {
		this.productoRespository = new ProductoRepositoryHibernateImpl();
	}

	@Override
	public List<Producto> findAll(){
		try {
			this.productoRespository.findProductos();
		} catch (GenericException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Producto getById(Long idProducto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto getByCodigo(String codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto deleteProducto(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto updateProducto(Producto producto) {
		// TODO Auto-generated method stub
		return null;
	}

}
