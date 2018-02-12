public class kolmnurk{
   double a, b, c;
   public kolmnurk(double alus, double korgus, double kylg){
     a = alus;
     b = korgus;
     c = kylg;
     if(a <=0){throw new RuntimeException("Aluse väärtus ei sobi.");}
		if(b <=0){throw new RuntimeException("Kõrguse väärtus ei sobi.");}
     if(c <=0){throw new RuntimeException("Külje väärtus ei sobi.");}
   }

   public double pindala(){
     return (a * b) / 2;
   }

   public double ymbermoot(){
     return a + b + c;
   }

   public String toString(){
     return "Kolmnurga ümbermõõt on "+
            ymbermoot()+" ja pindala "+pindala()+" ruutmeetrit.";
  }
 }