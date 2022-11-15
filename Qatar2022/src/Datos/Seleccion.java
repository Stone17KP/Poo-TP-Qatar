package Datos;

public class Seleccion {

		private int id;
		private String pais;
		private int goles_fecha;
		private boolean clasificado;
		
		public Seleccion(int id, String pais, int goles_fecha, boolean clasificado) {
			super();
			this.id = id;
			this.pais = pais;
			this.goles_fecha = goles_fecha;
			this.clasificado = clasificado;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getPais() {
			return pais;
		}

		public void setPais(String pais) {
			this.pais = pais;
		}

		public int getGoles_fecha() {
			return goles_fecha;
		}

		public void setGoles_fecha(int goles_fecha) {
			this.goles_fecha = goles_fecha;
		}

		public boolean isClasificado() {
			return clasificado;
		}

		public void setClasificado(boolean clasificado) {
			this.clasificado = clasificado;
		}

		@Override
		public String toString() {
			return "Seleccion [id=" + id + ", pais=" + pais + ", goles_fecha=" + goles_fecha + ", clasificado="
					+ clasificado + "]";
		}	
}
