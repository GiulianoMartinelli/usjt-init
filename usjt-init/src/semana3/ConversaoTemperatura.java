/* Ler uma temperatura em graus Celsius e apresenta-la convertida 
em graus Fahrenheit. A fórmula de conversão é

F = C * (9.0 / 5.0) + 32.0  */

package semana3;

import javax.swing.JOptionPane;

public class ConversaoTemperatura {
	public static void main(String[] args) {
		double celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Celcius"));
		double F = celsius * (0 / 5) + 32;
		JOptionPane.showMessageDialog(null, celsius + "° em Fahrenhenit são " + F + "°");
	}
}
