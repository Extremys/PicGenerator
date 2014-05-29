import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class PicGenerator { //classe main déplaçable dans Vue????

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedImage image= new BufferedImage(1, 1, BufferedImage.TYPE_3BYTE_BGR);
		Graphics2D impr= (Graphics2D) image.getGraphics();
		Filtre filter = new Filtre("U", 500, 10);
		Astre star = new Etoile();
		//Astre[] liste= new ArrayList();
		
		Vue vue = new Vue(600,600,image,impr,filter);
		
		vue.dessinerFond(1);
		//vue.enregistrerVue("test.jpg");
		vue.dessineEtoile(100);
		vue.enregistrerVue("test.jpg");
		vue.afficherVue("Exemple");
		
	       
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	       /*String nomFichier="Test1";
	    	
	       //nouveau.generate( nomFichier );

	       System.out.println( "Image générée." );*/
	       
	       //nouveau.afficheImage(nomFichier);
	       
	       /* JFrame f = new JFrame("Image générée");
	        f.setSize(800,800);
		   	ImageIcon img = new ImageIcon("Test-img.jpg");
		   	JLabel label = new JLabel(img);
		   	f.add(label);
		   	f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		   	f.setLocationRelativeTo(null);
		   	f.setVisible(true);*/
		   	
	}

}
