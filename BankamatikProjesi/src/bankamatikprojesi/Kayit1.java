package  bankamatikprojesi;

import javax.swing.*;

import java.awt.*;

import java.util.*;

import com.toedter.calendar.JDateChooser;

import java.awt.event.*;

public class Kayit1 extends JFrame implements ActionListener{
    long random;
    JTextField isimTextField, aksoyadiTextField, emailTextField, dogumTextField, adresTextField,sehirTextField, ilceTextField, pinkodTextField;
    JRadioButton erkek, kadin, evli, bekar ;
    JButton sonraki;
    JDateChooser dateChooser;
    
    Kayit1(){
        
        setLayout(null);
        
        //rastgele random sayı ürettim
        Random ran= new Random();
        
        // bu kod bir rastgele sayı üreterek, bu sayının 1000 ile 9999 arasında olmasını sağlar.
        random = Math.abs((ran.nextLong() % 9000L)+ 1000L); 
        
        
        //başlık
        JLabel musterino = new JLabel ("MÜŞTERİ FORM NUMARASI " + random);
        musterino.setFont( new Font("Verdana", Font.BOLD ,30));
        Color darkgoldColor = new Color(121, 112, 30); // Altın rengi (RGB)
        musterino.setForeground(darkgoldColor);
        musterino.setBounds(140,40,600,40);
        add(musterino);
        
        
        JLabel kisiselBilgi = new JLabel ("Sayfa1 -> Kişisel Bilgiler" );
        kisiselBilgi.setFont( new Font("Verdana", Font.BOLD ,22));
        Color goldColor = new Color(194, 185, 107);
        kisiselBilgi.setForeground(goldColor);
        kisiselBilgi.setBounds(290,80,400,30);
        add(kisiselBilgi);
        
        
        
        JLabel isim = new JLabel ("İsim:" );
        isim.setFont( new Font("Verdana", Font.BOLD ,20));
        isim.setForeground(darkgoldColor);
        isim.setBounds(100,140,100,30);
        add(isim);
        
        isimTextField= new JTextField();
        isimTextField.setFont( new Font("Verdana", Font.BOLD ,14));
        isimTextField.setBounds(330,140,400,30);
        add(isimTextField);
        
        
        JLabel aksoyadi = new JLabel ("Anne Kızlık Soyadı:" );
        aksoyadi.setFont( new Font("Verdana", Font.BOLD ,20));
        aksoyadi.setForeground(darkgoldColor);
        aksoyadi.setBounds(100,190,300,30);
        add(aksoyadi);
        
        aksoyadiTextField= new JTextField();
        aksoyadiTextField.setFont( new Font("Verdana", Font.BOLD ,14));
        aksoyadiTextField.setBounds(330,190,400,30);
        add(aksoyadiTextField);
        
        
        JLabel dogum = new JLabel ("Doğum Tarihi:" );
        dogum.setFont( new Font("Verdana", Font.BOLD ,20));
        dogum.setForeground(darkgoldColor);
        dogum.setBounds(100,240,300,30);
        add(dogum);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(330, 240,200,30);
        dateChooser.setForeground(goldColor);
        add(dateChooser);
        
        
        JLabel cinsiyet = new JLabel ("Cinsiyet:" );
        cinsiyet.setFont( new Font("Verdana", Font.BOLD ,20));
        cinsiyet.setForeground(darkgoldColor);
        cinsiyet.setBounds(100,290,300,30);
        add(cinsiyet);
        
        erkek= new JRadioButton("Erkek");
        erkek.setBounds(330,290,60,30);
        erkek.setBackground(Color.WHITE);
        add(erkek);
        
        kadin= new JRadioButton("Kadın");
        kadin.setBounds(450,290,60,30);
        kadin.setBackground(Color.WHITE);
        add(kadin);
        
        
        ButtonGroup cinsiyetgroup= new ButtonGroup();
        cinsiyetgroup.add(erkek);
        cinsiyetgroup.add(kadin);
        
        
        
        JLabel email = new JLabel ("E-mail Adresi:" );
        email.setFont( new Font("Verdana", Font.BOLD ,20));
        email.setForeground(darkgoldColor);
        email.setBounds(100,340,300,30);
        add(email);
        
        
        emailTextField= new JTextField();
        emailTextField.setFont( new Font("Verdana", Font.BOLD ,14));
        emailTextField.setBounds(330,340,400,30);
        add(emailTextField);
        
        JLabel medenihal = new JLabel ("Medeni Hâl:" );
        medenihal.setFont( new Font("Verdana", Font.BOLD ,20));
        medenihal.setForeground(darkgoldColor);
        medenihal.setBounds(100,390,300,30);
        add(medenihal);
        
        evli= new JRadioButton("Evli");
        evli.setBounds(330,390,60,30);
        evli.setBackground(Color.WHITE);
        add(evli);
        
        bekar= new JRadioButton("Bekar");
        bekar.setBounds(450,390,60,30);
        bekar.setBackground(Color.WHITE);
        add(bekar);
        
        
        ButtonGroup medenihalgroup= new ButtonGroup();
        medenihalgroup.add(evli);
        medenihalgroup.add(bekar);
        
        
        JLabel adres = new JLabel ("Adres:" );
        adres.setFont( new Font("Verdana", Font.BOLD ,20));
        adres.setForeground(darkgoldColor);
        adres.setBounds(100,440,300,30);
        add(adres);
        
        adresTextField= new JTextField();
        adresTextField.setFont( new Font("Verdana", Font.BOLD ,14));
        adresTextField.setBounds(330,440,400,30);
        add(adresTextField);
        
        
        JLabel sehir = new JLabel ("Şehir:" );
        sehir.setFont( new Font("Verdana", Font.BOLD ,20));
        sehir.setForeground(darkgoldColor);
        sehir.setBounds(100,490,300,30);
        add(sehir);
        
        sehirTextField= new JTextField();
        sehirTextField.setFont( new Font("Verdana", Font.BOLD ,14));
        sehirTextField.setBounds(330,490,400,30);
        add(sehirTextField);
        
        
        JLabel ilce = new JLabel ("İlçe:" );
        ilce.setFont( new Font("Verdana", Font.BOLD ,20));
        ilce.setForeground(darkgoldColor);
        ilce.setBounds(100,540,300,30);
        add(ilce);
        
        ilceTextField= new JTextField();
        ilceTextField.setFont( new Font("Verdana", Font.BOLD ,14));
        ilceTextField.setBounds(330,540,400,30);
        add(ilceTextField);
        
        
        JLabel pinkod = new JLabel ("Posta Kodu:" );
        pinkod.setFont( new Font("Verdana", Font.BOLD ,20));
        pinkod.setForeground(darkgoldColor);
        pinkod.setBounds(100,590,300,30);
        add(pinkod);
        
        pinkodTextField= new JTextField();
        pinkodTextField.setFont( new Font("Verdana", Font.BOLD ,14));
        pinkodTextField.setBounds(330,590,400,30);
        add(pinkodTextField);
        
        
        sonraki= new JButton("Devam Et");
        sonraki.setBounds(620,660,150,30);
        sonraki.setForeground(darkgoldColor);
        sonraki.setFont(new Font("Verdana",Font.BOLD,14));
        sonraki.setBackground(goldColor);
        sonraki.addActionListener(this);
        add(sonraki);
        
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    
    }
    
