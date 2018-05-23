public class Meeskond {
    protected String meeskonnanimi;
    protected double voidud;
    protected double kaotused;
    protected double varavad;
	protected double omale;
public Meeskond(String meeskonnanimi, double voidud, double kaotused, double varavad, double omale){
        this.meeskonnanimi=meeskonnanimi;
        this.voidud=voidud;
        this.kaotused=kaotused;
        this.varavad=varavad; 
		this.omale=omale;
}
public double voiduprotsent() {
    return voidud*100/(voidud+kaotused);
 }
 
public double varavatevahe() {
   return (varavad -- omale);
}

}



/*Meeskonna Borussia Dortmund võiduprotsent on 75.0 ja hooaja esimesel poolel löödi 11.0 väravat.
Meeskonna FC Barcelona võiduprotsent on 100.0 ja hooaja esimesel poolel löödi 13.0 väravat.
Meeskonna Chelsea võiduprotsent on 62.5 ja hooaja esimesel poolel löödi 8.0 väravat.
Meeskonna Juventus võiduprotsent on 50.0 ja hooaja esimesel poolel löödi 5.0 väravat.
Meeskonna Levadia võiduprotsent on 25.0 ja hooaja esimesel poolel löödi 3.0 väravat.*/