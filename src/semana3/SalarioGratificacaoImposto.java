/* Fazer um programa que recebe o sal�rio-base de um funcion�rio,
calcula e mostra o sal�rio a receber, sabendo-se que esse
funcion�rio tem gratifica��o de 5% sobre o sal�rio-base e
paga imposto de 7% sobre o sal�rio-base. */

package semana3;

import javax.swing.JOptionPane;

public class SalarioGratificacaoImposto {
	public static void main(String[] args) {
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu sal�rio base: "));
		double imposto = salario * 0.07;
		double gratificacao = salario * 0.05;
		JOptionPane.showMessageDialog(null, "Seu salario final, considerando gratifica��es e impostos � de " + (salario + gratificacao - imposto));
	}
}
