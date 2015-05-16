/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Detection;


import static Detection.Detection.*;
import Piece.*;
import inter.echequier;
import static inter.echequier.b;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author hamza
 */
public class Detection {
    
    
    
      public static boolean verifierPlein(JButton b ){
          return b.getIcon() != null;
        }
   
      public static String verfierCouleur (JButton b ){
       
       if (verifierPlein(b))
       {
           if (((ImageIcon)b.getIcon()).getDescription().charAt(1)=='B')
              return "B";
           
           else if (((ImageIcon)b.getIcon()).getDescription().charAt(1)=='N')
                return "N";
       }
        return null;
        
   }
   public static String verfierType (JButton b ){
       
       if (verifierPlein(b))
       {
           return (((ImageIcon)b.getIcon()).getDescription().charAt(0))+"";
       }
        return null;
        
   }
   //emplacement du boutton
   public static int emplacement (JButton t){
       
       for(int i=0;i<8;i++)
                for(int j=0;j<8;j++)
                {
                    if (t==echequier.b[i][j])
                    {
                        return i*10+j ;
                    }
                
                }    
       return -1 ;
   }
   public static void initialiserTableau(int[] tab)
   {
       for (int s=0;s<tab.length;s++)
       {
           tab[s]=-1;
       }
   }
   
     public static void concatenerTableau(int[] tab,int[] tab1)
   {
          int s=0;
          int h=0;
          
           for (s=0;tab[s]!=-1;s++)
        {           
                   
                      h++;     
        }
        for (s=0;tab1[s]!=-1;s++)
        {           

                   
            tab[h]= tab1[s]; 
            h++;
         
        }
   }
     
   public static void afficher2(int[] tab)
   {
     for (int p=0;tab[p]!=-1;p++)
       {
          System.out.println(tab[p] + "            ");
       }
   }
   
 public static void afficherA(ArrayList <Integer> ar)
   { System.out.print( "roi");
          for (Integer ar1 : ar) {
              System.out.print("  "+  ar1);
          }
          System.out.print( "froi");
   }
 
 
 public static ArrayList <Integer> safeKingB (){

         int [] tc = new int [50];
         
        ArrayList <Integer> ar = new ArrayList();  
       
        initialiserTableau(tc);
        int m =0, h=0,n=0;
     
        for (int v=0;v<8;v++){
            for (int l=0;l<8;l++){
                if ("N".equals(verfierCouleur(b[v][l]))){
                    if ("P".equals(verfierType(echequier.b[v][l]))){
                        initialiserTableau(tc);
                        tc=Pion.verifierDepPionCap(v,l);
                        for (int i =0;tc[i]!=-1;i++){
                            ar.add(tc[i]);
                        }
                  
                    }
                    if ("C".equals(verfierType(echequier.b[v][l]))){
                        initialiserTableau(tc);
                        tc=Cavalier.verifierDepCavalier(v, l);
                        for (int i =0;tc[i]!=-1;i++){
                            ar.add(tc[i]);
                        }
                    }
                    if ("T".equals(verfierType(echequier.b[v][l]))){
                        initialiserTableau(tc);
                        tc=Tour.verifierDepTour (v,l);
                        for (int i =0;tc[i]!=-1;i++){
                            ar.add(tc[i]);
                        }
                    }
                    if ("R".equals(verfierType(echequier.b[v][l]))){
                        initialiserTableau(tc);
                       tc=Reine.verifierDepReine (v,l);
                        for (int i =0;tc[i]!=-1;i++){
                            ar.add(tc[i]);
                        }
                    }
                    if ("K".equals(verfierType(echequier.b[v][l]))){
                        initialiserTableau(tc);
                        tc=King.verifierDepKing (v,l);
                      for (int i =0;tc[i]!=-1;i++){
                            ar.add(tc[i]);
                        }
                    }
                    if ("F".equals(verfierType(echequier.b[v][l]))){
                        initialiserTableau(tc);
                        tc=Fou.verifierDepFou (v,l);
                        for (int i =0;tc[i]!=-1;i++){
                            ar.add(tc[i]);
                        }
                    }
                }
            }
        }
        
            
        
       
        return ar; 
    }

   
 // +++++++++++++++++++++++++++++++++++++

 public static ArrayList <Integer> safeKingN (){

         int [] tc = new int [50];
         
        ArrayList <Integer> ar = new ArrayList();  
       
        initialiserTableau(tc);
        int m =0, h=0,n=0;
     
        for (int v=0;v<8;v++){
            for (int l=0;l<8;l++){
                if ("B".equals(verfierCouleur(b[v][l]))){
                    if ("P".equals(verfierType(echequier.b[v][l]))){
                        initialiserTableau(tc);
                        tc=Pion.verifierDepPionCap(v,l);
                        for (int i =0;tc[i]!=-1;i++){
                            ar.add(tc[i]);
                        }
                  
                    }
                    if ("C".equals(verfierType(echequier.b[v][l]))){
                        initialiserTableau(tc);
                        tc=Cavalier.verifierDepCavalier(v, l);
                        for (int i =0;tc[i]!=-1;i++){
                            ar.add(tc[i]);
                        }
                    }
                    if ("T".equals(verfierType(echequier.b[v][l]))){
                        initialiserTableau(tc);
                        tc=Tour.verifierDepTour (v,l);
                        for (int i =0;tc[i]!=-1;i++){
                            ar.add(tc[i]);
                        }
                    }
                    if ("R".equals(verfierType(echequier.b[v][l]))){
                        initialiserTableau(tc);
                       tc=Reine.verifierDepReine (v,l);
                        for (int i =0;tc[i]!=-1;i++){
                            ar.add(tc[i]);
                        }
                    }
                    if ("K".equals(verfierType(echequier.b[v][l]))){
                        initialiserTableau(tc);
                        tc=King.verifierDepKing (v,l);
                      for (int i =0;tc[i]!=-1;i++){
                            ar.add(tc[i]);
                        }
                    }
                    if ("F".equals(verfierType(echequier.b[v][l]))){
                        initialiserTableau(tc);
                        tc=Fou.verifierDepFou (v,l);
                        for (int i =0;tc[i]!=-1;i++){
                            ar.add(tc[i]);
                        }
                    }
                }
            }
        }
        
            
        
       
        return ar; 
    }

   }