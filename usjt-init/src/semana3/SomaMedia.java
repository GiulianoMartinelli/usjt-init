/*Fazer um programa que recebe três números inteiros, calcula e
 mostra a soma desses números.

Fazer um programa que recebe três notas, calcula e mostra a média
aritmética dessas notas. */

package semana3;

import javax.swing.JOptionPane;

public class SomaMedia {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " + " + num3 + " = " + (num1 + num2 + num3) + "\nE a media dos numeros é " + ((num1 + num2 + num3) / 3));
	}
}
