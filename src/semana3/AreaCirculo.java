/* Fazer um programa que calcula e mostra a �rea 
de um c�rculo, sabendo que:
�rea = pi * r2 */

package semana3;

import java.lang.Math;

import javax.swing.JOptionPane;

public class AreaCirculo {
	public static void main(String[] args) {
		double raio = Double.parseDouble(JOptionPane.showInputDialog("Raio do circulo: "));
		JOptionPane.showMessageDialog(null, "A �rea do circulo de raio " + raio + " � igual a " + (Math.PI * Math.pow(raio, 2)));
	}
}
