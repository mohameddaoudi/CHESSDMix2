/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inter;

import java.io.File;
import Detection.Detection;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Piece.*;
import java.util.ArrayList;

/**
 *
 * @author Daoudi
 */
public class echequier extends JFrame implements ActionListener{
    Panel a;
     public static Panel p;
    JButton aide;
   public  int fplacRec=-1;
   ImageIcon imgRec;
    public ImageIcon imgRec1;
    Panel container1 ;
    Panel c;
    JButton prec;
     public  static int old=-1,next=-1,m=0;
    public static player p1;
    //public static player p2;
    public static choixe k;
     public static int choi=-1;
    Panel container = new Panel();
   static int  clic = 1 , dplac = -1 , fplac = -1 ; 
     int [] t = new int [50];
      static public ArrayList <Integer> safeKingTab = new ArrayList();
    
    boolean estplien;
    // les Bottouns
    public static JButton [][] b ; 
    JButton e ; 
  public static  ImageIcon N = new ImageIcon();
  public static  ImageIcon F = new ImageIcon();
    //pieces noir
     static ImageIcon PN = new ImageIcon("PN.png");
   static  ImageIcon CN = new ImageIcon("CN.png");
   static  ImageIcon FN = new ImageIcon("FN.png");
    static ImageIcon KN= new ImageIcon("KN.png");  
    static ImageIcon TN = new ImageIcon("TN.png");
    static ImageIcon RN = new ImageIcon("RN.png");
       
