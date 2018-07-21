using System;

public class Pedido {

	protected int nroFactura;
	protected String fecha;
	protected Producto prod[] = new Producto[0];
	public int getNroFactura() {
		return nroFactura;
	}
	public void setNroFactura(int nroFactura) {
		this.nroFactura = nroFactura;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Producto[] getProd() {
		return prod;
	}
	public void setProd(Producto[] prod) {
		this.prod = prod;
	}
	public Pedido(int nroFactura, String fecha, Producto[] prod) {
		super();
		this.nroFactura = nroFactura;
		this.fecha = fecha;
		this.prod = prod;
	}

}
