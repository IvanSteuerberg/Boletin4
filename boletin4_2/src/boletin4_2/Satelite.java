
package boletin4_2;

 //@author irodriguezsteuerberg
 
public class Satelite {
  private double meridiano;
  private double paralelo;
  private double distanciaTerra;
 public Satelite ( ) {
 }
public Satelite (double m, double p, double d){
meridiano = m;
paralelo = p;
distanciaTerra = d;
}
 public void verPosicion ( ) {

System.out.println ("o satelite atopase  no paralelo "
+paralelo+", meridiano "+meridiano+" e a unha distancia da terra "+distanciaTerra);     
}
}