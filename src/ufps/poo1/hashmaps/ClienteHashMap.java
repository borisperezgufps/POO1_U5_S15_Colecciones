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
		
		// Cree una colección guardando un objeto 
		// persona y usando la CC como llave.
		// Hágalo para tres personas, y use las 
		// CC: 88234, 99345 y 23456.
		
		
		// Imprima la lista de personas por CC.
		
		
		// Imprima solo el nombre de la persona con CC 23456
		
		
		// Imprima solo el nombre de la persona con CC 88234
		
		
		// Actualice la edad de la persona con CC 99345. Debe
		// sumarle dos años.
		
		
		// Elimine a las personas que sean menores de edad. 
		// En caso de no tener personas menores de edad, se 
		// recomienda crear nuevas. Recuerde imprimirlas primero
		// y luego sí eliminarlas.
		
		
		// Cree una colección para agrupar a las personas por edad.
		// Debe manejar una colección con la edad como llave, y la
		// lista de personas como valor.
		
	}
	
}
