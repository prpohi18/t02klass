
public class Hoim {

	protected String name;
	protected int qnt;
	protected String locale;
	

	public Hoim(String name, int qnt, String locale) {
		
		this.name = name;
		this.qnt = qnt;
		this.locale = locale;
		
	}
	
	public int qntDanger() {
		int result = 0;
		if(qnt<5000) {
			result = 90;
			return result;
		}
		else if(qnt<15000) {
			result = 75;
			return result;
		}
		else if(qnt<30000) {
			result = 60;
			return result;
		}
		else{
			result = 50;
			return result;
		}
	}
	
	public int localeDanger() {
		if(locale=="CL") {
			return 50;
		}
		else if(locale=="ILCE") {
			return 90;
		}
		else if(locale=="IL") {
			return 75;
		}
		else {
			return 0;
		}
	}
	
	public String dangerTotal() {
		int test =(qntDanger()+localeDanger())/2;
		
		if(test > 89) {
			return "VERY LOW";
		}
		else if(test > 76) {
			return "LOW";
		}
		else {
			return "MEDIUM";
		}
	}

}


