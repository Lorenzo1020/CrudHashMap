package Main;

import java.util.Scanner;

import Implementacion.LogicaMetodos;
import Model.Libros;

public class Principal {
	public static void main(String[] args) {
		// Declarar las variables
		Scanner lectura = null;

		String clave;
		String titulo; // Este sera nuestra llave para el hashMap
		int numPag;
		String autor;

		Libros libro;

		int menuPrinci, subMenu;

		LogicaMetodos imp = new LogicaMetodos();

		System.out.println("Modificando este proyecto");
		int edad = 10;

		do {
			System.out.println("BIENVENIDO AL MENU");
			System.out.println("1---ALTA");
			System.out.println("2---MOSTRAR");
			System.out.println("3--BUSCAR");
			System.out.println("4--EDITAR");
			System.out.println("5---ELIMINAR");
			System.out.println("6---SALIR");

			lectura = new Scanner(System.in);
			menuPrinci = lectura.nextInt();

			switch (menuPrinci) {
			case 1:
				System.out.println("Ingrese la clave");
				lectura = new Scanner(System.in);
				clave = lectura.nextLine();

				System.out.println("Ingrese el titulo");
				lectura = new Scanner(System.in);
				titulo = lectura.nextLine();

				System.out.println("Ingrese numero de paginas");
				lectura = new Scanner(System.in);
				numPag = lectura.nextInt();

				System.out.println("Ingrese el autor");
				lectura = new Scanner(System.in);
				autor = lectura.nextLine();

				// Crear el objeto
				libro = new Libros(clave, titulo, numPag, autor);

				// Guardar
				imp.guardar(libro);
				System.out.println("Se guardo");

				break;
			case 2:
				imp.mostrar();
				break;
			case 3:

				System.out.println("Ingrese la clave");
				lectura = new Scanner(System.in);
				clave = lectura.nextLine();

				// Buscar
				libro = imp.buscar(clave);
				System.out.println("Se encontro el registro " + libro);
				break;
			case 4:

				System.out.println("Ingrese la clave");
				lectura = new Scanner(System.in);
				clave = lectura.nextLine();

				// Buscar
				libro = imp.buscar(clave);
				System.out.println("Se encontro el registro " + libro);

				// Se puede actualizar cuaquier atributo del objeto menos la llave
				do {
					System.out.println("SUB MENU");
					System.out.println("1----TITULO");
					System.out.println("2---NUM. PAGINAS");
					System.out.println("3---REGRESAR");
					lectura = new Scanner(System.in);
					subMenu = lectura.nextInt();

					switch (subMenu) {
					case 1:
						System.out.println("Ingrese el nuevo titulo");
						lectura = new Scanner(System.in);
						titulo = lectura.nextLine();

						// Actualizacion
						libro.setTitulo(titulo);
						imp.editar(libro);
						System.out.println("Se edito");
						break;
					case 2:
						System.out.println("Ingrese el nuevo num paginas");
						lectura = new Scanner(System.in);
						numPag = lectura.nextInt();

						// Actualizacion
						libro.setNumPag(numPag);
						imp.editar(libro);
						System.out.println("Se edito");
						break;
					case 3:
						break;
					}

				} while (subMenu < 3);
				break;
			case 5:
				System.out.println("Ingrese la clave");
				lectura = new Scanner(System.in);
				clave = lectura.nextLine();

				// Eliminacion
				imp.eliminar(clave);
				System.out.println("Se elimino con exito");
				break;
			case 6:
				break;
			}
		} while (menuPrinci < 6);

	}

}
