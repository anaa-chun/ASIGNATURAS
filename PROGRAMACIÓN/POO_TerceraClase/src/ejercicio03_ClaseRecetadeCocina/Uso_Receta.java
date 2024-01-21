package ejercicio03_ClaseRecetadeCocina;

//@author: Ana Chun Gómez de Castro DAM1

public class Uso_Receta {

	public static void main(String[] args) {
		/*- Implementa una clase Receta que contenga una lista de ingredientes y pasos para preparar un plato.
		- Incluye métodos para añadir y eliminar ingredientes, y para añadir pasos a la receta.
		- Añade un método para mostrar la receta completa, incluyendo todos los ingredientes y el procedimiento paso a paso.*/

		// Instancio de la clase Receta con límites para ingredientes y pasos
		Receta recetaBizcochoLimon = new Receta(5, 10);

		// Los ingredientes que necesitamos
		recetaBizcochoLimon.añadirIngrediente("Harina");
		recetaBizcochoLimon.añadirIngrediente("Azúcar");
		recetaBizcochoLimon.añadirIngrediente("Huevos");
		recetaBizcochoLimon.añadirIngrediente("Limones");
		recetaBizcochoLimon.añadirIngrediente("Levadura");

		// Aquí explico cómo se hace el bizcoho de limón
		recetaBizcochoLimon.añadirPaso("Precalentar el horno a 180°C.");
		recetaBizcochoLimon.añadirPaso("Mezclar la harina, el azúcar y la levadura en un bol.");
		recetaBizcochoLimon.añadirPaso("Añadir los huevos y el jugo de limón a la mezcla.");
		recetaBizcochoLimon.añadirPaso("Batir la mezcla hasta obtener una masa homogénea.");
		recetaBizcochoLimon.añadirPaso("Verter la masa en un molde y hornear durante 30 minutos.");

		// Muestro la receta completa del bizcoho de limón
		recetaBizcochoLimon.mostrarReceta();
	}

}
