package cuentas;

public class Main {

	public static void main(String[] args) {
		CCuenta cuenta1;
		double saldoActual;

		cuenta1 = operativa_cuenta(5);
		saldoActual = cuenta1.estado();
		System.out.println("El saldo actual es " + saldoActual);

	}

	private static CCuenta operativa_cuenta(float cantidad) {
		CCuenta cuenta1;
		cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
		try {
			cuenta1.retirar(1);
		} catch (Exception e) {
			System.out.println("Fallo al retirar");
		}
		try {
			System.out.println("Ingreso en cuenta");
			cuenta1.ingresar(0);
		} catch (Exception e) {
			System.out.println("Fallo al ingresar");
		}
		return cuenta1;
	}
}
