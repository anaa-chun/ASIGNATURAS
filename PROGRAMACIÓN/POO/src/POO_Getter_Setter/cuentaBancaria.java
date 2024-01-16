package POO_Getter_Setter;

//@author: Ana Chun Gómez de Castro DAM1

public class cuentaBancaria {

	/*
	 * Objetivo: Diseña una clase CuentaBancaria con dos propiedades privadas:
	 * titular (String) y saldo (double). Crea los métodos getter y setter para
	 * ambas propiedades.
	 * 
	 * Desafío adicional: En el setter del saldo, no permitas que el saldo sea
	 * negativo.
	 */

	private String titular;
	private double saldo;

	public cuentaBancaria(String titular, double saldo) {

		this.titular = titular;
		if (saldo >= 0) {
			this.saldo = saldo;
		} else {
			this.saldo = 0; // Establece el saldo en cero para evitar haya saldos negativos

		}

		saldo = 999.990;
	}

	public String dimeTitular() {
		return " El titular de la cuenta bancaria es " + titular;
	}

	public double dimeSaldo() {
		return saldo;
	}

}
