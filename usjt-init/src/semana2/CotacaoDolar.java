/*Ler a cotação do dólar e a quantidade de dólares. 
Converter para real e mostrar o resultado.*/

package semana2;

import javax.swing.JOptionPane;

public class CotacaoDolar {
	public static void main(String[] args) {
		double dolar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da cotação do Dolar: "));
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser convertido para real: "));
		JOptionPane.showMessageDialog(null, valor + " dolares em real é " + (valor / dolar));		
	}
}
