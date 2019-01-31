package trabajo_urgente;

import java.util.Arrays;

public class Departamento {

	private int numero;
	private String nombre;
	private String nombreJefe;
	private Empleado[] empleado;
	
	
	public Departamento(int numero, String nombre, String nombreJefe) {
		this.numero = numero;
		this.nombre = nombre;
		this.nombreJefe = nombreJefe;
	}

	public Departamento(int numero, String nombre, String nombreJefe, Empleado[] empleado) {
		empleado = new Empleado[3];
		empleado[0] = new Empleado("Rocio", 123);
		empleado[1] = new Empleado("Jose", 234);
		empleado[2] = new Empleado("Luna", 345);
		this.numero = numero;
		this.nombre = nombre;
		this.nombreJefe = nombreJefe;
		this.empleado = empleado;
	}
	
	


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getNombreJefe() {
		return nombreJefe;
	}


	public void setNombreJefe(String nombreJefe) {
		this.nombreJefe = nombreJefe;
	}


	public Empleado[] getEmpleado() {
		return empleado;
	}


	public void setEmpleado(Empleado[] empleado) {
		this.empleado = empleado;
	}
	
	public void llenadoEmpleado() {
		
	}


	@Override
	public String toString() {
		return "Departamento [numero=" + numero + ", nombre=" + nombre + ",nombreJefe=" + nombreJefe + ", empleado="
				+ Arrays.toString(empleado) + "]";
	}
}
