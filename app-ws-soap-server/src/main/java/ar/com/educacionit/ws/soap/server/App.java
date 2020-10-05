package ar.com.educacionit.ws.soap.server;

import java.util.List;

import ar.com.educacionit.app.domain.Producto;
import ar.com.educacionit.service.ProductoService;
import ar.com.educacionit.service.impl.ProductoServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ProductoService ps = new ProductoServiceImpl();
        
        List<Producto> productos = ps.findAll();
        
        System.out.println(productos);
    }
}
