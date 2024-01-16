package POO_Getter_Setter;

//@author: Ana Chun Gómez de Castro DAM1

public class Automovil { //declaro una clase
	/*
	 * Objetivo: Crear una clase Automovil con dos propiedades privadas: marca
	 * (String) y modelo (String). Implementa los métodos getter y setter para estas
	 * propiedades.
	 * 
	 * Desafío adicional: Asegúrate de que el modelo no sea nulo ni esté vacío en el
	 * setter.
	 */

	//Propiedades privadas
	private String marca;
	private String modelo;

	public Automovil() {
		marca = "BMV";
		modelo = "coupé";
	}
	
	public String getModelo() {
		return modelo;
	}

	public String getMarca() {
		return marca;
	}

	public String dimeMarca() {
		return "No me gusta el coche que es de la marca " + marca;
	}

	public String dimeModelo() {
		return " pero es de modelo " + modelo;
	}
	


}
