package kassiane;
import java.io.*;
import java.util.*;

public class DiaDaSemana{
public static void main(String[]args){

int x;
Scanner dado;
System.out.println("Digite um numero");
dado = new Scanner(System.in);
x = dado.nextInt();;
switch (x){
case 1:

System.out.println("Domingo");
break;

case 2:

System.out.println("Segunda");
break;
case 3:

System.out.println("Terca");
break;
case 4:

System.out.println("Quarta");
break;
case 5:

System.out.println("Quinta");
break;
case 6:

System.out.println("Sexta");
break;
case 7:

System.out.println("Sabado");
break;

default:
System.out.println("Deus ainda nao enventou esse dia");
}



}
}
