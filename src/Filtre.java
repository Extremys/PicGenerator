import java.awt.Color;


public class Filtre {
	
	private double lambda; //Pour un filtre ne laissant passer qu'une longueur d'onde
	
	private double lambdaMin;
	private double lambdaMax;
	
	//private int delta; //pas de discretisation de la plage de longueur d'onde cas non lineaire
	
	//???private double[] lambda; //Quand le filtre laisse passer une plage de long d'onde donnée à un delta donné 

	
	public Color conversionLambdaToRGB(){
		
		int intensite= (int) ((this.lambda*255)/(lambdaMax-lambdaMin)); //Les pixels sont codés sur 256 bits
		
		Color nivGris = new Color(intensite,intensite,intensite);

		return nivGris;

	}
}
