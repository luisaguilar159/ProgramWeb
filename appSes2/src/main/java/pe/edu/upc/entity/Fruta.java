package pe.edu.upc.entity;
//Fruta es la clase padre
public class Fruta {
	
	//atributos de instancia
	//valores cambian con cada objeto
	private String nombre;
	private String color;
	private String sabor;
	private boolean puedoHacerJugo;
	
	//atributos de clase - valor no depende de obj
	//se pone static pues depende de la clase, no del objeto
	public static String LugarOrigen="UPC";
	
	//constructor sobrecarga
	public Fruta(){
		this.nombre = "Indefinido";
		this.color = "S/C";
		this.sabor = "S/C";
		this.puedoHacerJugo=false;
	}
	
	//Source -> Generate Constructor using Fields...
	public Fruta(String nombre, String color, String sabor) {
		super(); //heredar constructor clase Padre
		this.nombre = nombre;
		this.color = color;
		this.sabor = sabor;
		this.puedoHacerJugo=false;
	}
	
	//metodos de acceso a datos ( set y get )
	//Source -> Generate Getters and Setters...
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public boolean isPuedoHacerJugo() {
		return puedoHacerJugo;
	}

	public void setPuedoHacerJugo(boolean puedoHacerJugo) {
		this.puedoHacerJugo = puedoHacerJugo;
	}

	//se esta heredando
	//Sobreescritura de metodos heredados
	//Source -> Generate toString()...
	@Override
	public String toString() {
		return "Fruta [nombre=" + nombre + ", color=" + color + ", sabor=" + sabor + ", puedoHacerJugo="
				+ puedoHacerJugo + "]";
	} 
	
	
	

}
