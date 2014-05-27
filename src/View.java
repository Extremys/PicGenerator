import java.util.Random;

import java.awt.Color;

import java.awt.Graphics2D;

import java.awt.image.BufferedImage;

import java.io.BufferedWriter;

import java.io.File;

import java.io.FileOutputStream;

import java.io.IOException;

import java.io.OutputStreamWriter;

import javax.imageio.IIOImage;

import javax.imageio.ImageIO;

import javax.imageio.ImageWriteParam;

import javax.imageio.ImageWriter;

import javax.imageio.plugins.jpeg.JPEGImageWriteParam;

import javax.imageio.stream.ImageOutputStream;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class View {


    public static String generate( String prefixe ) throws Exception{



        Random aleatoire = new Random();
        int number= 15; //nombre d'étoiles
        int x,y = 0;

        int PIX_SIZE = 1; //Défini la granularité d'écriture



        //image size in pixel blocks

        int X = 500;

        int Y = 500;

        
        
        int R=5;
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
               
               g.fillRect( y, x , PIX_SIZE , PIX_SIZE );

        

            }

        

        }

        

        g.dispose();



        saveToFile( bi, new File( filename ) ); 

        return filename;



    }//fin methode  


    public static void saveToFile( BufferedImage img, File file ) throws IOException {

        

        ImageWriter writer = null;

        java.util.Iterator iter = ImageIO.getImageWritersByFormatName("jpg");

        

        if( iter.hasNext() ){

            writer = (ImageWriter)iter.next();

        }

        

        ImageOutputStream ios = ImageIO.createImageOutputStream( file );

        writer.setOutput(ios);



        ImageWriteParam param = new JPEGImageWriteParam( java.util.Locale.getDefault() );

        param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT) ;

        param.setCompressionQuality(0.98f);



        writer.write(null, new IIOImage( img, null, null ), param);

    

    }//fin methode 

    public void afficheImage(String filename){
    	
    	JFrame f = new JFrame("Image générée");
    	f.setSize(800,800);
    	ImageIcon img = new ImageIcon(filename);
    	JLabel label = new JLabel(img);
    	f.add(label);
    	f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    	f.setVisible(true);
    	
    }
	
	
}
