
import java.io.*;
import java.util.*;
public class Retsept{
    public static void main(String[] args) throws IOException{

        BufferedReader sisse=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Sisesta muffinite arv: ");
        String arv = sisse.readLine();
        int mArv = Integer.parseInt(arv);

        System.out.println("Sisesta yhikud g/kg: ");
        String rYhik = sisse.readLine();
        
        Muffinid v6i=new Muffinid(12, mArv);
        Muffinid jahu=new Muffinid(20, mArv);
        Muffinid suhkur=new Muffinid(14, mArv);
        Muffinid vanillisuh=new Muffinid(1, mArv);
        Muffinid kypsetuspulber=new Muffinid(0.4, mArv);
        Muffinid piim=new Muffinid(8, mArv);
        Muffinid muna=new Muffinid(8, mArv);

        System.out.println("V6i kogus ühele muffinile "+v6i.kogusalg+" grammi"); 
        System.out.println("Jahu kogus ühele muffinile "+jahu.kogusalg+" grammi");
        System.out.println("Suhkur kogus ühele muffinile "+suhkur.kogusalg+" grammi");
        System.out.println("Vanillisuhkru kogus ühele muffinile "+vanillisuh.kogusalg+" grammi");
        System.out.println("Kypsetuspulbri kogus ühele muffinile "+kypsetuspulber.kogusalg+" grammi");
        System.out.println("Piima kogus ühele muffinile "+piim.kogusalg+" grammi");
        System.out.println("Muna kogus ühele muffinile "+muna.kogusalg+" grammi");
        System.out.println(" ");

        if(rYhik.equals("g")){ 

            System.out.println("V6i kogus "+v6i.muffiniKogusG()+" grammi"); 
            System.out.println("Jahu kogus "+jahu.muffiniKogusG()+" grammi");
            System.out.println("Suhkur kogus  "+suhkur.muffiniKogusG()+" grammi");
            System.out.println("Vanillisuhkru kogus  "+vanillisuh.muffiniKogusG()+" grammi");
            System.out.println("Kypsetuspulbri kogus "+kypsetuspulber.muffiniKogusG()+" grammi");
            System.out.println("Piima kogus "+piim.muffiniKogusG()+" grammi");
            System.out.println("Muna kogus  "+muna.muffiniKogusG()+" grammi");
        }

        if(rYhik.equals("kg")){
            System.out.println("V6i kogus "+v6i.muffiniKogusKg()+" kilogrammi"); 
            System.out.println("Jahu kogus "+jahu.muffiniKogusKg()+" kilogrammi");
            System.out.println("Suhkur kogus  "+suhkur.muffiniKogusKg()+" kilogrammi");
            System.out.println("Vanillisuhkru kogus  "+vanillisuh.muffiniKogusKg()+" kilogrammi");
            System.out.println("Kypsetuspulbri kogus "+kypsetuspulber.muffiniKogusKg()+" kilogrammi");
            System.out.println("Piima kogus "+piim.muffiniKogusKg()+" kilogrammi");
            System.out.println("Muna kogus  "+muna.muffiniKogusKg()+" kilogrammi");
        }

        Muffinid maksumus = new Muffinid(1.50, mArv);
        double hind = maksumus.muffiniteHind(mArv);
        System.out.println("Muffinite hinnaks tuleb "+ hind+ " eurot");

    }
}

/*
Sisesta muffinite arv: 
30
Sisesta yhikud g/kg: 
kg
V6i kogus ühele muffinile 12.0 grammi
Jahu kogus ühele muffinile 20.0 grammi
Suhkur kogus ühele muffinile 14.0 grammi
Vanillisuhkru kogus ühele muffinile 1.0 grammi
Kypsetuspulbri kogus ühele muffinile 0.4 grammi
Piima kogus ühele muffinile 8.0 grammi
Muna kogus ühele muffinile 8.0 grammi
 
V6i kogus 0.36 kilogrammi
Jahu kogus 0.6 kilogrammi
Suhkur kogus  0.42 kilogrammi
Vanillisuhkru kogus  0.03 kilogrammi
Kypsetuspulbri kogus 0.012 kilogrammi
Piima kogus 0.24 kilogrammi
Muna kogus  0.24 kilogrammi
Muffinite hinnaks tuleb 45.0



Sisesta muffinite arv: 
12
Sisesta yhikud g/kg: 
g
V6i kogus ühele muffinile 12.0 grammi
Jahu kogus ühele muffinile 20.0 grammi
Suhkur kogus ühele muffinile 14.0 grammi
Vanillisuhkru kogus ühele muffinile 1.0 grammi
Kypsetuspulbri kogus ühele muffinile 0.4 grammi
Piima kogus ühele muffinile 8.0 grammi
Muna kogus ühele muffinile 8.0 grammi
 
V6i kogus 144.0 grammi
Jahu kogus 240.0 grammi
Suhkur kogus  168.0 grammi
Vanillisuhkru kogus  12.0 grammi
Kypsetuspulbri kogus 4.800000000000001 grammi
Piima kogus 96.0 grammi
Muna kogus  96.0 grammi
Muffinite hinnaks tuleb 18.0

*/