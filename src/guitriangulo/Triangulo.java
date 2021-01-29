
package guitriangulo;

public class Triangulo {
    private Punto p1;
    private Punto p2;
    private Punto p3;

    public Triangulo (){
    }
    
    public Triangulo( Punto p1, Punto p2, Punto p3){
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
    }
    
    public Triangulo( double x1, double y1, double x2, double y2, double x3, double y3){
        p1= new Punto (x1, y1);
        p2= new Punto (x2, y2);
        p3= new Punto (x3, y3);
    }
    
      public Punto getP1(){
        return  p1;
    }
    
     public Punto getP2(){
        return  p2;
    }
     
     public Punto getP3(){
        return  p3;
    }
     
     public void setP1( Punto p1){
         this.p1=p1;
     }
    
     public void setP2( Punto p2){
         this.p2=p2;
     }
     
     public void setP3( Punto p3){
         this.p3=p3;
     }
     
        private double distancia (Punto p){
        double x = 0;
        double y = 0;
        return Math.sqrt(Math.pow(p.getX()-x,2)+Math.pow(p.getY()-y,2));
}
    
        private double altura(){
         Recta r1= new Recta( p1,p2);
         double h=0;
         h= r1.distancia(p3);
         return h;
        }
        
     
         public double perimetro(){
         return p1.distancia(p2)+p2.distancia(p3)+p3.distancia(p1);
         }
     
         public double area(){
          Recta r1 = new Recta(p1,p2);
		double h=0;
		h=r1.distancia(p3);
		double base= p1.distancia(p3);
		return ((base*h/2));
         }
    
}
