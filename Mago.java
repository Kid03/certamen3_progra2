public class Mago extends Personaje {
	private String poder;
	public Mago (String nombre,Integer energia,String poder){
		super (nombre,energia);
		this.poder=poder;
	}
	public void encantar (){}
@Override
	public String toString(){
		return null;
	}
}
