package principal;

import java.util.ArrayList;
import java.util.Scanner;

import model.Pedido;

public class Facturacion {
	static Scanner sc = new Scanner(System.in);
	static ArrayList <Pedido> pedidos = new ArrayList<>(5);
	public static void main(String[] args) {
		System.out.println("Introduce datos del pedido:");
		datos();
		facturacion();
	}
		public static void datos() {
			String nombre;
			String unidades;
			String precio;
			for(int i = 0; i<2;i++ ) {
				System.out.println("Introduce el nombre del producto:");
				nombre = sc.nextLine();
				System.out.println("Introduce unidades:");
				unidades= sc.nextLine();
				System.out.println("Introduce el precio");
				precio = sc.nextLine();
				
				int unidades2 = Integer.parseInt(unidades);
				double precio2 = Double.parseDouble(precio);
				pedidos.add(new Pedido(nombre,unidades2,precio2));
			}
	}
		public static void facturacion() {
			double suma = 0;
			
			for (int i=0; i <pedidos.size();i++) {
				suma = suma + (pedidos.get(i).getPrecio() * pedidos.get(i).getUnidades());
			}
			
			System.out.println("La facturacion es: "+ suma);
		}

}
