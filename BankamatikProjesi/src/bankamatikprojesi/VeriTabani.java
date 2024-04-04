package bankamatikprojesi;

import java.sql.*;

public class VeriTabani {
    
    Connection c;
    Statement s;
    public VeriTabani(){
    
        try {
            c=DriverManager.getConnection("jdbc:mysql://localhost:3307/bankamatiksistemi", "root", "sifreniz");
            s=c.createStatement(); //Statement sınıfı, SQL ifadelerini yürütmek ve veritabanı ile iletişim kurmak için kullanılır
            
            
        
        }catch (Exception e){
            System.out.println(e);
        }
    
    
    }
    
}
