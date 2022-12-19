package Datos;

import java.util.LinkedList;

import javax.swing.JOptionPane;

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
		 
		
		public static void IngresoEncargado(Encargado encargado1) {
			//Scanner entrada = new Scanner(System.in);
			int nroid=Integer.parseInt(JOptionPane.showInputDialog("Ingrese id "));
			int contra=Integer.parseInt(JOptionPane.showInputDialog("Ingrese contraseña "));
			//System.out.println("Ingrese id ");
			//int nroid =  entrada.nextInt();
			//System.out.println(" Ingrese contra");
			//int contra =  entrada.nextInt();
			if(encargado1.IngresoEncargado(encargado1, nroid,contra)) {					
				//System.out.println("^^^^^^^^Logeado correctamente^^^^^^^^");
				JOptionPane.showMessageDialog(null, "^^^^^^^^Logeado correctamente^^^^^^^^");
			}else {
				JOptionPane.showMessageDialog(null, "No se pudo ingresar \nVuelva a intentar");
				//System.out.println("No se pudo ingresar");
				//System.out.println("Vuelva a intentar");
				IngresoEncargado(encargado1);
			}	
		}
		
		public static void Resultados(LinkedList<Partido> partidos, LinkedList<Seleccion> Clasificados,LinkedList<Seleccion>GGgrupos) {
			int ga, gb;				
				ga=0;
				gb=0;
				
			for (int i = 0; i < partidos.size(); i++) {
				
				ga=(int)(Math.random()*5);
				gb=(int)(Math.random()*5);					
				/*switch (i) {
				case 0:JOptionPane.showMessageDialog(null, "Resultados GRUPO A"); break;
				case 6:JOptionPane.showMessageDialog(null, "Resultados GRUPO B"); break;
				case 12:JOptionPane.showMessageDialog(null, "Resultados GRUPO C"); break;
				case 18:JOptionPane.showMessageDialog(null, "Resultados GRUPO D"); break;
				case 24:JOptionPane.showMessageDialog(null, "Resultados GRUPO E"); break;
				case 30:JOptionPane.showMessageDialog(null, "Resultados GRUPO F"); break;
				case 36:JOptionPane.showMessageDialog(null, "Resultados GRUPO G"); break;
				case 42:JOptionPane.showMessageDialog(null, "Resultados GRUPO H"); break;
				}*/
				if (ga>gb) {
					partidos.get(i).getPais().setPuntos(partidos.get(i).getPais().getPuntos()+3);
					partidos.get(i).getPais().setPg(partidos.get(i).getPais().getPg()+1);
					partidos.get(i).getPais2().setPp(partidos.get(i).getPais2().getPp()+1);									
					partidos.get(i).getPais().setGf(partidos.get(i).getPais().getGf()+ga);
					partidos.get(i).getPais().setGc(partidos.get(i).getPais().getGc()+gb);
					partidos.get(i).getPais2().setGf(partidos.get(i).getPais2().getGf()+gb);
					partidos.get(i).getPais2().setGc(partidos.get(i).getPais2().getGc()+ga);	
					//JOptionPane.showMessageDialog(null, "Gana= "+partidos.get(i).getPais().getNombre()+"\nVS \nPierde= "+partidos.get(i).getPais2().getNombre());
					GGgrupos.add((Seleccion) partidos.get(i).getPais());
				}else if (gb>ga) {
					partidos.get(i).getPais2().setPuntos(partidos.get(i).getPais2().getPuntos()+3);
					partidos.get(i).getPais2().setPg(partidos.get(i).getPais2().getPg()+1);
					partidos.get(i).getPais().setPp(partidos.get(i).getPais().getPp()+1);					
					partidos.get(i).getPais().setGf(partidos.get(i).getPais().getGf()+ga);
					partidos.get(i).getPais().setGc(partidos.get(i).getPais().getGc()+gb);
					partidos.get(i).getPais2().setGf(partidos.get(i).getPais2().getGf()+gb);
					partidos.get(i).getPais2().setGc(partidos.get(i).getPais2().getGc()+ga);
					//JOptionPane.showMessageDialog(null, "Gana= "+partidos.get(i).getPais2().getNombre()+"\nVS \nPierde= "+partidos.get(i).getPais().getNombre());
					GGgrupos.add((Seleccion) partidos.get(i).getPais2());
				}else if (ga==gb) { 
					ga++;
						partidos.get(i).getPais().setPuntos(partidos.get(i).getPais().getPuntos()+3);
						partidos.get(i).getPais().setPg(partidos.get(i).getPais().getPg()+1);
						partidos.get(i).getPais2().setPp(partidos.get(i).getPais2().getPp()+1);
						partidos.get(i).getPais().setGf(partidos.get(i).getPais().getGf()+ga);
						partidos.get(i).getPais().setGc(partidos.get(i).getPais().getGc()+gb);
						partidos.get(i).getPais2().setGf(partidos.get(i).getPais2().getGf()+gb);
						partidos.get(i).getPais2().setGc(partidos.get(i).getPais2().getGc()+ga);
						//JOptionPane.showMessageDialog(null, "Gana= "+partidos.get(i).getPais().getNombre()+"\nVS \nPierde= "+partidos.get(i).getPais2().getNombre());
						GGgrupos.add((Seleccion) partidos.get(i).getPais());
					}
				JOptionPane.showMessageDialog(null, partidos.get(i)+"\nID PARTIDO"+partidos.get(i).getId());
			}
			int d=Integer.parseInt(JOptionPane.showInputDialog("Desea Hacer la apuesta P1? \nIngrese \n1 Si lo desea\n de lo contrario ingrese cualquier #, para desestimar el mensaje"));
			if (d==1) {
				
			
				int aa=0,f=0,apuesta=0,apu=1;
				apuesta=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dinero que va a apostar en Fase de GRUPOS\nCada partido que gane, se duplicara su apuesta, De lo contrario no gana nada"));
				aa=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cant de apuestas que va a hacer en Fase de GRUPOS"));
				int[]veces=new int[aa];
				for (int k = 0; k < aa; k++) {
					f=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del partido, en el que desea apostar"));
					f--;
					int eleccion=Integer.parseInt(JOptionPane.showInputDialog("el partido que escogio es \n"+partidos.get(f) +"\nElija 1 o 2 a que PAIS, va su apuesta \n1=Primer PAIS \n2=Segundo PAIS "));
					if (eleccion==1) {
						JOptionPane.showMessageDialog(null, "Su eleccion fue "+partidos.get(f).getPais());
						if (ga>gb) {
							JOptionPane.showMessageDialog(null, "Pais ganador= "+partidos.get(f).getPais()+"\nPais perdedor= "+partidos.get(f).getPais2()+"\nGano esta apuesta");
							apu++;
						}else if (gb>ga) {
							JOptionPane.showMessageDialog(null, "Pais ganador= "+partidos.get(f).getPais2()+"\nPais perdedor= "+partidos.get(f).getPais()+"\nPerdio esta apuesta");
							apu--;
						}
					}else if(eleccion==2) {
						JOptionPane.showMessageDialog(null, "Su eleccion fue "+partidos.get(f).getPais2());
						if (ga>gb) {
							JOptionPane.showMessageDialog(null, "Pais ganador= "+partidos.get(f).getPais2()+"\nPais perdedor= "+partidos.get(f).getPais()+"\nGano esta apuesta");
							apu++;
						}else if (gb>ga) {
							JOptionPane.showMessageDialog(null, "Pais ganador= "+partidos.get(f).getPais()+"\nPais perdedor= "+partidos.get(f).getPais2()+"\nPerdio esta apuesta");
							apu--;
						}
					}						
				}
				if (apu>=0) {
					JOptionPane.showMessageDialog(null, "Dinero total= "+apuesta*apu);
				} else {
					JOptionPane.showMessageDialog(null, "No gano nada");						
				}
		}
			int d1=Integer.parseInt(JOptionPane.showInputDialog("Quiere ver los ganadores de cada encuentro de Fase?? \nIngrese \n1 Si lo desea\n de lo contrario ingrese cualquier #, para desestimar el mensaje"));
			if (d1==1) {
			for (int k = 0; k <GGgrupos.size(); k++) {
				switch (k) {
				case 0,1,2,3,4,5:JOptionPane.showMessageDialog(null, "Ganadores x Partido GRUPO A \n"+GGgrupos.get(k)); break;
				case 6,7,8,9,10,11:JOptionPane.showMessageDialog(null, "Ganadores x Partido GRUPO B \n"+GGgrupos.get(k)); break;
				case 12,13,14,15,16,17:JOptionPane.showMessageDialog(null, "Ganadores x Partido GRUPO C \n"+GGgrupos.get(k)); break;
				case 18,19,20,21,22,23:JOptionPane.showMessageDialog(null, "Ganadores x Partido GRUPO D \n"+GGgrupos.get(k)); break;
				case 24,25,26,27,28,29:JOptionPane.showMessageDialog(null, "Ganadores x Partido GRUPO E \n"+GGgrupos.get(k)); break;
				case 30,31,32,33,34,35:JOptionPane.showMessageDialog(null, "Ganadores x Partido GRUPO F \n"+GGgrupos.get(k)); break;
				case 36,37,38,39,40,41:JOptionPane.showMessageDialog(null, "Ganadores x Partido GRUPO G \n"+GGgrupos.get(k)); break;
				case 42,43,44,45,46,47:JOptionPane.showMessageDialog(null, "Ganadores x Partido GRUPO H \n"+GGgrupos.get(k)); break;
				}
			}
			}
		}
																											
		public static void Posiciones(LinkedList<Seleccion> grupos, LinkedList<Seleccion> grupoA) {
			//Scanner entrada = new Scanner(System.in);
			int max=-1, max2=-1, max3=-1, max4=-1;
			
			Seleccion pais1=null;
			Seleccion pais2=null;
			Seleccion pais3=null;
			Seleccion pais4=null;
			
			for (int i = 0; i <4; i++) {
				if (grupoA.get(i).getPuntos()>max) {
					max = grupoA.get(i).getPuntos();
					pais1 = grupoA.get(i); 
				} else if (grupoA.get(i).getPuntos() == max) {
					if (grupoA.get(i).getGf() > pais1.getGf()) {
						pais1 = grupoA.get(i);
					} else {
						pais1 = pais1;
					}
				}
			}
			for (int j = 0; j < 4; j++) {
				if (grupoA.get(j).getPuntos()>max2 && grupoA.get(j) != pais1 ) {
						max2 = grupoA.get(j).getPuntos();
						pais2= grupoA.get(j);
				} else if (grupoA.get(j).getPuntos() == max2 && grupoA.get(j) != pais1 ) {
					if (grupoA.get(j).getGf() > pais2.getGf()) {
						pais2 = grupoA.get(j);
					} else {
						pais2 = pais2;
					}
				}
			}
			for (int j2 = 0; j2 < 4; j2++) {
					if (grupoA.get(j2).getPuntos()>max3 && grupoA.get(j2) != pais1 && grupoA.get(j2) != pais2) {
							max3 = grupoA.get(j2).getPuntos();
							pais3= grupoA.get(j2);
					} else if (grupoA.get(j2).getPuntos() == max3 && grupoA.get(j2) != pais1 && grupoA.get(j2) != pais2) {
						if (grupoA.get(j2).getGf() > pais3.getGf()) {
							pais3 = grupoA.get(j2);
						} else {
							pais3 = pais3;
						}
					}
			}
			for (int x = 0; x < 4; x++) {
				if (grupoA.get(x) != pais1 && grupoA.get(x) != pais2 && grupoA.get(x) != pais3) {
					
					max4 = grupoA.get(x).getPuntos();
					pais4= grupoA.get(x);
				} 
				}
			grupoA.clear();
			grupoA.add(pais1);
			grupoA.add(pais2);
			grupoA.add(pais3);
			grupoA.add(pais4);
			/*atension lo baje abajo del for*///JOptionPane.showMessageDialog(null, "PAIS \t PTS \t PG \t PE \t PP \t GF \t GC \n ");
			//System.out.println("PAIS \t PTS \t PG \t PE \t PP \t GF \t GC \n " );			
					/*for (int i = 0; i < 4; i++) {
						JOptionPane.showMessageDialog(null,"PAIS \t PTS \t PG \t PE \t PP \t GF \t GC \n "+grupoA.get(i).getSigla() + "\t     " + grupoA.get(i).getPuntos() + "\t     " + grupoA.get(i).getPg() + "\t     " + grupoA.get(i).getPe() + "\t     " + grupoA.get(i).getPp() + "\t     " + grupoA.get(i).getGf() + "\t     " + grupoA.get(i).getGc());
						//System.out.println(grupoA.get(i).getSigla() + "\t" + grupoA.get(i).getPuntos() + "\t" + grupoA.get(i).getPg() + "\t" + grupoA.get(i).getPe() + "\t" + grupoA.get(i).getPp() + "\t" + grupoA.get(i).getGf() + "\t" + grupoA.get(i).getGc() );
					}*/	
					JOptionPane.showMessageDialog(null, "PTS= Puntos\nPG= Partidos ganados\nPE= Partidos empatados\nPP= Partidos perdidos \nGF= Goles a favor\nGC= Goles Recibidos");
					JOptionPane.showMessageDialog(null,"PAIS \t PTS \t PG \t PE \t PP \t GF \t GC \n "+grupoA.get(0).getSigla() + "\t     " + grupoA.get(0).getPuntos() + "\t     " + grupoA.get(0).getPg() + "\t     " + grupoA.get(0).getPe() + "\t     " + grupoA.get(0).getPp() + "\t     " + grupoA.get(0).getGf() + "\t     " + grupoA.get(0).getGc()+
													   "\n "+grupoA.get(1).getSigla() + "\t     " + grupoA.get(1).getPuntos() + "\t     " + grupoA.get(1).getPg() + "\t     " + grupoA.get(1).getPe() + "\t     " + grupoA.get(1).getPp() + "\t     " + grupoA.get(1).getGf() + "\t     " + grupoA.get(1).getGc()+
												       "\n "+grupoA.get(2).getSigla() + "\t     " + grupoA.get(2).getPuntos() + "\t     " + grupoA.get(2).getPg() + "\t     " + grupoA.get(2).getPe() + "\t     " + grupoA.get(2).getPp() + "\t     " + grupoA.get(2).getGf() + "\t     " + grupoA.get(2).getGc()+
													   "\n "+grupoA.get(3).getSigla() + "\t     " + grupoA.get(3).getPuntos() + "\t     " + grupoA.get(3).getPg() + "\t     " + grupoA.get(3).getPe() + "\t     " + grupoA.get(3).getPp() + "\t     " + grupoA.get(3).getGf() + "\t     " + grupoA.get(3).getGc());
		}
		public static void Octavos(LinkedList<Seleccion> Clasificados, LinkedList<Seleccion> octavos,  LinkedList<Seleccion> cuartos, LinkedList<Seleccion> grupoA, LinkedList<Seleccion> grupoB, LinkedList<Seleccion> grupoC, LinkedList<Seleccion> grupoD, LinkedList<Seleccion> grupoE, LinkedList<Seleccion> grupoF, LinkedList<Seleccion> grupoG, LinkedList<Seleccion> grupoH ) {
			octavos.add(grupoA.get(0));
			octavos.add(grupoA.get(1));
			octavos.add(grupoB.get(0));
			octavos.add(grupoB.get(1));
			octavos.add(grupoC.get(0));
			octavos.add(grupoC.get(1));
			octavos.add(grupoD.get(0));
			octavos.add(grupoD.get(1));
			octavos.add(grupoE.get(0));
			octavos.add(grupoE.get(1));
			octavos.add(grupoF.get(0));
			octavos.add(grupoF.get(1));
			octavos.add(grupoG.get(0));
			octavos.add(grupoG.get(1));
			octavos.add(grupoH.get(0));
			octavos.add(grupoH.get(1));
			
			JOptionPane.showMessageDialog(null, "Los paises clasificados a Octavos de Final son: \n" +octavos);
			//System.out.println("Los paises clasificados a Octavos de Final son: ");
			//System.out.println(octavos);
			int apu=0;
			int p;
			p=(int)(Math.random()*2+1);
			JOptionPane.showMessageDialog(null, "Ahora toca tirar la moneda \nsi sale 1(CARA) Gana la Seleccion: "+grupoA.get(0)+"si sale 2(CRUZ) gana la Seleccion de: "+grupoB.get(1));
			int pp=Integer.parseInt(JOptionPane.showInputDialog("Desea Hacer una apuesta en este partido?? \nIngrese \n1 Si lo desea (apuesta automatica 100)\n de lo contrario ingrese cualquier #, para desestimar el mensaje"));
			if (pp==1) {
				int ppp=Integer.parseInt(JOptionPane.showInputDialog("Que pais pasa a cuartos de Final ? \n1 Pais 1 \n2 Pais 2"));
				if (ppp==1) {
					if (p==1) {
						apu++;						
					}else {
						apu--;
					}
				}else if (ppp==2){
					if (p==0) {
						apu++;						
					}else {
						apu--;
					}
				}
			}
		
			if (p==1) {
				JOptionPane.showMessageDialog(null, "Salio "+p+" Pasa a Cuartos de Final: "+grupoA.get(0));
				//System.out.println("Salio "+p+" Pasa a Cuartos de Final: "+grupoA.get(0));
				cuartos.add(grupoA.get(0));
			} else {
				JOptionPane.showMessageDialog(null, "Salio "+p+" Pasa a Cuartos de Final: "+grupoB.get(1));
				//System.out.println("Salio "+p+" Pasa a Cuartos de Final: "+grupoB.get(1));
				cuartos.add(grupoB.get(1));
			} 				
			int p2;
			JOptionPane.showMessageDialog(null, "Ahora toca tirar la moneda \nsi sale 1(CARA) Gana la Seleccion: "+grupoB.get(0)+"si sale 2(CRUZ) gana la Seleccion de: "+grupoA.get(1));
			//System.out.println("Ahora toca tirar la moneda");
			//System.out.println("si sale 1(CARA) Gana la Seleccion: "+grupoB.get(0)+"si sale 2(CRUZ) gana la Seleccion de: "+grupoA.get(1));
			p2=(int)(Math.random()*2+1);
			pp=0;
			 pp=Integer.parseInt(JOptionPane.showInputDialog("Desea Hacer una apuesta en este partido?? \nIngrese \n1 Si lo desea (apuesta automatica 100)\n de lo contrario ingrese cualquier #, para desestimar el mensaje"));
			if (pp==1) {
				int ppp=Integer.parseInt(JOptionPane.showInputDialog("Que pais pasa a cuartos de Final ? \n1 Pais 1 \n2 Pais 2"));
				if (ppp==1) {
					if (p2==1) {
						apu++;						
					}else {
						apu--;
					}
				}else if (ppp==2){
					if (p2==0) {
						apu++;						
					}else {
						apu--;
					}
				}
			}
			if (p2==1) {
				JOptionPane.showMessageDialog(null, "Salio "+p2+" Pasa a Cuartos de Final: "+grupoB.get(0));
				//System.out.println("Salio "+p2+" Pasa a Cuartos de Final: "+grupoB.get(0));
				cuartos.add(grupoB.get(0));
			} else {
				JOptionPane.showMessageDialog(null, "Salio "+p2+" Pasa a Cuartos de Final: "+grupoA.get(1));
				//System.out.println("Salio "+p2+" Pasa a Cuartos de Final: "+grupoA.get(1));
				cuartos.add(grupoA.get(1));
			}
			int p3;
			JOptionPane.showMessageDialog(null, "Ahora toca tirar la moneda \nsi sale 1(CARA) Gana la Seleccion: "+grupoC.get(0)+"si sale 2(CRUZ) gana la Seleccion de: "+grupoD.get(1));
			//System.out.println("Ahora toca tirar la moneda");
			//System.out.println("si sale 1(CARA) Gana la Seleccion: "+grupoC.get(0)+"si sale 2(CRUZ) gana la Seleccion de: "+grupoD.get(1));
			p3=(int)(Math.random()*2+1);
			pp=0;
			 pp=Integer.parseInt(JOptionPane.showInputDialog("Desea Hacer una apuesta en este partido?? \nIngrese \n1 Si lo desea (apuesta automatica 100)\n de lo contrario ingrese cualquier #, para desestimar el mensaje"));
			if (pp==1) {
				int ppp=Integer.parseInt(JOptionPane.showInputDialog("Que pais pasa a cuartos de Final ? \n1 Pais 1 \n2 Pais 2"));
				if (ppp==1) {
					if (p3==1) {
						apu++;						
					}else {
						apu--;
					}
				}else if (ppp==2){
					if (p3==0) {
						apu++;						
					}else {
						apu--;
					}
				}
			}
			if (p3==1) {
				JOptionPane.showMessageDialog(null, "Salio "+p2+" Pasa a Cuartos de Final: "+grupoC.get(0));
				//System.out.println("Salio "+p3+" Pasa a Cuartos de Final: "+grupoC.get(0));
				cuartos.add(grupoC.get(0));
			} else {
				JOptionPane.showMessageDialog(null, "Salio "+p2+" Pasa a Cuartos de Final: "+grupoD.get(1));
				//System.out.println("Salio "+p3+" Pasa a Cuartos de Final: "+grupoD.get(1));
				cuartos.add(grupoD.get(1));
			}
			int p4;
			JOptionPane.showMessageDialog(null, "Ahora toca tirar la moneda \nsi sale 1(CARA) Gana la Seleccion: "+grupoD.get(0)+"si sale 2(CRUZ) gana la Seleccion de: "+grupoC.get(1));
			//System.out.println("Ahora toca tirar la moneda");
			//System.out.println("si sale 1(CARA) Gana la Seleccion: "+grupoD.get(0)+"si sale 2(CRUZ) gana la Seleccion de: "+grupoC.get(1));
			p4=(int)(Math.random()*2+1);
			pp=0;
			 pp=Integer.parseInt(JOptionPane.showInputDialog("Desea Hacer una apuesta en este partido?? \nIngrese \n1 Si lo desea (apuesta automatica 100)\n de lo contrario ingrese cualquier #, para desestimar el mensaje"));
			if (pp==1) {
				int ppp=Integer.parseInt(JOptionPane.showInputDialog("Que pais pasa a cuartos de Final ? \n1 Pais 1 \n2 Pais 2"));
				if (ppp==1) {
					if (p4==1) {
						apu++;						
					}else {
						apu--;
					}
				}else if (ppp==2){
					if (p4==0) {
						apu++;						
					}else {
						apu--;
					}
				}
			}
			if (p4==1) {
				JOptionPane.showMessageDialog(null, "Salio "+p2+" Pasa a Cuartos de Final: "+grupoD.get(0));
				//System.out.println("Salio "+p4+" Pasa a Cuartos de Final: "+grupoD.get(0));
				cuartos.add(grupoD.get(0));
			} else {
				JOptionPane.showMessageDialog(null, "Salio "+p2+" Pasa a Cuartos de Final: "+grupoC.get(1));
				//System.out.println("Salio "+p4+" Pasa a Cuartos de Final: "+grupoC.get(1));
				cuartos.add(grupoC.get(1));
			}
			int p5;
			JOptionPane.showMessageDialog(null, "Ahora toca tirar la moneda \nsi sale 1(CARA) Gana la Seleccion: "+grupoE.get(0)+"si sale 2(CRUZ) gana la Seleccion de: "+grupoF.get(1));
			//System.out.println("Ahora toca tirar la moneda");
			//System.out.println("si sale 1(CARA) Gana la Seleccion: "+grupoE.get(0)+"si sale 2(CRUZ) gana la Seleccion de: "+grupoF.get(1));
			p5=(int)(Math.random()*2+1);
			pp=0;
			 pp=Integer.parseInt(JOptionPane.showInputDialog("Desea Hacer una apuesta en este partido?? \nIngrese \n1 Si lo desea (apuesta automatica 100)\n de lo contrario ingrese cualquier #, para desestimar el mensaje"));
			if (pp==1) {
				int ppp=Integer.parseInt(JOptionPane.showInputDialog("Que pais pasa a cuartos de Final ? \n1 Pais 1 \n2 Pais 2"));
				if (ppp==1) {
					if (p5==1) {
						apu++;						
					}else {
						apu--;
					}
				}else if (ppp==2){
					if (p5==0) {
						apu++;						
					}else {
						apu--;
					}
				}
			}
			if (p5==1) {
				JOptionPane.showMessageDialog(null, "Salio "+p2+" Pasa a Cuartos de Final: "+grupoE.get(0));
				//System.out.println("Salio "+p5+" Pasa a Cuartos de Final: "+grupoE.get(0));
				cuartos.add(grupoE.get(0));
			} else {
				JOptionPane.showMessageDialog(null, "Salio "+p2+" Pasa a Cuartos de Final: "+grupoF.get(0));
				//System.out.println("Salio "+p5+" Pasa a Cuartos de Final: "+grupoF.get(1));
				cuartos.add(grupoF.get(1));
			}
			int p6;
			JOptionPane.showMessageDialog(null, "Ahora toca tirar la moneda \nsi sale 1(CARA) Gana la Seleccion: "+grupoF.get(0)+"si sale 2(CRUZ) gana la Seleccion de: "+grupoE.get(1));
			//System.out.println("Ahora toca tirar la moneda");
			//System.out.println("si sale 1(CARA) Gana la Seleccion: "+grupoF.get(0)+"si sale 2(CRUZ) gana la Seleccion de: "+grupoE.get(1));
			p6=(int)(Math.random()*2+1);
			pp=0;
			 pp=Integer.parseInt(JOptionPane.showInputDialog("Desea Hacer una apuesta en este partido?? \nIngrese \n1 Si lo desea (apuesta automatica 100)\n de lo contrario ingrese cualquier #, para desestimar el mensaje"));
			if (pp==1) {
				int ppp=Integer.parseInt(JOptionPane.showInputDialog("Que pais pasa a cuartos de Final ? \n1 Pais 1 \n2 Pais 2"));
				if (ppp==1) {
					if (p6==1) {
						apu++;						
					}else {
						apu--;
					}
				}else if (ppp==2){
					if (p6==0) {
						apu++;						
					}else {
						apu--;
					}
				}
			}
			if (p6==1) {
				JOptionPane.showMessageDialog(null, "Salio "+p2+" Pasa a Cuartos de Final: "+grupoF.get(0));
				//System.out.println("Salio "+p6+" Pasa a Cuartos de Final: "+grupoF.get(0));
				cuartos.add(grupoF.get(0));
			} else {
				JOptionPane.showMessageDialog(null, "Salio "+p2+" Pasa a Cuartos de Final: "+grupoE.get(1));
				//System.out.println("Salio "+p6+" Pasa a Cuartos de Final: "+grupoE.get(1));
				cuartos.add(grupoE.get(1));
			}	
			int p7;JOptionPane.showMessageDialog(null, "Ahora toca tirar la moneda \nsi sale 1(CARA) Gana la Seleccion: "+grupoG.get(0)+"si sale 2(CRUZ) gana la Seleccion de: "+grupoH.get(1));
			//System.out.println("Ahora toca tirar la moneda");
			//System.out.println("si sale 1(CARA) Gana la Seleccion: "+grupoG.get(0)+"si sale 2(CRUZ) gana la Seleccion de: "+grupoH.get(1));
			p7=(int)(Math.random()*2+1);
			pp=0;
			 pp=Integer.parseInt(JOptionPane.showInputDialog("Desea Hacer una apuesta en este partido?? \nIngrese \n1 Si lo desea (apuesta automatica 100)\n de lo contrario ingrese cualquier #, para desestimar el mensaje"));
			if (pp==1) {
				int ppp=Integer.parseInt(JOptionPane.showInputDialog("Que pais pasa a cuartos de Final ? \n1 Pais 1 \n2 Pais 2"));
				if (ppp==1) {
					if (p7==1) {
						apu++;						
					}else {
						apu--;
					}
				}else if (ppp==2){
					if (p7==0) {
						apu++;						
					}else {
						apu--;
					}
				}
			}
			if (p7==1) {
				JOptionPane.showMessageDialog(null, "Salio "+p2+" Pasa a Cuartos de Final: "+grupoG.get(0));
				//System.out.println("Salio "+p7+" Pasa a Cuartos de Final: "+grupoG.get(0));
				cuartos.add(grupoG.get(0));
			} else {
				JOptionPane.showMessageDialog(null, "Salio "+p2+" Pasa a Cuartos de Final: "+grupoH.get(1));
				//System.out.println("Salio "+p7+" Pasa a Cuartos de Final: "+grupoH.get(1));
				cuartos.add(grupoH.get(1));
			}
			int p8;
			JOptionPane.showMessageDialog(null, "Ahora toca tirar la moneda \nsi sale 1(CARA) Gana la Seleccion: "+grupoH.get(0)+"si sale 2(CRUZ) gana la Seleccion de: "+grupoG.get(1));
			//System.out.println("Ahora toca tirar la moneda");
			//System.out.println("si sale 1(CARA) Gana la Seleccion: "+grupoH.get(0)+"si sale 2(CRUZ) gana la Seleccion de: "+grupoG.get(1));
			p8=(int)(Math.random()*2+1);
			pp=0;
			 pp=Integer.parseInt(JOptionPane.showInputDialog("Desea Hacer una apuesta en este partido?? \nIngrese \n1 Si lo desea (apuesta automatica 100)\n de lo contrario ingrese cualquier #, para desestimar el mensaje"));
			if (pp==1) {
				int ppp=Integer.parseInt(JOptionPane.showInputDialog("Que pais pasa a cuartos de Final ? \n1 Pais 1 \n2 Pais 2"));
				if (ppp==1) {
					if (p8==1) {
						apu++;						
					}else {
						apu--;
					}
				}else if (ppp==2){
					if (p8==0) {
						apu++;						
					}else {
						apu--;
					}
				}
			}
			if (p8==1) {
				JOptionPane.showMessageDialog(null, "Salio "+p2+" Pasa a Cuartos de Final: "+grupoH.get(0));
				//System.out.println("Salio "+p8+" Pasa a Cuartos de Final: "+grupoH.get(0));
				cuartos.add(grupoH.get(0));
			} else {
				JOptionPane.showMessageDialog(null, "Salio "+p2+" Pasa a Cuartos de Final: "+grupoG.get(1));
				//System.out.println("Salio "+p8+" Pasa a Cuartos de Final: "+grupoG.get(1));
				cuartos.add(grupoG.get(1));
			}
			if (apu>0) {
				JOptionPane.showMessageDialog(null, "Total recaudado cuartos= "+apu*100);		
			}else {
				JOptionPane.showMessageDialog(null, "No gano nada");
			}
		}			
		public static void Cuartos(LinkedList<Seleccion> Clasificados, LinkedList<Seleccion> cuartos, LinkedList<Seleccion> semi ) {
			int apu=0,pp;	
		JOptionPane.showMessageDialog(null, "Los paises clasificados a Cuartos de Final son: \n" +cuartos+"\nA continuacion ingresara los ganadores de cada cruce: ");
		//System.out.println("Los paises clasificados a Cuartos de Final son: ");
		//System.out.println(cuartos);
		//System.out.println("A continuacion ingresara los ganadores de cada cruce: ");			
		int pc;
		JOptionPane.showMessageDialog(null, "Ahora toca tirar la moneda \nsi sale 1(CARA) Gana la Seleccion: "+cuartos.get(0)+"si sale 2(CRUZ) gana la Seleccion de: "+cuartos.get(1));
		//System.out.println("Ahora toca tirar la moneda");
		//System.out.println("si sale 1(CARA) Gana la Seleccion: "+cuartos.get(0)+"si sale 2(CRUZ) gana la Seleccion de: "+cuartos.get(1));
		pc=(int)(Math.random()*2+1);
		pp=0;
		 pp=Integer.parseInt(JOptionPane.showInputDialog("Desea Hacer una apuesta en este partido?? \nIngrese \n1 Si lo desea (apuesta automatica 100)\n de lo contrario ingrese cualquier #, para desestimar el mensaje"));
		if (pp==1) {
			int ppp=Integer.parseInt(JOptionPane.showInputDialog("Que pais pasa Semi Final ? \n1 Pais 1 \n2 Pais 2"));
			if (ppp==1) {
				if (pc==1) {
					apu++;						
				}else {
					apu--;
				}
			}else if (ppp==2){
				if (pc==0) {
					apu++;						
				}else {
					apu--;
				}
			}
		}
		if (pc==1) {
			JOptionPane.showMessageDialog(null,"Salio "+pc+" Pasa a Semi-Final: "+cuartos.get(0));
			//System.out.println("Salio "+pc+" Pasa a Semi-Final: "+cuartos.get(0));
			semi.add(cuartos.get(0));
		} else {
			JOptionPane.showMessageDialog(null,"Salio "+pc+" Pasa a Semi-Final: "+cuartos.get(1));
			//System.out.println("Salio "+pc+" Pasa a Semi-Final: "+cuartos.get(1));
			semi.add(cuartos.get(1));
		}
		int pc2;
		JOptionPane.showMessageDialog(null, "Ahora toca tirar la moneda \nsi sale 1(CARA) Gana la Seleccion: "+cuartos.get(2)+"si sale 2(CRUZ) gana la Seleccion de: "+cuartos.get(3));
		//System.out.println("Ahora toca tirar la moneda");
		//System.out.println("si sale 1(CARA) Gana la Seleccion: "+cuartos.get(2)+"si sale 2(CRUZ) gana la Seleccion de: "+cuartos.get(3));
		pc2=(int)(Math.random()*2+1);
		pp=0;
		 pp=Integer.parseInt(JOptionPane.showInputDialog("Desea Hacer una apuesta en este partido?? \nIngrese \n1 Si lo desea (apuesta automatica 100)\n de lo contrario ingrese cualquier #, para desestimar el mensaje"));
		if (pp==1) {
			int ppp=Integer.parseInt(JOptionPane.showInputDialog("Que pais pasa a Semi Final ? \n1 Pais 1 \n2 Pais 2"));
			if (ppp==1) {
				if (pc2==1) {
					apu++;						
				}else {
					apu--;
				}
			}else if (ppp==2){
				if (pc2==0) {
					apu++;						
				}else {
					apu--;
				}
			}
		}
		if (pc2==1) {
			JOptionPane.showMessageDialog(null,"Salio "+pc+" Pasa a Semi-Final: "+cuartos.get(2));
			//System.out.println("Salio "+pc2+" Pasa a Semi-Final: "+cuartos.get(2));
			semi.add(cuartos.get(2));
		} else {
			JOptionPane.showMessageDialog(null,"Salio "+pc+" Pasa a Semi-Final: "+cuartos.get(3));
			//System.out.println("Salio "+pc2+" Pasa a Semi-Final: "+cuartos.get(3));
			semi.add(cuartos.get(3));
		}	
		int pc3;
		JOptionPane.showMessageDialog(null, "Ahora toca tirar la moneda \nsi sale 1(CARA) Gana la Seleccion: "+cuartos.get(4)+"si sale 2(CRUZ) gana la Seleccion de: "+cuartos.get(5));
		//System.out.println("Ahora toca tirar la moneda");
		//System.out.println("si sale 1(CARA) Gana la Seleccion: "+cuartos.get(4)+"si sale 2(CRUZ) gana la Seleccion de: "+cuartos.get(5));
		pc3=(int)(Math.random()*2+1);
		pp=0;
		 pp=Integer.parseInt(JOptionPane.showInputDialog("Desea Hacer una apuesta en este partido?? \nIngrese \n1 Si lo desea (apuesta automatica 100)\n de lo contrario ingrese cualquier #, para desestimar el mensaje"));
		if (pp==1) {
			int ppp=Integer.parseInt(JOptionPane.showInputDialog("Que pais pasa a Semi Final ? \n1 Pais 1 \n2 Pais 2"));
			if (ppp==1) {
				if (pc3==1) {
					apu++;						
				}else {
					apu--;
				}
			}else if (ppp==2){
				if (pc3==0) {
					apu++;						
				}else {
					apu--;
				}
			}
		}
		if (pc3==1) {
			JOptionPane.showMessageDialog(null,"Salio "+pc+" Pasa a Semi-Final: "+cuartos.get(4));
			//System.out.println("Salio "+pc3+" Pasa a Semi-Final: "+cuartos.get(4));
			semi.add(cuartos.get(4));
		} else {
			JOptionPane.showMessageDialog(null,"Salio "+pc+" Pasa a Semi-Final: "+cuartos.get(5));
			//System.out.println("Salio "+pc3+" Pasa a Semi-Final: "+cuartos.get(5));
			semi.add(cuartos.get(5));
		}
		int pc4;
		JOptionPane.showMessageDialog(null, "Ahora toca tirar la moneda \nsi sale 1(CARA) Gana la Seleccion: "+cuartos.get(6)+"si sale 2(CRUZ) gana la Seleccion de: "+cuartos.get(7));
		//System.out.println("Ahora toca tirar la moneda");
		//System.out.println("si sale 1(CARA) Gana la Seleccion: "+cuartos.get(6)+"si sale 2(CRUZ) gana la Seleccion de: "+cuartos.get(7));
		pc4=(int)(Math.random()*2+1);
		pp=0;
		 pp=Integer.parseInt(JOptionPane.showInputDialog("Desea Hacer una apuesta en este partido?? \nIngrese \n1 Si lo desea (apuesta automatica 100)\n de lo contrario ingrese cualquier #, para desestimar el mensaje"));
		if (pp==1) {
			int ppp=Integer.parseInt(JOptionPane.showInputDialog("Que pais pasa a Semi Final ? \n1 Pais 1 \n2 Pais 2"));
			if (ppp==1) {
				if (pc4==1) {
					apu++;						
				}else {
					apu--;
				}
			}else if (ppp==2){
				if (pc4==0) {
					apu++;						
				}else {
					apu--;
				}
			}
		}
		if (pc4==1) {
			JOptionPane.showMessageDialog(null,"Salio "+pc+" Pasa a Semi-Final: "+cuartos.get(6));
			//System.out.println("Salio "+pc4+" Pasa a Semi-Final: "+cuartos.get(6));
			semi.add(cuartos.get(6));
		} else {
			JOptionPane.showMessageDialog(null,"Salio "+pc+" Pasa a Semi-Final: "+cuartos.get(7));
			//System.out.println("Salio "+pc4+" Pasa a Semi-Final: "+cuartos.get(7));
			semi.add(cuartos.get(7));
		}
		if (apu>0) {
			JOptionPane.showMessageDialog(null, "Total recaudado cuartos= "+apu*100);		
		}else {
			JOptionPane.showMessageDialog(null, "No gano nada");
		}
		}						
		public static void SemiFinal(LinkedList<Seleccion> Clasificados, LinkedList<Seleccion> semi, LinkedList<Seleccion> Final) {
			int apu=0,pp;
		JOptionPane.showMessageDialog(null, "Los paises clasificados a la SemiFinal del Mudnial son: "+semi+"\nA continuacion ingresara los ganadores de cada cruce: ");
		//System.out.println("Los paises clasificados a la SemiFinal del Mudnial son: ");
		//System.out.println(semi);
		//System.out.println("A continuacion ingresara los ganadores de cada cruce: ");
		int ps;
		JOptionPane.showMessageDialog(null, "Ahora toca tirar la moneda \nsi sale 1(CARA) Gana la Seleccion: "+semi.get(0)+"si sale 2(CRUZ) gana la Seleccion de: "+semi.get(1));
		//System.out.println("Ahora toca tirar la moneda");
		//System.out.println("si sale 1(CARA) Gana la Seleccion: "+semi.get(0)+"si sale 2(CRUZ) gana la Seleccion de: "+semi.get(1));
		ps=(int)(Math.random()*2+1);
		pp=0;
		 pp=Integer.parseInt(JOptionPane.showInputDialog("Desea Hacer una apuesta en este partido?? \nIngrese \n1 Si lo desea (apuesta automatica 100)\n de lo contrario ingrese cualquier #, para desestimar el mensaje"));
		if (pp==1) {
			int ppp=Integer.parseInt(JOptionPane.showInputDialog("Que pais pasa a la FINAL ? \n1 Pais 1 \n2 Pais 2"));
			if (ppp==1) {
				if (ps==1) {
					apu++;						
				}else {
					apu--;
				}
			}else if (ppp==2){
				if (ps==0) {
					apu++;						
				}else {
					apu--;
				}
			}
		}
		if (ps==1) {
			JOptionPane.showMessageDialog(null,"Salio "+ps+" Pasa a Semi-Final: "+semi.get(0));
			//System.out.println("Salio "+ps+" Pasa a la Final: "+semi.get(0));
			Final.add(semi.get(0));
		} else {
			JOptionPane.showMessageDialog(null,"Salio "+ps+" Pasa a Semi-Final: "+semi.get(0));
			//System.out.println("Salio "+ps+" Pasa a la Final: "+semi.get(1));
			Final.add(semi.get(1));
		}
		int ps2;
		JOptionPane.showMessageDialog(null, "Ahora toca tirar la moneda \nsi sale 1(CARA) Gana la Seleccion: "+semi.get(2)+"si sale 2(CRUZ) gana la Seleccion de: "+semi.get(3));
		//System.out.println("Ahora toca tirar la moneda");
		//System.out.println("si sale 1(CARA) Gana la Seleccion: "+semi.get(2)+"si sale 2(CRUZ) gana la Seleccion de: "+semi.get(3));
		ps2=(int)(Math.random()*2+1);
		pp=0;
		 pp=Integer.parseInt(JOptionPane.showInputDialog("Desea Hacer una apuesta en este partido?? \nIngrese \n1 Si lo desea (apuesta automatica 100)\n de lo contrario ingrese cualquier #, para desestimar el mensaje"));
		if (pp==1) {
			int ppp=Integer.parseInt(JOptionPane.showInputDialog("Que pais pasa a la Final ? \n1 Pais 1 \n2 Pais 2"));
			if (ppp==1) {
				if (ps2==1) {
					apu++;						
				}else {
					apu--;
				}
			}else if (ppp==2){
				if (ps2==0) {
					apu++;						
				}else {
					apu--;
				}
			}
		}
		if (ps2==1) {
			JOptionPane.showMessageDialog(null,"Salio "+ps2+" Pasa a Semi-Final: "+semi.get(2));
			//System.out.println("Salio "+ps2+" Pasa a la Final: "+semi.get(2));
			Final.add(semi.get(2));
		} else {
			JOptionPane.showMessageDialog(null,"Salio "+ps2+" Pasa a Semi-Final: "+semi.get(3));
			//System.out.println("Salio "+ps2+" Pasa a la Final: "+semi.get(3));
			Final.add(semi.get(3));
		}
		if (apu>0) {
			JOptionPane.showMessageDialog(null, "Total recaudado SemiFinal= "+apu*100);		
		}else {
			JOptionPane.showMessageDialog(null, "No gano nada");
		}
		}			
		public static void Final(LinkedList<Seleccion> Clasificados, LinkedList<Seleccion> Final) {
			int apu=0,pp;
			JOptionPane.showMessageDialog(null, "Los paises clasificados a la Final del Mudnial son: "+Final+"\nA continuacion ingresara los ganadores de cada cruce: ");
		//System.out.println("Los paises clasificados a la Final del Mudnial son: ");
		//System.out.println(Final);		
		//System.out.println("A continuacion ingresara los ganadores de cada cruce: ");
		int pf;
		JOptionPane.showMessageDialog(null, "Ahora toca tirar la moneda \nsi sale 1(CARA) Gana la Seleccion: "+Final.get(0)+"si sale 2(CRUZ) gana la Seleccion de: "+Final.get(1));
		//System.out.println("Ahora toca tirar la moneda");
		//System.out.println("si sale 1(CARA) Gana la Seleccion: "+Final.get(0)+"si sale 2(CRUZ) gana la Seleccion de: "+Final.get(1));
		pf=(int)(Math.random()*2+1);
		pp=0;
		 pp=Integer.parseInt(JOptionPane.showInputDialog("Desea Hacer una apuesta en este partido?? \nIngrese \n1 Si lo desea (apuesta automatica 100)\n de lo contrario ingrese cualquier #, para desestimar el mensaje"));
		if (pp==1) {
			int ppp=Integer.parseInt(JOptionPane.showInputDialog("Que pais GANARA la Final ? \n1 Pais 1 \n2 Pais 2"));
			if (ppp==1) {
				if (pf==1) {
					apu++;						
				}else {
					apu--;
				}
			}else if (ppp==2){
				if (pf==0) {
					apu++;						
				}else {
					apu--;
				}
			}
		}
		if (pf==1) {
			JOptionPane.showMessageDialog(null,"Salio "+pf+" Pasa a Semi-Final: "+Final.get(0));
			//System.out.println("Salio "+pf+" Gana el Mundial Qatar 2022 : "+Final.get(0));
		} else {
			JOptionPane.showMessageDialog(null,"Salio "+pf+" Pasa a Semi-Final: "+Final.get(1));
			//System.out.println("Salio "+pf+" Gana el Mundial Qatar 2022 : "+Final.get(1));
		}
		if (apu>0) {
			JOptionPane.showMessageDialog(null, "Total recaudado Final= "+apu*100);		
		}else {
			JOptionPane.showMessageDialog(null, "No gano nada");
		}
		}
		}

