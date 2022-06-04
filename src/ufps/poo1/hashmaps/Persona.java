package ufps.poo1.hashmaps;

public class Persona {

	private String nombre;
	private int edad;
	private int CC;
	
	public int getCC() {
		return CC;
	}

	public void setCC(int cC) {
		CC = cC;
	}

	public Persona() {}
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public boolean equals(Object obj) {
		// Se tomo el parámetro como el otro objeto Persona con quien comparar. 
		// Se le hace el casting.
		Persona pers = (Persona) obj;
		
		// Se comparan los atributos del parámetro contra los de la clase.
		if(pers.getNombre().equals(this.getNombre()) && pers.getEdad()==this.getEdad())
			return true;
		
		return false;
	}
	
}
