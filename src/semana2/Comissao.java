/*Calcular o pagamento de comissão de vendedores de peças,
levando-se em consideração que sua comissão será de 5% do total da venda 
e que você tem os seguintes dados: preço unitário da peça e quantidade vendida. */

package semana2;

import javax.swing.JOptionPane;

public class Comissao {
	public static void main(String[] args) {
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do produto ventido: "));
		double quantidade = Double.parseDouble(JOptionPane.showInputDialog("Quantidade do produto: "));
		double resultado = (quantidade * valor) * 0.05 ;
		JOptionPane.showMessageDialog(null, "A comissao do vendedor eh " + resultado);
	}
}
