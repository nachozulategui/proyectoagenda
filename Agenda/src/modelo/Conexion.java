package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	public static void main(String[] args) {
		String timeZone = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String dbName = "ventas";
		String url = "jdbc:mysql://localhost:3306/" + dbName + timeZone;
		String user = "admin";
		String pass = "12341234";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		try {
	           Class.forName(driver) ;
	           Connection conexion = DriverManager.getConnection(url, user, pass);
	           System.out.println("Base de datos "+dbName+" situada en :\n "+url);
	        }catch(ClassNotFoundException | SQLException e){
	        	System.out.println("Error en la conexion");
	            e.printStackTrace();
	        }

	}

}
