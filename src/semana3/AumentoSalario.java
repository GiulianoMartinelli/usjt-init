/* Fazer um programa que recebe o sal�rio de um
funcion�rio e o percentual de aumento, calcula 
e mostra o valor do aumento e o novo sal�rio.  */

package semana3;

import javax.swing.JOptionPane;

public class AumentoSalario {
	public static void main(String[] args) {
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu sal�rio: "));
		double aumento = Double.parseDouble(JOptionPane.showInputDialog("Digite seu percentual de aumento: "));
		double valor = salario * (aumento / 100);
		JOptionPane.showMessageDialog(null, "Seu salario aumentou em " + valor + "\nSe tornando " + (salario + valor));
	}
}