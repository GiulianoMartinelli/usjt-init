/* Ler um valor em real e a cota��o do d�lar.
Em seguida, exibir o valor correspondente em d�lares. */

package semana3;

import javax.swing.JOptionPane;

public class ConversaoDolar {
	public static void main(String[] args) {
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor, em reais, para conversao a dolar: "));
		double dolar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da cota��o do dolar: "));
		JOptionPane.showMessageDialog(null, valor + " reais em dolares � " + (valor * dolar));	
	}
}
