package kassiane;

public class GalinhaTest {
	
	public static int ovosDaGranja;//Variavel global
	public int ovos;//total de ovos do objeto galinha
	public GalinhaTest botar(){
		
	this.ovos++;
	GalinhaTest.ovosDaGranja ++;
	return this;
	}
}
