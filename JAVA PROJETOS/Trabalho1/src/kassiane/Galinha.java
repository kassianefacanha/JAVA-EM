package kassiane;

public class Galinha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 GalinhaTest g1 = new GalinhaTest();
		 g1.botar().botar().botar();
		 
		 GalinhaTest g2 = new GalinhaTest();
		 g2.botar().botar();
		 
		 System.out.println(g1.ovos);
		 System.out.println(g2.ovos);
	}

}
