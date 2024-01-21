
package ejercicio01_ClaseRelojdeAlarma;

//@author : Ana Chun Gómez de Castro DAM1

public class Uso_RelojdeAlarma {

	public static void main(String[] args) {
		/*- Crea una clase RelojAlarma que tenga atributos para la hora de alarma, hora actual y si la
		alarma está activada o no.
		
		- Implementa métodos para establecer la hora de la alarma, activar/desactivar la alarma y
		actualizar la hora actual.
		
		- Añade un método que compruebe si la hora actual coincide con la hora de la alarma y, de
		ser así, imprima un mensaje de "Alarma sonando".
		*/

		RelojdeAlarma miRelojAlarma = new RelojdeAlarma();

		miRelojAlarma.establecerHoraAlarma(11); // Establece la hora de la alarma a las 11
		miRelojAlarma.activarAlarma(); // Activa la alarma

		// Simula el paso del tiempo actualizando la hora actual
		for (int i = 1; i <= 11; i++) {
			miRelojAlarma.actualizarHoraActual(i);
			miRelojAlarma.comprobarAlarma();
		}

	}

}
