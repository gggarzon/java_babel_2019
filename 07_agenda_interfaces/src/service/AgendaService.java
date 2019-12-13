package service;

import model.Contacto;

public interface AgendaService {

	boolean agregarContacto(Contacto c);

	Contacto buscarContacto(String email);

	void eliminarContacto(String email);

	Contacto[] devolverContactos();

}