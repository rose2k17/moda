package com.curso.moda.main;

import java.util.ArrayList;

import com.curso.moda.*;

public class Main {

	public static ArrayList<Empresa> abc= new ArrayList<Empresa>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija a la que pertenezca el objeto

			Empresa delBosque = new Dise�ador(1, "Vicente", "Del Bosque", 60, 28489);
			Empresa iniesta = new Modelo(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
			Empresa raulMartinez = new Maquillador(3, "Ra�l", "Martinez", 41, "Licenciado en Fisioterapia", 18);

			abc.add(delBosque);
			abc.add(iniesta);
			abc.add(raulMartinez);

			// CONCENTRACION
			System.out.println("Todos los integrantes comienzan una reuni�n. (Todos ejecutan el mismo m�todo)");
			for (Empresa ab : abc) {
				System.out.print(ab.getNombre() + " " + ab.getApellidos() + " -> ");
				ab.reunion();
			}

			// VIAJE
			System.out.println("\nTodos los integrantes viajan para desfilar. (Todos ejecutan el mismo m�todo)");
			for (Empresa ab : abc) {
				System.out.print(ab.getNombre() + " " + ab.getApellidos() + " -> ");
				ab.viajar();
			}

			// ENTRENAMIENTO
			System.out.println("\nEnsayo: Todos los integrantes tienen su funci�n en un ensayo (Especializaci�n)");
			for (Empresa ab : abc) {
				System.out.print(ab.getNombre() + " " + ab.getApellidos() + " -> ");
				ab.ensayar();
			}


			// PARTIDO DE FUTBOL
			System.out.println("\nDesfile de moda: Todos los integrantes tienen su funci�n en un desfile (Especializaci�n)");
			for (Empresa ab : abc) {
				System.out.print(ab.getNombre() + " " + ab.getApellidos() + " -> ");
				ab.desfilar();
			}

			// PLANIFICAR ENTRENAMIENTO
			System.out.println("\nPlanificar Ensayo: Solo el entrenador tiene el m�todo para planificar un ensayo:");
			System.out.print(delBosque.getNombre() + " " + delBosque.getApellidos() + " -> ");
			((Dise�ador) delBosque).planificarEnsayo();

			// ENTREVISTA
			System.out.println("\nEntrevista: Solo el futbolista tiene el m�todo para dar una entrevista:");
			System.out.print(iniesta.getNombre() + " " + iniesta.getApellidos() + " -> ");
			((Modelo) iniesta).entrevista();

			// MASAJE
			System.out.println("\nMaquillaje: Solo el masajista tiene el m�todo para maquillar:");
			System.out.print(raulMartinez.getNombre() + " " + raulMartinez.getApellidos() + " -> ");
			((Maquillador) raulMartinez).maquillar();
	}

}
