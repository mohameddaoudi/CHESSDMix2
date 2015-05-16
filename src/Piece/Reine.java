/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Piece;
import Detection.*;
/**
 *
 * @author hamza
 */
public class Reine extends Piece {
      public static int [] verifierDepReine(int i , int j){
        int s=0,h=0;
        int [] tt = new int [40] ;
        int [] tr = new int [20] ;
        int [] tf = new int [20] ;
          initialiserTableau(tt);
            initialiserTableau(tr);
              initialiserTableau(tf);
            
            for (int p=0;p<tr.length;p++){tr[p]=-1;}
            for (int p=0;p<tf.length;p++){tf[p]=-1;}
        tr= Tour.verifierDepTour(i , j);
        tf= Fou.verifierDepFou( i , j);
  
         Detection.concatenerTableau(tt,tf);
    Detection.concatenerTableau(tt,tr);
        /*   for (s=0;s<20;s++)
        {         if(tr[s]!=-1) {
            tt[h]= tr[s]; 
            h++;
        } 
               
        }
        for (s=20;s<40;s++)
        {           
                   if(tf[s-20]!=-1) {
            tt[h]= tf[s-20]; 
            h++;
        } 
        }
  */
     
    
         return tt;   
    }
}
