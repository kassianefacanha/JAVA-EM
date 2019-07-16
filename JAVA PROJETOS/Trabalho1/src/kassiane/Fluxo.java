package kassiane;
public class Fluxo{
public static void main(String[]args){
boolean passou = true;
int numero=15;
int idade = 100;
if(passou){
System.out.println("contratado");
}
if ((numero%2)== 0){
System.out.println("Numero par ");
}else{
System.out.println("Impare");
}
if(idade<=11){
System.out.println("Crianca");
}else if (idade>11 && idade <18){
System.out.println("Adolescente");
}else if (idade>18 && idade <=60){
System.out.println("Adulto");
}else{
System.out.println("Melhor idade");
}


}
}