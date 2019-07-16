package kassiane;
import java.util.Scanner;

public class Entrada{

   public static void main(String[] args) {
        // Chamada do programa
        //System.out.println(args[0]);
        
       //Interagindo com o Usuário
      Scanner s = new Scanner(System.in);
      System.out.println("qual o seu nome?");
      String nome = s.nextLine();
      System.out.println("SEJA BEM VINDO" + nome);
   }

}