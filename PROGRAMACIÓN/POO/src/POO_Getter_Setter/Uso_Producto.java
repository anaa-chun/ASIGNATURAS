package POO_Getter_Setter;

//@author: Ana Chun Gómez de Castro DAM1

public class Uso_Producto {

	public static void main(String[] args) {
		/*
		 * Objetivo: Crea una clase Producto con tres propiedades privadas: nombre
		 * (String), precio (double), y stock (int). Desarrolla los métodos getter y
		 * setter necesarios.
		 * 
		 * Desafío adicional: En el setter de stock, asegúrate de que no sea un número
		 * negativo.
		 */

		Producto CaviarAlmasOsetra = new Producto();

		System.out.println(CaviarAlmasOsetra.dimeNombre());
		System.out.println(CaviarAlmasOsetra.dimePrecio());
		System.out.println(CaviarAlmasOsetra.dimeStock());
	}
}
