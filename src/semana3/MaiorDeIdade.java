/* Escreva um programa que obtém a idade de uma pessoa e diz se ela é maior,
segundo a legislação brasileira. Escreva uma versão com if/else e outra com o
operador ternário. */

package semana3;

import javax.swing.JOptionPane;

public class MaiorDeIdade {
	public static void main(String[] args) {
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
		if (idade >= 18) {
			JOptionPane.showMessageDialog(null, "Você é maior de idade");
		} else {
			JOptionPane.showMessageDialog(null, "Você é menor de idade");
		}
		String maiordeidade;
		maiordeidade = idade >= 18 ? "Você é maior de idade" : "Você é menor de idade";
		JOptionPane.showMessageDialog(null, maiordeidade);
	}
}
