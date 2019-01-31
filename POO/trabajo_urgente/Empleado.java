package trabajo_urgente;

public class Empleado {

	private String nombre;
	private int numEmpleado;
	
	public Empleado(String nombre, int numEmpleado) {
		this.nombre = nombre;
		this.numEmpleado = numEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", numEmpleado=" + numEmpleado + "]";
	}
	
}
