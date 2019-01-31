
public class Educacion {

	private String nivelEscolar;
	private int zona;
	private String controlGubernamental;
	private String correo;
	private int clave;
	public Educacion(String nivelEscolar, int zona, String controlGubernamental, String correo, int clave) {
		super();
		this.nivelEscolar = nivelEscolar;
		this.zona = zona;
		this.controlGubernamental = controlGubernamental;
		this.correo = correo;
		this.clave = clave;
	}
	public String getNivelEscolar() {
		return nivelEscolar;
	}
	public void setNivelEscolar(String nivelEscolar) {
		this.nivelEscolar = nivelEscolar;
	}
	public int getZona() {
		return zona;
	}
	public void setZona(int zona) {
		this.zona = zona;
	}
	public String getControlGubernamental() {
		return controlGubernamental;
	}
	public void setControlGubernamental(String controlGubernamental) {
		this.controlGubernamental = controlGubernamental;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getClave() {
		return clave;
	}
	public void setClave(int clave) {
		this.clave = clave;
	}
}
