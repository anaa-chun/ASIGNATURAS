package ejercicio02_SistemadeReservasdeHotel;

import java.util.Scanner;

//@author: Ana Chun Gómez de Castro DAM1

public class Uso_Habitacion {

	/*- Diseña una clase Habitacion con atributos como número de habitación, tipo (simple, doble,
	suite) y si está ocupada.
	- Crea una clase Hotel que contenga un arreglo de Habitacion.
	- Añade métodos en Hotel para reservar y cancelar reservas de habitaciones, y para verificar
	la disponibilidad.
	*/

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para la entrada del usuario

		Hotel miHotel = new Hotel(11); // Instancio Hotel en ese caso con 11 habitaciones

		miHotel.mostrarDisponibilidad();
		System.out.print("Dime el número de la habitación para reservar: ");
		int numReserva1 = scanner.nextInt(); // CreO un Scanner para la entrada del usuario

		// Mostrar la disponibilidad inicial de las habitaciones
		miHotel.reservarHabitacion(numReserva1);

		// Pido al usuario que introduzca el número de la habitación para reservar
		System.out.print("Dime el número de la segunda habitación para reservar: ");
		int numReserva2 = scanner.nextInt();
		miHotel.reservarHabitacion(numReserva2);

		// El usuario introduce el número de la habitación para cancelar la reserva
		miHotel.mostrarDisponibilidad();
		System.out.print("Dime el número de la habitación para cancelar la reserva: ");
		int numCancelacion = scanner.nextInt();
		miHotel.cancelarReservaHabitacion(numCancelacion);

		// Mostrar la disponibilidad después de cancelar la reserva
		miHotel.mostrarDisponibilidad();

		scanner.close(); // Evita que vaya lento el programa
	}
}
