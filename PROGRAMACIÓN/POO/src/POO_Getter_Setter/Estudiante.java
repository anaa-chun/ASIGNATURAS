package POO_Getter_Setter;

//@author: Ana Chun Gómez de Castro DAM1

public class Estudiante {
	/*
	 * Ejercicio 3: Clase Estudiante Objetivo: Construye una clase Estudiante con
	 * tres propiedades privadas: nombre (String), edad (int), y calificacion
	 * (double). Implementa los getters y setters correspondientes.
	 * 
	 * Desafío adicional: Asegúrate de que la edad sea un número positivo y que la
	 * calificación esté en el rango de 0 a 100.
	 */

	private String nombre;
	private int edad;
	private double calificacion;

	public Estudiante() {
		nombre = " Ana Chun";
		edad = 19;
		calificacion = 8.5;
	}

	public String dimeEstudiante() {
		return " Soy la alumna "+nombre + " tengo " + edad + " años, y mi calificación de programación es un " + calificacion;
	}

	public int dimeEdad() {
		return edad;
	}

	public double dimeCalificacion() {
		return calificacion;
	}

}
