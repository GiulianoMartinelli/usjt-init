/* Tendo como dados de entrada a altura (h) e o sexo de uma pessoa 
(um caracter m ou f), construir um programa que calcula seu peso ideal,
utilizando as seguintes f�rmulas:
Para homens: (72.7*h) - 58
Para mulheres: (62.1*h) - 44.7 */

package semana3;

import javax.swing.JOptionPane;

public class PesoIdeal {
	public static void main(String[] args) {
		String sexo = JOptionPane.showInputDialog("Voc� � homem [M] ou mulher [F]? ");
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Qual sua altura? "));
		if (("M").equals(sexo) || ("m").equals(sexo)){
			JOptionPane.showMessageDialog(null, "Seu peso ideal � " + ((72.7 * altura) - 58));
		} else {
			JOptionPane.showMessageDialog(null, "Seu peso ideal � " + ((62.1 * altura) - 44.7));
		}
	}
}
