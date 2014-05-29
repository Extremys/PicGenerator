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

	/*
	 * 
	public void dessineEtoileSur(Vue vue, int nbEtoile){ //Dessiner une seule instance d'étoile OK mais plusieurs méthodes dans classe Vue
		
		Random aleatoire = new Random();
		int PIX_SIZE = 1; //Défini la granularité d'écriture
		
		int h = this.getHauteur();
		int l= this.getLargeur();
		int x,y;
		double lambdaBorne= this.getFiltre().getLambdaAbsBorne();
		double largeurBande= this.getFiltre().getLargeurBande();
		double lambdaBruit;
		
		
		this.image = new BufferedImage( PIX_SIZE * h, PIX_SIZE * l, 

                BufferedImage.TYPE_3BYTE_BGR ); //création de l'image, format
		
		this.impression=(Graphics2D)this.image.getGraphics(); //conversion
		
		
        for( int i =0; i < h; i++ ){


            for( int j =0; j < l; j++ ){

                x = i * PIX_SIZE;

                y = j * PIX_SIZE;
//
                if ( (( x-x0)*( x-x0))+(( y-y0)*( y-y0)) < R*R ){

             	   teinte= seuilmin+aleatoire.nextInt(256-seuilmin);
 					if(teinte>=256){
 						teinte= aleatoire.nextInt(256);
 					                   }
 					else{
 						g.setColor( new Color(teinte, teinte, teinte) );
 					}
               
 					//teinte= seuilmin+aleatoire.nextInt(256-seuilmin);
                    
                }
//
                //System.out.println(lambdaBorne);
            	lambdaBruit= (aleatoire.nextInt((int)seuilBruit*10)*largeurBande/2)+lambdaBorne;
            	
            	System.out.println("Longueur d'onde écrite (avec bruit) = "+lambdaBruit+" nm.");
            	int nivGris=(int)(lambdaBruit%lambdaBorne);// Pour prendre en compte le decalage 1 -> 255 RGB
            	System.out.println(nivGris);
            	if(nivGris>=0){
            		
                   this.impression.setColor( new Color(nivGris, nivGris, nivGris) );
                   //System.out.println(this.impression.getColor());
            	   
            	}
            	
            	else{

            		System.out.println("Erreur");
            		System.out.println(this.impression.getColor());
            	   
            	}

               //fil the rectangles with the pixel blocks in chosen color
               
               System.out.println(this.impression.getColor());
               
               this.impression.fillRect( y, x , PIX_SIZE , PIX_SIZE );

            }


        }

	} */
}
