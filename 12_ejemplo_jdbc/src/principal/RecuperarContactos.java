package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RecuperarContactos {

	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
		//jdbc:mysql//servidor:puerto/basedatos
		String url = "jdbc:mysql://localhost:3306/agenda2";
		String user = "root";
		String pwd = "root";
		String sql = "SELECT * FROM contactos";
		try {
			Class.forName(driver);
		}catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
			return;
		}
		try (Connection con = DriverManager.getConnection(url, user,pwd);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(sql);
				){
			while (rs.next()) {
				System.out.println(rs.getString("nombre"));
			}
			}
			
			catch(SQLException ex)
			{
				ex.printStackTrace();
			}
		

	}

}
