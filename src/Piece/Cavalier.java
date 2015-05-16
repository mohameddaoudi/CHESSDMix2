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
public class Cavalier extends Piece{
    
    
    public  static int[] verifierDepCavalier(int i , int j){
      int[] tc = new int [25] ;
      initialiserTableau(tc);
      // detection de joueur et ennemie
       String moi =  Detection.verfierCouleur(echequier.b[i][j]);
      String   ennemie="";
       if("N".equals(moi)){
       ennemie="B";
       }
       else{
           ennemie="N"; 
       }
       
      
       
           if (i+1<8 && i+1>=0)//0<=i<8
           {
               if (j+2<8 && j+2>=0)
                    if (!(moi.equals(Detection.verfierCouleur(echequier.b[i+1][j+2])))) 
                        tc[0]=(i+1)*10+(j+2);
               if (j-2>=0 && j-2<8)
                    if (!(moi.equals(Detection.verfierCouleur(echequier.b[i+1][j-2])))) 
                        tc[1]=(i+1)*10+(j-2);
           }
           if (i-1>=0 && i-1<8)
           {
               if (j+2<8 && j+2>=0)
                    if (!(moi.equals(Detection.verfierCouleur(echequier.b[i-1][j+2])))) 
                        tc[2]=(i-1)*10+(j+2);
               if (j-2>=0 && j-2<8)
                   if (!(moi.equals(Detection.verfierCouleur(echequier.b[i-1][j-2])))) 
                        tc[3]=(i-1)*10+(j-2);
           }
           if (j+1<8 && j+1 >=0)
           {
               if (i+2<8 && i+2>=0)
                   if (!(moi.equals(Detection.verfierCouleur(echequier.b[i+2][j+1])))) 
                        tc[4]=(i+2)*10+(j+1);
               if (i-2>=0 && i-2 <8)
                   if (!(moi.equals(Detection.verfierCouleur(echequier.b[i-2][j+1])))) 
                        tc[5]=(i-2)*10+(j+1);
           }
           if (j-1<8 && j-1>=0)
           {
               if (i+2<8 && i+2>=0)
                   if (!(moi.equals(Detection.verfierCouleur(echequier.b[i+2][j-1])))) 
                        tc[6]=(i+2)*10+(j-1);
               if (i-2<8 && i-2>=0)
                   if (!(moi.equals(Detection.verfierCouleur(echequier.b[i-2][j-1])))) 
                        tc[7]=(i-2)*10+(j-1);
           }
       return tc ;
    }
      
  
   
}
   

