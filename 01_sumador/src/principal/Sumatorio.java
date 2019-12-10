package principal;

public class Sumatorio {
	//intentar no sobrecargar main

	public static void main(String[] args) {
		int a = 50;
		int b = 16;
		int menor = buscarMenor(a,b);
		int mayor = buscarMayor(a,b);
		System.out.println("La suma de pares es: "+ sumaPares(menor,mayor));
	}
	
	public static int buscarMenor (int a,int b) {
		return a>b?b:a;
		
	}
	public static int buscarMayor(int a, int b) {
		return a>b?a:b;
	}
	public static int sumaPares (int menor, int mayor) {
	int suma = 0;
	for (int i = menor; i <= mayor; i ++) {
		if ( i % 2 == 0) {
			suma = suma + i;
		}
	}
	return suma;
	}

}
