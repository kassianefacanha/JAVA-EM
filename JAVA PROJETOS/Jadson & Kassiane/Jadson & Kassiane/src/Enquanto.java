import javax.swing.JOptionPane;


public class Enquanto {

	
	public static void main(String[] args) {
		int n = 0;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		
		while(n != 0){
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));	
			
			
		}
       if(n<10){
    	   
    	   JOptionPane.showMessageDialog(null, "Número confirmado");
    	   
       }
	}

}
