using System;

public class Producto {

	protected int cod_producto;
	protected String nombre_prod;
	protected double precio;
	protected double descuento;
	public int getCod_producto() {
		return cod_producto;
	}
	public void setCod_producto(int cod_producto) {
		this.cod_producto = cod_producto;
	}
	public String getNombre_prod() {
		return nombre_prod;
	}
	public void setNombre_prod(String nombre_prod) {
		this.nombre_prod = nombre_prod;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	public Producto(int cod_producto, String nombre_prod, double precio, double descuento) {
		super();
		this.cod_producto = cod_producto;
		this.nombre_prod = nombre_prod;
		this.precio = precio;
		this.descuento = descuento;
	}

}
