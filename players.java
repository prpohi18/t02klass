public class players{
	protected String data;
	public players(String uusrida){
		data=uusrida;
	}
	
	public int punktid(){
		return Integer.parseInt(data.substring(0, 2));
	}
	
	public int lauapallid(){
		return Integer.parseInt(data.substring(2, 3));
	}
	
	public int soodud(){
		return Integer.parseInt(data.substring(3, 4));
	}
	
	public int minutid(){
		return Integer.parseInt(data.substring(4, 6));
	}
}