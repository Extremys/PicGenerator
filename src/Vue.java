import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Vue { //ici qu'on va assembler l'image par �critures successives  d'abor le fond puis les objets
	
	//taille des pixels???
	private int hauteur; //Pour la taille & r�solution
	private int largeur;
	private BufferedImage image; //image � cr�er
	private Graphics2D impression; //container d'�criture de l'image pour affichage
	private Filtre filtre;
	
	/*private double lambdaMin; //Plage de longueur d'onde de la capture
	private double lambdaMax;*/
	
	//private Fond fond; //constitu� �galement d'un fond
	//private ArrayList<Astre> astre; //Liste d'astres contenus
	
	//private int nombreAstre; //nombre astre contenu
	
	public Vue(){
		
	}

	public Vue(int hauteur, int largeur, BufferedImage image,
			Graphics2D impression, Filtre filtre/*, Fond fond,*/
			/*ArrayList<Astre> astre*/) {
		super();
		this.hauteur = hauteur;
		this.largeur = largeur;
		this.image = image;
		this.impression = impression;
		this.filtre = filtre;
		//this.fond = fond;
		//this.astre = astre;
	}
	
		
	public int getHauteur() {
		return hauteur;
	}







	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}







	public int getLargeur() {
		return largeur;
	}







	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}







	public BufferedImage getImage() {
		return image;
	}







	public void setImage(BufferedImage image) {
		this.image = image;
	}







	public Graphics2D getImpression() {
		return impression;
	}







	public void setImpression(Graphics2D impression) {
		this.impression = impression;
	}







	public Filtre getFiltre() {
		return filtre;
	}







	public void setFiltre(Filtre filtre) {
		this.filtre = filtre;
	}






/*
	public Fond getFond() {
		return fond;
	}







	public void setFond(Fond fond) {
		this.fond = fond;
	}







	public ArrayList<Astre> getAstre() {
		return astre;
	}







	public void setAstre(ArrayList<Astre> astre) {
		this.astre = astre;
	}*/







	public void enregistrerVue(String nomFichier){


		File outputfile = new File(nomFichier);
		try {
			ImageIO.write(this.image, "jpg", outputfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		//saveToFile( this.image, new File( nomFichier ) );
	}
	
	

	public void afficherVue(String nomFichier){
		
		File copieVue = new File(nomFichier+"-temp");
		try {
			ImageIO.write(this.image, "jpg", copieVue);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//pour parer la corruption du fichier une fois captur� on enregistre une copie temporaire
		
		JFrame f = new JFrame("Vue g�n�r�e");
        f.setSize(this.hauteur,this.largeur);
	   	ImageIcon capture = new ImageIcon(nomFichier+"-temp");
	   	JLabel label = new JLabel(capture);
	   	f.add(label);
	   	f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	   	f.setVisible(true);
	   	copieVue.delete(); //on efface la copie cr��e v�rifier si c'est un dossier...
	   	
	}
	
	
public void dessinerFond(double seuilBruit /*en pourcentage*/){
		
		Random aleatoire = new Random();
		int PIX_SIZE = 1; //D�fini la granularit� d'�criture
		
		int h = this.getHauteur();
		int l= this.getLargeur();
		double lambdaBorne= this.getFiltre().getLambdaAbsBorne();
		double largeurBande= this.getFiltre().getLargeurBande();
		double lambdaBruit=0.0;
		
		
		this.image = new BufferedImage( PIX_SIZE * h, PIX_SIZE * l, 

                BufferedImage.TYPE_3BYTE_BGR ); //cr�ation de l'image, format
		
		this.impression=(Graphics2D)this.image.getGraphics(); //conversion
		
		
        for( int i =0; i < h; i++ ){


            for( int j =0; j < l; j++ ){

                h = i * PIX_SIZE;

                l = j * PIX_SIZE;


            	lambdaBruit= (aleatoire.nextInt((int)seuilBruit*10)*largeurBande/2)+lambdaBorne;
            	
            	System.out.println("Longueur d'onde �crite (avec bruit) = "+lambdaBruit+" nm.");
            	int nivGris=(int)(lambdaBruit/lambdaBorne);// Pour prendre en compte le decalage 1 -> 255 RGB
            	   
            	if(nivGris>=0){
            		
                   this.impression.setColor( new Color(nivGris, nivGris, nivGris) );
            	   
            	}
            	
            	else

            		System.out.println("Erreur");
            		System.out.println(this.impression.getColor());
            	   
            	}

               //fil the rectangles with the pixel blocks in chosen color
               
               System.out.println(this.impression.getColor());
               
               this.impression.fillRect( l, h , PIX_SIZE , PIX_SIZE );

            }


        }
		
		
	}

