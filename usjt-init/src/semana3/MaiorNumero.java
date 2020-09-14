// Fazer um programa que recebe dois números e mostra o maior.

package semana3;

import javax.swing.JOptionPane;

public class MaiorNumero {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		if (num1 > num2) {
			JOptionPane.showMessageDialog(null, "O maior número é: " + num1);
		} else if (num1 == num2) {
			JOptionPane.showMessageDialog(null, "Os números sao iguais");
		} else {
			JOptionPane.showMessageDialog(null, "O maior número é: " + num2);
		}
	}
}