    public void actionPerformed (ActionEvent ae){
        String musterino= "" + random; //long
        String isim= isimTextField.getText(); //setText
        String aksoyadi= aksoyadiTextField.getText();
        String dogum= ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String cinsiyet=null;
        if (erkek.isSelected()){
            cinsiyet= "Erkek";
        }
        else if (kadin.isSelected()){
            cinsiyet="Kadin";
        }
        
        String email=emailTextField.getText();
        String medenihal=null;
        if (evli.isSelected()){
            medenihal= "Evli";
        }
        else if (bekar.isSelected()){
            medenihal="Bekar";
        }
    
        String adres= adresTextField.getText();
        String sehir= sehirTextField.getText();
        String ilce= ilceTextField.getText();
        String pinkod= pinkodTextField.getText();
        
        
        try {
            
            if (isim.equals("")){
                JOptionPane.showMessageDialog(null,"İsim girmek zorunludur.."); //JOptionPane pencere açıyor mesaj veren
            } else  {
                VeriTabani c= new VeriTabani();
                //VERİ TABANINA YENİ BİLGİ EKLEMEK İÇİN SQL SORGULARI, 
                String query = "insert into kaydol values('"+musterino+"','"+isim+"','"+aksoyadi+"','"+dogum+"','"+cinsiyet+"','"+email+"','"+medenihal+"','"+adres+"','"+sehir+"','"+pinkod+"','"+ilce+"')";
                c.s.executeUpdate(query);
                
                
                setVisible(false);
                new Kayit2().setVisible(true);
            }  
            
            
                
            
            
        
        }catch(Exception e) {
            System.out.println(e);
        
        }
        
    }
    
    

    public static void main(String args[]){
         // "Kayit1" sınıfından bir nesne oluşturuluyor
        new Kayit1();
    
    
    
    
    
    
    
    
    
    
    }




}
