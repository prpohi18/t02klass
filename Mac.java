import java.io.*;
import java.util.*;
public class Mac{
  protected String macVendor;
  public Mac(String andmed){
    macVendor=andmed;
  }
  public String convert(){
    String aadress = macVendor.substring(0, 8);
    String vastus = "Andmed puuduvad";
    String[] aadressid={"00:e0:4c","00:23:DF","00:16:6B"};
    String[] vendor={"Realtek Semiconductor corp.", "Apple inc.", "Samsung Electronics"};
    for (int i=0; i < 3;i++ ) {
      if (aadress.equalsIgnoreCase(aadressid[i])) {
        vastus = vendor[i];
      }
    }
    return vastus;
  }

  public String listSearched(){
    int check = 1;
    try {
      BufferedReader br=new BufferedReader(new FileReader("data.txt"));
      List<Mac> aadressid=new ArrayList<Mac>();
      String rida=br.readLine();
      while(rida!=null){
          rida=br.readLine();
          if (rida.equals(macVendor)) {
            check = 0;
            return "Seda MAC aadressi on juba otsitud";
          }
      }
      br.close();
    }catch (Exception e){}
    if (check==1) {
      PrintWriter output;
      try {
        output = new PrintWriter(new FileWriter("data.txt", true));
        output.println(macVendor);
        output.close();
      }catch (Exception e) { }
    }
    return "Seda MAC aadressi pole enne otsitud";
  }
}
