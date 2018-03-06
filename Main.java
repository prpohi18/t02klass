import java.util.Arrays;
import java.util.List;
import java.io.*;
import java.util.*;


public class Main{
	public static void main (String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new FileReader("vin.txt"));
		int Af=0, As=0, Eu=0, Na=0, Sa=0, Oc=0, count=0;
		String ln=br.readLine();

		
		
		String[] AF = new String[]{"A", "B", "C", "D", "E", "F", "G", "H"};
		String[] AS = new String[]{"J", "K", "L", "M", "N", "P", "R"};
		String[] EU = new String[]{"S", "T", "U", "V", "W", "X", "Y", "Z"};
		String[] NA = new String[]{"1", "2", "3", "4", "5"};
		String[] OC = new String[]{"6", "7"};
		String[] SA = new String[]{"8", "9"};
		
		List<String> listAF = Arrays.asList(AF);
		List<String> listAS = Arrays.asList(AS);
		List<String> listEU = Arrays.asList(EU);
		List<String> listNA = Arrays.asList(NA);
		List<String> listOC = Arrays.asList(OC);
		List<String> listSA = Arrays.asList(SA);
		
		while(ln!=null){
			
			Vin vinCode=new Vin(ln);
			
			if (listAF.contains(vinCode.region())) {
				//System.out.println("Regioon: Aafrika ");
				Af += 1;
				count += 1;
			}
			if (listAS.contains(vinCode.region())) {
				//System.out.println("Regioon: Aasia ");
				As += 1;
				count += 1;
			}
			if (listEU.contains(vinCode.region())) {
				//System.out.println("Regioon: Euroopa ");
				Eu += 1;
				count += 1;
			}
			if (listNA.contains(vinCode.region())) {
				//System.out.println("Regioon: Põhja-Ameerika ");
				Na += 1;
				count += 1;
			}
			if (listOC.contains(vinCode.region())) {
				//System.out.println("Regioon: Okeaania ");
				Oc += 1;
				count += 1;
			}
			if (listSA.contains(vinCode.region())) {
				//System.out.println("Regioon: Lõuna-Ameerika ");
				Sa += 1;
				count += 1;
			}
			
			ln=br.readLine();
		}
		
		br.close();
		
		System.out.println("Aafrika päritoluga autod: "+Af);
		System.out.println("Aasia päritoluga autod: "+As);
		System.out.println("Euroopa päritoluga autod: "+Eu);
		System.out.println("Põhja-Ameerika päritoluga autod: "+Na);
		System.out.println("Lõuna-Ameerika päritoluga autod: "+Sa);
		System.out.println("Okeaania päritoluga autod: "+Oc);
		System.out.println("Andmebaasis autosid kokku: "+count);
		
		
		
	}
}