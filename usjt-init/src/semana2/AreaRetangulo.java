/* Ler as dimens�es de um ret�ngulo (base e altura),
 calcular e escrever a �rea do ret�ngulo. */

package semana2;

import javax.swing.JOptionPane;

public class AreaRetangulo {
	public static void main(String[] args) {
	double base = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para a base do retangulo: "));
	double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para a altura do retangulo: "));
	JOptionPane.showMessageDialog(null, "A �rea do retangulo � de: " + (base * altura));
	}
}
