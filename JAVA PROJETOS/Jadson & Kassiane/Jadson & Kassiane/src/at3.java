import javax.swing.JOptionPane;


public class at3 {


	public static void main(String[] args) {
		
		
		int n  ;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero do dia"));
		
		if(n==1){
			
			JOptionPane.showMessageDialog(null,"� Domingo");
			
			}
		if(n==2){
			JOptionPane.showMessageDialog(null,"� Segunda");
			
		}
		
		if(n==3){
			JOptionPane.showMessageDialog(null,"� Ter�a");
		}
		
		if(n==4){
			JOptionPane.showMessageDialog(null,"� Quarta");
			
		}
		if(n==5){	
			
			JOptionPane.showMessageDialog(null,"� Quinta");
			
		}
		if(n==6){
		JOptionPane.showMessageDialog(null,"� Sexta");
			
		}
		
		if(n==7){
			
			JOptionPane.showMessageDialog(null,"� S�bado");
			
		}
		if(n > 7||n < 1){
			
			JOptionPane.showMessageDialog(null,"Nenhum dia da semana");
			
		}
	
			
	 }
		
		
	}


