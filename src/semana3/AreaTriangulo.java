/*Fazer um programa que calcula e mostra a área
 de um triângulo, sabendo que:
área = (base * altura) / 2. */

package semana3;

import javax.swing.JOptionPane;

public class AreaTriangulo {
	public static void main(String[] args) {
		double base = Double.parseDouble(JOptionPane.showInputDialog("Base do triangulo: "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura do triangulo: "));
		JOptionPane.showMessageDialog(null, "A área do triangulo de base " + base + " e altura " + altura + " é igual a " + (( base * altura) / 2));
	}
}
