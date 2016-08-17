package pe.edu.upc.entity;

//como se necesitan coger datos de Fruta, se pondra extends
//solo se puede heredar de una clase padre, el hijo no puede tener
//2 padres
public class Mermelada extends Fruta{
	
	private int duracionDias;
	private String tipoEnvase;
	
	
	
	public Mermelada(String nombre, String color, String sabor, 
			         int duracionDias, String tipoEnvase) {
		super(nombre, color, sabor);
		this.duracionDias=duracionDias;
		this.tipoEnvase=tipoEnvase;
		// TODO Auto-generated constructor stub
	}



	public String prepararMermelada(){
		return ("Preparando mermelada con alegria:" 
	              + this.getNombre());
	}

}
