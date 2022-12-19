package Interfaz;

	import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
	import java.util.Scanner;

import javax.swing.JOptionPane;

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
				grupoD.add(Clasificados.get(14));
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
			
				LinkedList<Seleccion> Apuestas1 = new LinkedList<Seleccion>();
				LinkedList<Seleccion> GGgrupos = new LinkedList<Seleccion>();
				
				
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
			//Scanner entrada = new Scanner(System.in);
				//int m=0;
			//int m=0;
			String m="";
				do {
					//id = 1 contra = 1234
			Encargado encargado1= new Encargado(1,"Pancho",1234);
					Encargado.IngresoEncargado(encargado1);
					Menu1(Estadios,Clasificados, octavos, cuartos, semi, Final, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH, partidos,encargado1,Apuestas1,GGgrupos);
					 m=(String)(JOptionPane.showInputDialog(null,"Ingrese cualquier numero para terminar, ingrese si para volver al menu y continuar"));
					 JOptionPane.showMessageDialog(null, m);
				//System.out.println("Ingrese cualquier letra para terminar, ingrese 9 para volver al menu y continuar");
					//m= entrada.nextInt();
					
				} while (m.equalsIgnoreCase("si"));
			}
		}
		public static void Menu1(LinkedList<Estadio> Estadios,LinkedList<Seleccion> Clasificados, LinkedList<Seleccion> octavos, LinkedList<Seleccion> cuartos,
				LinkedList<Seleccion> semi, LinkedList<Seleccion> Final, LinkedList<Seleccion> grupoA,  LinkedList<Seleccion> grupoB, LinkedList<Seleccion> grupoC,
				LinkedList<Seleccion> grupoD, LinkedList<Seleccion> grupoE, LinkedList<Seleccion> grupoF, LinkedList<Seleccion> grupoG, LinkedList<Seleccion> grupoH,
				LinkedList<Partido> partidos,Encargado encargado1,LinkedList<Seleccion> Apuestas1,LinkedList<Seleccion>GGgrupos) { 
			//Scanner entrada = new Scanner(System.in);
			int a=Integer.parseInt(JOptionPane.showInputDialog(
					"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ "
					+ "\nBienvenido Mundial de Qatar 2022. Encargado= "+encargado1.getNombre()+""
					+ "\nIngrese la opcion que desea conocer "
					+ "\nSi esta entrando por primera vez, vaya elijiengo de menor a mayor. **Muchas Gracias** "
					+ "\n1- Selecciones  y partidos de los grupos "
					+ "\n2- Posiciones de los grupos + resultados de la tabla "
					+ "\n3- ver Octavos de Final "
					+ "\n4- ver Cuartos de Final "
					+ "\n5- ver SemiFinal "
					+ "\n6- ver Final "
					+"\n8 Elija el partido al que desea apostar FASE DE GRUPOS"
					+ "\n7- Salir"
					));
			switch (a) {
			case 1:
				//String op=(String)JOptionPane.showInputDialog("Ingrese el grupo del que desea ver los partidos");
				//JOptionPane.showMessageDialog(null, "Los partidos del grupo " + op + " son: ");
				//String op;
				//System.out.println("Ingrese el grupo del que desea ver los partidos");
				//entrada.nextLine();
				//op = entrada.nextLine();
				//System.out.println("Los partidos del grupo " + op + " son: ");
				/*for (int i = 0; i < partidos.size(); i++) {
					if (partidos.get(i).getPais().getGrupo().equalsIgnoreCase(op)) {
						//JOptionPane.showMessageDialog(null, (partidos.get(i))+"\nMinutos: "+ partidos.get(i).getDuracion()+"\nNumero de partido: "+ 
					    //partidos.get(i).getId()+"\nEstadio del encuentro : "+ (Estadios.get((int)(Math.random()*8)).getNombre()));	
						//System.out.println(partidos.get(i));
						//System.out.println("Minutos: "+partidos.get(i).getDuracion());
						//System.out.println("Numero de partido: "+partidos.get(i).getId());
						//System.out.println("Estadio del encuentro : "+(Estadios.get((int)(Math.random()*8)).getNombre()));
					}
				}*/
				Encargado.Resultados(partidos, Clasificados,GGgrupos);
				Menu1(Estadios,Clasificados, octavos, cuartos, semi, Final, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH, partidos,encargado1,Apuestas1,GGgrupos);
				break;
			case 2:
				//String g="";
				String g=(String)JOptionPane.showInputDialog("Los 2 primeros de cada grupo clasifican a octavos de Final  \n Ingrese el grupo del que desea saber las posiciones");
				//System.out.println("Los 2 primeros de cada grupo clasifican a octavos de Final");		
				//System.out.println("Ingrese el grupo del que desea saber las posiciones");
				//entrada.nextLine();
				//String g = entrada.nextLine();
				JOptionPane.showMessageDialog(null, "La clasificacion del grupo es: ");
				//System.out.println("La clasificacion del grupo es: ");
				switch (g) {
				case "a":
					Encargado.Posiciones(Clasificados, grupoA);
					Menu1(Estadios,Clasificados, octavos, cuartos, semi, Final, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH, partidos,encargado1,Apuestas1,GGgrupos);
					break;
				case "b":
					Encargado.Posiciones(Clasificados, grupoB);		
					Menu1(Estadios,Clasificados, octavos, cuartos, semi, Final, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH, partidos,encargado1,Apuestas1,GGgrupos);
					break;
				case "c":
					Encargado.Posiciones(Clasificados, grupoC);
					Menu1(Estadios,Clasificados, octavos, cuartos, semi, Final, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH, partidos,encargado1,Apuestas1,GGgrupos);
					break;
				case "d":
					Encargado.Posiciones(Clasificados, grupoD);
					Menu1(Estadios,Clasificados, octavos, cuartos, semi, Final, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH, partidos,encargado1,Apuestas1,GGgrupos);
					break;
				case "e":
					Encargado.Posiciones(Clasificados, grupoE);
					Menu1(Estadios,Clasificados, octavos, cuartos, semi, Final, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH, partidos,encargado1,Apuestas1,GGgrupos);
					break;
				case "f":
					Encargado.Posiciones(Clasificados, grupoF);
					Menu1(Estadios,Clasificados, octavos, cuartos, semi, Final, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH, partidos,encargado1,Apuestas1,GGgrupos);
					break;
				case "g":
					Encargado.Posiciones(Clasificados, grupoG);
					Menu1(Estadios,Clasificados, octavos, cuartos, semi, Final, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH, partidos,encargado1,Apuestas1,GGgrupos);
					break;
				case "h":
					Encargado.Posiciones(Clasificados, grupoH);
					Menu1(Estadios,Clasificados, octavos, cuartos, semi, Final, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH, partidos,encargado1,Apuestas1,GGgrupos);	
					break;

				default:
					JOptionPane.showMessageDialog(null, "La letra ingresada fue: "+g+"\nNo existe ningun grupo del mundial con la letra ingresada \nVuelve al Menu");
					//System.out.println("La letra ingresada fue: " + g);
					//System.out.println("No existe ningun grupo del mundial con la letra ingresada");
					//System.out.println("vuelve al menu");
					Menu1(Estadios,Clasificados, octavos, cuartos, semi, Final, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH, partidos,encargado1,Apuestas1,GGgrupos);
					break;
				}
				break;
			case 3:
				Encargado.Octavos(Clasificados, octavos, cuartos, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH);
				Menu1(Estadios,Clasificados, octavos, cuartos, semi, Final, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH, partidos,encargado1,Apuestas1,GGgrupos);
				break;
			case 4:
				Encargado.Cuartos(Clasificados, cuartos, semi);
				Menu1(Estadios,Clasificados, octavos, cuartos, semi, Final, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH, partidos,encargado1,Apuestas1,GGgrupos);
				break;
			case 5:
				Encargado.SemiFinal(Clasificados, semi, Final);
				Menu1(Estadios,Clasificados, octavos, cuartos, semi, Final, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH, partidos,encargado1,Apuestas1,GGgrupos);
				break;
			case 6:
				Encargado.Final(Clasificados, Final);
				break;
			case 7:
				JOptionPane.showMessageDialog(null, "**Hasta luego**");
				//JOptionPane.showConfirmDialog(null, "**Hasta luego**");
				//System.out.println("**Hasta luego**");
				break;
			default:
				break;
			}
		}
		public static void PartidosGrupo(LinkedList<Partido> partidos, LinkedList<Seleccion> Clasificados,int id)  {
			int tot=0;
			Partido partido;
			//String op;				
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

				
	}