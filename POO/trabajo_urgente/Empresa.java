package trabajo_urgente;

import java.util.Arrays;

public class Empresa {

	private int rfc;
	private String razonSocial;
	private String nombreGerente;
	private Departamento[] departamento;
	
	public Empresa(int rfc, String razonSocial, String nombreGerente) {
		this.rfc = rfc;
		this.razonSocial = razonSocial;
		this.nombreGerente = nombreGerente;
	}

	
	public Empresa(int rfc, String razonSocial, String nombreGerente, Departamento[] departamento) {
		departamento = new Departamento[3];
		departamento[0] = new Departamento(1453678, "Sistemas" , "Arnoldo", null);
		departamento[1] = new Departamento(12456, "Produccion", "Daniel", null);
		departamento[2] = new Departamento(16346, "Calidad", "Erick", null);
		this.rfc = rfc;
		this.razonSocial = razonSocial;
		this.nombreGerente = nombreGerente;
		this.departamento = departamento;
	}
	
	

	
	public int getRfc() {
		return rfc;
	}

	public void setRfc(int rfc) {
		this.rfc = rfc;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getNombreGerente() {
		return nombreGerente;
	}

	public void setNombreGerente(String nombreGerente) {
		this.nombreGerente = nombreGerente;
	}

	public Departamento[] getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento[] departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Empresa [rfc=" + rfc + ",\n razonSocial=" + razonSocial + ",\n nombreGerente=" + nombreGerente
				+ ",\n departamento=" + Arrays.toString(departamento) + "]";
	}
	
}
