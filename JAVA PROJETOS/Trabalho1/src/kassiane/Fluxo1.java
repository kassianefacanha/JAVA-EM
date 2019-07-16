package kassiane;
import java.io.*;
import java.util.*;

public class Fluxo1{
public static void main(String[]args){

char sexo='E';
switch(sexo){
case 'M':
System.out.println("Macho");
break;
case'F':
System.out.println("Femea");
break;
default:
System.out.println("Outro");
}


int x;
Scanner dado;
System.out.println("Digite um numero");
dado = new Scanner(System.in);
x = dado.nextInt();
switch (x){
case 1:

System.out.println("Numero 1");
break;

case 2:

System.out.println("Numero 2");
break;

default:
System.out.println("Outro");
}




}
}
