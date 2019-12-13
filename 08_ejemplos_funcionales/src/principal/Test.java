package principal;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		ArrayList <Integer> numeros = new ArrayList<>();
		
		numeros.add(10);
		numeros.add(50);
		numeros.add(18);
		numeros.add(25);
		numeros.add(6);
		numeros.add(41);
		numeros.add(10);
		numeros.add(4);
		//Ordenacion con expresion lambda
		numeros.sort((a,b)->a-b);
		// numeros.sort((a,b)->b-a); // ordenar al revés mayor a menor
		numeros.removeIf(t->t<25?true:false);
		numeros.replaceAll(e->e*e);
		numeros.forEach((Integer t)->System.out.println(t));
		/*for (int i=0; i<numeros.size();i++) {
			System.out.println(numeros.get(i));
		}
		*/
	}
	

}

/*class Criterio implements Predicate<Integer>{

	@Override
	public boolean test(Integer arg0) {
		if (arg0<25) {
			return true;
		}
		return false;
		//return t<25?true:false;
	}
	
}*/
