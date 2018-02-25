public class index{
  protected String zipKoodid;
  public index(String newZip){
    zipKoodid=newZip;
  }

  public int areaNr(){
    return Integer.parseInt(zipKoodid.substring(0,1));

  }

  public String areaName(){
    String[] areaNames={"","Tallinn linn", "Narva linn", "Ida-Virumaa", "Kohtla-Järve linn",
    "Tartu linn", "Tartumaa", "Raplamaa", "Pärnumaa", "Saaremaa"};
    return areaNames[areaNr()];
    }

  @Override
  public String toString(){
    return zipKoodid + "  -  " + areaName();
  }


}
