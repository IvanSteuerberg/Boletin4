package boletin4_1;

//@author irodriguezsteuerberg
 
public class Coche {
private int velocidade;

public Coche (){
velocidade = 0;
}
public int getVelocidade(){
return velocidade;
}
public void acelerar(int valor){
velocidade = velocidade+valor;
}        
public void frenar(int menos){
velocidade = velocidade-menos;
}        
public void amosar(){
System.out.println("A velocidade é de "+velocidade+" km/h");
}        
        
        
        
}
