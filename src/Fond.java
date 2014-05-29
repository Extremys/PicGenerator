import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.Random;


public class Fond {
	
	private int seuilBruit; //valeur seuil de la variation du bruit en partant d'un extremum de la bande passante 
	
	//ou pourcentage de bruit
	
	public void dessinerFondSur(Vue vue){
		
		Random aleatoire = new Random();
		int PIX_SIZE = 1; //Défini la granularité d'écriture
		
		int h = vue.getHauteur();
		int l= vue.getLargeur();
		Filtre filtre= vue.getFiltre();
		BufferedImage img= vue.getImage();
		BufferedImage bi = new BufferedImage( PIX_SIZE * h, PIX_SIZE * l, 

                BufferedImage.TYPE_3BYTE_BGR ); 
		
		Graphics2D graph = vue.getImpression();
		
		
	}
	
	

}
