package Datos;

public class Partido {

		private int id;
		private String fecha;
		
		public Partido(int id, String fecha) {
			super();
			this.id = id;
			this.fecha = fecha;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFecha() {
			return fecha;
		}

		public void setFecha(String fecha) {
			this.fecha = fecha;
		}

		@Override
		public String toString() {
			return "Partido [id=" + id + ", fecha=" + fecha + "]";
		}
}
