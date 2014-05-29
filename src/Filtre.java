import java.awt.Color;


public class Filtre { // plut�t filtre visuel de floutage...etc...
	
	private String nomFiltre; //en faire une �num�ration avec une s�rie de filtres pr�d�finis?
	private double lambda; //Pour un filtre ne laissant passer qu'une longueur d'onde en moyenne
	private double largeurBande;
	
	/*private double lambdaMin;
	private double lambdaMax;*/
	
	//private int delta; //pas de discretisation de la plage de longueur d'onde cas non lineaire
	
	//???private double[] lambda; //Quand le filtre laisse passer une plage de long d'onde donn�e � un delta donn� 

	public Filtre(String nomFiltre, double lambda, double largeurBande) {
		super();
		this.nomFiltre = nomFiltre;
		this.lambda = lambda;
		this.largeurBande = largeurBande;
	}
	
	
	public String getNomFiltre() {
		return nomFiltre;
	}







	public void setNomFiltre(String nomFiltre) {
		this.nomFiltre = nomFiltre;
	}







	public double getLambda() {
		return lambda;
	}







	public void setLambda(double lambda) {
		this.lambda = lambda;
	}







	public double getLargeurBande() {
		return largeurBande;
	}







	public void setLargeurBande(double largeurBande) {
		this.largeurBande = largeurBande;
	}



	public double getLambdaAbsBorne(){
		
		return this.lambda-(this.largeurBande/2.0);
	}



	public Color conversionLambdaToRGB(){
		
		
		
		int intensite= (int) ((this.lambda*255)/(largeurBande)); //Les pixels sont cod�s sur 256 bits
		
		Color nivGris = new Color(intensite,intensite,intensite);

		return nivGris;

	}


}
