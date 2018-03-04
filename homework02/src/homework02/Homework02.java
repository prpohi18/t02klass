package homework02;
public class Homework02 {
    public static void main(String[] args) {
        data person1 = new data("49409196019");
        data person2 = new data("39507082431");
        data person3 = new data("46303130401");
        data person4 = new data("60406076504");
        
        System.out.println("Isik 1: " + person1.sex + ". Sünnikuupäev " + person1.birthDay + " " + person1.birthMonth + " " + person1.birthYear);
        System.out.println("Isik 2: " + person2.sex + ". Sünnikuupäev " + person2.birthDay + " " + person2.birthMonth + " " + person2.birthYear);
        System.out.println("Isik 3: " + person3.sex + ". Sünnikuupäev " + person3.birthDay + " " + person3.birthMonth + " " + person3.birthYear);
        System.out.println("Isik 4: " + person4.sex + ". Sünnikuupäev " + person4.birthDay + " " + person4.birthMonth + " " + person4.birthYear);
    }
    
   /* public String results(data person){
        return "Iskikukood " + person.idCode +"\n"
                + person.sex + ". Sünnikuupäev " + person.birthDay + " " + person.birthMonth + " " + person.birthYear;
    }
    */
}



/*
Isik 1: naine. Sünnikuupäev 19 september 1994
Isik 2: mees. Sünnikuupäev 8 juuli 1995
Isik 3: naine. Sünnikuupäev 13 märts 1963
Isik 4: naine. Sünnikuupäev 7 juuni 2004
*/
