/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexões;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author gustavo.pinho
 */
public class tilapia {
    public static void main (String[] args){
        Connection conTilapita = null;
        try {
        Connection conTilapia = ConnectionProvider.getCon();
        Statement sTilapia = conTilapia.createStatement();
        sTilapia.executeUpdate("create table Users( id int AUTO_INCREMENT primary key, nome varchar(200), senha varchar(200) )");
             JOptionPane.showMessageDialog(null, "feito tlgd?");
        conTilapia.close();
        sTilapia.close();
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
        }
        
     }
        
    
}
