package com.curso.moda.main;

import java.util.ArrayList;

import com.curso.moda.*;

public class Main {

	public static ArrayList<Empresa> abc= new ArrayList<Empresa>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija a la que pertenezca el objeto

			Empresa delBosque = new Diseñador(1, "Vicente", "Del Bosque", 60, 28489);
			Empresa iniesta = new Modelo(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
			Empresa raulMartinez = new Maquillador(3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 18);

			abc.add(delBosque);
			abc.add(iniesta);
			abc.add(raulMartinez);

			// CONCENTRACION
			System.out.println("Todos los integrantes comienzan una reunión. (Todos ejecutan el mismo método)");
			for (Empresa ab : abc) {
				System.out.print(ab.getNombre() + " " + ab.getApellidos() + " -> ");
				ab.reunion();
			}

			// VIAJE
			System.out.println("\nTodos los integrantes viajan para desfilar. (Todos ejecutan el mismo método)");
			for (Empresa ab : abc) {
				System.out.print(ab.getNombre() + " " + ab.getApellidos() + " -> ");
				ab.viajar();
			}

			// ENTRENAMIENTO
			System.out.println("\nEnsayo: Todos los integrantes tienen su función en un ensayo (Especialización)");
			for (Empresa ab : abc) {
				System.out.print(ab.getNombre() + " " + ab.getApellidos() + " -> ");
				ab.ensayar();
			}


			// PARTIDO DE FUTBOL
			System.out.println("\nDesfile de moda: Todos los integrantes tienen su función en un desfile (Especialización)");
			for (Empresa ab : abc) {
				System.out.print(ab.getNombre() + " " + ab.getApellidos() + " -> ");
				ab.desfilar();
			}

			// PLANIFICAR ENTRENAMIENTO
			System.out.println("\nPlanificar Ensayo: Solo el entrenador tiene el método para planificar un ensayo:");
			System.out.print(delBosque.getNombre() + " " + delBosque.getApellidos() + " -> ");
			((Diseñador) delBosque).planificarEnsayo();

			// ENTREVISTA
			System.out.println("\nEntrevista: Solo el futbolista tiene el método para dar una entrevista:");
			System.out.print(iniesta.getNombre() + " " + iniesta.getApellidos() + " -> ");
			((Modelo) iniesta).entrevista();

			// MASAJE
			System.out.println("\nMaquillaje: Solo el masajista tiene el método para maquillar:");
			System.out.print(raulMartinez.getNombre() + " " + raulMartinez.getApellidos() + " -> ");
			((Maquillador) raulMartinez).maquillar();
	}

}
