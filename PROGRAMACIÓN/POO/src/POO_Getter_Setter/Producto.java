package POO_Getter_Setter;

//@author: Ana Chun Gómez de Castro DAM1

public class Producto {

	/*
	 * Objetivo: Crea una clase Producto con tres propiedades privadas: nombre
	 * (String), precio (double), y stock (int). Desarrolla los métodos getter y
	 * setter necesarios.
	 * 
	 * Desafío adicional: En el setter de stock, asegúrate de que no sea un número
	 * negativo.
	 */

	private String nombre;
	private double precio;
	private int stock;

	public Producto() {
		nombre = "Caviar Almas Osetra";
		precio = 30.001;
		stock = 23;
	}

	public String dimeNombre() {
		return "El " + nombre + " es una variedad particularmente exclusiva y costosa de caviar.";
	}

	public double dimePrecio() {
		return precio;
	}

	public int dimeStock() {
		return stock;
	}

}
