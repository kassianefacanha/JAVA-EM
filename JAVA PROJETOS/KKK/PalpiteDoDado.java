import java.util.Scanner;
import java.util.Random;

public class PalpiteDoDado{
public static void main(String[]args){
Scanner  s = new Scanner(System.in);
System.out.println("Qual o seu palpite?");
int palpite  = s.nextInt();

Random n = new Random();
int dado = n.nextInt(6)+1;
if (palpite== dado){

System.out.println("Acertou");
}else{
System.out.println("Errou");
}


}
}