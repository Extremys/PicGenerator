import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class PicGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JPEGCreator nouveau = new JPEGCreator();
	       
	       String nomFichier="Test1";
	    	
	       nouveau.generate( nomFichier );

	       System.out.println( "Image g�n�r�e." );
	       
	       //nouveau.afficheImage(nomFichier);
	       
	        JFrame f = new JFrame("Image g�n�r�e");
	        f.setSize(800,800);
		   	ImageIcon img = new ImageIcon("Test-img.jpg");
		   	JLabel label = new JLabel(img);
		   	f.add(label);
		   	f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		   	f.setVisible(true);
		   	
	}

}
