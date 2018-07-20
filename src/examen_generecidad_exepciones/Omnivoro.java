package examen_generecidad_exepciones;

public class Omnivoro extends Dinosaurio {
	protected String tipoConsumidor;
	protected String digestion;
	
	public Omnivoro() {
		super ();
		this.tipoConsumidor="";
		this.digestion="";
	}
	
	public Omnivoro(String nombre, double altura, double peso, String periodo, double anio, String encontrado,
			String tipoConsumidor, String digestion) {
		super(nombre, altura, peso, periodo, anio, encontrado);
		this.tipoConsumidor = tipoConsumidor;
		this.digestion = digestion;
	}
	public String getTipoConsumidor() {
		return tipoConsumidor;
	}
	public void setTipoConsumidor(String tipoConsumidor) {
		this.tipoConsumidor = tipoConsumidor;
	}
	public String getDigestion() {
		return digestion;
	}
	public void setDigestion(String digestion) {
		this.digestion = digestion;
	}

}
