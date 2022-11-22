package Datos;

public class Encargado {
	
		 private int id;
		 private String nombre;
		 private int contra;
		 
		 
		public Encargado(int id, String nombre, int contra) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.contra = contra;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getContra() {
			return contra;
		}
		public void setContra(int contra) {
			this.contra = contra;
		}
		@Override
		public String toString() {
			return "Encargado [id=" + id + ", nombre=" + nombre + ", contra=" + contra + "]";
		}
		public boolean IngresoEncargado(Encargado encargado1,int nroid, int contra) {
			
			if(encargado1.getId()==nroid && encargado1.getContra()==contra) {
				return true;
			}else {
				return false;
			}
		}
		 
		}

