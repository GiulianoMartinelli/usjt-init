/* Fazer um programa que recebe o salário-base de um funcionário,
calcula e mostra o salário a receber, sabendo-se que esse
funcionário tem gratificação de 5% sobre o salário-base e
paga imposto de 7% sobre o salário-base. */

package semana3;

import javax.swing.JOptionPane;

public class SalarioGratificacaoImposto {
	public static void main(String[] args) {
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário base: "));
		double imposto = salario * 0.07;
		double gratificacao = salario * 0.05;
		JOptionPane.showMessageDialog(null, "Seu salario final, considerando gratificações e impostos é de " + (salario + gratificacao - imposto));
	}
}
