using System;

public class Jugo extends Producto{

	protected double contenido;
	protected String media;
	public double getContenido() {
		return contenido;
	}
	public void setContenido(double contenido) {
		this.contenido = contenido;
	}
	public String getMedia() {
		return media;
	}
	public void setMedia(String media) {
		this.media = media;
	}
	public Jugo(int cod_producto, String nombre_prod, double precio, double descuento, double contenido, String media) {
		super(cod_producto, nombre_prod, precio, descuento);
		this.contenido = contenido;
		this.media = media;
	}
	public Jugo(int cod_producto, String nombre_prod, double precio, double descuento) {
		super(cod_producto, nombre_prod, precio, descuento);
		// TODO Auto-generated constructor stub
	}

}
