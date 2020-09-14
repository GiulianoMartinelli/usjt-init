/*O custo de um carro novo ao consumidor é a soma do custo de fábrica com a
porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo
que o percentual do distribuidor seja de 28% e os impostos de 45%, ler o custo de
fábrica de um carro, calcular e escrever o custo final ao consumidor.	*/

package semana2;

import javax.swing.JOptionPane;

public class CustoCarro {
	public static void main(String[] args) {
		double fabrica = Double.parseDouble(JOptionPane.showInputDialog("Valor de fabrica do carro: "));
		double total = fabrica + (fabrica * 28 / 100) + (fabrica * 45 / 100);
		JOptionPane.showMessageDialog(null, "O preço final do carro é de R$" + total);
	}
}
