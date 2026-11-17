package paquete;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorTareas {
	
	static ArrayList<String> tareas = new ArrayList<>();
	
	public static void main(String[] args) {
		
		System.out.println("Gestor de tareas - equipo A y B");
		listarTareas();
		eliminarTareas();
	
	}
	public static void agregarTarea(String descripcion) {
		 if (descripcion != null && !descripcion.isBlank()) {
		 tareas.add(descripcion);}
		 
	}
	public static void listarTareas() {
		if (tareas.isEmpty()) {
		System.out.println("No hay tareas registradas");
		return;
		}
		for (int i = 0; i < tareas.size(); i++) {
		System.out.println((i + 1) + ". " + tareas.get(i));
		}
	}
	public static void eliminarTareas() {
		
		String[] tareas = {"tarea1","tarea2","tarea3","tarea4","tarea5"};
		int cont = 0;
		String tarea="";
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce la tarea a buscar");
		tarea = leer.next();
				
		
		for (int i = 0; i < tareas.length; i++) {
			if (tarea.equalsIgnoreCase(tareas[i])) {
				cont += 1;
				
			}
		}//finfor
		
		if (cont==0) {
			System.out.println("No aparece en el array.");
		} else {
			System.out.println("Tarea eliminada.");
			tareas[cont]="";
		}
		
	}
}