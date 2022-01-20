
package base_de_donnée;


public class Param_de_connection {
    
    public static String ADDRESS_IP = "127.0.0.1";
    public static String ADDRESS_DB = "jdbc:mysql://" + ADDRESS_IP + ":3306/e_assoc_bdd";//notre base de donnée en fonction du logiciel utilisé
    public static String USERNAME_DB = "root";
    public static String PASSWORD_DB = "";//"root"
    
    public static int PORT = 11111;
    public static String USER;
}

