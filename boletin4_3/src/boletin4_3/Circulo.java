package boletin4_3;

//@author irodriguezsteuerberg
 
public class Circulo {
private double radio;
final double Pi=3.14;

public Circulo(){}
public Circulo(double radio){
this.radio=radio;
}
public void setRadio(double radio){
this.radio=radio;
}
public double getRadio(){
return radio;
}    
public double calcularArea(){
return Pi*Math.pow(radio, 2);
}    
public double calcularLonxitude(){
return 2*Pi*radio;
}
public void amosar(){
System.out.println("O radio do circulo é "+radio);
}

}
