package klassid;
/**
 *
 * @author Anu
 */
public class Kolmnurk {
    float a, b, c;
    public Kolmnurk(float kylg1, float kylg2, float kylg3){
        a = kylg1;
        b = kylg2;
        c = kylg3;
        
        if (a<=0||b<=0||c<=0){throw new RuntimeException("Kolmnurga külje väärtus ei saa."
                + "olla väiksem või võrdne 0-ga!");}   
    }
    
    public float pindala(){ 
        //Heroni valem - pindala külgede kaudu
        float p = a + b + c;
	float t = p/2;
	float s = t*(t-a)*(t-b)*(t-c);
        if (s<=0){throw new RuntimeException("Kolmnurga pindala ei ole võimalik arvutada.");
        } else {
            return s;
        }
    }
    public double umbermoot(){
        float p = a + b + c;
        if (p<=0){throw new RuntimeException("Kolmnurga pindala ei ole võimalik arvutada.");
        } else {
            return p;
        }
    }
    @Override
    public String toString(){
     return "Kolmnurga ümbermõõt on "+ umbermoot() + " sentimeetrit"
             + "ja pindala "+ pindala()+ " ruutsentimeetrit.";
  }
    
}
