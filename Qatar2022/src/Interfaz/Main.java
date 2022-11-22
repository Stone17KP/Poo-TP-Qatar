package Interfaz;

	import java.util.LinkedList;
	import java.util.Scanner;
	import Datos.*;
	
	public class Main {

		public static void main(String[] args) {

			LinkedList<Seleccion> Clasificados = new LinkedList<Seleccion>();
			
			Clasificados.add(new Seleccion ("Qatar", 0, true, "A", 0, "QAT", 1, 0, 0, 0, 0 ,0));
			Clasificados.add(new Seleccion ("Ecuador", 0, true, "A", 0, "ECU", 2, 0, 0, 0, 0 ,0));
			Clasificados.add(new Seleccion ("Senegal", 0, true, "A", 0, "SEN", 3, 0, 0, 0, 0 ,0));
			Clasificados.add(new Seleccion ("Holanda", 0, true, "A", 0, "HOL", 4, 0, 0, 0, 0 ,0));
			
			Clasificados.add(new Seleccion ("Inglaterra", 0, true, "B", 0, "ING", 5, 0, 0, 0, 0 ,0));
			Clasificados.add(new Seleccion ("Iran", 0, true, "B", 0, "IRN", 6, 0, 0, 0, 0 ,0));
			Clasificados.add(new Seleccion ("USA", 0, true, "B", 0, "USA", 7, 0, 0, 0, 0 ,0));
			Clasificados.add(new Seleccion ("Gales", 0, true, "B", 0, "GAL", 8, 0, 0, 0, 0 ,0));
			
			Clasificados.add(new Seleccion ("Argentina", 0, true, "C", 0, "ARG", 9, 0, 0, 0, 0 ,0));
			Clasificados.add(new Seleccion ("Arabia Saudita", 0, true, "C", 0, "ARA", 10, 0, 0, 0, 0 ,0));
			Clasificados.add(new Seleccion ("Mexico", 0, true, "C", 0, "MEX", 11, 0, 0, 0, 0 ,0));
			Clasificados.add(new Seleccion ("Polonia", 0, true, "C", 0, "POL", 12, 0, 0, 0, 0 ,0));
			
			Clasificados.add(new Seleccion  ("Francia", 0, true, "D", 0, "FRA", 13, 0, 0, 0, 0 ,0));
			Clasificados.add(new Seleccion ("Australia", 0, true, "D", 0, "AUS", 14, 0, 0, 0, 0 ,0));
			Clasificados.add(new Seleccion ("Dinamarca", 0, true, "D", 0, "DIN", 15, 0, 0, 0, 0 ,0));
			Clasificados.add(new Seleccion ("Tunez", 0, true, "D", 0, "TUN", 16, 0, 0, 0, 0 ,0));
			
			Clasificados.add(new Seleccion ("España", 0, true, "E", 0, "ESP", 17, 0, 0, 0, 0 ,0));
			Clasificados.add(new Seleccion ("Costa Rica", 0, true, "E", 0, "CRC", 18, 0, 0, 0, 0 ,0));
			Clasificados.add(new Seleccion ("Alemania", 0, true, "E", 0, "ALE", 19, 0, 0, 0, 0 ,0));
			Clasificados.add(new Seleccion ("Japon", 0, true, "E", 0, "JAP", 20, 0, 0, 0, 0 ,0));
			
			Clasificados.add(new Seleccion ("Belgica", 0, true, "F", 0, "BEL", 21, 0, 0, 0, 0 ,0));
			Clasificados.add(new Seleccion ("Canada", 0, false, "F", 0, "CAN", 22, 0, 0, 0, 0 ,0));
			Clasificados.add(new Seleccion ("Marruecos", 0, false, "F", 0, "MAR", 23, 0, 0, 0, 0 ,0));
			Clasificados.add(new Seleccion ("Croacia", 0, true, "F", 0, "CRO", 24, 0, 0, 0, 0 ,0));
			
			Clasificados.add(new Seleccion ("Brasil", 0, true, "G", 0, "BRA", 25, 0, 0, 0, 0 ,0));
			Clasificados.add(new Seleccion ("Serbia", 0, true, "G", 0, "SER", 26, 0, 0, 0, 0 ,0));
			Clasificados.add(new Seleccion ("Suiza", 0, true, "G", 0, "SUI", 27, 0, 0, 0, 0 ,0));
			Clasificados.add(new Seleccion ("Camerun", 0, true, "G", 0, "CAM", 28, 0, 0, 0, 0 ,0));
			
			Clasificados.add(new Seleccion ("Portugal", 0, true, "H", 0, "POR", 29, 0, 0, 0, 0 ,0));
			Clasificados.add(new Seleccion ("Ghana", 0, true, "H", 0, "GHA", 30, 0, 0, 0, 0 ,0));
			Clasificados.add(new Seleccion ("Uruguay", 0, true, "H", 0, "URU", 31, 0, 0, 0, 0 ,0));
			Clasificados.add(new Seleccion ("Corea del Sur", 0, true, "H", 0, "COR", 32, 0, 0, 0, 0 ,0));			
			
			for (int i = 0; i < Clasificados.size(); i++) {
			
				LinkedList<	Seleccion> grupoA = new LinkedList<Seleccion>();
				grupoA.add(Clasificados.get(0));
				grupoA.add(Clasificados.get(1));
				grupoA.add(Clasificados.get(2));
				grupoA.add(Clasificados.get(3));
			
				LinkedList<	Seleccion> grupoB = new LinkedList<Seleccion>();
				grupoB.add(Clasificados.get(4));
				grupoB.add(Clasificados.get(5));
				grupoB.add(Clasificados.get(6));
				grupoB.add(Clasificados.get(7));

				LinkedList<	Seleccion> grupoC = new LinkedList<Seleccion>();
				grupoC.add(Clasificados.get(8));
				grupoC.add(Clasificados.get(9));
				grupoC.add(Clasificados.get(10));
				grupoC.add(Clasificados.get(11));
				
				LinkedList<	Seleccion> grupoD = new LinkedList<Seleccion>();
				grupoD.add(Clasificados.get(12));
				grupoD.add(Clasificados.get(13));
				grupoD.add( Clasificados.get(14));
				grupoD.add(Clasificados.get(15));
				
				LinkedList<	Seleccion> grupoE = new LinkedList<Seleccion>();
				grupoE.add(Clasificados.get(16));
				grupoE.add(Clasificados.get(17));
				grupoE.add(Clasificados.get(18));
				grupoE.add(Clasificados.get(19));
				
				LinkedList<	Seleccion> grupoF = new LinkedList<Seleccion>();
				grupoF.add(Clasificados.get(20));
				grupoF.add(Clasificados.get(21));
				grupoF.add(Clasificados.get(22));
				grupoF.add(Clasificados.get(23));
				
				LinkedList<	Seleccion> grupoG = new LinkedList<Seleccion>();
				grupoG.add(Clasificados.get(24));
				grupoG.add(Clasificados.get(25));
				grupoG.add(Clasificados.get(26));
				grupoG.add(Clasificados.get(27));
				
				LinkedList<	Seleccion> grupoH = new LinkedList<Seleccion>();
				grupoH.add(Clasificados.get(28));
				grupoH.add(Clasificados.get(29));
				grupoH.add(Clasificados.get(30));
				grupoH.add(Clasificados.get(31));
			
			LinkedList<Seleccion> octavos = new LinkedList<Seleccion>();
			LinkedList<Seleccion> cuartos = new LinkedList<Seleccion>();
			LinkedList<Seleccion> semi = new LinkedList<Seleccion>();
			LinkedList<Seleccion> Final = new LinkedList<Seleccion>();

			LinkedList<Partido> partidoa = new LinkedList<>();
			LinkedList<Partido> partidob = new LinkedList<>();
			LinkedList<Partido> partidoc = new LinkedList<>();
			LinkedList<Partido> partidod = new LinkedList<>();
			LinkedList<Partido> partidoe = new LinkedList<>();
			LinkedList<Partido> partidof = new LinkedList<>();
			LinkedList<Partido> partidog = new LinkedList<>();
			LinkedList<Partido> partidoh = new LinkedList<>();

			int id;						
			
			PartidosGrupo(partidoa, grupoA, id=0);
			PartidosGrupo(partidob, grupoB, id=6);
			PartidosGrupo(partidoc, grupoC, id=12);
			PartidosGrupo(partidod, grupoD, id=18);
			PartidosGrupo(partidoe, grupoE, id=24);
			PartidosGrupo(partidof, grupoF, id=30);
			PartidosGrupo(partidog, grupoG, id=36);
			PartidosGrupo(partidoh, grupoH, id=42);
			LinkedList<Partido> partidos = new LinkedList<>();
			partidos.addAll(partidoa);
			partidos.addAll(partidob);
			partidos.addAll(partidoc);
			partidos.addAll(partidod);
			partidos.addAll(partidoe);
			partidos.addAll(partidof);
			partidos.addAll(partidog);
			partidos.addAll(partidoh);
			
			LinkedList<Seleccion> grupos = new LinkedList<>();
			grupos.addAll(grupoA);
			grupos.addAll(grupoB);
			grupos.addAll(grupoC);
			grupos.addAll(grupoD);
			grupos.addAll(grupoE);
			grupos.addAll(grupoF);
			grupos.addAll(grupoG);
			grupos.addAll(grupoH);
			
			LinkedList<Estadio> Estadios = new LinkedList<Estadio>();
			
			Estadios.add( new Estadio (0,"Estadio Al Bait "));
			Estadios.add( new Estadio (1,"Estadio Al Yanub "));
			Estadios.add( new Estadio (2,"Estadio Ahmad Bin Ali "));
			Estadios.add( new Estadio (3,"Estadio Al Zumama "));
			Estadios.add( new Estadio (4,"Estadio Ciudad de la Educación "));
			Estadios.add( new Estadio (5,"Estadio Internacional Jalifa "));
			Estadios.add( new Estadio (6,"Estadio de Lusail "));
			Estadios.add( new Estadio (7,"Estadio 974 "));
			
			//String cancha=(Estadios.get((int)(Math.random()*8)).getNombre());
			//System.out.println("la cancha es "+cancha);
			
			
	                                           // ------------ loggin Encargado --------------
			Scanner entrada = new Scanner(System.in);
				int m=0;
				do {
					//id = 1 contra = 1234
			Encargado encargado1= new Encargado(1,"Pancho",1234);
					IngresoEncargado(encargado1);
					Menu1(Estadios,Clasificados, octavos, cuartos, semi, Final, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH, partidos,encargado1);
					System.out.println("Ingrese cualquier letra para terminar, ingrese 9 para volver al menu y continuar");
					m= entrada.nextInt();
					
				} while (m!=9);
			}
		}
			public static void Menu1(LinkedList<Estadio> Estadios,LinkedList<Seleccion> Clasificados, LinkedList<Seleccion> octavos, LinkedList<Seleccion> cuartos, LinkedList<Seleccion> semi, LinkedList<Seleccion> Final, LinkedList<Seleccion> grupoA,  LinkedList<Seleccion> grupoB, LinkedList<Seleccion> grupoC, LinkedList<Seleccion> grupoD, LinkedList<Seleccion> grupoE, LinkedList<Seleccion> grupoF, LinkedList<Seleccion> grupoG, LinkedList<Seleccion> grupoH, LinkedList<Partido> partidos,Encargado encargado1) { 
				Scanner entrada = new Scanner(System.in);
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Bienvenido Mundial de Qatar 2022. Encargado= "+encargado1.getNombre());
				System.out.println("Ingrese la opcion que desea conocer");
				System.out.println("Si esta entrando por primera vez, vaya elijiengo de menor a mayor. **Muchas Gracias** ");
				System.out.println("1- Selecciones  y partidos de los grupos");
				System.out.println("2- Posiciones de los grupos + resultados de la tabla");
				System.out.println("3- ver Octavos de Final");
				System.out.println("4- ver Cuartos de Final");
				System.out.println("5- ver SemiFinal");
				System.out.println("6- ver Final");
				System.out.println("7- Salir");
				int a = entrada.nextInt();
				switch (a) {
				case 1:
					String op;
					System.out.println("Ingrese el grupo del que desea ver los partidos");
					entrada.nextLine();
					op = entrada.nextLine();
					System.out.println("Los partidos del grupo " + op + " son: ");
					for (int i = 0; i < partidos.size(); i++) {
						if (partidos.get(i).getPais().getGrupo().equalsIgnoreCase(op)) {
							System.out.println(partidos.get(i));
							System.out.println("Minutos: "+partidos.get(i).getDuracion());
							System.out.println("Numero de partido: "+partidos.get(i).getId());
							System.out.println("Estadio del encuentro : "+(Estadios.get((int)(Math.random()*8)).getNombre()));
						}
					}
					Resultados(partidos, Clasificados);
					Menu1(Estadios,Clasificados, octavos, cuartos, semi, Final, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH, partidos,encargado1);
					break;
				case 2:
					System.out.println("Los 2 primeros de cada grupo clasifican a octavos de Final");
					
					System.out.println("Ingrese el grupo del que desea saber las posiciones");
					entrada.nextLine();
					String g = entrada.nextLine();
					System.out.println("La clasificacion del grupo es: ");
					switch (g) {
					case "a":
						Posiciones(Clasificados, grupoA);
						Menu1(Estadios,Clasificados, octavos, cuartos, semi, Final, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH, partidos,encargado1);
						break;
					case "b":
						Posiciones(Clasificados, grupoB);		
						Menu1(Estadios,Clasificados, octavos, cuartos, semi, Final, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH, partidos,encargado1);
						break;
					case "c":
						Posiciones(Clasificados, grupoC);
						Menu1(Estadios,Clasificados, octavos, cuartos, semi, Final, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH, partidos,encargado1);
						break;
					case "d":
						Posiciones(Clasificados, grupoD);
						Menu1(Estadios,Clasificados, octavos, cuartos, semi, Final, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH, partidos,encargado1);
						break;
					case "e":
						Posiciones(Clasificados, grupoE);
						Menu1(Estadios,Clasificados, octavos, cuartos, semi, Final, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH, partidos,encargado1);
						break;
					case "f":
						Posiciones(Clasificados, grupoF);
						Menu1(Estadios,Clasificados, octavos, cuartos, semi, Final, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH, partidos,encargado1);
						break;
					case "g":
						Posiciones(Clasificados, grupoG);
						Menu1(Estadios,Clasificados, octavos, cuartos, semi, Final, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH, partidos,encargado1);
						break;
					case "h":
						Posiciones(Clasificados, grupoH);
						Menu1(Estadios,Clasificados, octavos, cuartos, semi, Final, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH, partidos,encargado1);	
						break;

					default:
						System.out.println("La letra ingresada fue: " + g);
						System.out.println("No existe ningun grupo del mundial con la letra ingresada");
						System.out.println("vuelve al menu");
						Menu1(Estadios,Clasificados, octavos, cuartos, semi, Final, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH, partidos,encargado1);
						break;
					}
					break;
				case 3:
					Octavos(Clasificados, octavos, cuartos, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH);
					Menu1(Estadios,Clasificados, octavos, cuartos, semi, Final, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH, partidos,encargado1);
					break;
				case 4:
					Cuartos(Clasificados, cuartos, semi);
					Menu1(Estadios,Clasificados, octavos, cuartos, semi, Final, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH, partidos,encargado1);
					break;
				case 5:
					SemiFinal(Clasificados, semi, Final);
					Menu1(Estadios,Clasificados, octavos, cuartos, semi, Final, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH, partidos,encargado1);
					break;
				case 6:
					Final(Clasificados, Final);
					break;
				case 7:
					System.out.println("**Hasta luego**");
					break;
				default:
					break;
				}
			}			
			public static void IngresoEncargado(Encargado encargado1) {
				Scanner entrada = new Scanner(System.in);
				System.out.println("Ingrese id ");
				int nroid =  entrada.nextInt();
				System.out.println(" Ingrese contra");
				int contra =  entrada.nextInt();
				if(encargado1.IngresoEncargado(encargado1, nroid,contra)) {					
					System.out.println("^^^^^^^^Logeado correctamente^^^^^^^^");
				}else {
					System.out.println("No se pudo ingresar");
					System.out.println("Vuelva a intentar");
					IngresoEncargado(encargado1);
				}	
			}
			public static void PartidosGrupo(LinkedList<Partido> partidos, LinkedList<Seleccion> Clasificados,int id)  {
				int tot=0;
				Partido partido;
				String op;				
				for (int i = 1; i <=3; i++) {
					if (tot <3) {
						id++;
						partido = new Partido(0,id, 90.00, Clasificados.get(0), Clasificados.get(i));
						partidos.add(partido);
						tot++;
						if (tot == 3) {
							i=0;
						}
					} else if (i != 1 && tot<5) {
						id++;
						partido = new Partido(0,id,90.00, Clasificados.get(1), Clasificados.get(i));
						partidos.add(partido);
						tot++;
						if (tot == 5) {
							i=2;
						}
					} else if (i != 1 && i !=2 ) {
						id++;
						partido = new Partido(0,id, 90.00, Clasificados.get(2), Clasificados.get(i));
						partidos.add(partido);
					}
					}
			}		
			public static void Resultados(LinkedList<Partido> partidos, LinkedList<Seleccion> Clasificados) {
				int ga, gb;				
					ga=0;
					gb=0;
				for (int i = 0; i < partidos.size(); i++) {
					ga=(int)(Math.random()*5);
					gb=(int)(Math.random()*5);					
					if (ga>gb) {
						partidos.get(i).getPais().setPuntos(partidos.get(i).getPais().getPuntos()+3);
						partidos.get(i).getPais().setPg(partidos.get(i).getPais().getPg()+1);
						partidos.get(i).getPais2().setPp(partidos.get(i).getPais2().getPp()+1);									
						partidos.get(i).getPais().setGf(partidos.get(i).getPais().getGf()+ga);
						partidos.get(i).getPais().setGc(partidos.get(i).getPais().getGc()+gb);
						partidos.get(i).getPais2().setGf(partidos.get(i).getPais2().getGf()+gb);
						partidos.get(i).getPais2().setGc(partidos.get(i).getPais2().getGc()+ga);						
					}else if (gb>ga) {
						partidos.get(i).getPais2().setPuntos(partidos.get(i).getPais2().getPuntos()+3);
						partidos.get(i).getPais2().setPg(partidos.get(i).getPais2().getPg()+1);
						partidos.get(i).getPais().setPp(partidos.get(i).getPais().getPp()+1);					
						partidos.get(i).getPais().setGf(partidos.get(i).getPais().getGf()+ga);
						partidos.get(i).getPais().setGc(partidos.get(i).getPais().getGc()+gb);
						partidos.get(i).getPais2().setGf(partidos.get(i).getPais2().getGf()+gb);
						partidos.get(i).getPais2().setGc(partidos.get(i).getPais2().getGc()+ga);											
					}else if (ga==gb) {
						int gg;
						gg=(int)(Math.random()*2);
						if (gg==1) {															
							partidos.get(i).getPais().setPuntos(partidos.get(i).getPais().getPuntos()+3);
							partidos.get(i).getPais().setPg(partidos.get(i).getPais().getPg()+1);
							partidos.get(i).getPais2().setPp(partidos.get(i).getPais2().getPp()+1);						
						}else {
							partidos.get(i).getPais2().setPuntos(partidos.get(i).getPais2().getPuntos()+3);
							partidos.get(i).getPais2().setPg(partidos.get(i).getPais2().getPg()+1);
							partidos.get(i).getPais().setPp(partidos.get(i).getPais().getPp()+1);								
						}
					}										
				}
			}																								
			public static void Posiciones(LinkedList<Seleccion> grupos, LinkedList<Seleccion> grupoA) {
				Scanner entrada = new Scanner(System.in);
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
				System.out.println("PAIS \t PTS \t PG \t PE \t PP \t GF \t GC \n " );			
						for (int i = 0; i < 4; i++) {
							System.out.println(grupoA.get(i).getSigla() + "\t" + grupoA.get(i).getPuntos() + "\t" + grupoA.get(i).getPg() + "\t" + grupoA.get(i).getPe() + "\t" + grupoA.get(i).getPp() + "\t" + grupoA.get(i).getGf() + "\t" + grupoA.get(i).getGc() );
						}			
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
				System.out.println("Los paises clasificados a Octavos de Final son: ");
				System.out.println(octavos);				
				int p;
				System.out.println("Ahora toca tirar la moneda");
				System.out.println("si sale 1(CARA) Gana la Seleccion: "+grupoA.get(0)+"si sale 2(CRUZ) gana la Seleccion de: "+grupoB.get(1));
				p=(int)(Math.random()*2+1);
				if (p==1) {
					System.out.println("Salio "+p+" Pasa a Cuartos de Final: "+grupoA.get(0));
					cuartos.add(grupoA.get(0));
				} else {
					System.out.println("Salio "+p+" Pasa a Cuartos de Final: "+grupoB.get(1));
					cuartos.add(grupoB.get(1));
				} 				
				int p2;
				System.out.println("Ahora toca tirar la moneda");
				System.out.println("si sale 1(CARA) Gana la Seleccion: "+grupoB.get(0)+"si sale 2(CRUZ) gana la Seleccion de: "+grupoA.get(1));
				p2=(int)(Math.random()*2+1);
				if (p2==1) {
					System.out.println("Salio "+p2+" Pasa a Cuartos de Final: "+grupoB.get(0));
					cuartos.add(grupoB.get(0));
				} else {
					System.out.println("Salio "+p2+" Pasa a Cuartos de Final: "+grupoA.get(1));
					cuartos.add(grupoA.get(1));
				}
				int p3;
				System.out.println("Ahora toca tirar la moneda");
				System.out.println("si sale 1(CARA) Gana la Seleccion: "+grupoC.get(0)+"si sale 2(CRUZ) gana la Seleccion de: "+grupoD.get(1));
				p3=(int)(Math.random()*2+1);
				if (p3==1) {
					System.out.println("Salio "+p3+" Pasa a Cuartos de Final: "+grupoC.get(0));
					cuartos.add(grupoC.get(0));
				} else {
					System.out.println("Salio "+p3+" Pasa a Cuartos de Final: "+grupoD.get(1));
					cuartos.add(grupoD.get(1));
				}
				int p4;
				System.out.println("Ahora toca tirar la moneda");
				System.out.println("si sale 1(CARA) Gana la Seleccion: "+grupoD.get(0)+"si sale 2(CRUZ) gana la Seleccion de: "+grupoC.get(1));
				p4=(int)(Math.random()*2+1);
				if (p4==1) {
					System.out.println("Salio "+p4+" Pasa a Cuartos de Final: "+grupoD.get(0));
					cuartos.add(grupoD.get(0));
				} else {
					System.out.println("Salio "+p4+" Pasa a Cuartos de Final: "+grupoC.get(1));
					cuartos.add(grupoC.get(1));
				}
				int p5;
				System.out.println("Ahora toca tirar la moneda");
				System.out.println("si sale 1(CARA) Gana la Seleccion: "+grupoE.get(0)+"si sale 2(CRUZ) gana la Seleccion de: "+grupoF.get(1));
				p5=(int)(Math.random()*2+1);
				if (p5==1) {
					System.out.println("Salio "+p5+" Pasa a Cuartos de Final: "+grupoE.get(0));
					cuartos.add(grupoE.get(0));
				} else {
					System.out.println("Salio "+p5+" Pasa a Cuartos de Final: "+grupoF.get(1));
					cuartos.add(grupoF.get(1));
				}
				int p6;
				System.out.println("Ahora toca tirar la moneda");
				System.out.println("si sale 1(CARA) Gana la Seleccion: "+grupoF.get(0)+"si sale 2(CRUZ) gana la Seleccion de: "+grupoE.get(1));
				p6=(int)(Math.random()*2+1);
				if (p6==1) {
					System.out.println("Salio "+p6+" Pasa a Cuartos de Final: "+grupoF.get(0));
					cuartos.add(grupoF.get(0));
				} else {
					System.out.println("Salio "+p6+" Pasa a Cuartos de Final: "+grupoE.get(1));
					cuartos.add(grupoE.get(1));
				}	
				int p7;
				System.out.println("Ahora toca tirar la moneda");
				System.out.println("si sale 1(CARA) Gana la Seleccion: "+grupoG.get(0)+"si sale 2(CRUZ) gana la Seleccion de: "+grupoH.get(1));
				p7=(int)(Math.random()*2+1);
				if (p7==1) {
					System.out.println("Salio "+p7+" Pasa a Cuartos de Final: "+grupoG.get(0));
					cuartos.add(grupoG.get(0));
				} else {
					System.out.println("Salio "+p7+" Pasa a Cuartos de Final: "+grupoH.get(1));
					cuartos.add(grupoH.get(1));
				}
				int p8;
				System.out.println("Ahora toca tirar la moneda");
				System.out.println("si sale 1(CARA) Gana la Seleccion: "+grupoH.get(0)+"si sale 2(CRUZ) gana la Seleccion de: "+grupoG.get(1));
				p8=(int)(Math.random()*2+1);
				if (p8==1) {
					System.out.println("Salio "+p8+" Pasa a Cuartos de Final: "+grupoH.get(0));
					cuartos.add(grupoH.get(0));
				} else {
					System.out.println("Salio "+p8+" Pasa a Cuartos de Final: "+grupoG.get(1));
					cuartos.add(grupoG.get(1));
				}								
			}			
			public static void Cuartos(LinkedList<Seleccion> Clasificados, LinkedList<Seleccion> cuartos, LinkedList<Seleccion> semi ) {
			System.out.println("Los paises clasificados a Cuartos de Final son: ");
			System.out.println(cuartos);
			System.out.println("A continuacion ingresara los ganadores de cada cruce: ");			
			int pc;
			System.out.println("Ahora toca tirar la moneda");
			System.out.println("si sale 1(CARA) Gana la Seleccion: "+cuartos.get(0)+"si sale 2(CRUZ) gana la Seleccion de: "+cuartos.get(1));
			pc=(int)(Math.random()*2+1);
			if (pc==1) {
				System.out.println("Salio "+pc+" Pasa a Semi-Final: "+cuartos.get(0));
				semi.add(cuartos.get(0));
			} else {
				System.out.println("Salio "+pc+" Pasa a Semi-Final: "+cuartos.get(1));
				semi.add(cuartos.get(1));
			}
			int pc2;
			System.out.println("Ahora toca tirar la moneda");
			System.out.println("si sale 1(CARA) Gana la Seleccion: "+cuartos.get(2)+"si sale 2(CRUZ) gana la Seleccion de: "+cuartos.get(3));
			pc2=(int)(Math.random()*2+1);
			if (pc2==1) {
				System.out.println("Salio "+pc2+" Pasa a Semi-Final: "+cuartos.get(2));
				semi.add(cuartos.get(2));
			} else {
				System.out.println("Salio "+pc2+" Pasa a Semi-Final: "+cuartos.get(3));
				semi.add(cuartos.get(3));
			}	
			int pc3;
			System.out.println("Ahora toca tirar la moneda");
			System.out.println("si sale 1(CARA) Gana la Seleccion: "+cuartos.get(4)+"si sale 2(CRUZ) gana la Seleccion de: "+cuartos.get(5));
			pc3=(int)(Math.random()*2+1);
			if (pc3==1) {
				System.out.println("Salio "+pc3+" Pasa a Semi-Final: "+cuartos.get(4));
				semi.add(cuartos.get(4));
			} else {
				System.out.println("Salio "+pc3+" Pasa a Semi-Final: "+cuartos.get(5));
				semi.add(cuartos.get(5));
			}
			int pc4;
			System.out.println("Ahora toca tirar la moneda");
			System.out.println("si sale 1(CARA) Gana la Seleccion: "+cuartos.get(6)+"si sale 2(CRUZ) gana la Seleccion de: "+cuartos.get(7));
			pc4=(int)(Math.random()*2+1);
			if (pc4==1) {
				System.out.println("Salio "+pc4+" Pasa a Semi-Final: "+cuartos.get(6));
				semi.add(cuartos.get(6));
			} else {
				System.out.println("Salio "+pc4+" Pasa a Semi-Final: "+cuartos.get(7));
				semi.add(cuartos.get(7));
			}			
			}						
			public static void SemiFinal(LinkedList<Seleccion> Clasificados, LinkedList<Seleccion> semi, LinkedList<Seleccion> Final) {
			System.out.println("Los paises clasificados a la SemiFinal del Mudnial son: ");
			System.out.println(semi);
			
			System.out.println("A continuacion ingresara los ganadores de cada cruce: ");
			int ps;
			System.out.println("Ahora toca tirar la moneda");
			System.out.println("si sale 1(CARA) Gana la Seleccion: "+semi.get(0)+"si sale 2(CRUZ) gana la Seleccion de: "+semi.get(1));
			ps=(int)(Math.random()*2+1);
			if (ps==1) {
				System.out.println("Salio "+ps+" Pasa a la Final: "+semi.get(0));
				Final.add(semi.get(0));
			} else {
				System.out.println("Salio "+ps+" Pasa a la Final: "+semi.get(1));
				Final.add(semi.get(1));
			}
			int ps2;
			System.out.println("Ahora toca tirar la moneda");
			System.out.println("si sale 1(CARA) Gana la Seleccion: "+semi.get(2)+"si sale 2(CRUZ) gana la Seleccion de: "+semi.get(3));
			ps2=(int)(Math.random()*2+1);
			if (ps2==1) {
				System.out.println("Salio "+ps2+" Pasa a la Final: "+semi.get(2));
				Final.add(semi.get(2));
			} else {
				System.out.println("Salio "+ps2+" Pasa a la Final: "+semi.get(3));
				Final.add(semi.get(3));
			}
			}			
			public static void Final(LinkedList<Seleccion> Clasificados, LinkedList<Seleccion> Final) {
			System.out.println("Los paises clasificados a la Final del Mudnial son: ");
			System.out.println(Final);		
			System.out.println("A continuacion ingresara los ganadores de cada cruce: ");
			int pf;
			System.out.println("Ahora toca tirar la moneda");
			System.out.println("si sale 1(CARA) Gana la Seleccion: "+Final.get(0)+"si sale 2(CRUZ) gana la Seleccion de: "+Final.get(1));
			pf=(int)(Math.random()*2+1);
			if (pf==1) {
				System.out.println("Salio "+pf+" Gana el Mundial Qatar 2022 : "+Final.get(0));
			} else {
				System.out.println("Salio "+pf+" Gana el Mundial Qatar 2022 : "+Final.get(1));
			}			
			}		
	}