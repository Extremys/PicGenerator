import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;


public class Vue { //ici qu'on va assembler l'image par écritures successives  d'abor le fond puis les objets
	
	//taille des pixels???
	private int hauteur; //Pour la taille & résolution
	private int largeur;
	private BufferedImage image; //image à créer
	private Graphics2D impression; //container d'écriture de l'image pour affichage
	//private Filtre filtre;
	private double lambdaMin; //Plage de longueur d'onde de la capture
	private double lambdaMax;
	
	private Fond fond; //constitué également d'un fond
	private ArrayList<Astre> astre; //Liste d'astres contenus
	

}
