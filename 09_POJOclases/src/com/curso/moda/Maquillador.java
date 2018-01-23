package com.curso.moda;

public class Maquillador extends Empresa{
	private String titulacion;
	private int aniosExperiencia;
	
	public Maquillador() {
		super();
	}
	
	public Maquillador(int id, String nombre, String apellidos, int edad,String titulacion,int aniosExperiencia) {
		super(id, nombre, apellidos, edad);
		// TODO Auto-generated constructor stub
		this.titulacion = titulacion;
		this.aniosExperiencia = aniosExperiencia;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	@Override
	public void ensayar() {
		System.out.println("Da asistancia en un ensayo (Clase Maquillador)");
	}
	public void maquillar() {
		System.out.println("Maquilla");
	}

}
