/* Fazer um programa que recebe o pre�o de um produto,
calcula e mostra o novo pre�o sabendo-se que este
sofreu um desconto de 10%. */

package semana3;

import javax.swing.JOptionPane;

public class Desconto {
	public static void main(String[] args) {
		double preco = Double.parseDouble(JOptionPane.showInputDialog("Valor do produto: "));
		JOptionPane.showMessageDialog(null, "O novo valor do produto �: " + (preco * 0.9));
	}
}
