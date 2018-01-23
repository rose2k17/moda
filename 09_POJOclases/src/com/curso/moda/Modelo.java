package com.curso.moda;

public class Modelo extends Empresa {
	private int nSalida;
	private String posicion;
	
	public Modelo() {
		super();
	}
	
	public Modelo(int id, String nombre, String apellidos, int edad, int nSalida, String posicion) {
		super(id, nombre, apellidos, edad);
		// TODO Auto-generated constructor stub
		this.nSalida=nSalida;
		this.posicion=posicion;
	}

	// Constructor, getter y setter

	public int getnSalida() {
		return nSalida;
	}

	public void setnSalida(int nSalida) {
		this.nSalida = nSalida;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	@Override
	public void ensayar() {
		System.out.println("Realiza un ensayo (Clase Modelo)");
	}
	public void desfilar() {
		System.out.println("Hace un desfile (Clase Modelo)");
	}

	public void entrevista() {
		System.out.println("Da una Entrevista");
	}
}

