package examen_generecidad_exepciones;

public class Hervivoro extends Dinosaurio {
	protected String digestion;

	public Hervivoro() {
		super();
		this.digestion="";
	}
	public Hervivoro(String nombre, double altura, double peso, String periodo, double anio, String encontrado,
			String digestion) {
		super(nombre, altura, peso, periodo, anio, encontrado);
		this.digestion = digestion;
	}


	public String getDigestion() {
		return digestion;
	}

	public void setDigestion(String digestion) {
		this.digestion = digestion;
	}
}
