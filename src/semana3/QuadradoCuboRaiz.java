/* Fazer um programa que recebe um número positivo, calcula e mostra:
a) O número digitado ao quadrado;
b) O número digitado ao cubo;
c) A raiz quadrada do número digitado. */

package semana3;

import javax.swing.JOptionPane;

public class QuadradoCuboRaiz {
	public static void main(String[] args) {
		double n = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: "));
		JOptionPane.showMessageDialog(null, "Quadrado: " + Math.pow(n, 2) + "\nCubo: " + Math.pow(n, 3) + "\nRaiz: " + Math.sqrt(n));
	}
}
