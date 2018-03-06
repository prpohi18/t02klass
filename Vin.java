public class Vin{
	protected String data;
	public Vin(String newC){
		data=newC;
	}
	
	public String region(){
		return data.substring(0,1);
	}
	
}