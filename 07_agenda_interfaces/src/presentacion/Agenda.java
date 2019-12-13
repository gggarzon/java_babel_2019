package presentacion;

import java.util.Scanner;

import model.Contacto;
import service.AgendaFactory;
import service.AgendaService;
import service.AgendaServiceImpl;


public class Agenda {

	public static void main(String[] args) {
		System.out.println("MENU");	
		mostrarMenu();
	}
	
	public static void mostrarMenu() {
		AgendaService gestor = new AgendaServiceImpl();
		int r = 0;
		Scanner sc = new Scanner (System.in);
		do {
		System.out.println("1.- Aniadir contacto");
		System.out.println("2.- Buscar contacto");
		System.out.println("3.- Eliminar contacto");
		System.out.println("4.- Mostrar contacto");
		System.out.println("5.- Salir");
		r = Integer.parseInt(sc.nextLine());
		switch(r) {
		case 1: Contacto c = pedirContacto();
			if(gestor.agregarContacto(c))
				System.out.println("EXITO");
			else {
				System.out.println("NO EXISTE");
			}
			break;
		case 2: 
			if(gestor.buscarContacto(sc.nextLine())!=null) {
				System.out.println("Contacto encontrado");
			}
			else {
				System.out.println("No se ha encontrado el contacto");
			}
			break;
		case 3:
			System.out.println("Indica el email del contacto");
			gestor.eliminarContacto(sc.nextLine());
			System.out.println("Contacto eliminado");
			break;
			
		case 4:
			monstrarContacto(gestor.devolverContactos());
			break;
		case 5:
			
			System.out.println("Saliendo del menu....");
			break;
			
		}
		} while (r!=5);
			
	}

	private static void monstrarContacto(Contacto[] devolverContactos) {
		Contacto [] contacts = devolverContactos;
		for (int i = 0; i<devolverContactos.length;i++) {
			System.out.println("Contacto numero "+i+":");
			System.out.println(devolverContactos[i].getNombre());
			System.out.println(devolverContactos[i].getEmail());
			System.out.println(devolverContactos[i].getEdad());
			System.out.println();
		}
	}

	private static Contacto pedirContacto() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce datos del contacto");
		System.out.println("Nombre: ");
		String name = sc.nextLine();
		System.out.println("Email: ");
		String em = sc.nextLine();
		System.out.println("Edad: ");
		int edad = Integer.parseInt(sc.nextLine());
		Contacto c = new Contacto(name,em,edad);
		return c;
	}
	

}
