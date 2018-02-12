import java.io.*;
import java.util.*;
public class kodutoo2_2{
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new FileReader("andmed.txt"));
		List<kodutoo2> koodid=new ArrayList<kodutoo2>();
		String rida=br.readLine();
		while(rida!=null){
			koodid.add(new kodutoo2(rida));
			rida=br.readLine();
		}
		br.close();
		System.out.println(koodid);
	}
}