    //pieces blanches
   static ImageIcon PB = new ImageIcon("PB.png");
   static ImageIcon CB = new ImageIcon("CB.png");
    static ImageIcon FB = new ImageIcon("FB.png");
    static ImageIcon KB= new ImageIcon("KB.png");  
    static ImageIcon TB = new ImageIcon("TB.png");
    static ImageIcon RB = new ImageIcon("RB.png");
      public static JScrollPane HistoryScroll;
     private final Label l1=new Label("Historiques des coup");
    public echequier (){
      
       prec=new JButton("PRECECDENT");
          HistoryScroll=new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
           HistoryScroll.setSize(150,150);
        HistoryScroll.setLocation(20,70);
        HistoryScroll.setToolTipText("lotfi gips");
         HistoryScroll.setToolTipText("raghib lok,xlfvkms:dcv");
          p1=new player("B");
          p1.setColor("B");
         this.setBackground(Color.yellow);
         this.setSize(1000,700);
         this.setVisible (true);
         this.setTitle("CHESS GAME");       
         this.setResizable(false);
         this.setLocationRelativeTo(null);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setLayout(new BorderLayout());
          // les panel
         
          container = new Panel();
          container1 = new Panel();
          
     
          aide=new JButton("aide");

 p = new Panel();
 p.setLayout(new GridLayout(1000,1));
   a = new Panel();
          container1.setLayout(new BorderLayout());
          a.setLayout(new GridLayout(2,1));
          l1.setBackground(Color.red);
         container1.add(l1,BorderLayout.NORTH);
                container1.add(HistoryScroll ,BorderLayout.CENTER ); 
          a.add(prec );
          a.add(aide );
           container1.add(a ,BorderLayout.SOUTH); 

         
          container.setLayout(new GridLayout(8,8));
            int k = 1;
            //creation de table de jeux .
           
            b= new JButton [8][8];
            for(int i=0;i<8;i++)
                for(int j=0;j<8;j++)
                {
                    e= new JButton ();
                    b[i][j] = e ;
                    container.add(e);
                    e.setName(""+k);
                   
                    k++;
                    if ((i%2==0 && j%2==0)|| i%2!=0 && j%2!=0 )
                       b[i][j].setBackground(new Color(225,182,108));
                    else 
                       b[i][j].setBackground(new Color(136,68,0));
                    //add action listener
                    b[i][j].addActionListener(this);
                }
            // affecter les image au boutons ;
            // IMAGES NOIRS 
                    for(int j=0;j<8;j++)
                        {
                        b[1][j].setIcon(PN);
                         if ((j==0) ||( j==7))
                        b[0][j].setIcon(TN);
                         if ((j==1 || j==6))
                        b[0][j].setIcon(CN);
                         if ((j==2 || j==5))
                        b[0][j].setIcon(FN);
                         if (j==3)
                        b[0][j].setIcon(RN);
                         if (j==4)
                        b[0][j].setIcon(KN);
                        }
                // IMAGES BLANCHES 
                   for(int j=0;j<8;j++)
                        { 
                        b[6][j].setIcon(PB);
                        int i=7;
                         if (j==0|| j==7)
                        b[i][j].setIcon(TB);
                         if (j==1 || j==6)
                        b[i][j].setIcon(CB);
                         if (j==2 || j==5)
                        b[i][j].setIcon(FB);
                         if (j==3)
                        b[i][j].setIcon(RB);
                         if (j==4)
                        b[i][j].setIcon(KB);   
                        }
              this.add(container,BorderLayout.CENTER);
              this.add(container1,BorderLayout.EAST);
              this.pack();
                 prec.addActionListener(new precAction());
                    aide.addActionListener(new aideAction());
              
      }
       /****************************************************************/
        public void actionPerformed(ActionEvent e){
       /**************************************************************/
       if(choi==1){ 
          int i=estnoirdame()/10; int  j=estnoirdame()%10;
       switch(k.getChoi()){
                case "reine" :
                 //   deja=true;
                    b[i][j].setIcon(null);
                    b[i][j].setIcon(RN);
                    break;
                case "fou" :
                   // deja=true;
                     b[i][j].setIcon(FN);
                    break;
                case "tour" :
                    //deja=true;
                     b[i][j].setIcon(TN);
                    break;
                case "chevelier" :
                   // deja=true;
                     b[i][j].setIcon(CN);
                    break;
            }
       choi=-1;
       estnoirdame();
      }
       /****************************************************************/
       if(choi==0){ 
          int i=estblancdame()/10; int  j=estblancdame()%10;
             switch(k.getChoi()){
                case "reine" :
                 //   deja=true;
                    b[i][j].setIcon(null);
                    b[i][j].setIcon(RB);
                    break;
                case "fou" :
                   // deja=true;
                     b[i][j].setIcon(FB);
                    break;
                case "tour" :
                    //deja=true;
                     b[i][j].setIcon(TB);
                    break;
                case "chevelier" :
                   // deja=true;
                     b[i][j].setIcon(CB);
                    break;
            }
             choi=-1;
             estblancdame();
      }
   
       estplien=Detection.verifierPlein(((JButton)e.getSource()));
     
  if(estplien && clic==1)
   {

           System.out.println("premir clic");
          dplac= Detection.emplacement((JButton)e.getSource()); 
           imgRec=getImage(dplac/10,dplac%10);
   if ( "P".equals(Detection.verfierType((JButton)e.getSource())))
   {
       System.out.print("zsd");
   t = Pion.verifierDepPion((int)dplac/10 ,(int)dplac%10);
   }
   else if ( "C".equals(Detection.verfierType((JButton)e.getSource())))
   {
   t = Cavalier.verifierDepCavalier((int)dplac/10 , (int) dplac%10);
   }
  
   else if ( "F".equals(Detection.verfierType((JButton)e.getSource())))
   {
   t = Fou.verifierDepFou((int)dplac/10 , (int)dplac%10);
   }
  else if ( "T".equals(Detection.verfierType((JButton)e.getSource())))
   {
   t = Tour.verifierDepTour((int)dplac/10 , (int)dplac%10);
   }
    else if ( "K".equals(Detection.verfierType((JButton)e.getSource())))
   {
   t = King.verifierDepKing((int)dplac/10 , (int)dplac%10);

 if( "B".equals(Detection.verfierCouleur((JButton)e.getSource()))){
       
           echequier.safeKingTab=Detection.safeKingB();
       
       
   }
    
  else if( "N".equals(Detection.verfierCouleur((JButton)e.getSource()))){
       
           echequier.safeKingTab=Detection.safeKingN();
       
       
   }
        for(int g=0;g<t.length;g++){
           for(int eg=0;eg< echequier.safeKingTab.size();eg++)  {
               
               if(t[g]==echequier.safeKingTab.get(eg))
                   t[g]=-2;
               
           }
           Detection.afficherA(safeKingTab);
      }
   }
    else if ( "R".equals(Detection.verfierType((JButton)e.getSource())))
   {
   t = Reine.verifierDepReine((int)dplac/10 , (int) dplac%10);
   }
  
     clic=2;
    
       }
      else if( Detection.verifierPlein(((JButton)e.getSource()))&& clic==2)
      {
          
          
         System.out.print("zsd");
      fplac= Detection.emplacement((JButton)e.getSource());
       imgRec1=getImage(fplac/10,fplac%10);
        System.out.println(" plein deusieme clic "+dplac);
        
      
      
      for (int i=0 ;i<t.length;i++)
      {
      if (t[i]==fplac){
          fplacRec=fplac ;
          //imgRec=(ImageIcon)b[fplac/10][fplac%10].getIcon();
         Piece.deplacerIcon ( dplac/10 ,dplac%10  ,fplac/10 ,fplac%10 );  
      }
     
      
      }
      clic=1;
   
      }
       else if( !(Detection.verifierPlein(((JButton)e.getSource()))) && clic==2)
       {
       System.out.println("vide deusieme clic");
       fplac= Detection.emplacement((JButton)e.getSource());
       imgRec1=getImage(fplac/10,fplac%10);
       for (int i=0 ;i<t.length;i++)
       {
       if (t[i]==fplac)
       Piece.deplacerIcon ( dplac/10 ,dplac%10  ,fplac/10 ,fplac%10 );
       }
       clic=1;
       for (int i=0;i<t.length;i++ ){t[i]=-1;}
       }
  
       /*******************************************************************/
   
   }
   
 
  
   
   
   
   

    
    /******************** roi***************************/
        

/**********************reine ///////////////////*/
   
  
    
