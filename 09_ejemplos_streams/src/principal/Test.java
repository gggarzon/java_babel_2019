package principal;

import java.util.stream.*;
public class Test {

	public static void main(String[] args) {
		Stream <Double> stream = Stream.of(1.2,1.2,3.2,8.3, 38.2,25.0);
		//System.out.println("Numeros del stream: "+stream.count());
		// a partir de aqui ya no se puede volver a usar este stream
		//stream.forEach(t->System.out.println(t));
		//System.out.println("Mayor que 25.0: "+ stream.anyMatch(t->t>38.2?true:false));
		//System.out.println(stream.max((a,b)-> a>b?1:-1).get()); // hay que devolver un objeto de tipo Double por eso a>b?1:-1
																// llamamos al metodo get para que no devuelva un objeto Optional
		
		//stream.distinct().forEach(t->System.out.println(t)); // usamos un stream intermedio y otro final PIPELINE
		
		/*
		stream
		.filter(t->t>20)  // esto devuelve un stream
		.forEach(t->System.out.println(t)); //esto es una operacion final
		*/
		
		/*
		stream
		.map(a->a*a)   // ESTE DEVUELVE ALGO
		.forEach(t->System.out.println(t)); //esto es una operacion final
		*/
		
		/*
		stream
		.peek(t->System.out.println(t))  // esta operacion es lazy: SE EJECUTA "EN MEMORIA". 
		.count(); // No sale el resultado de count porque no lo estamos imprimiendo, pero si que sale el resultado de peek.
		*/
		/*
		stream
		.mapToInt(e-> )
		.forEach(t->System.out.println(t));
		*/
		
		Double [] d = stream
		.toArray(t->new Double[t]);
		
		for (int i = 0; i< d.length;i++) {
			System.out.println(d[i]);
		}
	}

}
