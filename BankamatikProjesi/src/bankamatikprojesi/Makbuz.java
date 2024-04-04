
package bankamatikprojesi;

import javax.swing.*;
import java.awt.*;


public class Makbuz extends JFrame{
    
    Makbuz(String pinnumber){
        setTitle("Makbuz");
        
        setLayout(null);
        
        JLabel ceo= new JLabel("CEO'lar:");
        ceo.setBounds(20,100,300,20);
        add(ceo);
        JLabel ceo2= new JLabel("İREM Y.& ZEHRA T.");
        ceo2.setBounds(20,120,300,20);
        add(ceo2);
        
        JLabel bank= new JLabel ("SYSO BANK");
        bank.setBounds(150,20,200,20);
        add(bank);
        
        JLabel tesekkur= new JLabel("Bizi tercih ettiğiniz için teşekkürler.<3<3<3");
        tesekkur.setBounds(20,80,300,20);
        add(tesekkur);
        
        
        
        setSize(400,600);
        setLocation(20,20);
        Color pinkColor = new Color(255, 224, 231); // Pembe renk (RGB)
        getContentPane().setBackground(pinkColor);
        setVisible(true);
        
    
    }
    
    public static void main(String args[]){
     
        new Makbuz("");
    }
    
}
