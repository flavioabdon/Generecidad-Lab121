package examen_generecidad_exepciones;

public class Carnivoro  extends Dinosaurio { 
	protected String tipoConsumidor;

	public Carnivoro() {
		super();
		this.tipoConsumidor="";
	}


	public Carnivoro(String nombre, double altura, double peso, String periodo, double anio, String encontrado,
			String tipoConsumidor) {
		super(nombre, altura, peso, periodo, anio, encontrado);
		this.tipoConsumidor = tipoConsumidor;
	}


	public String getTipoConsumidor() {
		return tipoConsumidor;
	}


	public void setTipoConsumidor(String tipoConsumidor) {
		this.tipoConsumidor = tipoConsumidor;
	}
	
	public void getDatos () {
		System.out.println(this.getNombre());
	}

}
