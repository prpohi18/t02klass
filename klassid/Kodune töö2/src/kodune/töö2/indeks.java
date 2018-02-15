/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodune.töö2;

public class indeks {
    protected double x;
    protected double y;
 
    
    public indeks(double x, double y){
      this.x=x;
      this.y=y;
      
}
    public double getX(){return x;}
    public double getY(){return y;}
    public double KMI(){
    double kmi=x/((y*0.01)*(y*0.01));    
    return kmi;    
    }
    
    
    
    public String seisund(){
        
        if (KMI() >= 30) {
            return "ta on rasvunud";
        } else if ((30>KMI())&&(KMI()>25)) {
            return "ta on ülekaalus";
        } else if ((25>KMI())&&(KMI()>19)) {
            return "ta on ideaalkaalus";
        } else {
            return "ta on alakaalus";
        } 
        
        
        
      
                
            }         
    
    public String Suurem(indeks teine){
    if((x/((y*0.01)*(y*0.01)))>(getX()/((getY()*0.01)*(getY()*0.01)))){
        return "Esimese persooni KMI on suurem";
    }else{
      return "Teise persooni KMI on suurem";  
    }
        
         
    }
    
    
    @Override
    public String toString(){
     return "Persooni kaal on "+x+" kg ja pikkus "+y+" cm"; 
    }
}