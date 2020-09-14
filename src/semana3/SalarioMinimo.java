/* Escreva um programa que obtém o salário de uma pessoa
e diz se ela está ganhando pelo menos o salário mínimo. */ 

package semana3;

import javax.swing.JOptionPane;

public class SalarioMinimo {
	public static void main(String[] args) {
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário: "));
		if (salario >= 1039) {
			JOptionPane.showMessageDialog(null, "Você ganha pelo menos um salário minimo!");
		} else {
			JOptionPane.showMessageDialog(null, "Você ganha menos que um salário minimo");
		}
	}
}
