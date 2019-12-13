package principal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class PruebaNio {
	
	public static void main(String [] args) throws IOException {
		String pedido = "vaso";
		Path pt = Paths.get("c:\\Users\\german.gonzalez\\Desktop\\materialcurso\\ficheros\\pedidos.txt");
		Stream <String> pedidos = Files.lines(pt);
		
		System.out.println(pedidos.filter(t->t.equals(pedido))
		.count());
		
	}

}
