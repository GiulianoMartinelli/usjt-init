/* Escreva um programa que obt�m a idade de uma pessoa e diz se ela � maior,
segundo a legisla��o brasileira. Escreva uma vers�o com if/else e outra com o
operador tern�rio. */

package semana3;

import javax.swing.JOptionPane;

public class MaiorDeIdade {
	public static void main(String[] args) {
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
		if (idade >= 18) {
			JOptionPane.showMessageDialog(null, "Voc� � maior de idade");
		} else {
			JOptionPane.showMessageDialog(null, "Voc� � menor de idade");
		}
		String maiordeidade;
		maiordeidade = idade >= 18 ? "Voc� � maior de idade" : "Voc� � menor de idade";
		JOptionPane.showMessageDialog(null, maiordeidade);
	}
}
