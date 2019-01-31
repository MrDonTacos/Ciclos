package tarea1_2;

public class Persona {
	private String nombre ;
	private Corazon corazon;
	//private Coche coche;
	public Persona(String nom) {
		corazon = new Corazon();
		corazon.setRitmo(100);
		this.nombre = nom;
	}
	/*
	public void asignaCoche(Coche c) {
		coche = c;
	
	}
	public void viaja() {
		System.out.println(nombre + " está viajando...");
		coche.enciende();
		System.out.println("(Transcurren 3 segundos)");
		try {Thread.sleep(3000); } catch(InterruptedException e) {}
		coche.apagado();
	}*/
	
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Corazon getCorazon() {
		return corazon;
	}



	public void setCorazon(Corazon corazon) {
		this.corazon = corazon;
	}



	public void emociona() {
		if(corazon.leerRitmo()>40 && corazon.leerRitmo()<181) {
		corazon.cambiarRitmo(+5); 
		if(corazon.leerRitmo()>40 && corazon.leerRitmo()<181) {
		System.out.println("El nuevo ritmo cardiaco es: " + corazon.leerRitmo());}
		else
		System.out.println("El Ritmo está fuera de rango!");	
	}else 		System.out.println("El Ritmo está fuera de rango!");	
 }
	
	public void tranquiliza() {
		if(corazon.leerRitmo()>40 && corazon.leerRitmo()<180) {
			corazon.cambiarRitmo(-5); 
			System.out.println("El nuevo ritmo cardiaco es: " + corazon.leerRitmo());}
			else
			System.out.println("El Ritmo está fuera de rango!");	}



	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", corazon=" + corazon + "]";
	}
	
	}

