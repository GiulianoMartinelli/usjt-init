/* A nota final de um estudante é calculada a partir de três notas
atribuídas respectivamente a um trabalho de laboratório, à avaliação
semestral e a um exame final. A média das três notas mencionadas
anteriormente obedece aos pesos a seguir:
NOTA PESO
Trabalho de laboratório 2
Avaliação semestral 3
Exame final 5 
 */

package semana3;

import javax.swing.JOptionPane;

public class Notafinal {
	public static void main(String[] args) {
		double lab = Double.parseDouble(JOptionPane.showInputDialog("Digite nota do laboratorio: "));
		double av = Double.parseDouble(JOptionPane.showInputDialog("Digite nota da avaliação semestral: "));
		double ex = Double.parseDouble(JOptionPane.showInputDialog("Digite nota do exame final: "));
		double total = ((lab * 2) + (av * 3) + (ex * 5)) / 10;
		JOptionPane.showMessageDialog(null, "Nota de laboratorio: " + lab + 
				"\nNota da avaliação semestral: " + av + 
				"\nNota do exame final: " + ex + 
				"\nNota final: " + total);
	}
}
