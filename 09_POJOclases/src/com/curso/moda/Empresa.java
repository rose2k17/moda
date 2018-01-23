package com.curso.moda;

public abstract class Empresa implements IDesfile {
	protected int id;
	protected String nombre;
	protected String apellidos;
	protected int edad;
	
	public Empresa() {
		super();
	}
	
	public Empresa(int id, String nombre, String apellidos, int edad) {
		this.id=id;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void reunion() {
		System.out.println("Reunirse (Clase Padre)");
	}

	public void viajar() {
		System.out.println("Viajar (Clase Padre)");
	}
	
	public void ensayar() {
		System.out.println("Ensayar (Clase Padre)");
	}

	public void desfilar() {
		System.out.println("Asiste al desfile (Clase Padre)");
	}
	
}
