package ar.com.educacionit.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="titulo")
	private String titulo;
	
	@Column(name="precio")
	private Float precio;
	
	@ManyToOne
	@JoinColumn(name = "tipo_producto", referencedColumnName = "id")
	private TipoProducto tipoProducto;
	
	@Column(name="codigo", unique= true)
	private String codigo;

	public Producto(Long id, String titulo, Float precio, TipoProducto tipoProducto, String codigo) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.precio = precio;
		this.tipoProducto = tipoProducto;
		this.codigo = codigo;
	}

	public Producto(String titulo, Float precio, TipoProducto tipoProducto, String codigo) {
		super();
		this.titulo = titulo;
		this.precio = precio;
		this.tipoProducto = tipoProducto;
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public TipoProducto getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(TipoProducto tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

}
