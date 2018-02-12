public class Koodikontroll{
     protected String andmed;
     public Koodikontroll(String uusKood){
         andmed=uusKood;
     }
     public String sugu(){
         int number = Integer.parseInt(andmed.substring(0, 1));
         String sugu = "";
         if (number==1 || number==3 || number==5){
             sugu = "Mees";
         } else if (number==2 || number==4 || number==6){
             sugu = "Naine";
         } 
		 else {
			 sugu = "Esimene number ei sobi soo määramiseks.";
		 }
         return sugu;
     }
	 
	public int kuunr(){
		return Integer.parseInt(andmed.substring(3,5));
	}
	public String kuunimi(){
		String[] kuunimed={"","jaanuar","veebruar","märts","aprill","mai","juuni","juuli","august","september","oktoober","november","detsember"};
		return kuunimed[kuunr()];
	}
	public int aastaarv4kohta(){
		return (18+(Integer.parseInt(andmed.substring(0,1))-1)/2)*100+Integer.parseInt(andmed.substring(1,3));
	}
	public int paevanr(){
		return Integer.parseInt(andmed.substring(5,7));
	}
	public String toString(){
		return paevanr()+"."+kuunimi()+" "+aastaarv4kohta();
	}
	

     public String kontroll(){
         String repl = andmed.replaceAll(".(?!$)", "$0 ");
         String[] intToStr = repl.split(" ");
         int[] arvud = new int[intToStr.length];
         for (int i = 0; i < arvud.length; i++){
             arvud[i] = Integer.parseInt(intToStr[i]);
         }
		 
		 //kontrollnumbri arvutamine
         int summa, jagatis;
		 String vastus;
         summa = 0;
         for (int i = 0; i < 10; i++){
             if (i<9){
                 summa = summa + arvud[i]*(i+1);
             } else {
                 summa = summa + arvud[i]*1;
             }
         }
         if (summa % 11 == 10){
             jagatis = (arvud[0]*3+arvud[1]*4+arvud[2]*5+arvud[3]*6+arvud[4]*7+arvud[5]*8+arvud[6]*9+arvud[7]*1+arvud[8]*2+arvud[9]*3) % 11;
             if (jagatis == 10){
                 jagatis = 0;
             }
         } else {
             jagatis = summa % 11;
         }
         if (jagatis == arvud[10]){
             vastus = "Isikukood on kehtiv!";
         } else {
             vastus = "Isikukoodis on viga!";
         }
         return vastus;
     }
 } 
