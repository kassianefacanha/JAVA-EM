package iraneide;

import javax.swing.JOptionPane;

public class MatematicaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//	 @return  a raiz quadradado n�mero segundo equa�� de pell 
		 
		
		Matematica m = new Matematica();
		
		int ma = m.maior(10,20);
		
	System.out.println("o n�mero maior � igual a, "+ma);
		
		
		double so = m.soma(10,20);
		System.out.println("A soma das das vri�veis � : "+so);
		JOptionPane.showMessageDialog(null,"O maio n�mero � "+ma+"."+"\n E a soma das duas vari�veis � "+so);
	
	
	//A soma do maior n�mero par com o maior n�mero impar	
	int par = m.maior(2,4);	
	int impar = m.maior(3,5);
	double so1 = m.soma(par, impar);
	JOptionPane.showMessageDialog(null, "A soma do maior numero \n par com o maior n�mero impar � " +so1);
	System.out.println("A soma do maior numero \n par com o maior n�mero impar � " +so1);
	

	}
}