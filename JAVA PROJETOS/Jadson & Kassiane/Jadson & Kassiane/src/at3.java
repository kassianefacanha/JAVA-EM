import javax.swing.JOptionPane;


public class at3 {


	public static void main(String[] args) {
		
		
		int n  ;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do dia"));
		
		if(n==1){
			
			JOptionPane.showMessageDialog(null,"É Domingo");
			
			}
		if(n==2){
			JOptionPane.showMessageDialog(null,"É Segunda");
			
		}
		
		if(n==3){
			JOptionPane.showMessageDialog(null,"É Terça");
		}
		
		if(n==4){
			JOptionPane.showMessageDialog(null,"É Quarta");
			
		}
		if(n==5){	
			
			JOptionPane.showMessageDialog(null,"É Quinta");
			
		}
		if(n==6){
		JOptionPane.showMessageDialog(null,"É Sexta");
			
		}
		
		if(n==7){
			
			JOptionPane.showMessageDialog(null,"É Sábado");
			
		}
		if(n > 7||n < 1){
			
			JOptionPane.showMessageDialog(null,"Nenhum dia da semana");
			
		}
	
			
	 }
		
		
	}


