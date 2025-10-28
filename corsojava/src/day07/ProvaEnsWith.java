package day07;

import javax.swing.JOptionPane;

public class ProvaEnsWith {

	public static void main(String[] args) {
		String file = JOptionPane.showInputDialog(null,"isnerisci il nome di un file java valido");
		if (file.endsWith(".java")) {
              JOptionPane.showMessageDialog(null, "il nome del file è valido");
            
		}else {
			JOptionPane.showMessageDialog(null, "il nome del file è non valido: non termina con.java");
		}
		
		}
}


