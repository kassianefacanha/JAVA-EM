import java.util.Scanner;

public class Operador02{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.println("Informe o raio");


double raio =s.nextDouble();
double diametro = 2*raio;
System.out.println(diametro);
double pi =Math.PI;
double circunferencia = 2 * pi * raio  ;
System.out.println("VCircunferencia"+circunferencia);
//Area PI r2
double area = pi*(raio*raio);
System.out.println("Area"+area);








}
} 