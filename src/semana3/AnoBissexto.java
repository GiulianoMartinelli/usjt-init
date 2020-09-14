/* Sabe-se que um ano � bissexto se for divis�vel por 400
ou se for divis�vel por 4 e n�o for divis�vel por 100.
Por exemplo: 1988, 1992, 1996, 2020.
Determinar se um determinado ano lido � bissexto. */


package semana3;

import javax.swing.JOptionPane;

public class AnoBissexto {
	public static void main(String[] args) {
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite um ano"));
		if ( (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0 ) ) {
			JOptionPane.showMessageDialog(null, "O ano � bissexto");
		} else {
			JOptionPane.showMessageDialog(null, "O ano n�o � bissexto");
		}
	}
}
