package service;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import model.Contacto;
public class AgendaServiceImpl implements AgendaService {
	private HashMap <String, Contacto> agenda;
	
	@Override
	public boolean agregarContacto (Contacto c) {
		boolean exito = false;
		
		if (!agenda.containsKey(c)) {
			agenda.put(c.getEmail(), c);
			exito = true;
		}
		return exito;
	}
	@Override
	public Contacto buscarContacto(String email) {
		return agenda.get(email);
	}
	
	@Override
	public void eliminarContacto(String email) {
		if (!agenda.containsKey(email)) {
			agenda.remove(email);
		}
	}
	
	@Override
	public List<Contacto> devolverContactos() {
		return null;
	}

}
