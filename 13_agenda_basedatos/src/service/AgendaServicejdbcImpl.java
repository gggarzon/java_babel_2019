package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Contacto;

public class AgendaServicejdbcImpl implements AgendaService {
	private static final String driver = "com.mysql.jdbc.Driver";
	//jdbc:mysql//servidor:puerto/basedatos
	private static final String url = "jdbc:mysql://localhost:3306/agenda2";
	private static final String user = "root";
	private static final String pwd = "root";
	static { //esto solo se ejecuta una vez en la vida de la clase
		try {
			Class.forName(driver);
		}catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
	}
	
	@Override
	public boolean agregarContacto(Contacto c) {
		boolean exito = false;
		try (Connection con = DriverManager.getConnection(url, user,pwd)){
			String sql = "INSERT INTO contactos (nombre,email,edad) VALUES ('"+c.getNombre()+"','"+c.getEmail()+"',"+c.getEdad()+")";
			Statement st = con.createStatement();
			st.execute(sql);
			exito = true;
			}
			
			catch(SQLException ex)
			{
				ex.printStackTrace();
			}
		return exito;
	}

	@Override
	public Contacto buscarContacto(String email) {
		Contacto c= new Contacto(" ", " ", 0);
		Boolean exito=false;
		try (Connection con = DriverManager.getConnection(url, user,pwd)){
			String sql = "SELECT * FROM contactos WHERE email='"+email+"'";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if (rs.next()) {
				c.setNombre(rs.getString("nombre"));
				c.setEmail(rs.getString("email"));
				c.setEdad(rs.getInt("edad"));
				exito = true;

			}
			}
			
			catch(SQLException ex)
			{
				ex.printStackTrace();
			}
		if (exito) {
			return c;
		}
		else {
			return null;
		}
		

	}

	@Override
	public void eliminarContacto(String email) {
		try (Connection con = DriverManager.getConnection(url, user,pwd)){
			String sql = "DELETE FROM contactos WHERE email='"+email+"'";
			Statement st = con.createStatement();
			st.execute(sql);
			}
			catch(SQLException ex)
			{
				ex.printStackTrace();
			}
	}

	@Override
	public List<Contacto> devolverContactos() {
		List <Contacto> contactos = new ArrayList<>();
		Boolean exito=false;
		try (Connection con = DriverManager.getConnection(url, user,pwd)){
			String sql = "SELECT * FROM contactos";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Contacto c= new Contacto(rs.getString("nombre"),rs.getString("email"), rs.getInt("edad"));
				contactos.add(c);
			}
			exito = true;
			}
			
			catch(SQLException ex)
			{
				ex.printStackTrace();
			}
		if (exito) {
			return contactos;
		}
		else {
			return null;
		}
}
}