package boletin4_3;
//@author irodriguezsteuerberg
public class Boletin4_3 {

    public static void main(String[] args) {
Circulo obxcirculo1 = new Circulo();
obxcirculo1.setRadio(10);
obxcirculo1.amosar();
System.out.println("Area: "+obxcirculo1.calcularArea()
+" e a lonxitude: "+obxcirculo1.calcularLonxitude());
Circulo obxcirculo2 = new Circulo(15);
obxcirculo2.amosar();
System.out.println("Area: "+obxcirculo2.calcularArea()
+" e a lonxitude: "+obxcirculo2.calcularLonxitude());    
}
   
}
