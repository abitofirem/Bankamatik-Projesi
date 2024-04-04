package  bankamatikprojesi;

import java.awt.*;;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;


public class Kayit2 extends JFrame implements ActionListener{
    
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1, c2, c3, c4 ,c5 , c6, c7;
    JButton devam, iptal;
    
    Kayit2(){
        
        setLayout(null);
        
        JLabel l1= new JLabel("Sayfa2->HESAP BİLGİLERİ");
        l1.setFont( new Font("Verdana", Font.BOLD ,22));
        Color darkgoldColor = new Color(121, 112, 30);
        l1.setForeground(darkgoldColor);
        l1.setBounds(280,40,400,40);
        add(l1);
        
        
        JLabel tur= new JLabel("Hesap Türü");
        tur.setFont( new Font("Verdana", Font.BOLD ,22));
        Color goldColor = new Color(194, 185, 107);
        tur.setForeground(darkgoldColor);
        tur.setBounds(100,140,200,30);
        add(tur);
        
        
        r1= new JRadioButton("Vadesiz Hesap");
        r1.setFont( new Font("Verdana", Font.BOLD ,16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,180,250,20);
        add(r1);
        
        r2= new JRadioButton("Birikim Hesabı");
        r2.setFont( new Font("Verdana", Font.BOLD ,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,180,250,20);
        add(r2);
        
        r3= new JRadioButton("Yatırım Hesabı");
        r3.setFont( new Font("Verdana", Font.BOLD ,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,220,250,20);
        add(r3);
        
        r4= new JRadioButton("Emeklilik Hesabı");
        r4.setFont( new Font("Verdana", Font.BOLD ,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,220,300,20);
        add(r4);
        
        
        ButtonGroup groupAccount = new ButtonGroup();
        groupAccount.add(r1);
        groupAccount.add(r2);
        groupAccount.add(r3);
        groupAccount.add(r4);
        
        
        JLabel kart= new JLabel("Kart Numarası:");
        kart.setFont( new Font("Verdana", Font.BOLD ,22));
        kart.setForeground(darkgoldColor);
        kart.setBounds(100,300,200,30);
        add(kart);
        
        
        JLabel number= new JLabel("XXXX-XXXX-XXXX-4134");
        number.setFont( new Font("Verdana", Font.BOLD ,22));
        number.setBounds(330,300,300,30);
        add(number);
        
        
        JLabel carddetail= new JLabel("(16 Haneli Dijital Kart Numaranız)");
        carddetail.setFont( new Font("Verdana", Font.BOLD ,12));
        carddetail.setForeground(goldColor);
        carddetail.setBounds(100,330,300,30);
        add(carddetail);
        
        
        JLabel pin= new JLabel("PIN:");
        pin.setFont( new Font("Verdana", Font.BOLD ,22));
        pin.setForeground(darkgoldColor);
        pin.setBounds(100,370,200,30);
        add(pin);
        
        JLabel pindetail= new JLabel("(4 Haneli Dijital Şifreniz)");
        pindetail.setFont( new Font("Verdana", Font.BOLD ,12));
        pindetail.setForeground(goldColor);
        pindetail.setBounds(100,400,300,30);
        add(pindetail);
        
        JLabel pnumber= new JLabel("XXXX");
        pnumber.setFont( new Font("Verdana", Font.BOLD ,22));
        pnumber.setBounds(330,370,300,30);
        add(pnumber);
        
        
        JLabel services= new JLabel("Hizmet Tercihi:");
        services.setFont( new Font("Verdana", Font.BOLD ,22));
        services.setForeground(darkgoldColor);
        services.setBounds(100,450,300,30);
        add(services);
        
        
        
        c1 = new JCheckBox("ATM Kartı");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Verdana", Font.BOLD, 16));
        c1.setBounds(100,500,200,30);
        add(c1);
        
        c2 = new JCheckBox("Internet Bankacılığı");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Verdana", Font.BOLD, 16));
        c2.setBounds(350,550,300,30);
        add(c2);
        
        c3 = new JCheckBox("Mobil Bankacılığı");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Verdana", Font.BOLD, 16));
        c3.setBounds(100,550,200,30);
        add(c3);
        
        c4 = new JCheckBox("E-mail Bilgilendirme Servisi");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Verdana", Font.BOLD, 16));
        c4.setBounds(350,500,300,30);
        add(c4);
        
        c5 = new JCheckBox("Çek İşlemleri");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Verdana", Font.BOLD, 16));
        c5.setBounds(100,600,200,30);
        add(c5);
        
        c6 = new JCheckBox("E-Beyanname");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Verdana", Font.BOLD, 16));
        c6.setBounds(350,600,200,30);
        add(c6);
        
        
        c7 = new JCheckBox("Yukarıda girdiğim bilgilerin doğruluğunu kabul ediyorum",true);
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100,680,600,30);
        add(c7);
        
        
        devam = new JButton("Devam Et");
        devam.setFont(new Font("Verdana", Font.BOLD, 14));
        devam.setBackground(goldColor);
        devam.setForeground(darkgoldColor);
        devam.setBounds(250,720,150,30);
        devam.addActionListener(this);
        add(devam);
        
        iptal = new JButton("İptal");
        iptal.setFont(new Font("Verdana", Font.BOLD, 14));
        iptal.setBackground(goldColor);
        iptal.setForeground(darkgoldColor);
        iptal.setBounds(420,720,100,30);
        iptal.addActionListener(this);
        add(iptal);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
        
    }
        
        
        public void actionPerformed(ActionEvent ae) {
        
        if (ae.getSource()== devam){
            String accountType =null;
            if(r1.isSelected()){
                accountType="Vadesiz Hesap";
            }else if(r2.isSelected()){
                accountType="Birikim Hesabı";
            }else if(r3.isSelected()){
                accountType="Yatırım Hesabı";
            }else if(r4.isSelected()){
                accountType="Emeklilik Hesabı";
            }
        
           
            Random random= new Random();
            String cardnumber= ""+ Math.abs((random.nextLong()%90000000)+ 5040936000000000L);
            
            String pinnumber= "" + Math.abs((random.nextLong()%9000L)+ 1000L); 
            
            String facility= "";
            if(c1.isSelected()){
                facility= facility +" ATM Kartı";
            }else if(c2.isSelected()){
                facility= facility+ " Internet Bankacılığı";
            }else if(c3.isSelected()){
                facility= facility+ " Mobil Bankacılığı";
            }else if(c4.isSelected()){
                facility= facility+ " E-mail Bilgilendirme Sistemi";
            }else if(c5.isSelected()){
                facility= facility+ " Çek İşlemleri";
            }else if(c6.isSelected()){
                facility= facility+ " E-Beyanname";
            }
                
            
            
            try{
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null,"Hesap türü girmek zorunludur!");
                }else {
                    VeriTabani veritabani= new VeriTabani();
                    String query1= "insert into kaydol2 values('"+accountType+"', '"+cardnumber+"', '"+pinnumber+"', '"+facility+"')";
                    String query2= "insert into giris values('"+cardnumber+"', '"+pinnumber+"')";
                    veritabani.s.executeUpdate(query1);
                    veritabani.s.executeUpdate(query2);
                    
                    
                    
                    JOptionPane.showMessageDialog(null, "Kart Numaranız: "+ cardnumber+ "\n Pin Kodunuz: "+ pinnumber);
                    
                    setVisible(false);
                    new ParaYatirma(pinnumber).setVisible(false);
                }
           }catch( Exception e){
               System.out.println(e);
           }
            
            
            
            
            
        } else if(ae.getSource()== iptal){ 
            setVisible(false);
            new Giris().setVisible(true);
            
           
        }
        
    }
        
    
    

    public static void main(String args[]){
         // "Kayit1" sınıfından bir nesne oluşturuluyor
        new Kayit2();
    
    
    
    
    
    
    
    
    
    
    }




}
