public class andmed {
	
	protected String isikukood;

	
	
	public andmed(String isikukood) {
		this.isikukood = isikukood;
		
	}

	public String synnikuu() {
		
		int synnikuu = Integer.parseInt(isikukood.substring(3, 5));
		
		String tulemus= "";
		
		if (synnikuu ==1) {
			tulemus= "töötaja on sündinud jaanuaris.";
		}else if (synnikuu == 2) {
			tulemus= "töötaja on sündinud veebruaris.";
		}else if (synnikuu == 3) {
			tulemus= "töötaja on sündinud märtsis.";
		}else if (synnikuu == 4) {
			tulemus= "töötaja on sündinud aprillis.";
		}else if (synnikuu == 5) {
			tulemus= "töötaja on sündinud mais.";
		}else if (synnikuu == 6) {
			tulemus= "töötaja on sündinud juunis.";
		}else if (synnikuu == 7) {
			tulemus= "töötaja on sündinud juulis.";
		}else if (synnikuu == 8) {
			tulemus= "töötaja on sündinud augustis.";
		}else if (synnikuu == 9) {
			tulemus= "töötaja on sündinud septembris.";
		}else if (synnikuu == 10) {
			tulemus= "töötaja on sündinud oktoobris.";
		}else if (synnikuu == 11) {
			tulemus= "töötaja on sündinud novembris.";
		}else if (synnikuu == 12) {
			tulemus= "töötaja on sündinud detsembris.";	
		}
		return tulemus;
	}	
	



}
	






