public abstract class Personaje {
	private String nombre;
	private Integer energia;
	public Personaje (String nombre,Integer energia){
		this.nombre=nombre;
		this.energia=150;
	}
	public String getNombre(){
		return nombre;
	}
	public Integer energia (){
		return  energia;
	}
	public void alimentarse (Integer plusEnergia){
		energia=energia+plusEnergia;
	}
	public void consumirEnergia (Integer minusEnergia){
		energia=energia-minusEnergia;
	}
@Override
	public abstract String toString ();
}
