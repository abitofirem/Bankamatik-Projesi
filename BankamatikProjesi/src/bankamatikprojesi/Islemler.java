
package bankamatikprojesi;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

public class Islemler extends JFrame implements ActionListener{
    
    JButton deposit, withdrawl, ministatement,pinchange,fastcash,balanceenquiry,exit;
    String pinnumber;
    
    Islemler(String pinnumber){
        this.pinnumber=pinnumber;
        
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("gorsel/CASH.png"));
        Image i2= i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text= new JLabel ("Lütfen yapmak istediğiniz işlemi seçiniz");
        text.setBounds(200,300,700,35);
        text.setForeground(Color.WHITE); 
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);
        
        
        Color darkgoldColor = new Color(121, 112, 30);
        Color goldColor = new Color(194, 185, 107);
        
        deposit= new JButton("Para Yatırma");
        deposit.setBounds(170,430,150,30); 
        deposit.setBackground(Color.WHITE);
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdrawl= new JButton("Para çekme");
        withdrawl.setBounds(355,430,150,30);
        withdrawl.setBackground(Color.WHITE);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        fastcash= new JButton("Hızlı Nakit");
        fastcash.setBounds(170,465,150,30);
        fastcash.setBackground(Color.WHITE);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        
        ministatement= new JButton("SURPRİZZZ");
        ministatement.setBounds(355,465,150,30);
        ministatement.setBackground(Color.WHITE);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
        pinchange= new JButton("Pin Değişikliği");
        pinchange.setBounds(355,500,150,30);
        pinchange.setBackground(Color.WHITE);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        balanceenquiry= new JButton("Bakiye Sorgulama");
        balanceenquiry.setBounds(170,500,150,30);
        balanceenquiry.setBackground(Color.WHITE);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);
        
        exit= new JButton("Çıkış");
        exit.setBounds(355,535,150,30);
        exit.setBackground(Color.WHITE);
        exit.addActionListener(this);
        image.add(exit);
        
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true); //çerçeve olmadan sağlar kapatma düğmesi vs gozukmez
        setVisible(true);
        
    
    
    
    
    
    
    
    }
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==exit){
            System.exit(0);// çıkış yapma ekranı
        
        } else if(ae.getSource()==deposit){
            setVisible(false);
            new ParaYatirma(pinnumber).setVisible(true);
                
        }else if(ae.getSource()==withdrawl){
            setVisible(false);
            new ParaCekme(pinnumber).setVisible(true);
        }else if(ae.getSource()== fastcash){
            setVisible(false);
            new HizliNakit(pinnumber).setVisible(true);
        }else if(ae.getSource()== pinchange){
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        }else if(ae.getSource()== balanceenquiry){
            setVisible(false);
            new BakiyeSorgulama(pinnumber).setVisible(true);
        }else if(ae.getSource()== ministatement){
            setVisible(false);
            new Makbuz(pinnumber).setVisible(true);
        }
    }
    
    
  public static void main(String args[]){
        
       new Islemler(""); 
        
        
        
    }
} 