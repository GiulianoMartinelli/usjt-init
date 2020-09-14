/* Uma revendedora de carros usados paga a seus funcionários vendedores um
salário fixo por mês, mais uma comissão também fixa para cada carro vendido e mais
5% do valor das vendas por ele efetuadas. Ler o número de carros por ele vendidos, o
valor total de suas vendas, o salário fixo e o valor que ele recebe por carro vendido.
Calcular e exibir o salário final do vendedor. */

package semana2;

import javax.swing.JOptionPane;

public class SalarioFinal {
	public static void main(String[] args) {
		double carros = Double.parseDouble(JOptionPane.showInputDialog("Carros vendidos: "));
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor total das vendas: "));
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário fixo: "));
		double venda = Double.parseDouble(JOptionPane.showInputDialog("Valor por carro vendido: "));
		double total = salario + (venda * carros) + (valor * 0.05);
		JOptionPane.showMessageDialog(null , "Seu salario final é R$" + total);
	}
}
