package pe.edu.upc.view;

import pe.edu.upc.entity.Fruta;

public class appFruteriaUPC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fruta objFruta=new Fruta("Mango", "Amarillo", "Dulce");
		System.out.println(objFruta.toString());
		
		Fruta.LugarOrigen="Otro lugar";
		Fruta.LugarOrigen="Otro lugar2";
		System.out.println(Fruta.LugarOrigen);

	}

}
