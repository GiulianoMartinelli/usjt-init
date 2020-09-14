/* Usando switch-case, escrever um programa que l� um inteiro entre
1 e 7 e exibe o dia da semana correspondente a esse n�mero. 
Isto �, domingo se 1, segunda-feira se 2, e assim por diante. */


package semana3;

import javax.swing.JOptionPane;

public class DiaDaSemana {
	public static void main(String[] args) {
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do dia da semana: "));
		switch (dia) {
		case 1: 
			JOptionPane.showMessageDialog(null, "Domingo");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Segunda");
			break;
		case 3: 
			JOptionPane.showMessageDialog(null, "Ter�a");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Quarta");
			break;
		case 5: 
			JOptionPane.showMessageDialog(null, "Quinta");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "Sexta");
			break;
		case 7: 
			JOptionPane.showMessageDialog(null, "Sabado");
			break;
		default:
			JOptionPane.showMessageDialog(null, "S� vale de 1 a 7");
		}
	}
}
