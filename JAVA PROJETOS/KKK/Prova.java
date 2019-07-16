import javax .swing.JOptionPane;
public class Prova{
public static void main(String[]args){
float a,b,c ;
a =Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de a"));
b=Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de b : "));
c=a+b;
JOptionPane.showMessageDialog(null,c);

}
}