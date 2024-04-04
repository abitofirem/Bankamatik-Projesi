package bankamatikprojesi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.sql.*;


public class Giris extends JFrame implements ActionListener{ //Arayüz için JFrame sınıfını kullandık
    
    JButton oturum, kaydol;
    JTextField kartTextField;
    JPasswordField pinPasswordField;
    
    
    Giris(){
    
        setTitle("SYSOBANK'A HOŞGELDİNİZ..");
        
        setLayout(null);
         
        ImageIcon syso1= new ImageIcon(ClassLoader.getSystemResource("gorsel/syso.png")); //png formatında fotoğrafı çektik
        Image syso2= syso1.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon syso3=new ImageIcon(syso2);
        
        JLabel label=new JLabel(syso3); //Görselin görüntülenmesi için kullandık
        label.setBounds(10,2,200,200);
        add(label);
        
        //Hoşgeldin yazısı
        JLabel text= new JLabel("SYSO BANK'A HOŞGELDİNİZ");
        text.setBounds(200,80,800,40);
        text.setFont( new Font("Verdana", Font.BOLD ,30));
        Color goldColor = new Color(194, 185, 107); // Altın rengi (RGB)
        text.setForeground(goldColor);
        add(text);
        
        
        //kartno
        JLabel kartno= new JLabel("Kart Numarası:");
        kartno.setBounds(50,180,800,40);
        kartno.setFont( new Font("Raleway",Font.BOLD , 28));
        Color darkgoldColor = new Color(121, 112, 30); // Altın rengi (RGB)
        kartno.setForeground(darkgoldColor);
        add(kartno);
        
        
        kartTextField= new JTextField();
        kartTextField.setBounds(250,185,250,30);
        kartTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(kartTextField);
        
        //pin
        JLabel pin= new JLabel("Pin:");
        pin.setBounds(50,240,800,40);
        pin.setFont( new Font("Raleway", Font.BOLD, 28));
        pin.setForeground(darkgoldColor);
        add(pin);
        
        
        pinPasswordField= new JPasswordField();
        pinPasswordField.setBounds(250,245,250,30);
        pinPasswordField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinPasswordField);
        
         // Şifreyi Göster Checkbox
        JCheckBox showPasswordCheckBox = new JCheckBox("Şifreyi Göster");
        showPasswordCheckBox.setBounds(520, 245, 120, 30);
        showPasswordCheckBox.setForeground(darkgoldColor);
        showPasswordCheckBox.setBackground(Color.WHITE);
        add(showPasswordCheckBox);
        
          // CheckBox durumunu takip etmek için ItemListener ekleme
        showPasswordCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (showPasswordCheckBox.isSelected()) {
                    pinPasswordField.setEchoChar((char) 0); // Şifreyi göster
                } else {
                    pinPasswordField.setEchoChar('\u25cf'); // Şifreyi gizle(u25cf nokta kodu temsil eder)
                }
            }
        });
        
        //Oturum Aç Butonu
        oturum= new JButton("Oturum Aç ");
        oturum.setBounds(300,300,100,30);
        oturum.setForeground(darkgoldColor);
        oturum.setBackground(goldColor);
        oturum.addActionListener(this);
        add(oturum);
        
        
        //Kaydol butonu
        
        kaydol= new JButton("Kaydol ");
        kaydol.setBounds(300,350,100,30);
        kaydol.setForeground(darkgoldColor);
        kaydol.setBackground(goldColor);
        kaydol.addActionListener(this);
        add(kaydol);
        
        
        
        
        
        
        //arkaplan rengi
        getContentPane().setBackground(Color.WHITE);
        
       
        
        setSize(800,480); //Pencere boyutunu pixel olarak ayarlar
        setVisible(true); // Hangi bilşenlerin görünür olduğu kontrol edilir
        setLocation(350,200);
    }

       @Override
    public void actionPerformed(ActionEvent ae) {
        
        if (ae.getSource()== oturum){
            VeriTabani veritabani= new VeriTabani();
            String cardnumber= kartTextField.getText();
            String pinnumber= pinPasswordField.getText();
            String query = "SELECT * FROM giris WHERE cardnumber = '" + cardnumber + "' AND pinnumber = '" + pinnumber + "'";
            try{
            ResultSet rs= veritabani.s.executeQuery(query);
            if(rs.next()){
                setVisible(false);
                new Islemler(pinnumber).setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Kart numaranız veya şifreniz hatalı!");
            }
            
            
            
            }catch(Exception e){
                System.out.println(e);
            }
            
        }
        else if(ae.getSource()== kaydol){ //kaydola tıkladığımızda 1.kayıt sayfasını açsın
            setVisible(false);
            new Kayit1().setVisible(true);
        }
        
    }
    
    
    public static void main (String args[]){
       
        new Giris();
    
       
    }

 





}
