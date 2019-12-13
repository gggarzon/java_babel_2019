package service;
import java.util.Collection;
import java.util.Arrays;
import java.util.HashMap;

import model.Contacto;
public class AgendaService {
	private HashMap <String, Contacto> agenda;
	
	public AgendaService() {
		agenda= new HashMap <>();
	}
	public boolean agregarContacto (Contacto c) {
		boolean ex = false;
		if (!agenda.containsKey(c.getEmail())) {
			agenda.put(c.getEmail(), c);
			ex = true;
		}
		return ex;
	}
	public Contacto buscarContacto(String email) {
		return agenda.get(email);
	}
	
	public void eliminarContacto(String email) {
		if (!agenda.containsKey(email)) {
			agenda.remove(email);
		}
	}
	
	public Contacto[] devolverContactos() {
		Contacto [] completo = agenda.values().toArray(new Contacto[0]);
		Arrays.sort(completo,(a,b)->a.getEdad()-b.getEdad()); //ordenamos de menor a mayor el array completo, aqui hay dos parametro
																// un parametro con el array y otro con la expresion lambda
		return completo;
		
	}

}
