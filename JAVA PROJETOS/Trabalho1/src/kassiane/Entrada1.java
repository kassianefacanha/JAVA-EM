package kassiane;
import javax.swing.JOptionPane;

public class Entrada1{

  public static void main(String[] args) {

    String nome = JOptionPane.showInputDialog("Qual seu nome ?");
    JOptionPane.showMessageDialog(null, nome);
}
  }