/*Ler a cota��o do d�lar e a quantidade de d�lares. 
Converter para real e mostrar o resultado.*/

package semana2;

import javax.swing.JOptionPane;

public class CotacaoDolar {
	public static void main(String[] args) {
		double dolar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da cota��o do Dolar: "));
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser convertido para real: "));
		JOptionPane.showMessageDialog(null, valor + " dolares em real � " + (valor / dolar));		
	}
}
