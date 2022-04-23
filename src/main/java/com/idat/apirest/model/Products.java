package com.idat.apirest.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Table(name="products")
@Entity
public class Products {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProducto;
	private String producto;
	private String descripcion;
	private Double precio;
	private Integer stock;
	
	@ManyToOne
    @JoinColumn(name = "id_bodega")
    private Bodega bodega;
	
	
	@ManyToMany(mappedBy = "products" , cascade = {CascadeType.PERSIST ,CascadeType.MERGE})
	private List<Cliente> profesor = new ArrayList<>();


	public Integer getIdProducto() {
		return idProducto;
	}


	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}


	public String getProducto() {
		return producto;
	}


	public void setProducto(String producto) {
		this.producto = producto;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Double getPrecio() {
		return precio;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}


	public Integer getStock() {
		return stock;
	}


	public void setStock(Integer stock) {
		this.stock = stock;
	}


	public Bodega getBodega() {
		return bodega;
	}


	public void setBodega(Bodega bodega) {
		this.bodega = bodega;
	}


	public List<Cliente> getProfesor() {
		return profesor;
	}


	public void setProfesor(List<Cliente> profesor) {
		this.profesor = profesor;
	}
	
	
	
	
	
}
