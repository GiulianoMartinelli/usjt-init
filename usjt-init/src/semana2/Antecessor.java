// Ler um valor inteiro e exibir seu antecessor.


package semana2;

import javax.swing.JOptionPane;

public class Antecessor {
	public static void main(String[] args) {
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
		JOptionPane.showMessageDialog(null, "O antecessor desse numero é: " + (valor - 1));
	}
}
