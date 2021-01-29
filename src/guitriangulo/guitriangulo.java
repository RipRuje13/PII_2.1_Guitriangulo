
package guitriangulo;


import javax.swing.JOptionPane;
public class guitriangulo {

    public static void main(String[] args) {
        String cad;
        int opc=0, nt=0;
        Triangulo t = new Triangulo();
        double x1,y1,x2,y2,x3,y3;
             
        do{
            try{
           cad = JOptionPane.showInputDialog(null,"\n1.Crear Triangulo \n2.Calcular perimetro \n3.Calcular Area \n4.Salir","Menu",JOptionPane.PLAIN_MESSAGE);
           opc = Integer.parseInt(cad);
           
           switch(opc){
               case 1: 
                   cad  =  JOptionPane.showInputDialog(null, "Dijite x1" ,"Coordenadas",JOptionPane.PLAIN_MESSAGE);
                   x1 = Double.parseDouble(cad);
                   cad  =  JOptionPane.showInputDialog(null, "Dijite y1" ,"Coordenadas",JOptionPane.PLAIN_MESSAGE);
                   y1 = Double.parseDouble(cad); 
                   Punto  p1= new Punto(x1,y1);
                   cad  =  JOptionPane.showInputDialog(null, "Dijite x2" ,"Coordenadas",JOptionPane.PLAIN_MESSAGE);
                   x2 = Double.parseDouble(cad);
                   cad  =  JOptionPane.showInputDialog(null, "Dijite y2" ,"Coordenadas",JOptionPane.PLAIN_MESSAGE);
                   y2 = Double.parseDouble(cad);  
                    Punto  p2= new Punto(x2,y2);
                   cad  =  JOptionPane.showInputDialog(null, "Dijite x3" ,"Coordenadas",JOptionPane.PLAIN_MESSAGE);
                   x3 = Double.parseDouble(cad);
                   cad  =  JOptionPane.showInputDialog(null, "Dijite y3" ,"Coordenadas",JOptionPane.PLAIN_MESSAGE);
                   y3 = Double.parseDouble(cad); 
                    Punto  p3= new Punto(x3,y3);
                   t = new Triangulo (p1,p2,p3);
                   
                   break;
                   
               case 2:
                  double p = t.perimetro();
                  Double.toString(p);
                  JOptionPane.showMessageDialog(null,p,"Perimetro del Triangulo",JOptionPane.PLAIN_MESSAGE);
                  break;
                case 3:                     
                  double a = t.area();
                  Double.toString(a);
                  JOptionPane.showMessageDialog(null,a,"Area del Triangulo",JOptionPane.PLAIN_MESSAGE);
                   break;
                   
                   default: 
                    break;
            }
            }catch(NumberFormatException e){
                int respuesta = JOptionPane.showConfirmDialog(null, "Desea continuar ","Título", JOptionPane.YES_NO_OPTION);
                if(respuesta == JOptionPane.NO_OPTION){
                    break;
                }
                
            }
        }while(opc != 4);
        
                     
      
    }
 }
    

