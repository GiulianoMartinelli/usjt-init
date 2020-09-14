// Ler um número inteiro e exibir o seu antecessor e o seu sucessor.

package semana3;

import javax.swing.JOptionPane;

public class AntecessorSucessor {
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		JOptionPane.showMessageDialog(null, "Antecessor: " + (n - 1) + "\nSucessor: " + (n + 1));
	}
}
