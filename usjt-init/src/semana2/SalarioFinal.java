/* Uma revendedora de carros usados paga a seus funcion�rios vendedores um
sal�rio fixo por m�s, mais uma comiss�o tamb�m fixa para cada carro vendido e mais
5% do valor das vendas por ele efetuadas. Ler o n�mero de carros por ele vendidos, o
valor total de suas vendas, o sal�rio fixo e o valor que ele recebe por carro vendido.
Calcular e exibir o sal�rio final do vendedor. */

package semana2;

import javax.swing.JOptionPane;

public class SalarioFinal {
	public static void main(String[] args) {
		double carros = Double.parseDouble(JOptionPane.showInputDialog("Carros vendidos: "));
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor total das vendas: "));
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Sal�rio fixo: "));
		double venda = Double.parseDouble(JOptionPane.showInputDialog("Valor por carro vendido: "));
		double total = salario + (venda * carros) + (valor * 0.05);
		JOptionPane.showMessageDialog(null , "Seu salario final � R$" + total);
	}
}
