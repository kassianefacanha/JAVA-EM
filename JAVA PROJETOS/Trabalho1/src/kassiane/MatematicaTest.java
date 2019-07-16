package kassiane;

public class MatematicaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Matematica m= new Matematica ();
	
	/**	int ma= m.maior(10,20);
		
          System.out.println("O numero maior é igual a :" +ma);
		
		double so = m.soma(10 , 20);
		System.out.println("A soma dos PARAMETROS é:" +so);
		
	*/	
		
		int par = m.maior(2, 4);
		int impar = m.maior(2, 5);
		@SuppressWarnings("unused")
		double s = m.soma(par, impar);
		
		System.out.println(par);
		System.out.println(impar);
		System.out.println(par+  +impar);
		
		
	}

}
