/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Piece;

import inter.echequier;
import Piece.*;
import Detection.*;
import inter.Win;
import static inter.echequier.b;
import java.awt.Component;
import java.awt.Label;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author hamza
 */
public class Piece {
    
    
    /**
     *
     * @param istart
     * @param jstart
     * @param ifin
     * @param jfin
     * @param tab
     */
     public static ArrayList<String> elements;
    public static String win ;
    
     public static void deplacerIcon (int istart , int jstart ,int ifin ,int jfin ){
     String a; 
         if("B".equals(Detection.verfierCouleur( echequier.b[istart][jstart]))){
              a="player1:";
          }else{
              a="Player2:";
          }
       elements = new ArrayList<>();
         echequier.HistoryScroll.getViewport().add(echequier.p);
         
         
         
         if("B".equals(Detection.verfierCouleur( echequier.b[istart][jstart])) && "B".equals( echequier.p1.getColor())) 
         { 
             
 elements.add("("+(8-ifin)+","+(jfin+1)+")");
 if("K".equals(Detection.verfierType(echequier.b[ifin][jfin])) && "N".equals(Detection.verfierCouleur(echequier.b[ifin][jfin]))){
         //  close();
     win ="player 1";
    Win w=new Win();
    w.setVisible(true);
    
         }
             /*echequier.setOLdDeplacer(istart,jstart);
             echequier.setNextDeplacer(ifin,jfin); */
           echequier.F = (ImageIcon) echequier.b[ifin][jfin].getIcon();
        echequier.N = (ImageIcon) echequier.b[istart][jstart].getIcon();
         echequier.b[ifin][jfin].setIcon(echequier.N);
         echequier.b[istart][jstart].setIcon(null);
         /* echequier.setOLdDeplacer(istart,jstart);
         echequier.setNextDeplacer(ifin,jfin);*/
        echequier.p1.color="N";
       }
       else if(Detection.verfierCouleur(echequier.b[istart][jstart])=="N" && echequier.p1.getColor()=="N"){
      
 elements.add("("+(8-ifin)+","+(jfin+1)+")");
           // echequier.setOLdDeplacer(istart,jstart);
         //echequier.setNextDeplacer(ifin,jfin);
  if("K".equals(Detection.verfierType(echequier.b[ifin][jfin])) && "B".equals(Detection.verfierCouleur(echequier.b[ifin][jfin]))){
      win ="player 2"; 
       Win w=new Win();
       w.setVisible(true);
      System.out.println("player2 rbe777 hhhhhhh");
         }
           echequier.F = (ImageIcon)  echequier.b[ifin][jfin].getIcon();
        echequier.N = (ImageIcon)  echequier.b[istart][jstart].getIcon();
         echequier.b[ifin][jfin].setIcon(echequier.N);
         echequier.b[istart][jstart].setIcon(null);
         /* echequier.setOLdDeplacer(istart,jstart);
         echequier.setNextDeplacer(ifin,jfin);*/
        echequier.p1.color="B";
       }
          for(int i=0; i<elements.size();i++)
   {   
       echequier.p.add(new Label(a+"  "+elements.get(i)));
      
   }
          if( "P".equals(Detection.verfierType(echequier.b[ifin][jfin])))
                  {
                      echequier. appellerchoix();
                  } 
    }
     
     
    public static void initialiserTableau(int[] tab)
   {
       for (int p=0;p<tab.length;p++){tab[p]=-1;}
   }
    
    
    
    public static void afficher(int[] tab)
   {
     for (int p=0;p<tab.length;p++)
       {
          System.out.print(tab[p] + " ");
       }
   }
   }
   

