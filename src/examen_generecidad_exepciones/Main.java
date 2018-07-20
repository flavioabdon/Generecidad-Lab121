package examen_generecidad_exepciones;

import java.time.Period;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, Exception {
		Scanner cin = new Scanner(System.in);
		Main m=new Main();
		// TODO Auto-generated method stub
		Libro<Dinosaurio> lib1 = new Libro<Dinosaurio>();
		Carnivoro car1= new Carnivoro("Carnotauro", 4.6 , 3.5 , "Cretacico superior" , 70000000.0 , "Argentina" , "Depredador");
		Carnivoro car2= new Carnivoro("Spinosurio", 5.0 , 8.5 , "Cretacico" , 112000000.0 , "Niger" , "Carroñero");//"Niger,Egipto,Libia,Marruecos"
		Carnivoro car3= new Carnivoro("Velociraptor", 1.8 , 2.0 , "Cretacico superior" , 80000000.0 , "Mongolia" , "Depredador");
		Carnivoro car4= new Carnivoro("Terranossaurus Rex", 12.0 , 4.0 , "Cretacico superior" , 65000000.0 , "Canada" , "Depredador");
		Carnivoro car5= new Carnivoro("Megalosaurus", 9.0 , 0.0 , "Jurasico Media" , 145000000.0 , "Inglaterra" , "Depredador");
		Hervivoro heb1= new Hervivoro("Diplodocus", 26.0 , 15.0 , "Jurasico Superior" , 115000000.0, "Usa", "Estomago Simple");
		Hervivoro heb2= new Hervivoro("Triceraptops", 9.0 , 3.0 , "Cretacico Superior" , 70000000.0, "Usa", "Estomago Simple");
		Hervivoro heb3= new Hervivoro("Brontosaurio", 4.2 , 30.0 , "Jurasico Superior" , 150000000.0, "Usa", "Estomago Compuesto");
		Omnivoro omn1=new Omnivoro("Oviraptor", 2.0 , 60.0 ,"Cretacico Superior" , 150000000.0 , "Mongolia" , "Carronero" , "Estomago Simple");		
		
		//2 añadir
		lib1.addCapitulo(car1); 
		lib1.addCapitulo(car2);
		lib1.addCapitulo(car3);
		lib1.addCapitulo(heb1);
		lib1.addCapitulo(omn1);
		lib1.addCapitulo(heb2);
		
		//2 mostrar
		System.out.println("\n***Objetos en la lista:");
		for (Dinosaurio dino : lib1) {
			System.out.println("Nombre:"+dino.getNombre()+" ,Altura:"+dino.getAltura()+ " ,Año:"+dino.getAnio()+" ,Encontrado:" + dino.getEncontrado() +" ,Periodo:"+dino.getPeriodo()+" ,Peso:"+dino.getPeso()) ;
		}
		
		// eliminar 
		System.out.println("\n***Se va a eliminar:");
		System.out.println(car1.getNombre());
		lib1.remCapitulo(car1);
		System.out.println(car2.getNombre());
		lib1.remCapitulo(car2);
		System.out.println(car3.getNombre());
		lib1.remCapitulo(car3);
		
		System.out.println("\n***Objetos en la lista:");
		for (Dinosaurio dino : lib1) {
			System.out.println("Nombre:"+dino.getNombre()+" ,Altura:"+dino.getAltura()+ " ,Año:"+dino.getAnio()+" ,Encontrado:" + dino.getEncontrado() +" ,Periodo:"+dino.getPeriodo()+" ,Peso:"+dino.getPeso()) ;
		}
		//buscar
		System.out.println("***Realizar BUS . pais. Intro. Pais:");
		String str="";
		str= cin.next();
		
		for (Dinosaurio list : lib1) {
			if (list.getEncontrado().equals(str)) {
				System.out.println("\nEncontrado:"+list.getNombre()+" "+list.getEncontrado());
			}
			else {
				
			}
		}
//		
		System.out.println("***Añadir un nuevo carnivoro:");
		System.out.print("Nombre:");
		String inombre=cin.next();
		double ipeso=0.0;
		System.out.print("Peso:");
		String str1=cin.next();
		if (m.isNumeric(str1) ){
			ipeso = Double.parseDouble(""+str1);
		}
		else {
			System.out.println("*******Error*******");
		}
			
	
	
		System.out.print("Altura:");
		double ialtura=cin.nextDouble();
		System.out.print("Periodo;");
		String iper=cin.next();
		System.out.print("Años:");
		double ianos=cin.nextDouble();
		System.out.print("Procedencia:");
		String iprocedencia=cin.next();
		System.out.print("Tipo Consumidor:");
		String iconsumi=cin.next();
		
		Carnivoro car10= new Carnivoro(inombre, ipeso ,ialtura ,iper ,ianos  , iprocedencia , iconsumi);
		lib1.addCapitulo(car10);
		
		System.out.println("\n***Objetos en la lista:");
		for (Dinosaurio dino : lib1) {
			System.out.println("Nombre:"+dino.getNombre()+" ,Altura:"+dino.getAltura()+ " ,Año:"+dino.getAnio()+" ,Encontrado:" + dino.getEncontrado() +" ,Periodo:"+dino.getPeriodo()+" ,Peso:"+dino.getPeso()) ;
		}
		
	}
	public boolean isNumeric(String num) throws Exception{
	       double numero;
	        try{
	              numero=Double.parseDouble(num.trim());  
	              return true;
	        }
	     
	        catch(NumberFormatException ex){
	            return false; 
	        }
	}


}
