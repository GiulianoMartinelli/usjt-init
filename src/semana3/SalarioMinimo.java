/* Escreva um programa que obt�m o sal�rio de uma pessoa
e diz se ela est� ganhando pelo menos o sal�rio m�nimo. */ 

package semana3;

import javax.swing.JOptionPane;

public class SalarioMinimo {
	public static void main(String[] args) {
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu sal�rio: "));
		if (salario >= 1039) {
			JOptionPane.showMessageDialog(null, "Voc� ganha pelo menos um sal�rio minimo!");
		} else {
			JOptionPane.showMessageDialog(null, "Voc� ganha menos que um sal�rio minimo");
		}
	}
}
