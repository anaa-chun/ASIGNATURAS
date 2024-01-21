package ejercicio03_ClaseRecetadeCocina;

//@author: Ana Chun Gómez De Castro DAM1

// Clase Receta
class Receta {
	/*- Implementa una clase Receta que contenga una lista de ingredientes y pasos para preparar un plato.
	- Incluye métodos para añadir y eliminar ingredientes, y para añadir pasos a la receta.
	- Añade un método para mostrar la receta completa, incluyendo todos los ingredientes y el procedimiento paso a paso.*/

	private String[] ingredientes; // Almacena los ingredientes de la receta
	private String[] pasos; // Alamacena los pasos de la preparación
	private int numIngredientes; // Número actual de ingredientes en la receta
	private int numPasos; // Número actual de pasos en la receta

	// Constructor de la clase Receta
	public Receta(int maxIngredientes, int maxPasos) {

		// Inicializo el arreglo de ingredientes, el de pasos, el número de ingred. y
		// pasos
		ingredientes = new String[maxIngredientes];
		pasos = new String[maxPasos];
		numIngredientes = 0;
		numPasos = 0;
	}

	// Método para añadir un ingrediente a la receta
	public void añadirIngrediente(String ingrediente) {
		if (numIngredientes < ingredientes.length) {
			ingredientes[numIngredientes] = ingrediente;
			numIngredientes++;
		} else {
			System.out.println("No se puede añadir más ingredientes. Receta completa.");
		}
	}

	// Método para eliminar un ingrediente de la receta
	public void eliminarIngrediente(String ingrediente) {
		for (int i = 0; i < numIngredientes; i++) {
			if (ingredientes[i].equalsIgnoreCase(ingrediente)) {
				for (int j = i; j < numIngredientes - 1; j++) {
					ingredientes[j] = ingredientes[j + 1];
				}
				ingredientes[numIngredientes - 1] = null; // Establecer el último elemento como nulo
				numIngredientes--; // Número de ingredientes
				return;
			}
		}
		System.out.println("Ingrediente no encontrado en la receta.");
	}

	// Método para añadir un paso a la receta
	public void añadirPaso(String paso) {
		if (numPasos < pasos.length) {
			pasos[numPasos] = paso; // Agregar paso al arreglo
			numPasos++; // Incrementar el número de pasos
		} else {
			System.out.println("No se pueden añadir más pasos ya que la receta está completa.");
		}
	}

	// Método para mostrar la receta completa
	public void mostrarReceta() {
		System.out.println("Receta de Bizcocho de Limón:");

		// Mostrar ingredientes
		System.out.println("Ingredientes que necesito:");
		for (int i = 0; i < numIngredientes; i++) {
			System.out.println("- " + ingredientes[i]);
		}

		// Mostrar pasos
		System.out.println("\nPasos a seguir:");
		for (int i = 0; i < numPasos; i++) {
			System.out.println((i + 1) + ". " + pasos[i]);
		}
	}
}
