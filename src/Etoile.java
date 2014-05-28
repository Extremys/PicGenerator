
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

}
