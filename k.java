import java.util.Scanner;
public class k{
  public static void main(String[] args) {
    int convert = 1;
    System.out.println("Sisesta MAC aadress kujul xx:xx:xx:xx:xx:xx või xx:xx:xx");
    System.out.println("Lõpetamiseks sisesta exit või quit");
    while (convert == 1){
      Scanner scanner = new Scanner (System.in);
      System.out.print("MAC aadress: ");
      String entry = scanner.next();
      if ((entry.length()==17 || entry.length()==8) && entry.substring(2,3).equals(":")) {
        Mac a=new Mac(entry);
        System.out.println("vendor: "+a.convert());
        System.out.println(a.listSearched());
      }else if (entry.equals("exit") || entry.equals("quit") || entry.equals("stop")) {
        convert = 0;
      }else{
        System.out.println("Kontrolli sisendit");
      }
    }
  }
}
