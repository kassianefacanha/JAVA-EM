import javax.swing.JOptionPane;


public class Enquanto {

	
	public static void main(String[] args) {
		int n = 0;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		
		while(n != 0){
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero"));	
			
			
		}
       if(n<10){
    	   
    	   JOptionPane.showMessageDialog(null, "N�mero confirmado");
    	   
       }
	}

}
