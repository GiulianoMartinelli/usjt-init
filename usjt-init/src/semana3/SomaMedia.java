/*Fazer um programa que recebe tr�s n�meros inteiros, calcula e
 mostra a soma desses n�meros.

Fazer um programa que recebe tr�s notas, calcula e mostra a m�dia
aritm�tica dessas notas. */

package semana3;

import javax.swing.JOptionPane;

public class SomaMedia {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " + " + num3 + " = " + (num1 + num2 + num3) + "\nE a media dos numeros � " + ((num1 + num2 + num3) / 3));
	}
}
