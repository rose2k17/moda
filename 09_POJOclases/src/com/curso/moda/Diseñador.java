package com.curso.moda;

public class Dise�ador extends Empresa {
	private int idDise�ador;
	public Dise�ador() {
		super();
	}
	public Dise�ador(int id, String nombre, String apellidos, int edad,int idDise�ador) {
		super(id, nombre, apellidos, edad);
		// TODO Auto-generated constructor stub
		this.setIdDise�ador(idDise�ador);
	}
	public int getIdDise�ador() {
		return idDise�ador;
	}
	public void setIdDise�ador(int idDise�ador) {
		this.idDise�ador = idDise�ador;
	}
	@Override
	public void ensayar() {
		System.out.println("Dirije un ensayo (Clase Dise�ador)");
	}
	public void desfilar() {
		System.out.println("Dirije un desfile (Clase Dise�ador)");
	}

	public void planificarEnsayo() {
		System.out.println("Planificar un Ensayo");
	}
}
