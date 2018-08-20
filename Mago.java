import java.util.Random;
public class Mago extends Personaje {
        private String poder;
        public Mago (String nombre,Integer energia,String poder){
                super (nombre,100);
                this.poder=poder;
        }
        public String encantar (){
                Integer n = (int) (Math.random()*4);
                consumirEnergia (2);
                if (n==0){
                        return (this+"Llamarada;20");
                }else if (n==1){
                        n = (int) (Math.random()*1);
                        if (n==1){
                                return (this+"Incendio;40");
                        }
                        return (this+"Incendio;35");
                }else if (n==2){
			alimentarse(30);
                        return (this+"Explosion;60");
                }else {
                        alimentarse(2);
                        return (this+"PierdeTurno;0");
                }
        }
@Override
        public String toString(){
                return String.format("%s;",getNombre());
	}
}
