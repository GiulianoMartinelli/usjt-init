/* Ler as dimensões de um retângulo (base e altura),
 calcular e escrever a área do retângulo. */

package semana2;

import javax.swing.JOptionPane;

public class AreaRetangulo {
	public static void main(String[] args) {
	double base = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para a base do retangulo: "));
	double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para a altura do retangulo: "));
	JOptionPane.showMessageDialog(null, "A área do retangulo é de: " + (base * altura));
	}
}
