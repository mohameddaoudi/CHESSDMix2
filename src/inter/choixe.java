/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author hamza
 */
public class choixe extends JFrame implements ActionListener{
   
   public  String choi="";
    JComboBox bx ;
    JButton b1;
    JLabel l1;
   public choixe(){
      this.setVisible(true);
      
      this.setLocationRelativeTo(null);
      l1=new JLabel("choisissez ");
      this.setSize(400,100);
      this.setLayout(new FlowLayout());
      bx = new JComboBox();
      b1=new JButton("confirmer");
      bx.setPreferredSize(new Dimension(100,30));
      bx.addItem("chevelier");
      bx.addItem("reine");
      bx.addItem("tour");
      bx.addItem("fou");
          
      this.add(l1);
      this.add(bx);
      this.add(b1);
     // bx.addActionListener(this);
      b1.addActionListener(this);
     
  }  
 

        @Override
        public void actionPerformed(ActionEvent ae) {
             setchoi(bx.getSelectedItem().toString()) ;
            
             System.out.print(getChoi());
              //echequier. appellerchoix();
               this.setVisible(false);
        }
      
  
  
     
  public void setchoi(String a){
      choi=a ;
  }
  public String getChoi(){
      return choi ;
  }
  
  
 
}
