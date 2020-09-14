//Escreva um programa que verifica se um número natural digitado pelo usuário é primo.

package semana04;

import javax.swing.JOptionPane;

public class NumPrimo {
	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		int q = 1;
		for(int i = 2; i < ((numero / 2) + 1); i++) {
			if (numero % i == 0){
				JOptionPane.showMessageDialog(null, "O numero é divisivel por " + i);
				q += 1;
			}
		}
		if (q == 1) {
			JOptionPane.showMessageDialog(null, "O numero é primo!");
		} 
		else {
			JOptionPane.showMessageDialog(null, "O numero nao é primo!");
		}
	}
}