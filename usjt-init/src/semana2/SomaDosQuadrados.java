/*Ler 4 n�meros, calcular o quadrado para cada um,
somar todos os quadrados e mostraro resultado.*/

package semana2;

import javax.swing.JOptionPane;

public class SomaDosQuadrados {
	public static void main(String[] args) {
		int primeiro = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
		int qprimeiro = primeiro * primeiro;
		JOptionPane.showMessageDialog(null, "O quadrado �: " + qprimeiro);
		int segundo = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: "));
		int qsegundo = segundo * segundo;
		JOptionPane.showMessageDialog(null, "O quadrado �: " + qsegundo);
		int terceiro = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro numero: "));
		int qterceiro = terceiro * terceiro;
		JOptionPane.showMessageDialog(null, "O quadrado � " + qterceiro);
		int quarto = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto numero: "));
		int qquarto = quarto * quarto;
		JOptionPane.showMessageDialog(null, "O quadrado �: " + qquarto);
		JOptionPane.showMessageDialog(null, "A soma dos quadrados dos numeros digitados �: " + (qprimeiro + qsegundo + qterceiro + qquarto));
	}
}
