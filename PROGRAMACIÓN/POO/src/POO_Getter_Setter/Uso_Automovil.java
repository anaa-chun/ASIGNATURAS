package POO_Getter_Setter;

//@author: Ana Chun Gómez De Castro DAM1

public class Uso_Automovil {

	public static void main(String[] args) {
		/*
		 * Objetivo: Crear una clase Automovil con dos propiedades privadas: marca
		 * (String) y modelo (String). Implementa los métodos getter y setter para estas
		 * propiedades.
		 * 
		 * Desafío adicional: Asegúrate de que el modelo no sea nulo ni esté vacío en el
		 * setter.
		 */

		Automovil BMV = new Automovil();

		System.out.println(BMV.dimeMarca() + BMV.dimeModelo());

	}

}
