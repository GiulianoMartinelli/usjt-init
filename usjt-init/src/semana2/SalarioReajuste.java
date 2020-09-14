/* Ler o salário mensal atual de um funcionário e o percentual de reajuste. 
Calcular e exibir o valor do novo salário. */

package semana2;

import javax.swing.JOptionPane;

public class SalarioReajuste {
	public static void main(String[] args) {
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário: "));
		double reajuste = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentural de reajuste: "));
		JOptionPane.showMessageDialog(null, "Seu novo salario é de " + (salario + (salario * (reajuste / 100))));
	}
}
