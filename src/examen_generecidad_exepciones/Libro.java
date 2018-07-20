package examen_generecidad_exepciones;
import java.util.ArrayList;
import java.util.Iterator;
public class Libro  <C> implements Iterable <C>{
	private ArrayList<C> capitulo = new ArrayList<C>();
	private int max=5;
	public Libro() {
		this.max=5;
	}
	//setters y getters
	public ArrayList<C> getCapitulo() {
		return capitulo;
	}

	public void setCapitulo(ArrayList<C> capitulo) {
		this.capitulo = capitulo;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
	
	public void addCapitulo(C cap) {
		if (capitulo.size()<=max) {
			capitulo.add(cap);
		}
		else {
			throw new RuntimeException("Se llego al limite de Temas en el libro.");
		}
	}
	public void remCapitulo(C cap) {
		
		if(capitulo.remove(cap))
		{
			System.out.println("Se Elimino correctamente el objeto");
		}
		else {
			throw new RuntimeException("Se llego al limite de Temas en el libro.");
		}
	}

	@Override
	public Iterator<C> iterator() {
		return capitulo.iterator();
	}
	
}
