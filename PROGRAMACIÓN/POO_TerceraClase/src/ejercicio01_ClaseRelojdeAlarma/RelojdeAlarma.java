package ejercicio01_ClaseRelojdeAlarma;

//@author: Ana Chun Gómez de Castro DAM1

public class RelojdeAlarma {
	/*- Crea una clase RelojAlarma que tenga atributos para la hora de alarma, hora actual y si la
	alarma está activada o no.
	
	- Implementa métodos para establecer la hora de la alarma, activar/desactivar la alarma y
	actualizar la hora actual.
	
	- Añade un método que compruebe si la hora actual coincide con la hora de la alarma y, de
	ser así, imprima un mensaje de "Alarma sonando".
	*/

	private int horaAlarma;
	private int horaActual;
	private boolean alarmaActivada;

	// Constructor
	public RelojdeAlarma() {
		this.horaAlarma = 0;
		this.horaActual = 0;
		this.alarmaActivada = false;
	}

	// Método para establecer la hora de la alarma
	public void establecerHoraAlarma(int nuevaHoraAlarma) {
		this.horaAlarma = nuevaHoraAlarma;
	}

	// Método para activar la alarma
	public void activarAlarma() {
		this.alarmaActivada = true;
	}

	// Método para desactivar la alarma
	public void desactivarAlarma() {
		this.alarmaActivada = false;
	}

	// Método para actualizar la hora actual
	public void actualizarHoraActual(int nuevaHoraActual) {
		this.horaActual = nuevaHoraActual;
	}

	// Método para comprobar si la hora actual coincide con la hora de la alarma
	public void comprobarAlarma() {
		if (alarmaActivada && horaActual == horaAlarma) {
			System.out.println("¡ALARMA SONANDOOOOOOO!!!!!!!!!!!");
		}
	}

}
