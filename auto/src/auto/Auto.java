package auto;
//nr, mark, aasta, 
public class Auto {
    protected String numbrimärk;
    protected String mark;
    protected String värv;
    protected int aasta;
    protected int speed = 0;
    
    public Auto(String numbrimärk, String mark, String värv, int aasta) {
        this.numbrimärk = numbrimärk;
        this.mark = mark;
        this.värv = värv;
        this.aasta = aasta;  
    }
    
    public int getYear() {
        return aasta;
    }
    
    public String getBrand() {
        return mark;
    }
    
    public String getColor() {
        return värv;
    }
    
    public String getLicensePlate() {
        return numbrimärk;
    }
    
    public String ylevaatus() {
        String lastNr = numbrimärk.substring(2, 3);
        String ylevaatuseKuu = "märts";
        if (lastNr.equals("1")) {
            ylevaatuseKuu = "märts";
        }
        if (lastNr.equals("2")) {
            ylevaatuseKuu = "aprill";
        }
        if (lastNr.equals("3")) {
            ylevaatuseKuu = "mai";
        }
        if (lastNr.equals("4")) {
            ylevaatuseKuu = "juuni";
        }
        if (lastNr.equals("5")) {
            ylevaatuseKuu = "juuli";
        }
        if (lastNr.equals("6")) {
            ylevaatuseKuu = "august";
        }
        if (lastNr.equals("7")) {
            ylevaatuseKuu = "september";
        }
        if (lastNr.equals("8")) {
            ylevaatuseKuu = "oktoober";
        }
        if (lastNr.equals("9")) {
            ylevaatuseKuu = "november";
        }
        if (lastNr.equals("0")) {
            ylevaatuseKuu = "detsember";
        }
        return("Auto ülevaatuse kuu on " + ylevaatuseKuu);
    }
    
    public void accelerate(int increment) {
        speed += increment;
    }
    
    public void brake(int decrement) {
        if (speed - decrement <= 0) {
             speed = 0;
        } else {
            speed -= decrement;
        }
    }
    
    @Override
    public String toString() {
        return ("Automark: " + mark + "\n"
                + "Numbrimärk: " + numbrimärk + "\n"
                + "Valmistamisaasta: " + aasta + "\n"
                + "Värvus: " + värv);
    }
}
