package kassiane;
import java.util.Arrays;

public class kassiane23{

public static void main(String[] args){

int [] impares =new int[5];

impares  [0] = 1;
impares  [1] = 3;
impares  [2] = 5;
impares  [3] = 7;
impares  [4] = 9;

System.out.println(impares.length);

System.out.println(Arrays.toString(impares));
System.out.println("-----------------------------------------------------");


String[] paises= {"Brasil","Russia","india","China"};
System.out.println(Arrays.toString(paises));

System.out.println(paises[0]);
paises [0]  = "brazil" ;
System.out.println(paises[0]);
System.out.println(paises.length);

System.out.println(Arrays.toString(paises));
System.out.println(Arrays.toString(impares));

int posicao = Arrays.binarySearch(paises,"Russia");
System.out.println(posicao);


Arrays.sort(paises, 0 , paises.length);
System.out.println(Arrays.toString(paises));


}

}