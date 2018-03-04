package homework02;
public class data {
    
    protected String idCode;
    protected String sex;
    protected int birthYear;
    protected String birthMonth;
    protected int birthDay;
    
    protected int sexData;
    
    public data (String idCode){
        this.idCode = idCode;
        this.sex = this.sex();
        this.birthYear = this.birthYear();
        this.birthMonth = this.birthMonth();
        this.birthDay = this.birthDay();

        /*
        System.out.println("Isikukood: " + this.idCode);
        System.out.println("Sugu: " + this.sex);
        System.out.println("Sünniaasta: " + this.birthYear);
        System.out.println("Sünnikuu: " + this.birthMonth);
        System.out.println("Sünnikuupäev: " + this.birthDay);
        */
    }
    
    public String sex(){
        sexData = Integer.parseInt(idCode.substring(0, 1));
        String sex = (sexData == 3 || sexData == 5) ? "mees" : "naine";
        
        return sex;
    }
    
    public int birthYear(){
        int birthYearData = Integer.parseInt(idCode.substring(1,3));
        int birthCentury = (sexData == 3 || sexData == 4) ? 1900 : 2000;
        
        return birthCentury + birthYearData;
    }
    
    public String birthMonth(){
        int birthMonthData = Integer.parseInt(idCode.substring(3,5));
        if (birthMonthData == 1) {
            birthMonth = "jaanuar";
        } else if (birthMonthData == 2) {
            birthMonth = "veebruar";
        } else if (birthMonthData == 3) {
            birthMonth = "märts";
        } else if (birthMonthData == 4) {
            birthMonth = "aprill";
        } else if (birthMonthData == 5) {
            birthMonth = "mai";
        } else if (birthMonthData == 6) {
            birthMonth = "juuni";
        } else if (birthMonthData == 7) {
            birthMonth = "juuli";
        } else if (birthMonthData == 8) {
            birthMonth = "august";
        } else if (birthMonthData == 9) {
            birthMonth = "september";
        } else if (birthMonthData == 10) {
            birthMonth = "oktoober";
        } else if (birthMonthData == 11) {
            birthMonth = "november";
        } else if (birthMonthData == 12) {
            birthMonth = "detsember";
        }
        
       return birthMonth;
    }
    
    public int birthDay(){
        int birthDay = Integer.parseInt(idCode.substring(5,7));
        
        return birthDay;
    }
}
