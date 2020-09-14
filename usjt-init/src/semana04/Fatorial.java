// Escreva um programa que calcula o fatorial de um valor natural digitado pelo usuário.

package semana04;

import javax.swing.JOptionPane;

public class Fatorial {
	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		int resultado = 1;
		for(int i = 2; i <= numero; i++) {
			resultado *= i;
		}
		JOptionPane.showMessageDialog(null, "Fatorial: " + resultado);
	}
}
