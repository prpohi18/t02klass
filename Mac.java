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

}
