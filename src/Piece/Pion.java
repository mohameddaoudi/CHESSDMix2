/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Piece;

import Detection.*;
import inter.*;

/**
 *
 * @author hamza
 */
public class Pion extends Piece {
    
    
     public static int [] verifierDepPion(int i , int j){
       int[] t =new int [6];//-1
      
         initialiserTableau(t);
         
         
       if ("N".equals(Detection.verfierCouleur(echequier.b[i][j])) &&  i<7)
       { 
          
           if (i==1 && !Detection.verifierPlein(echequier.b[i+1][j])){
               t[0]=(i+1)*10+j;
               if(!Detection.verifierPlein(echequier.b[i+2][j]))
               t[1]=(i+2)*10+j;
           }
           
           if(!Detection.verifierPlein(echequier.b[i+1][j])) {
              t[0]=(i+1)*10+j;
       
           }
           
          
           
           if(j<7 ){
                
               if ((Detection.verifierPlein(echequier.b[i+1][j+1])) && ("B".equals(Detection.verfierCouleur(echequier.b[i+1][j+1])) ))/* */
            {
                
               t[2]=(i+1)*10+j+1;
             
             
            }}
           
           if (j>0 ){
            if ((Detection.verifierPlein(echequier.b[i+1][j-1]) && "B".equals(Detection.verfierCouleur(echequier.b[i+1][j-1])) ))
            {
                t[3]=(i+1)*10+j-1;
            }   }    
           
       }
         // +++++++++++++++++++++++++++++++  pion blanc  ++++++++++++++++++
       
       if ("B".equals(Detection.verfierCouleur(echequier.b[i][j])) &&  i>0)
       { 
          
           if (i==6 && !Detection.verifierPlein(echequier.b[i-1][j])){
               t[0]=(i-1)*10+j;
               if(!Detection.verifierPlein(echequier.b[i-2][j]))
               t[1]=(i-2)*10+j;
           }
           
           if(!Detection.verifierPlein(echequier.b[i-1][j])) {
              t[0]=(i-1)*10+j;
       
           }
           
          
           
           if(j<7 ){
                
             if ((Detection.verifierPlein(echequier.b[i-1][j+1]) && "N".equals(Detection.verfierCouleur(echequier.b[i-1][j+1])) )) 
            {
                
               t[2]=(i-1)*10+j+1;
             
             
            }}
           
           if (j>0 ){
            if ((Detection.verifierPlein(echequier.b[i-1][j-1]) && "N".equals(Detection.verfierCouleur(echequier.b[i-1][j-1])) ))
            {
                t[3]=(i-1)*10+j-1;
            }   }    
           
       }
       
       
         
       return t ;
   }
   
    public static int [] verifierDepPionCap(int i , int j){
       int[] t =new int [6];//-1
      
         initialiserTableau(t);
         
         
       if ("N".equals(Detection.verfierCouleur(echequier.b[i][j])) &&  i<7)
       { 
          

           if(j<7 ){
                
               if ((Detection.verifierPlein(echequier.b[i+1][j+1])) && ("B".equals(Detection.verfierCouleur(echequier.b[i+1][j+1])) ))/* */
            {
                
               t[0]=(i+1)*10+j+1;
             
             
            }}
           
           if (j>0 ){
            if ((Detection.verifierPlein(echequier.b[i+1][j-1]) && "B".equals(Detection.verfierCouleur(echequier.b[i+1][j-1])) ))
            {
                t[1]=(i+1)*10+j-1;
            }   }    
           
       }
         // +++++++++++++++++++++++++++++++  pion blanc  ++++++++++++++++++
       
       if ("B".equals(Detection.verfierCouleur(echequier.b[i][j])) &&  i>0)
       { 
          
           
           
          
           
           if(j<7 ){
                
             if ((Detection.verifierPlein(echequier.b[i-1][j+1]) && "N".equals(Detection.verfierCouleur(echequier.b[i-1][j+1])) )) 
            {
                
               t[0]=(i-1)*10+j+1;
             
             
            }}
           
           if (j>0 ){
            if ((Detection.verifierPlein(echequier.b[i-1][j-1]) && "N".equals(Detection.verfierCouleur(echequier.b[i-1][j-1])) ))
            {
                t[1]=(i-1)*10+j-1;
            }   }    
           
       }
       
       
         
       return t ;
   }    
}
