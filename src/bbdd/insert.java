
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	class Insert {
	  public static void main(String[] args) {

	    String nombre = "Juanito";
	    String password = "1234qwer";

	    try {
	      Connection conexion = conectar();
	      Statement consulta = conexion.createStatement();

	      String sentencia = "INSERT INTO Usuarios(NOMBRE, PASSWORD) VALUES ('"+nombre+"', '"+password+"');";

	      consulta.executeUpdate(sentencia);
	      System.out.println("Done.");
	    }catch(SQLException e){
	      System.out.println("Error: " + e.getMessage());
	      e.printStackTrace();
	    }

	  }

	  public static Connection conectar(){
	    Connection conexion = null;
	    String timeZone = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	    String dbName = "ventas";
	    String host = "localhost";
	    int port = 3306;
	    String url = "jdbc:mysql://" + host + ":" + port + "/" + dbName + timeZone;
	    String user = "admin";
	    String pass = "12341234";
	    String driver = "com.mysql.cj.jdbc.Driver";

	    try {
	      Class.forName(driver);
	      conexion = DriverManager.getConnection(url, user, pass);
	      System.out.println("Base de datos " + dbName + " situada en :\n "+url);
	    }catch(ClassNotFoundException | SQLException e){
	      System.out.println("Error: " + e.getMessage());
	      e.printStackTrace();
	    }

	    return conexion;
	  }
	}


