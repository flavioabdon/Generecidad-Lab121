using System;


public class Cliente {
	protected int cod_cliente;
	protected String nombre;
	protected String apellido;
	protected String nit;
	protected int telefono;
	protected Cliente ped[] = new Cliente[0];
	public Cliente(int cod_cliente, String nombre, String apellido, String nit, int telefono, Cliente[] ped) {
		super();
		this.cod_cliente = cod_cliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nit = nit;
		this.telefono = telefono;
		this.ped = ped;
	}
	public int getCod_cliente() {
		return cod_cliente;
	}
	public void setCod_cliente(int cod_cliente) {
		this.cod_cliente = cod_cliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNit() {
		return nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public Cliente[] getPed() {
		return ped;
	}
	public void setPed(Cliente[] ped) {
		this.ped = ped;
	}
}
