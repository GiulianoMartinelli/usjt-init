// Fazer um programa que recebe dois n�meros e mostra o maior.

package semana3;

import javax.swing.JOptionPane;

public class MaiorNumero {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		if (num1 > num2) {
			JOptionPane.showMessageDialog(null, "O maior n�mero �: " + num1);
		} else if (num1 == num2) {
			JOptionPane.showMessageDialog(null, "Os n�meros sao iguais");
		} else {
			JOptionPane.showMessageDialog(null, "O maior n�mero �: " + num2);
		}
	}
}
