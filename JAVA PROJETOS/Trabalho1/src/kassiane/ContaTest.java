package kassiane;

public class ContaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
    Conta conta = new Conta();
    conta.cliente="Iraneide";
    conta.saldo= 10000.00;
    conta.exibirSaldo();
    /**
   conta.saca(1000);
   conta.exibirSaldo();
   
   conta.deposita(6000);
   conta.exibirSaldo();
   
   **/
   Conta destino = new Conta();
   destino.cliente = "Renato";
   destino.saldo = 8000.00;
   destino.exibirSaldo();
   
   conta.transferePara(destino,1550.00);
   conta.exibirSaldo();
   destino.exibirSaldo();
   
    }

}
