public class alg {
	protected String punkt;
	
	public alg(String punkt) {
		this.punkt = punkt;
	}
	
	public String vastus(){
		int vastus = Integer.parseInt(punkt);
		
		String varv="";
		
		if(vastus == 1){
			varv = "punase";
		}else if(vastus == 2){
			varv = "kollase";
		}else if(vastus == 3){
			varv = "rohelise";
		}else if(vastus == 4){
			varv = "pruuni";
		}else if(vastus == 5){
			varv = "sinise";
		}else if(vastus == 6){
			varv = "roosa";
		}else if(vastus == 7){
			varv = "musta";
		}
		return varv;
	}
}