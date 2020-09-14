/* Ler a idade de uma pessoa expressa em anose exibir
expressa em dias (considere que um ano tem 365 dias). */

package semana2;

import javax.swing.JOptionPane;

public class IdadeEmDias {
	public static void main(String[] args) {
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você tem?"));
		JOptionPane.showMessageDialog(null, "Você tem aproximadamente " + (idade * 365) + "dias de vida");
	}
}
