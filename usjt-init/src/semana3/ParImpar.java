// Ler um n�mero e verificar se ele � par ou �mpar.

package semana3;

import javax.swing.JOptionPane;

public class ParImpar {
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		if ((num % 2) == 0) {
			JOptionPane.showMessageDialog(null, "O n�mero � par!");
		} else {
			JOptionPane.showMessageDialog(null, "O n�mero � impar!");
		}
	}
}
