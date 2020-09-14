/* Ler um valor em real e a cotação do dólar.
Em seguida, exibir o valor correspondente em dólares. */

package semana3;

import javax.swing.JOptionPane;

public class ConversaoDolar {
	public static void main(String[] args) {
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor, em reais, para conversao a dolar: "));
		double dolar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da cotação do dolar: "));
		JOptionPane.showMessageDialog(null, valor + " reais em dolares é " + (valor * dolar));	
	}
}
