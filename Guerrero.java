import java.util.Random;
public class Guerrero extends Personaje {
        String arma;
        public Guerrero (String nombre, Integer energia, String arma){
                super (nombre,150);
                this.arma=arma;
        }
        public String combatir(){
                Integer n =(int) (Math.random()*4);
                if (n==0){
                        return (this+"GolpeDirecto;20");
                }else if (n==1){
                        return (this+"GiroLetal;30");
                }else if (n==2){
                        consumirEnergia(21);
                        return (this+"SuperArma;70");
                }else {
                        return (this+"PierdeTurno;0");
                }
        }
@Override
        public String toString (){
                return String.format("%s;",getNombre());
        }
}
