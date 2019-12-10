package notas;

import java.util.Scanner;

public class Notas {
	static Scanner sc= new Scanner(System.in);

	public static void main(String[] args) {
		int array[]= new int [5];
		System.out.println("Introduce las notas de cinco alumnos");
		array = solicitarNotas();
		System.out.println("El numero de aprobados es :"+calcularAprobados(array));
		System.out.println("La nota media es: "+ notaMedia(array));
		ordenar(array);
		listarNotas(array);
	}
	public static int[] solicitarNotas() {
		int notas[]= new int [5] ;
		int nota = 0;
		int i=0;
		boolean valido=false;
		while(i!=5) {
			System.out.println("Introduce la nota del alumno:");
		
			nota = sc.nextInt();
			if(nota>0 && nota<=10) {
				notas[i]=nota;
				i++;
			}
			else {
				System.out.println("Nota incorrecta");
				
			}
		}
		return notas;
		
	}
	public static int calcularAprobados(int [] array) {
		int aprobados= 0;
		for (int i:array) {
			if (i>=5) {
				aprobados++;
			}
		}
		return aprobados;
		
	}
	public static int notaMedia(int []array) {
		int sum = 0;
		for (int i = 0;i< array.length;i++) {
			sum= sum + array[i];
		}
		return sum/array.length; 
	}
	public static void  ordenar(int []array) {
		int aux = 0;
		for (int i=0;i<array.length;i++) {
			for (int j=i+1;j<array.length;j++) {
				if(array[j]>array[i]) {
					aux = array[i];
					array[i]=array[j];
					array[j]=aux;
				}
					
			}
		}
		
		
	}
	
	
	public static void listarNotas(int [] array) {
		System.out.println("Estas son las notas");
		for (int i = 0;i< array.length;i++) {
			System.out.println(array[i]);
		}
	}

}
