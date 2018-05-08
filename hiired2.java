
package kodutoo2;

/**
 *
 * @author JustIF
 */
public class hiired2 {
    public static void main(String[] args){
        hiired Razer = new hiired();
        Razer.riik = "Ameerika";
        Razer.varv = "must,roheline";
        Razer.aasta = 1998;
        Razer.maxDPI = 6400;
        Razer.hind = 100;
        
        
        hiired SteelSeries= new hiired();
        SteelSeries.riik = "Ameerika";
        SteelSeries.varv = "Suur vaalik";
        SteelSeries.aasta = 2001;
        SteelSeries.maxDPI = 6000;
        SteelSeries.hind = 70;
        
        int keskmineDPI;
        int keskmineHind;
        keskmineHind = (Razer.hind + SteelSeries.hind) / 2;
        keskmineDPI = (Razer.maxDPI + SteelSeries.maxDPI) / 2;
        
        
        System.out.println("Razer ja SteelSeries keskmine hind on: "+keskmineHind);
        System.out.println("Razer ja SteelSeries keskmine DPI on: "+keskmineDPI);
        System.out.println("Razer suundis "+Razer.aasta);
        System.out.println("SteelSeries sundis" +SteelSeries.aasta);
    }
}
