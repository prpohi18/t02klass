import java.io.*;
import java.util.*;
public class tasks{
  public static void main(String[] args) throws Exception{
    BufferedReader br=new BufferedReader(new FileReader("letterslist.txt"));
    List<index> zipKoodid= new ArrayList<index>();
    Map<String, Integer> sameArea=new HashMap<String, Integer>();
    String line=br.readLine();
    while(line!=null){
      zipKoodid.add(new index(line));
      line=br.readLine();
    }
    for(index code: zipKoodid){
      String area=code.areaName();
      if(sameArea.get(area)==null){
        sameArea.put(area, 1);
      } else{
        int amount=sameArea.get(area);
        sameArea.put(area, amount+1);
        }
      }

      System.out.println(sameArea);


    br.close();
    System.out.println(zipKoodid);
  }
}
