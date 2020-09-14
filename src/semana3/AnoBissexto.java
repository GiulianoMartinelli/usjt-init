/* Sabe-se que um ano é bissexto se for divisível por 400
ou se for divisível por 4 e não for divisível por 100.
Por exemplo: 1988, 1992, 1996, 2020.
Determinar se um determinado ano lido é bissexto. */


package semana3;

import javax.swing.JOptionPane;

public class AnoBissexto {
	public static void main(String[] args) {
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite um ano"));
		if ( (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0 ) ) {
			JOptionPane.showMessageDialog(null, "O ano é bissexto");
		} else {
			JOptionPane.showMessageDialog(null, "O ano não é bissexto");
		}
	}
}
