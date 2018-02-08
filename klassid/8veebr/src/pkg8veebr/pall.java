/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8veebr;

/**
 *
 * @author ketuo
 */
public class pall {
    protected double x;
    protected double y;
    protected double z;
    
    public pall(double x, double y, double z){
      this.x=x;
      this.y=y;
      this.z=z;
    }
    public double kaugusNullist(){
      return Math.sqrt(x*x+y*y);  
        
    }
    public double getX(){return x;}
    public double getY(){return y;}
    public double getZ(){return z;}
    public double kaugusPallist(pall teine){
       double dx=getX()-teine.getX();
       double dy=getY()-teine.getY();
       return Math.sqrt(dx*dx+dy*dy);
   
    }
public String kokkupuude(pall teine){
    
    if (kaugusPallist(teine)<(getZ()+teine.getZ())){
       return "pallid puutuvad kokkku";
   }else{
      return "pallid ei puutu kokku";
       
   }
}
    
     public pall(double x, double y){

       this(x, y, 1);

   }

   public boolean kasPuutub(pall teine){

       return kaugusPallist(teine)<getZ()+teine.getZ();

   }

    @Override
    public String toString(){
     return "Pall kohal ("+x+", "+y+","+z+")"; 
    }
    }

