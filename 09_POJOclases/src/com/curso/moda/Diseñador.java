package com.curso.moda;

public class Diseñador extends Empresa {
	private int idDiseñador;
	public Diseñador() {
		super();
	}
	public Diseñador(int id, String nombre, String apellidos, int edad,int idDiseñador) {
		super(id, nombre, apellidos, edad);
		// TODO Auto-generated constructor stub
		this.setIdDiseñador(idDiseñador);
	}
	public int getIdDiseñador() {
		return idDiseñador;
	}
	public void setIdDiseñador(int idDiseñador) {
		this.idDiseñador = idDiseñador;
	}
	@Override
	public void ensayar() {
		System.out.println("Dirije un ensayo (Clase Diseñador)");
	}
	public void desfilar() {
		System.out.println("Dirije un desfile (Clase Diseñador)");
	}

	public void planificarEnsayo() {
		System.out.println("Planificar un Ensayo");
	}
}
