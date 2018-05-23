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
    return Math.ceil(voidud*100/(voidud+kaotused));
 }
 
public double varavatevahe() {
   return Math.ceil(varavad-omale);
}

}



/*

Meeskonna Atletico Madrid võiduprotsent on 83.0 ning siiani on löödud 58.0 väravat ja oma väravasse on lastud 22.0 väravat. Väravatevahe on: 36.0 väravat.

Meeskonna FC Barcelona võiduprotsent on 97.0 ning siiani on löödud 99.0 väravat ja oma väravasse on lastud 29.0 väravat. Väravatevahe on: 70.0 väravat.

Meeskonna Real Madrid võiduprotsent on 79.0 ning siiani on löödud 94.0 väravat ja oma väravasse on lastud 44.0 väravat.V äravatevahe on: 50.0 väravat.

Meeskonna Valencia võiduprotsent on 59.0 ning siiani on löödud 57.0 väravat  ja oma väravasse on lastud 50.0 väravat.Väravatevahe on: 7.0 väravat.

Meeskonna Malaga võiduprotsent on 16.0 ning siiani on löödud 24.0 väravat  ja oma väravasse on lastud 61.0 väravat. Väravatevahe on: -37.0 väravat.


*/