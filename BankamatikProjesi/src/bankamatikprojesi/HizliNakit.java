
package bankamatikprojesi;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

import java.sql.*;

import java.util.Date;

public class HizliNakit extends JFrame implements ActionListener{
    
    JButton deposit, withdrawl, ministatement,pinchange,fastcash,balanceenquiry,exit;
    String pinnumber;
    
    HizliNakit(String pinnumber){
        this.pinnumber=pinnumber;
        
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("gorsel/CASH.png"));
        Image i2= i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text= new JLabel ("Çekmek istediğiniz tutarı seçiniz(₺)");
        text.setBounds(200,300,700,35);
        text.setForeground(Color.WHITE); 
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);
        
        
        Color darkgoldColor = new Color(121, 112, 30);
        Color goldColor = new Color(194, 185, 107);
        
        deposit= new JButton("20");
        deposit.setBounds(170,430,150,30); 
        deposit.setBackground(Color.WHITE);
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdrawl= new JButton("50");
        withdrawl.setBounds(355,430,150,30);
        withdrawl.setBackground(Color.WHITE);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        fastcash= new JButton("100");
        fastcash.setBounds(170,465,150,30);
        fastcash.setBackground(Color.WHITE);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        
        ministatement= new JButton("200");
        ministatement.setBounds(355,465,150,30);
        ministatement.setBackground(Color.WHITE);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
        pinchange= new JButton("1000");
        pinchange.setBounds(355,500,150,30);
        pinchange.setBackground(Color.WHITE);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        balanceenquiry= new JButton("500");
        balanceenquiry.setBounds(170,500,150,30);
        balanceenquiry.setBackground(Color.WHITE);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);
        
        exit= new JButton("Geri");
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
           setVisible(false);
           new Islemler(pinnumber).setVisible(true);
        
        } else {
            String tutar= ((JButton)ae.getSource()).getText().substring(0);// mesela 20 tl yerine 20'yi aldık(substring ile)
            VeriTabani c= new VeriTabani();
            try{
                ResultSet tl= c.s.executeQuery("select * from bank where pin= '"+pinnumber+"'");
                int bakiye = 0;
                while(tl.next()){
                    if(tl.getString("type").equals("ParaYatir")){
                        bakiye += Integer.parseInt(tl.getString("tutar"));
                     } else {
                        bakiye -= Integer.parseInt(tl.getString("tutar"));
                     }
                
                }
            
                    if (ae.getSource() != exit && bakiye < Integer.parseInt(tutar)){
                        JOptionPane.showMessageDialog(null, "Yetersiz Bakiye");
                        return;
            
            }
                    Date date= new Date();
                    String query= "insert into bank values('"+pinnumber+"','"+date+"', 'ParaCekme', '"+tutar+"')";
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,"TL" + tutar + "  para çekme işlemi gerçekleştirildi.");
                    
                    setVisible(false);
                    new Islemler(pinnumber).setVisible(true);

                    
            }catch(Exception e){
                System.out.println(e);
            
            
            }
        } 
    }
    
    
  public static void main(String args[]){
        
       new HizliNakit(""); 
        
        
        
    }
}
