package br.com.xti.poo;


public class GalinhaTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Galinha g1 = new Galinha();
g1.botar().botar().botar();

Galinha g2 = new Galinha();
g2.botar().botar();
System.out.println(g1.ovos);
System.out.println(g2.ovos);
	}

}
