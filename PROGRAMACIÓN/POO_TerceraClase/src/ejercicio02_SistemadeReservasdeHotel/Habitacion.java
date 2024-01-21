package ejercicio02_SistemadeReservasdeHotel;

//@author: Ana Chun Gómez de Castro DAM1

// Clase Habitacion
class Habitacion {
	/*- Diseña una clase Habitacion con atributos como número de habitación, tipo (simple, doble,
	suite) y si está ocupada.
	- Crea una clase Hotel que contenga un arreglo de Habitacion.
	- Añade métodos en Hotel para reservar y cancelar reservas de habitaciones, y para verificar
	la disponibilidad.
	*/

	private int numeroHabitacion;
	private String tipo;
	private boolean ocupada;

	// Constructor de la clase Habitacion
	public Habitacion(int numero, String tipo) {
		this.numeroHabitacion = numero;
		this.tipo = tipo;
		this.ocupada = false;
	}

	// Métodos para obtener información de la habitación
	public int getNumero() {
		return numeroHabitacion;
	}

	public String getTipo() {
		return tipo;
	}

	public boolean estaOcupada() {
		return ocupada;
	}

	// Métodos para reservar y cancelar reservas de la habitación
	public void reservar() {
		ocupada = true;
		System.out.println("La habitación número " + numeroHabitacion + " reservada.");
	}

	public void cancelarReserva() {
		ocupada = false;
		System.out.println("La reserva de habitación número " + numeroHabitacion + " cancelada.");
	}
}

// Clase Hotel
class Hotel {
	private Habitacion[] habitaciones;

	// Constructor de la clase Hotel
	public Hotel(int numHabitaciones) {
		habitaciones = new Habitacion[numHabitaciones];

		// Inicialización de las habitaciones del hotel
		for (int i = 0; i < numHabitaciones; i++) {
			if (i % 3 == 0) {
				habitaciones[i] = new Habitacion(i + 1, "Suite");
			} else if (i % 2 == 0) {
				habitaciones[i] = new Habitacion(i + 1, "Doble");
			} else {
				habitaciones[i] = new Habitacion(i + 1, "Simple");
			}
		}
	}

	// Método para mostrar la disponibilidad de las habitaciones en el hotel
	public void mostrarDisponibilidad() {
		System.out.println("Estado de las habitaciones:");
		for (Habitacion habitacion : habitaciones) {
			System.out.println("Habitación " + habitacion.getNumero() + ": "
					+ (habitacion.estaOcupada() ? "Ocupada" : "Disponible"));
		}
	}

	// Método para reservar una habitación específica
	public void reservarHabitacion(int numero) {
		if (numero >= 1 && numero <= habitaciones.length) {
			Habitacion habitacion = habitaciones[numero - 1];
			if (!habitacion.estaOcupada()) {
				habitacion.reservar();
			} else {
				System.out.println("Lo sentimos, la habitación número " + numero + " ya está ocupada.");
			}
		} else {
			System.out.println("Número de habitación inválido.");
		}
	}

	// Método para cancelar la reserva de una habitación específica
	public void cancelarReservaHabitacion(int numero) {
		if (numero >= 1 && numero <= habitaciones.length) {
			habitaciones[numero - 1].cancelarReserva();
		} else {
			System.out.println("Número de habitación inválido.");
		}
	}

}
