// Ler um número e verificar se ele é par ou ímpar.

package semana3;

import javax.swing.JOptionPane;

public class ParImpar {
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		if ((num % 2) == 0) {
			JOptionPane.showMessageDialog(null, "O número é par!");
		} else {
			JOptionPane.showMessageDialog(null, "O número é impar!");
		}
	}
}
