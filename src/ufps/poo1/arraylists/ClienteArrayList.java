package ufps.poo1.arraylists;

import java.util.ArrayList;

public class ClienteArrayList {

	private ArrayList<String> listaNombres;
	private ArrayList<Integer> listaTelefonos;
	
	private ArrayList<Persona> listaPersonas;
	
	public ClienteArrayList() {
		listaNombres = new ArrayList<String>();
		listaTelefonos = new ArrayList<Integer>();
		
		listaPersonas = new ArrayList<Persona>();
	}
	
	public static void main(String[] args) {
		
		ClienteArrayList lista = new ClienteArrayList();
		
//		lista.realizarOperacionesString();
		
		lista.realizarOperacionesInteger();
		
//		lista.realizarOperacionesObjeto();
		
	}
	
	public void realizarOperacionesString() {
		
		System.out.println("listaNombres is empty? "+listaNombres.isEmpty());
		
		listaNombres.add("Boris"); // Posición 0
		listaNombres.add("Paulo"); // Posición 1
		listaNombres.add("Paola"); // Posición 2
		
		imprimirStringVersion1("Se agregan tres elementos");
		
		listaNombres.add("María Camila"); // Posición 3
		listaNombres.add("Nelly"); // Posición 4
		
		imprimirStringVersion1("Se agregan otros dos elementos");
		
		listaNombres.add(3, "Celeste");
		
		imprimirStringVersion2("Se arega un elemento en posición 3");
		
		listaNombres.set(5, "Cristian");
		
		imprimirStringVersion2("Se reemplaza elemento en posición 5");
		
//		listaNombres.set(6, "Pedro"); // ¿Qué creen que pasa acá?
//		
//		imprimirStringVersion1("Asignando en posición 6");
		
		listaNombres.remove(3);
		
		imprimirStringVersion2("Se quita elemento en posición 3");
		
		listaNombres.remove("Paulo");
		
		imprimirStringVersion1("Se quita elemento de texto Paulo");
		
		System.out.println("listaNombres size: " + listaNombres.size());
	}
	
	public void imprimirStringVersion1(String texto) {
		System.out.println("------------------------");
		System.out.println("IMPRIMIENDO 1: "+texto);
		System.out.println("------------------------");
		
		// TipoDato nombreVariable : ArrayList
		for(String nombre : listaNombres) {
			System.out.println("Nombre = "+nombre);
		}
	}
	
	public void imprimirStringVersion2(String texto) {
		System.out.println("------------------------");
		System.out.println("IMPRIMIENDO 2: "+texto);
		System.out.println("------------------------");
		
		// TipoDato nombreVariable : ArrayList
		for(int i = 0;i<listaNombres.size();i++) {
			String nombre = listaNombres.get(i); // listaNombres[i];
			System.out.println("Nombre = "+nombre);
		}
	}
	
	
	public void realizarOperacionesInteger() {
		
		listaTelefonos.add(317); // Posición 0
		listaTelefonos.add(318); // Posición 1
		listaTelefonos.add(319); // Posición 2
		
		imprimirIntegerVersion1("Se agregan tres elementos");
		
		listaTelefonos.add(320); // Posición 3
		listaTelefonos.add(321); // Posición 4
		
		imprimirIntegerVersion1("Se agregan otros dos elementos");
		
		listaTelefonos.add(3, 331);
		
		imprimirIntegerVersion2("Se arega un elemento en posición 3");
		
		listaTelefonos.set(5, 332);
		
		imprimirIntegerVersion2("Se reemplaza elemento en posición 5");
		
		listaTelefonos.remove(3);
		
		imprimirIntegerVersion2("Se quita elemento en posición 3");
		
//		listaTelefonos.remove(318); // ¿Qué pasa al ejecutar esto?
		
//		imprimirIntegerVersion1("Se quita elemento 318");
	}
	
	public void imprimirIntegerVersion1(String texto) {
		System.out.println("------------------------");
		System.out.println("IMPRIMIENDO 1: "+texto);
		System.out.println("------------------------");
		
		// TipoDato nombreVariable : ArrayList
		for(Integer telefono : listaTelefonos) {
			System.out.println("Telefono = "+telefono);
		}
	}
	
	public void imprimirIntegerVersion2(String texto) {
		System.out.println("------------------------");
		System.out.println("IMPRIMIENDO 2: "+texto);
		System.out.println("------------------------");
		
		// TipoDato nombreVariable : ArrayList
		for(int i = 0;i<listaTelefonos.size();i++) {
			int telefono = listaTelefonos.get(i);
			System.out.println("Telefono = "+telefono);
		}
	}
	
	public void realizarOperacionesObjeto() {
		
		// Agregar tres objetos
		
		// Imprimir lista
		
		// Agregar dos objetos mas
		
		// Imprimir lista
		
		// Agregar objeto en posición 3
		
		// Imprimir lista
		
		// Asignar objeto a posición 5
		
		// Imprimir lista
		
		// Remover objeto en posición 3
		
		// Imprimir lista
		
		// Remover objeto
		
		// Imprimir lista
		
	}
	
	public void imprimirObjectVersion1(String texto) {
		System.out.println("------------------------");
		System.out.println("IMPRIMIENDO 1: "+texto);
		System.out.println("------------------------");
		
		// Implementar foreach
	}
	
	public void imprimirObjectVersion2(String texto) {
		System.out.println("------------------------");
		System.out.println("IMPRIMIENDO 2: "+texto);
		System.out.println("------------------------");
		
		// Implementar for
	}
}
