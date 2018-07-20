package examen_generecidad_exepciones;

import java.util.InputMismatchException;

public class Dinosaurio {
protected String nombre;
protected double altura;
protected double peso;
protected String periodo;
protected double anio;
protected String encontrado;
	public Dinosaurio () {
		this.nombre="";
		this.altura=0.0;
		this.peso=0.0;
		this.periodo="";
		this.anio=0;
		this.encontrado="";
	}
	public Dinosaurio(String nombre, double altura, double peso, String periodo, double anio, String encontrado) {
		super();
		this.nombre = nombre;
		this.periodo = periodo;
		this.anio = anio;
		this.encontrado = encontrado;

		this.altura = altura;


		this.peso = peso;

				
		
				
			
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public double getAnio() {
		return anio;
	}

	public void setAnio(double anio) {
		this.anio = anio;
	}

	public String getEncontrado() {
		return encontrado;
	}

	public void setEncontrado(String encontrado) {
		this.encontrado = encontrado;
	}
}
