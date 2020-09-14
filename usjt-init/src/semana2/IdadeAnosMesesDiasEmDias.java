/*Ler a idade de uma pessoa expressa em anos, meses e dias 
e exibir a idade dessa pessoa expressa apenas em dias. 
Considerar ano com 365 dias e mês com 30 dias. */

package semana2;

import javax.swing.JOptionPane;

public class IdadeAnosMesesDiasEmDias {
	public static void main(String[] args) {
		int anos = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você tem? "));
		int meses = Integer.parseInt(JOptionPane.showInputDialog("...e quantos meses? "));
		int dias = Integer.parseInt(JOptionPane.showInputDialog("...e quantos dias?"));
		int total = (anos * 365) + (meses * 30) + dias;
		JOptionPane.showMessageDialog(null, "Você tem aproximadamente " + total + " dias de vida");
		
	}
}
