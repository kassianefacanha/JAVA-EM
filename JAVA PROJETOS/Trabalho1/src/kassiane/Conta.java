package kassiane;

public class Conta {
String cliente;
double saldo;

void exibirSaldo(){
	System.out.println(cliente+" seu saldo � "+saldo);
}

void saca (double valor){
	
	//saldo = saldo - valor; ou
	saldo -= valor ;
	
	//ver se tem autoriza��o
	//se limite do dia n�o foi ultrapassado
	//se tem saldo mna conta
	//deduzir do saldo o valor do saque
	//atualizar registros do banco
	//entregar o dinheiro ao cliente
}
	void deposita(double valor){
		saldo += valor;
	}
	
	void transferePara(Conta destino,double valor){
		this.saca(valor);
		
	}
  }

