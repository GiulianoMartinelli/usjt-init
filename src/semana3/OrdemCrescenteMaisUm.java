/* Fazer um programa que receba tr�s n�meros inteiros em ordem
crescente e um quarto n�mero tamb�m inteiro que n�o siga esta regra.
Mostra, em seguida, os quarto n�meros em ordem crescente.  */

package semana3;

import javax.swing.JOptionPane;

public class OrdemCrescenteMaisUm {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "DIGITE NUMEROS DIFERENTES EM ORDEM CRESCENTE!");
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite qualquer outro numero (n�o importa a ordem) : "));
		if (n > n3) {
			JOptionPane.showMessageDialog(null, "Em ordem crescente: " + n1 + ", " + n2 + ", " + n3 + ", " + n);
		} else if (n > n2 && n < n3){
			JOptionPane.showMessageDialog(null, "Em ordem crescente: " + n1 + ", " + n2 + ", " + n + ", " + n3);
		} else if (n > n1 && n <n2) {
			JOptionPane.showMessageDialog(null, "Em ordem crescente: " + n1 + ", " + n + ", " + n2 + ", " + n2);
		} else if (n < n1) {
			JOptionPane.showMessageDialog(null, "Em ordem crescente: " + n + ", " + n1 + ", " + n2 + ", " + n3);
		}
	}
}
