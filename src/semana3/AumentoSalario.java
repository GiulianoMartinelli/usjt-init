/* Fazer um programa que recebe o salário de um
funcionário e o percentual de aumento, calcula 
e mostra o valor do aumento e o novo salário.  */

package semana3;

import javax.swing.JOptionPane;

public class AumentoSalario {
	public static void main(String[] args) {
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário: "));
		double aumento = Double.parseDouble(JOptionPane.showInputDialog("Digite seu percentual de aumento: "));
		double valor = salario * (aumento / 100);
		JOptionPane.showMessageDialog(null, "Seu salario aumentou em " + valor + "\nSe tornando " + (salario + valor));
	}
}