package service;

public class AgendaFactory {
	public static AgendaService getAgendaService() {
		return new AgendaServiceImpl();
	}

}
