package paquete;

import java.util.ArrayList;

public class GestorTareas {
	
	static ArrayList<String> tareas = new ArrayList<>();
	
	public static void main(String[] args) {
	System.out.println("Gestor de tareas - equipo A y B");
	agregarTarea("Hacer la compra");
	agregarTarea("Hacer deporte");
	listarTareas();
	buscarTarea("Hacer la compra");
	
	}
	public static void agregarTarea(String descripcion) {
		 if (descripcion != null && !descripcion.isBlank()) {
		 tareas.add(descripcion);}
		 }
	
	public static ArrayList<String> listarTareas() {
		if (tareas.isEmpty()) {
		System.out.println("No hay tareas registradas");
		return tareas;
		}
		for (int i = 0; i < tareas.size(); i++) {
		System.out.println((i + 1) + ". " + tareas.get(i));
		}
		return tareas;
	
	}
	
	public static ArrayList<String> buscarTarea(String descripcion) {
	    for (int i = 0; i < tareas.size(); i++) {
	        if (tareas.get(i).equalsIgnoreCase(descripcion)){
	        	System.out.println("Tarea encontrada");
	            return tareas;
	        }
	    }
	    return null;
    }
	
}

