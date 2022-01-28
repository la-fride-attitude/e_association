/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Frida
 */
public class insertioncompte {
    
    private  int num_compte;
    private  double cp;
    private  double ce;
    private  double cs;
    private  double cr;
    private  double ct;
    private  double cd;
    
    insertioncompte(int num_compte){
        this.num_compte = num_compte;
        this.cp = 0;
        this.ce = 0;
        this.cs = 0;
        this.cr = 0;
        this.ct = 0;
        this.cd = 0;
        
    }
    void connection(){
        java.sql.Connection connection = null;
        String host="localhost";
        String port="5433";
        String db_name="test";
        String username="postgres";
        String password="root";
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://"+host+":"+port+"/"+db_name+"", ""+username+"", ""+password+"");
            PreparedStatement add = connection.prepareStatement("INSERT INTO compte(num_compte,montant_principale,montant_epargne,montant_secours,montant_ration,montant_transport,montant_developpement) VALUES(?,?,?,?,?,?,?)");
                     add.setInt(1, this.num_compte);
                    
                     add.setDouble(2, this.cp) ;
                 
                     add.setDouble(3, this.ce);
                     add.setDouble(4, this.cs);
                     add.setDouble(5, this.cr);
                     add.setDouble(6, this.ct);
                     add.setDouble(7, this.cd);
                     
                    int r = add.executeUpdate();
                     
                     if(r>0){
                     System.out.print("entrer 1");
                     
                 }
                     connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
