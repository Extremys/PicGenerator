
public abstract class Astre extends Vue{
	
	private int x; //Coordonnées du centre de l'objet
	private int y;
	
	public Astre(){
		
	}
	public Astre(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	
}
