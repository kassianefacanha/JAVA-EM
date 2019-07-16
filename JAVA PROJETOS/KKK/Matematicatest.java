package iraneide;

import javax.swing.JOptionPane;

public class MatematicaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//	 @return  a raiz quadradado número segundo equaçã de pell 
		 
		
		Matematica m = new Matematica();
		
		int ma = m.maior(10,20);
		
	System.out.println("o número maior é igual a, "+ma);
		
		
		double so = m.soma(10,20);
		System.out.println("A soma das das vriáveis é : "+so);
		JOptionPane.showMessageDialog(null,"O maio número é "+ma+"."+"\n E a soma das duas variáveis é "+so);
	
	
	//A soma do maior número par com o maior número impar	
	int par = m.maior(2,4);	
	int impar = m.maior(3,5);
	double so1 = m.soma(par, impar);
	JOptionPane.showMessageDialog(null, "A soma do maior numero \n par com o maior número impar é " +so1);
	System.out.println("A soma do maior numero \n par com o maior número impar é " +so1);
	

	}
}