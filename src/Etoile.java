import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.Random;


public class Etoile extends Astre{
	
	private double rayon;
	
	//lambda associé? 

	public Etoile(){
		
	}
	
	public Etoile(int x, int y) {
		super(x, y);
		this.rayon=0;
		// TODO Auto-generated constructor stub
	}

	public Etoile(int x, int y, double rayon) {
		super(x, y);
		this.rayon = rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	public void generationEtoile(){
		
	}

	
	/*public void dessineEtoile(Vue vue){
		
		Random aleatoire = new Random();
		
		double variationLuminosite=0.1;//Pourcentage de variation possible autour de la longueur d'onde max
        int number= 15; //nombre d'étoiles
        int x,y = 0;

        int PIX_SIZE = 1; //Défini la granularité d'écriture



        //image size in pixel blocks

        int X = 500;

        int Y = 500;

        
        
        int R=50;
        int teinte=0;
        int seuilmax=10;
        int seuilmin=100;
        
        //for( int k =0; k < number; k++ ){
        int x0=250;
        int y0=250;
        //Color couleur = new Color(255, 255, 255);
        //Color couleur = new Color(teinte, teinte, teinte);
        
        //int R0=50; //epaisseur de peau

        BufferedImage bi = new BufferedImage( PIX_SIZE * X, PIX_SIZE * Y, 

                                              BufferedImage.TYPE_3BYTE_BGR );

        Graphics2D g=(Graphics2D)bi.getGraphics();

        String filename =  prefixe + "-img.jpg";


        for( int i =0; i < X; i++ ){



            for( int j =0; j < Y; j++ ){



                x = i * PIX_SIZE;

                y = j * PIX_SIZE;

               // équation du dessin (cercle)

               if ( (( x-x0)*( x-x0))+(( y-y0)*( y-y0)) < R*R ){

            	   teinte= seuilmin+aleatoire.nextInt(256-seuilmin);
					if(teinte>=256){
						teinte= aleatoire.nextInt(256);
					                   }
					else{
						g.setColor( new Color(teinte, teinte, teinte) );
					}
              
					//teinte= seuilmin+aleatoire.nextInt(256-seuilmin);
                   


               }else{

            	   teinte= aleatoire.nextInt(seuilmax+1);
            	   if(teinte>=0 && teinte<seuilmax){
                   g.setColor( new Color(teinte, teinte, teinte) );
            	   }
            	   else{
            		   teinte= aleatoire.nextInt(seuilmax+1);
            	   }

               

               }



               //fil the rectangles with the pixel blocks in chosen color
               
               //System.out.println(g.getColor());
               
               graph.fillRect( y, x , PIX_SIZE , PIX_SIZE );

        

            }

        

        }

        

        graph.dispose();
		
		
	}*/
}
