
package bankamatikprojesi;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

public class PinChange extends JFrame implements ActionListener{
    
    JPasswordField pin, repin;
    JButton change, back;
    String pinnumber;
    
    PinChange(String pinnumber){
        this.pinnumber= pinnumber;
        setLayout(null);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("gorsel/CASH.png"));
        Image i2= i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text= new JLabel("PIN DEĞİŞTİR");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setBounds(290,280,500,35);
        image.add(text);
        
        
        JLabel pintext= new JLabel("Yeni PIN: ");
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("System",Font.BOLD,16));
        pintext.setBounds(190,320,180,25);
        image.add(pintext);
        
        pin= new JPasswordField();
        pin.setFont(new Font("Verdana",Font.BOLD,25));
        pin.setBounds(365,320,150,25);
        image.add(pin);
        
        JLabel repintext= new JLabel("Yeni PIN'i tekrar girin: ");
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("System",Font.BOLD,16));
        repintext.setBounds(190,360,180,25);
        image.add(repintext);
        
        repin= new JPasswordField();
        repin.setFont(new Font("Verdana",Font.BOLD,25));
        repin.setBounds(365,360,150,25);
        image.add(repin);
        
        change = new JButton("DEĞİŞTİR");
        change.setBounds(355,510,130,30);
        change.setBackground(Color.WHITE);
        change.addActionListener(this);
        image.add(change);
        
        back = new JButton("GERİ");
        back.setBounds(190,510,130,30);
        back.setBackground(Color.WHITE);
        back.addActionListener(this);
        image.add(back);
        
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()== change){
        try{
            String npin= pin.getText();
            String rpin=repin.getText();
            
            if(!npin.equals(rpin)){
                JOptionPane.showMessageDialog(null, "PIN'ler eşleşmiyor.");
                return;
            }
            
            if(npin.equals("")){
                JOptionPane.showMessageDialog(null, "Lütfen PIN giriniz.");
                return;
            }
            
            if(rpin.equals("")){
            JOptionPane.showMessageDialog(null, "Lütfen yeni PIN'i giriniz.");
                return;
            }
            
            VeriTabani veritabani= new VeriTabani();
            String query1= "update bank set pin = '"+rpin+"' where pin= '"+pinnumber+"'";
            String query2= "update giris set pinnumber = '"+rpin+"' where pinnumber= '"+pinnumber+"'";
            String query3= "update kaydol2 set pinnumber = '"+rpin+"' where pinnumber= '"+pinnumber+"'";
            
            veritabani.s.executeUpdate(query1);
            veritabani.s.executeUpdate(query2);
            veritabani.s.executeUpdate(query3);
            
            JOptionPane.showMessageDialog(null, "PIN başarıyla değiştirildi!");
            
            setVisible(false);
            new Islemler(rpin).setVisible(true);
         
            }catch (Exception e){
             System.out.println(e);
            }
    
        }else {
            setVisible(false);
            new Islemler(pinnumber).setVisible(true);
        }
            
    }
    
    
    public static void main(String args[]){
     
        new PinChange("").setVisible(true);
    }
}
