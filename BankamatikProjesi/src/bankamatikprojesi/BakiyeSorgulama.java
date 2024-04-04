
package bankamatikprojesi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BakiyeSorgulama extends JFrame implements ActionListener{
    
    JButton back;
    String pinnumber;
    
    BakiyeSorgulama(String pinnumber){
        this.pinnumber=pinnumber;
        
        setLayout(null);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("gorsel/CASH.png"));
        Image i2= i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        
        back= new JButton("GERİ");
        back.setBounds(190,510,130,30);
        back.setBackground(Color.WHITE);
        back.addActionListener(this);
        image.add(back);
        
        
        VeriTabani c= new VeriTabani();
        int bakiye = 0;
            try{
                ResultSet tl= c.s.executeQuery("select * from bank where pin= '"+pinnumber+"'");
                
                while(tl.next()){
                    if(tl.getString("type").equals("ParaYatir")){
                        bakiye += Integer.parseInt(tl.getString("tutar"));
                     } else {
                        bakiye -= Integer.parseInt(tl.getString("tutar"));
                    }
                }
                     }catch(Exception e){
                         System.out.println(e);
                             }
                             
                             
        JLabel text= new JLabel("Şu Anki Mevcut Bakiyeniz: " + bakiye);
        text.setForeground(Color.WHITE);
        text.setBounds(170,300,400,30);
        text.setFont( new Font("Verdana", Font.BOLD ,18));
        image.add(text);
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Islemler(pinnumber).setVisible(true);
    }
    
     public static void main(String args[]){
     
        new BakiyeSorgulama("");
    }
}
