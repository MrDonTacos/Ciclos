package tarea_Almacen;

public class Camisas {


		private String talla;
		private String logotipo;
		private String referencia;
		private int cantidad;
		private int preciountario;
		
		public Camisas() {
		}

		public Camisas(String talla, String logotipo) {
			this.talla = talla;
			this.logotipo = logotipo;
		}

		public Camisas(String talla, String logotipo, String referencia, int cantidad, int preciountario) {
			this.talla = talla;
			this.logotipo = logotipo;
			this.referencia = referencia;
			this.cantidad = cantidad;
			this.preciountario = preciountario;
		}

		public String getTalla() {
			return talla;
		}

		public void setTalla(String talla) {
			this.talla = talla;
		}

		public String getLogotipo() {
			return logotipo;
		}

		public void setLogotipo(String logotipo) {
			this.logotipo = logotipo;
		}

		public String getReferencia() {
			return referencia;
		}

		public void setReferencia(String referencia) {
			this.referencia = referencia;
		}

		public int getCantidad() {
			return cantidad;
		}

		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}

		public int getPreciountario() {
			return preciountario;
		}

		public void setPreciountario(int preciountario) {
			this.preciountario = preciountario;
		}

		@Override
		public String toString() {
			return "Camisas [talla=" + talla + ", logotipo=" + logotipo + ", referencia=" + referencia + ", cantidad="
					+ cantidad + ", preciountario=" + preciountario + "]";
		}
		

		
		
	
}
