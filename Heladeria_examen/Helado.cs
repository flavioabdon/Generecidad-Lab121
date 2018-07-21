using System;

public class Helado extends Producto {

	protected double temperatura_req;

	public double getTemperatura_req() {
		return temperatura_req;
	}

	public void setTemperatura_req(double temperatura_req) {
		this.temperatura_req = temperatura_req;
	}

	public Helado(int cod_producto, String nombre_prod, double precio, double descuento, double temperatura_req) {
		super(cod_producto, nombre_prod, precio, descuento);
		this.temperatura_req = temperatura_req;
	}

	public Helado(int cod_producto, String nombre_prod, double precio, double descuento) {
		super(cod_producto, nombre_prod, precio, descuento);
		// TODO Auto-generated constructor stub
	}

}
