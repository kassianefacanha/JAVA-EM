public class  Triangulo{
public static void main(String[]args){

int ladoA,ladoB,ladoC;
ladoA=5;
ladoB=5;
ladoC=6;

if ((ladoA==ladoB)&&(ladoB==ladoC)){
System.out.println("Triangulo equilatero");
}else if((ladoA==ladoB)||(ladoA==ladoC)||(ladoB==ladoC)){
System.out.println("O triangulo e isoceles");
}else{
System.out.println("O triangulo e escaleno");
}


}
}