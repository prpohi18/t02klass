public class andmed {
	
	protected String isikukood;

	
	
	public andmed(String isikukood) {
		this.isikukood = isikukood;
		
	}

	public String synnikuu() {
		
		int synnikuu = Integer.parseInt(isikukood.substring(3, 5));
		
		String tulemus= "";
		
		if (synnikuu ==1) {
			tulemus= "t��taja on s�ndinud jaanuaris.";
		}else if (synnikuu == 2) {
			tulemus= "t��taja on s�ndinud veebruaris.";
		}else if (synnikuu == 3) {
			tulemus= "t��taja on s�ndinud m�rtsis.";
		}else if (synnikuu == 4) {
			tulemus= "t��taja on s�ndinud aprillis.";
		}else if (synnikuu == 5) {
			tulemus= "t��taja on s�ndinud mais.";
		}else if (synnikuu == 6) {
			tulemus= "t��taja on s�ndinud juunis.";
		}else if (synnikuu == 7) {
			tulemus= "t��taja on s�ndinud juulis.";
		}else if (synnikuu == 8) {
			tulemus= "t��taja on s�ndinud augustis.";
		}else if (synnikuu == 9) {
			tulemus= "t��taja on s�ndinud septembris.";
		}else if (synnikuu == 10) {
			tulemus= "t��taja on s�ndinud oktoobris.";
		}else if (synnikuu == 11) {
			tulemus= "t��taja on s�ndinud novembris.";
		}else if (synnikuu == 12) {
			tulemus= "t��taja on s�ndinud detsembris.";	
		}
		return tulemus;
	}	
	



}
	