    @SuppressWarnings("empty-statement")
    /*public int [] verifierDepReine(int i , int j){
    int
    
    }*/
     //// pion noir dame 
    
   public  static int   estnoirdame(){
     
       int i=7;
      
       for (int j=0;j<8;j++){
            if("P".equals(Detection.verfierType(echequier.b[i][j])) ){
           if(Detection.verfierCouleur (b[i][j])=="N" )
               return i*10+j;
       }
       }
       return -1 ;
   }
   /*********************************************/
   public static int  estblancdame(){
       int i=0;
       
       for (int j=0;j<8;j++){
            if("P".equals(Detection.verfierType(echequier.b[i][j])) ){
           if(Detection.verfierCouleur (b[i][j])=="B" )
               return i*10+j;
       }
       }
       return -1 ;
   }
   /**************************************************/
     
   public static void appellerchoix(){
       
        
        int i,j;
       
        
        if(estnoirdame()>=0){
          choi=1;
         
           k =new choixe();
           
             
      
         }
        else if(estblancdame()>=0){
             choi=0;
             k=new choixe();
              
         }
        else
        {choi=-1;}
        
    }
   
   
    public ImageIcon  getImage(int i , int j){
        return (ImageIcon)b[i][j].getIcon();
    }
    
    public static void nouveaux(){
        echequier.p1.color="B";
      
        for(int j=0;j<8;j++)
                        { 
                        echequier.b[6][j].setIcon(PB);
                        int i=7;
                         if (j==0|| j==7)
                        b[7][j].setIcon(TB);
                         if (j==1 || j==6)
                        b[7][j].setIcon(CB);
                         if (j==2 || j==5)
                        b[7][j].setIcon(FB);
                         if (j==3)
                        b[7][j].setIcon(RB);
                         if (j==4)
                        b[7][j].setIcon(KB);   
                        }
         for(int j=0;j<8;j++)
                        {
                        echequier.b[1][j].setIcon(PN);
                         if ((j==0) ||( j==7))
                        echequier.b[0][j].setIcon(TN);
                         else if ((j==1 || j==6))
                          echequier.b[0][j].setIcon(CN);
                         else if ((j==2 || j==5))
                        echequier.b[0][j].setIcon(FN);
                         else if (j==3)
                        echequier.b[0][j].setIcon(RN);
                         else if (j==4)
                        echequier.b[0][j].setIcon(KN);
                        
                        for(int i=2;i<6;i++)
                             {echequier.b[i][j].setIcon(null);
                              
                             }                       }
        
    }
    /* public static void setOLdDeplacer(int i , int j ){
    old =i*10+j;
    }
    public static int getOLdDeplacer(){
    return old ;
    }
    public static void setNextDeplacer(int i , int j ){
    next =i*10+j;
    }
    public static int getNextDeplacer(){
    return next ;
    }*/
     public class precAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
       
     b[dplac/10][dplac%10].setIcon(imgRec);
     b[fplac/10][fplac%10].setIcon(imgRec1);
     /*deplacerIcon (getNextDeplacer()/10 , getNextDeplacer()%10 , getOLdDeplacer()/10 , getOLdDeplacer()%10 );
     b[getOLdDeplacer()/10 ][getOLdDeplacer()%10].setIcon(imgRec);*/
         p1.setColor(Detection.verfierCouleur(b[dplac/10][dplac%10]));
        System.out.println(   p1.getColor());
        }
         
     }
     public class aideAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            
	  try {
 
		if ((new File("C:\\Program Files\\Chess_HOLD\\Manuel.pdf")).exists()) {
 
			Process p = Runtime
			   .getRuntime()
			   .exec("rundll32 url.dll,FileProtocolHandler C:\\Program Files\\Chess_HOLD\\Manuel.pdf");
			p.waitFor();
 
		} else {
 
			System.out.println("File is not exists");
 
		}
 
		System.out.println("Done");
 
  	  } catch (Exception ex) {
		ex.printStackTrace();
	  }
           
        }
          
      }
     
   //save king : on peut cree une methode qui fait un teste sur les mennace des composants d'adversere et les compare avec la position du king ;
}    




