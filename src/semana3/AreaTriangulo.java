/*Fazer um programa que calcula e mostra a �rea
 de um tri�ngulo, sabendo que:
�rea = (base * altura) / 2. */

package semana3;

import javax.swing.JOptionPane;

public class AreaTriangulo {
	public static void main(String[] args) {
		double base = Double.parseDouble(JOptionPane.showInputDialog("Base do triangulo: "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura do triangulo: "));
		JOptionPane.showMessageDialog(null, "A �rea do triangulo de base " + base + " e altura " + altura + " � igual a " + (( base * altura) / 2));
	}
}
