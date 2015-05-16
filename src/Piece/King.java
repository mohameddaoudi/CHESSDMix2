/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Piece;

import static inter.echequier.b;

/**
 *
 * @author hamza
 */
import Detection.Detection;
import static Piece.Piece.initialiserTableau;
import inter.*;
public class King extends Piece  {
    public static int [] verifierDepKing(int i , int j){
    int v=0;
       int[] tr = new int [25] ;
       initialiserTableau(tr);
   
  
       String moi =  Detection.verfierCouleur(echequier.b[i][j]);
       String   ennemie="";
        if("N".equals(moi)){
        ennemie="B";
 
       }
       else{
           ennemie="N"; 
           
       }
       
     
      
       if (i<8 && 0<=i ){
          
     
          if (j-1<8 && 0<=j-1 && !(moi.equals(Detection.verfierCouleur(b[i][j-1])))   ){
               tr[v]=(i)*10+j-1;
               v++;
               
           }
          if (j+1<8 && 0<=j+1 && !(moi.equals(Detection.verfierCouleur(b[i][j+1])))  ){
               tr[v]=(i)*10+j+1;
               v++;
               
           }
       }
       
       
       
       
       
       
      if (i-1<8 && 0<=i-1 ){
          
           if (!(moi.equals(Detection.verfierCouleur(b[i-1][j])))){
               tr[v]=(i-1)*10+j;
               v++;
               
           }
          
          if ( j-1<8 && 0<=j-1 && !(moi.equals(Detection.verfierCouleur(b[i-1][j-1])))  ){
               tr[v]=(i-1)*10+j-1;
               v++;
               
           }
        
            if ( j+1<8 && 0<=j+1 && !(moi.equals(Detection.verfierCouleur(b[i-1][j+1])))  ){
               tr[v]=(i-1)*10+j+1;
               v++;
               
           }
       }
      
      
      
      if (i+1<8 && 0<=i+1 ){
          
           if (!(moi.equals(Detection.verfierCouleur(b[i+1][j])))){
               tr[v]=(i+1)*10+j;
               v++;
               
           }
           
          if (j-1<8 && 0<=j-1 && !(moi.equals(Detection.verfierCouleur(b[i+1][j-1])))   ){
               tr[v]=(i+1)*10+j-1;
               v++;
               
           }
            if (j+1<8 && 0<=j+1 && !(moi.equals(Detection.verfierCouleur(b[i+1][j+1])))   ){
               tr[v]=(i+1)*10+j+1;
               v++;
               
           }
      
       
    }    
    /*  for(int r=0;r<echequier.safeKingTab.length;r++){
          for(int p=0;p<tr.length;p++)
          {
          if(echequier.safeKingTab[r]== tr[p])
          {
          tr[p]=-1;
      }
      }
      }*/
    
    
 return tr;
}




}