package tarea1_2;

public class Corazon {
	private int ritmo;
	
	
	
	public void setRitmo(int ritmo) {
		this.ritmo = ritmo;
	}

	public void cambiarRitmo(int valor) {
		ritmo += valor;
	}
	
	public int leerRitmo() {
		return ritmo;
	}

	@Override
	public String toString() {
		return "Corazon [ritmo=" + ritmo + "]";
	}
	
}
