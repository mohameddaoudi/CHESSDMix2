/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Piece;

import Detection.Detection;
import inter.echequier;

/**
 *
 * @author hamza
 */
public class Fou extends Piece{
    
    
    public static int [] verifierDepFou(int i , int j){
        
     int k=1 ;
       int v=0 ;
   int[] re = new int [25] ;
      initialiserTableau(re);
      String moi =  Detection.verfierCouleur(echequier.b[i][j]);
      String   ennemie="";
       if("N".equals(moi)){
       ennemie="B";
       }
       else{
           ennemie="N"; 
       }
       
      
     while (i+k<8 && 0<=i+k && 0<=j+k && j+k<8){
          
           if ((ennemie.equals(Detection.verfierCouleur(echequier.b[i+k][j+k])))){
               re[v]=(i+k)*10+j+k;
                 v++;
               break ;
           }
           else if ((moi.equals(Detection.verfierCouleur(echequier.b[i+k][j+k])))){
               break;
           }
           else{
                re[v]=(i+k)*10+(j+k); 
                v++; 
                k++;
           }
           
     }
         
      k=1; 
       while (i+k<8 && 0<=i+k && 0<=j-k && j-k<8){
          
           if ((ennemie.equals(Detection.verfierCouleur(echequier.b[i+k][j-k])))){
               re[v]=(i+k)*10+j-k;
               v++;
               break ;
           }
           else if ((moi.equals(Detection.verfierCouleur(echequier.b[i+k][j-k])))){
               break;
           }
           else{
                re[v]=(i+k)*10+j-k; 
                v++; 
                k++;
           }    
          
       }
       k=1;
       while (i-k<8 && 0<=i-k && 0<=j+k && j+k<8){
          
           if ((ennemie.equals(Detection.verfierCouleur(echequier.b[i-k][j+k])))){
               re[v]=(i-k)*10+j+k;
               v++;
               break ;
           }
           else if ((moi.equals(Detection.verfierCouleur(echequier.b[i-k][j+k])))){
               break;
           }
           else{
                re[v]=(i-k)*10+j+k; 
                v++; 
                k++;
           }
       }
       k=1;
       while (i-k<8 && 0<=i-k && 0<=j-k && j-k<8){
          
           if ((ennemie.equals(Detection.verfierCouleur(echequier.b[i-k][j-k])))){
               re[v]=(i-k)*10+j-k;
                 v++;
               break ;
           }
           else if ((moi.equals(Detection.verfierCouleur(echequier.b[i-k][j-k])))){
               break;
           }
           else{
                re[v]=(i-k)*10+j-k; 
                v++; 
                k++;
           }
       }
       return re; 
    }
       
}
