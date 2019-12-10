package principal;

import java.util.ArrayList;
import java.util.Scanner;

import model.Pedido;

public class Facturacion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList <Pedido> pedidos = new ArrayList<>();
		String nombre;
		String unidades;
		String precio;
		for(int i = 0; i<pedidos.size();i++ ) {
			System.out.println("Introduce el nombre del producto:");
			nombre = sc.nextLine();
			System.out.println("Introduce unidades:");
			unidades= sc.nextLine();
			System.out.println("Introduce el precio");
			precio = sc.nextLine();
			
			pedidos.add(new Pedido(nombre,unidades,precio));
		}
	}
		public void facturacion(Arraylist <Pedido> pedidos) {
			
	}

}
