package service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import model.Ciudad;

public class CiudadesService {
	private List <Ciudad> ciudades;
	public CiudadesService() {
		ciudades = new ArrayList <>();
		ciudades.add(new Ciudad("Avila",80000,20.2));
		ciudades.add(new Ciudad("Madrid",100001,21.4));
		ciudades.add(new Ciudad("Barcelona",90000,17.2));
		ciudades.add(new Ciudad("Valencia",80000,20.2));
		ciudades.add(new Ciudad("Badajoz",80400,23.5));
		ciudades.add(new Ciudad("Avila",82300,14.5));
		ciudades.add(new Ciudad("Inventada",1000,12.3));


	}
	
	public Ciudad ciudadTemperaturaMaxima() {
		return ciudades.stream()
		.max((a,b)->a.getTemp()>b.getTemp()?1:-1).get();
	}
	
	// devuelve numero de ciudades que superen los indicados
	public int ciudadMayorHabitantes(int hab) {
		return (int) ciudades.stream()
				.filter(t->t.getHabitantes()>hab)
				.count();
	}
	//devuelve lista con ciudades cuya temperatura sea superior al indicado
	public List <Ciudad> ciudadesMayorTemperatura (double temp){
		return ciudades.stream()
		.filter(t->t.getTemp()>temp)
		.collect(Collectors.toList());
	}
	
	public double temperaturaMedia() {
		return ciudades.stream()
				.mapToDouble(t->t.getTemp())
				.average()
				.getAsDouble();
	}
	
	// devuelve array con los nombres de todas las ciduades cuyos habitantes esten entre el rango indicado
	public String[] ciudadesEntreHabitantes (int a,int b) {
		return  ciudades.stream()
				.filter(t->t.getHabitantes()>=a && t.getHabitantes()<=b)
				.map(t->t.getNombre().toString())
				.toArray(t->new String[t]);
	}
	

}
