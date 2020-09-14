/* Fazer um programa que calcula e mostra a área 
de um círculo, sabendo que:
área = pi * r2 */

package semana3;

import java.lang.Math;

import javax.swing.JOptionPane;

public class AreaCirculo {
	public static void main(String[] args) {
		double raio = Double.parseDouble(JOptionPane.showInputDialog("Raio do circulo: "));
		JOptionPane.showMessageDialog(null, "A área do circulo de raio " + raio + " é igual a " + (Math.PI * Math.pow(raio, 2)));
	}
}
