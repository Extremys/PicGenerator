import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;


public class Vue { //ici qu'on va assembler l'image par �critures successives  d'abor le fond puis les objets
	
	//taille des pixels???
	private int hauteur; //Pour la taille & r�solution
	private int largeur;
	private BufferedImage image; //image � cr�er
	private Graphics2D impression; //container d'�criture de l'image pour affichage
	//private Filtre filtre;
	private double lambdaMin; //Plage de longueur d'onde de la capture
	private double lambdaMax;
	
	private Fond fond; //constitu� �galement d'un fond
	private ArrayList<Astre> astre; //Liste d'astres contenus
	

}
