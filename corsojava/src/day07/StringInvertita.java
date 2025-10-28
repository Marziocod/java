package day07;

import javax.swing.JOptionPane;

public class StringInvertita {

	public static void main(String[] args) {
		String stringa = JOptionPane.showInputDialog(null, "inserisci una frase");
		stringa = stringa.trim();
		String stringaInvertita = "";
		for (int i = stringa.length() - 1; i >= 0; i--) {
			stringaInvertita = stringaInvertita + stringa.charAt(i);
			// stringaInvertita += stringa.charAt(i);
		}
		JOptionPane.showMessageDialog(null, stringaInvertita);
	}

}
