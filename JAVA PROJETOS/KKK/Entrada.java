import java.util.Scanner;

public class Entrada{
public static void main (String [ ] args){
//chamada do programa
//System.out.println ( args [0] );

//Interagindo com o usuário

Scanner  s  = new Scanner(System.in) ;
System.out.println("Qual o seu nome?");
String nome = s.nextLine();
System.out.println("Seja bem vinda  "+nome);


}
} 