/*Calcular o pagamento de comiss�o de vendedores de pe�as,
levando-se em considera��o que sua comiss�o ser� de 5% do total da venda 
e que voc� tem os seguintes dados: pre�o unit�rio da pe�a e quantidade vendida. */

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
