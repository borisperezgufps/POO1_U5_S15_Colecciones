package ufps.poo1.hashmaps;

import java.util.HashMap;

import ufps.poo1.arraylists.Persona;

public class ClienteHashMap {

	private HashMap<String, Integer> listaNumeros;
	private HashMap<String, Persona> listaPersonas;
	
	public ClienteHashMap() {
		listaNumeros = new HashMap<String, Integer>();
		listaPersonas = new HashMap<String, Persona>();
	}
	
	public static void main(String[] args) {
		ClienteHashMap cliente = new ClienteHashMap();
		
		cliente.manipularPrimitivos();
		
//		cliente.manipularObjetos();
	}
	
	public void manipularPrimitivos() {
		
		System.out.println("listaNumeros is empty? "+listaNumeros.isEmpty());
		
		// Adiciona elementos
		listaNumeros.put("uno", 1);
		listaNumeros.put("dos", 2);
		listaNumeros.put("tres", 3);
		
		// Limpia la HashMap (aplica igual para ArrayList).
		listaNumeros.clear();
		
		// Adiciona elementos
		listaNumeros.put("cuatro", 4);
		listaNumeros.put("cinco", 5);
		listaNumeros.put("seis", 6);
		
		System.out.println("Día cuatro = "+listaNumeros.get("cuatro"));
		
		System.out.println("Día seis = "+listaNumeros.get("seis"));
		
		System.out.println("Día tres = "+listaNumeros.get("tres"));
		
		listaNumeros.put("cuatro", 8);
		
		System.out.println("Día cuatro = "+listaNumeros.get("cuatro"));
		
		// Impresión forma 1
		System.out.println("-------------------------");
		System.out.println("IMPRESIÓN 1");
		System.out.println("-------------------------");
		for (String key : listaNumeros.keySet()) {
		    int value = listaNumeros.get(key);
		    System.out.println(key + " " + value);
		}
		
		// Impresión forma 2
		System.out.println("-------------------------");
		System.out.println("IMPRESIÓN 2");
		System.out.println("-------------------------");
		
		listaNumeros.entrySet().forEach(entry -> {
		    System.out.println(entry.getKey() + " " + entry.getValue());
		});
		
	}
	
	public void manipularObjetos() {
		
	}
	
}
