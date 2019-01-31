
public final class Tec18 extends Educacion {
	private String carrerasTecnicas;
	private String areasDeportivas;
	
	
	public Tec18(String nivelEscolar, int zona, String controlGubernamental, String correo, int clave) {
		super(nivelEscolar, zona, controlGubernamental, correo, clave);
		// TODO Auto-generated constructor stub
	}
	public String getCarrerasTecnicas() {
		return carrerasTecnicas;
	}
	public void setCarrerasTecnicas(String carrerasTecnicas) {
		this.carrerasTecnicas = carrerasTecnicas;
	}
	public String getAreasDeportivas() {
		return areasDeportivas;
	}
	public void setAreasDeportivas(String areasDeportivas) {
		this.areasDeportivas = areasDeportivas;
	}
}
