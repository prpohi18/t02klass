
public class Kassid {
    protected String nimi;
    protected double vanus;

public Kassid(String nimi, double vanus){
        this.nimi=nimi;
        this.vanus=vanus;
}

 public String nimi() {
	return nimi;
	}
	
 public double vanus() {
	return vanus;
	}

public double kassiaastad() {
	if(vanus < 1){
		double inimeseaastad = vanus * 15;
		return inimeseaastad;
	}
	else if(vanus >1 && vanus <2){
		double inimeseaastad = vanus * 9;
		return inimeseaastad;
	}
	else{
		double inimeseaastad = 24 + ((vanus - 2) * 4);
		return inimeseaastad;
	}
 }

}