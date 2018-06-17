package t02;

class triangles {
    double side1;
    double side2;
    double side3;
}

public class T02 {
    public static void main(String[] args) {
        
        //first triangle
        triangles triangle1 = new triangles(); 
        triangle1.side1 = 3;
        triangle1.side2 = 4;
        triangle1.side3 = 5;
        
        //second triangle
        triangles triangle2 = new triangles(); 
        triangle2.side1 = 2;
        triangle2.side2 = 4;
        triangle2.side3 = 6;
        
        

        
        
        //calculations of area and circumference
        //triangle 1 
        double areaTriangle1;
        double circumferenceTriangle1;
        circumferenceTriangle1 = triangle1.side1 + triangle1.side2 + triangle1.side3;
        double s1 = (circumferenceTriangle1)/2; 
        areaTriangle1 = Math.sqrt(s1*(s1 - triangle1.side1)*(s1 - triangle1.side2)*(s1 - triangle1.side3));
        
        //triangle 2
        double areaTriangle2;        
        double circumferenceTriangle2;
        circumferenceTriangle2 = triangle2.side1 + triangle2.side2 + triangle2.side3;   
        double s2 = (circumferenceTriangle2)/2;  
        areaTriangle2 = Math.sqrt(s2*(s2 - triangle2.side1)*(s2 - triangle2.side2)*(s2 - triangle2.side3));
              
        
        
        System.out.println("Esimese kolmnurgaküljed on " + triangle1.side1 +", "+triangle1.side2 +", "+ triangle1.side3 +", "+
                            "ja Ümbermõõt on: " + circumferenceTriangle1 + " cm ning pindala on: " + areaTriangle1 + " cm2"); 
        
        
        System.out.println("Teise kolmnurgaküljed on " + triangle2.side1 +", "+triangle2.side2 +", "+ triangle2.side3 +", "+
                           "ja Ümbermõõt on: " + circumferenceTriangle2 + " cm ning pindala on: " + areaTriangle2 + " cm2");
        
        double areaTotal;
        areaTotal = areaTriangle1 + areaTriangle2;
        System.out.println("Kolmnurkade pindala on kokku " + areaTotal + "cm");
    }   
}


