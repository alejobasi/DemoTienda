package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class GestionDBTienda {
    private static GestionDBTienda instancia;
    private Connection connection;

    private static String DB_URL="jdbc:mysql://localhost:3306/tienda";
    private static String DB_USER="root";
    private static String DB_PASS="root";
    private GestionDBTienda(){
        try {
            System.out.println("Cargando Driver...");
            Class.forName("com.mysql,cj,jbdc.Driver");
            System.out.println("OK!");

            System.out.println("Conectado a la base de datos...");
            connection= DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
            System.out.println("OK!");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static GestionDBTienda getInstance(){
        if (instancia==null){
            instancia=new GestionDBTienda();
        }
        return instancia;
    }
}
