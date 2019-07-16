package kassiane;
import javax.swing.JOptionPane;


public class qualqueer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// cedulas disponiveis no caixa eletronico
		int [] cedulas = {100,50,20,10,5,2,1};
		// quantidade total de cedular entregues ao cliente
		int quantidadetotal =0;
		// valor a ser sacado pelo client
		int valorReais = Integer.parseInt (JOptionPane.showInputDialog(null,"ente com o valor"));
		// percorrendo todas as cedulas disponiveis no caixa eletronico
		for (int i = 0 ; i < cedulas.length; i++){
		// quantidade de cedulas para o valor cedulas [i]
		int quantidadedecedulas = valorReais/cedulas[i];
		// imprssao da quantidade de cedulas
		System.out.println("quantidade de cedulas de"+ cedulas[i] + ":" +quantidadedecedulas);
		//resto da divisao
		valorReais %= cedulas [i];
		//quantidade total de celular entregues ao cliente
		quantidadetotal += quantidadedecedulas;
		}
	//impressao
		System.out.println("quantidadetotal: "+quantidadetotal);	
		
		
		
			

	}

}
