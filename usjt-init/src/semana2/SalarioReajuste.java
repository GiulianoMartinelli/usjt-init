/* Ler o sal�rio mensal atual de um funcion�rio e o percentual de reajuste. 
Calcular e exibir o valor do novo sal�rio. */

package semana2;

import javax.swing.JOptionPane;

public class SalarioReajuste {
	public static void main(String[] args) {
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu sal�rio: "));
		double reajuste = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentural de reajuste: "));
		JOptionPane.showMessageDialog(null, "Seu novo salario � de " + (salario + (salario * (reajuste / 100))));
	}
}
