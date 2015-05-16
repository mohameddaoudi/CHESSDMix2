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
public class Tour extends Piece{
    public static int  [] verifierDepTour(int i , int j){
       int[] re = new int [25] ;
  
      initialiserTableau(re);
      
       int k=1 ;
       int v=0 ;
       String moi =  Detection.verfierCouleur(echequier.b[i][j]);
      String   ennemie="";
       if("N".equals(moi)){
       ennemie="B";
       }
       else{
           ennemie="N"; 
       }
       
      
     
      
     while (0<=j+k && j+k<8){
          
           if ((ennemie.equals(Detection.verfierCouleur(echequier.b[i][j+k])))){
               re[v]=(i)*10+j+k;
                 v++;
               break ;
           }
           else if ((moi.equals(Detection.verfierCouleur(echequier.b[i][j+k])))){
               break;
           }
           else{
                re[v]=(i)*10+(j+k); 
                v++; 
                k++;
           }
         
     } 
     k=1; 
         while (i+k<8 && 0<=i+k ){
          
           if ((ennemie.equals(Detection.verfierCouleur(echequier.b[i+k][j])))){
               re[v]=(i+k)*10+j;
                 v++;
               break ;
           }
           else if ((moi.equals(Detection.verfierCouleur(echequier.b[i+k][j])))){
               break;
           }
           else{
                re[v]=(i+k)*10+(j); 
                v++; 
                k++;
           }
           
     }
         
             k=1; 
    while (0<=j-k && j-k<8){
          
           if ((ennemie.equals(Detection.verfierCouleur(echequier.b[i][j-k])))){
               re[v]=(i)*10+j-k;
                 v++;
               break ;
           }
           else if ((moi.equals(Detection.verfierCouleur(echequier.b[i][j-k])))){
               break;
           }
           else{
                re[v]=(i)*10+(j-k); 
                v++; 
                k++;
           }
           
     }
    
        k=1; 
         while (i-k<8 && 0<=i-k ){
          
           if ((ennemie.equals(Detection.verfierCouleur(echequier.b[i-k][j])))){
               re[v]=(i-k)*10+j;
                 v++;
               break ;
           }
           else if ((moi.equals(Detection.verfierCouleur(echequier.b[i-k][j])))){
               break;
           }
           else{
                re[v]=(i-k)*10+(j); 
                v++; 
                k++;
           }
           
     }
    
       
       
  
return re ;
    }
}
