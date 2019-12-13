package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class TestContactos {

	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
		//jdbc:mysql//servidor:puerto/basedatos
		String url = "jdbc:mysql://localhost:3306/agenda2";
		String user = "root";
		String pwd = "root";
		try {
			Class.forName(driver);
		}catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
			return;
		}
		try (Connection con = DriverManager.getConnection(url, user,pwd)){
		// carga del driver
		//Class.forName(driver); //no usamos el new para que mi codigo no este vinculado a esa clase.
		//establecer conexion con al base de datos
		//Connection con = DriverManager.getConnection(url, user,pwd);
		// definimos instrucciosnes sql
		String sql = "INSERT INTO contactos (nombre,email,edad) VALUES ('profe','aaaa@google.es',22)";
		//ejecutar instruccion
		Statement st = con.createStatement();
		st.execute(sql);
		//cerrar la conexion
		//con.close();   // ESTA SENTENCIA CUANDO DA ERROR; LA Base de datos podria quedar abierta!!!, la solucion es try con recursos
						// con el try con recursos no hace falta la sentencia close().
		System.out.println("CONTACTO AÑADIDO");
		}
		
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		/*
		 finally {
		 	if (con!=null){
		 		con.close();
		 	}
		 }
		 */
		
		
		/*
		 catch (ClassNotFoundException|SQLException ex){    MULTICATCH
		 	ex.printStackTrace();
		 }
		 */
	}

}
