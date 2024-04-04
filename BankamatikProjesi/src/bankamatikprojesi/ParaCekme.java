
package bankamatikprojesi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ParaCekme  extends JFrame implements ActionListener{
    
    JTextField tutar;
    JButton withdraw, back;
    String pinnumber;
    ParaCekme(String pinnumber){
        
        this.pinnumber=pinnumber;
    
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("gorsel/CASH.png"));
        Image i2= i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text= new JLabel("Çekmek istediğiniz tutarı giriniz:");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setBounds(200,300,400,20);
        image.add(text);
        
        tutar= new JTextField();
        tutar.setFont(new Font("Verdana",Font.BOLD,22));
        tutar.setBounds(200,350,280,25);
        image.add(tutar);
        
        withdraw= new JButton("Para Çek");
        withdraw.setBounds(355,510,150,30);
        withdraw.addActionListener(this);
        withdraw.setBackground(Color.WHITE);
        image.add(withdraw);
        
        back= new JButton("Geri");
        back.setBounds(165,510,150,30);
        back.addActionListener(this);
        back.setBackground(Color.WHITE);
        image.add(back);
        
        
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()== withdraw){
            String number = tutar.getText();
            Date date= new Date();
            if(number.equals("")){
                JOptionPane.showMessageDialog(null,"Lütfen çekmek istediğiniz tutarı giriniz!");
            
            }else {
                try{
                VeriTabani veritabani = new VeriTabani();
                String query= "insert into bank values('"+pinnumber+"','"+date+"', 'ParaCekme', '"+number+"')";
                veritabani.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,""+number+" TL para çekme işlemi başarılı!");
                setVisible(false);
                new Islemler(pinnumber).setVisible(true);
                }catch (Exception e){
                    
                    System.out.println(e);
                }
            }
        
        }else if (ae.getSource()== back){
            setVisible(false);
            new Islemler(pinnumber).setVisible(true);
            
        }
    }
    
    public static void main(String args[]){
     
        new ParaCekme("");
    }
}

