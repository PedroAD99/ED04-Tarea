package cuentas;

/**
 * La clase simula la cuenta bancaria de un usuario, con su nombre, su numero de
 * cuenta, su saldo y el tipo de interes
 * 
 * @author Pedro
 * @version 1.0
 */

public class CCuenta {

	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInteres;

	/**
	 * Se crea el objeto CCuenta
	 */
	public CCuenta() {
	}

	/**
	 * 
	 * @param nom  --> Nombre del titular de la cuenta
	 * @param cue  --> Numero de cuenta del titular
	 * @param sal  --> Saldo de la cuenta
	 * @param tipo --> Tipo de interes asociado a la cuenta
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		setNombre(nom);
		setCuenta(cue);
		setSaldo(sal);
	}

	/**
	 * Metodo utilizado para recibir el saldo generado con el metodo getSaldo
	 * 
	 * @return Metodo getSaldo --> Devuelve el saldo de la cuenta
	 */
	public double estado() {
		return getSaldo();
	}

	/**
	 * Metodo utilizado para sumar valores a la variable saldo
	 * 
	 * @param cantidad Valor que se ingresa en la cuenta
	 * @throws Exception Devuelve excepcion cuando la cantidad es menor o igual a 0
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		setSaldo(getSaldo() + cantidad);
	}

	/**
	 * Metodo utilizado para restar valores a la variable saldo
	 * 
	 * @param cantidad Valor que se retira de la cuenta
	 * @throws Exception Devuelve excepcion cuando la cantidad es menor o igual a 0,
	 *                   o cuando el saldo es menor a la cantidad a retirar
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		setSaldo(getSaldo() - cantidad);
	}

	/**
	 * Metodo utilizado para obtener el nombre del titular
	 * 
	 * @return Nombre del titular
	 */
	private String getNombre() {
		return nombre;
	}

	/**
	 * Metodo utilizado para asignar un valor a la variable nombre
	 * 
	 * @param nombre --> Nombre del titular de la cuenta. El valor se añade a
	 *               "nombre"
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo utilizado para obtener el numero de cuenta
	 * 
	 * @return Numero de cuenta del titular
	 */
	private String getCuenta() {
		return cuenta;
	}

	/**
	 * Metodo utilizado para asignar un valor a la variable cuenta
	 * 
	 * @param cuenta --> Numero de cuenta del titular
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Metodo utilizado para obtener el saldo
	 * 
	 * @return Saldo de la cuenta
	 */
	private double getSaldo() {
		return saldo;
	}

	/**
	 * Metodo utilizado para asignar un valor a la variable saldo
	 * 
	 * @param saldo --> Saldo de la cuenta
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Metodo utilizado para obtener el tipo de interes
	 * 
	 * @return Tipo de interes
	 */
	private double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * Metodo utilizado para asignar un valor a la variable tipoInteres
	 * 
	 * @param tipoInteres --> Interes
	 */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
