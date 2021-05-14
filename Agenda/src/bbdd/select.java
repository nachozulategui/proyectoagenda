import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

class Select {
  public static void main(String[] args) {

    String tabla = "Usuarios";

    try {
      Connection conexion = conectar();
      Statement consulta = conexion.createStatement();

      String sentencia = "SELECT * FROM "+tabla+";";

      ResultSet resultados = consulta.executeQuery(sentencia);
      
      while(resultados.next()){
        int id = resultados.getInt("id");
        String nombre = resultados.getString("nombre");
        String password = resultados.getString("password");
        System.out.println(id+". "+nombre+" --> "+password);
      }

    }catch(SQLException e){
      System.out.println("Error: " + e.getMessage());
      e.printStackTrace();
    }

  }

  public static Connection conectar(){
    Connection conexion = null;
    String timeZone = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    String dbName = "Y9axiNCQbQ";
    String host = "remotemysql.com";
    int port = 3306;
    String url = "jdbc:mysql://" + host + ":" + port + "/" + dbName + timeZone;
    String user = "Y9axiNCQbQ";
    String pass = "QspPoK97OC";
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
