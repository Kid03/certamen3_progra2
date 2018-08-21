public class Battlefield {
        private Personaje p1;
        private Personaje p2;
        private PrintWriter p;
        private String atkP1;
        private String atkP2;
        public Battlefield (Personaje p1,Personaje p2, PrintWriter p){
                this.p1=p1;
                this.p2=p2;
                this.p=p;
        }
        public void Combatir (){
                Integer STP1=p1.energia;
                Integer STP2=p2.energia;
                if (p1 instanceof Guerrero){
                        atkP1=p1.combatir();
                }else{
                        atkP1=p1.encantar();
                }
                if (p2 instanceof Guerrero){
                        atkP2=p2.combatir();
                }else {
                        atkP2=p2.encantar();
                }
                atkP1.split(";");
                atkP2.split(";");
                
        }
}
