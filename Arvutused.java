public class Arvutused{
    protected String andmed;
    public Arvutused(String uusKood){
        andmed=uusKood;
    }
    public String sugu(){
        int number = Integer.parseInt(andmed.substring(0, 1));
        String vahemik = "";
        if (number==1 ){
            vahemik = "1800-1899 sündinud mees";
        } else if (number==2){
            vahemik = "1800-1899 sündinud naine";
        } else if (number==3) {
            vahemik = "1900-1999 sündinud mees";
        } else if (number==4){
            vahemik = "1900-1999 sündinud naine";
        } else if (number==5){
            vahemik = "2000-2099 sündinud mees";
        } else if (number==6){
            vahemik = "2000-2099 sündinud naine";
        }
        return vahemik;
    }
    public String kontroll(){
        //tühikud arvude vahele
        String repl = andmed.replaceAll(".(?!$)", "$0 ");
        //tühikute järgi massiivi
        String[] intToStr = repl.split(" ");
        int[] arvud = new int[intToStr.length];
        for (int i = 0; i < arvud.length; i++){
            arvud[i] = Integer.parseInt(intToStr[i]);
        }
        //summa arvutamine
        int summa;
        summa = 0;
        for (int i = 0; i < 10; i++){
            if (i<9){
                summa = summa + arvud[i]*(i+1);
            } else {
                summa = summa + arvud[i]*1;
            }
        }
        //jäägi ja viimase numbri arvutamine
        int viimanenr;
        if (summa % 11 == 10){
            viimanenr = (arvud[0]*3+arvud[1]*4+arvud[2]*5+arvud[3]*6+arvud[4]*7+arvud[5]*8+arvud[6]*9+arvud[7]*1+arvud[8]*2+arvud[9]*3) % 11;
            if (viimanenr == 10){
                viimanenr = 0;
            }
        } else {
            viimanenr = summa % 11;
        }
        String vastus;
        System.out.println("Viimane number " + viimanenr);
        if (viimanenr == arvud[10]){
            vastus = "Isikukood on kehtiv!";
        } else {
            vastus = "Isikukood on vale!";
        }
        return vastus;
    }
}