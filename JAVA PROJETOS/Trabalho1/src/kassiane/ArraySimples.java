package kassiane;
import java.util.Arrays;
public class ArraySimples{
public static void main(String[] args){
String[ ]paises = {"Brasil","Russia","India","China"};
System.out.println(Arrays.toString(paises));//Esta linha tona tudo em string
int posicao = Arrays.binarySearch(paises,"Russia");
System.out.println(posicao);

Double [ ] valores ={12.35,3456.3456};
System.out.println(valores[0].doubleValue( ) );
System.out.println(valores[1].doubleValue( ) );
}
}