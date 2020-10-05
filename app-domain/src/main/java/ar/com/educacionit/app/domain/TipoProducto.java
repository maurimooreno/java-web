package ar.com.educacionit.app.domain;

public class TipoProducto {
	
	private Long id;
	private String descripcion;
	
	public TipoProducto() {
		super();
	}

	public TipoProducto(Long id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "TipoProducto [id=" + id + ", descripcion=" + descripcion + "]";
	}
	
	
	

}
