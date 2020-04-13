/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INTELAMD
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class koneksibarang {
    public Connection bukakoneksi(){
      Connection con=null;
      try{
          Class.forName("com.mysql.jdbc.Driver");
          con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/dbbarang","root","");
          System.out.println("Berhasil");
          return con;
          }
          catch (Exception e){
          System.out.println("Gagal");
          return null;
          }
  }
  public static void main(String args[]){
      new koneksibarang().bukakoneksi();   
  }     
    
}
