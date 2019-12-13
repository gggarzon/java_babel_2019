package test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import service.CiudadesService;

public class TestCiudades {
	static CiudadesService cService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		cService = new CiudadesService();
	}

	@Test
	public void testCiudadTemperaturaMaxima() {
		assertEquals("La ciudad no corresponde", "Badajoz", cService.ciudadTemperaturaMaxima().getNombre());		
	}

	@Test
	public void testCiudadMayorHabitantes() {
		assertEquals("Valor incorrecto", 1 , cService.ciudadMayorHabitantes(100000));
	}

	@Test
	public void testCiudadesEntreHabitantes() {
		assertEquals("Valor incorrecto", 1 , cService.ciudadesEntreHabitantes(100000,500000).length);
	}

}
