public class Numbrid{
	protected String andmed;
	public Numbrid(String uusNumber){
		andmed=uusNumber;
	}
	
	public String Suunakood(){
		if(andmed.substring(0, 3).equals("372")){
			return "See number on Eesti oma";
		}
		if(andmed.substring(0, 3).equals("371")){
			return "See number on Läti oma";
		}
		if(andmed.substring(0, 3).equals("370")){
			return "See number on Leedu oma";
		}
		if(andmed.substring(0, 3).equals("358")){
			return "See number on Soome oma";
		}
		if(andmed.substring(0, 2).equals("47")){
			return "See number on Norra oma";
		}
		if(andmed.substring(0, 2).equals("46")){
			return "See number on Rootsi oma";
		}
		return "Error";
	}
}