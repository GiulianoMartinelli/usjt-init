/* A nota final de um estudante � calculada a partir de tr�s notas
atribu�das respectivamente a um trabalho de laborat�rio, � avalia��o
semestral e a um exame final. A m�dia das tr�s notas mencionadas
anteriormente obedece aos pesos a seguir:
NOTA PESO
Trabalho de laborat�rio 2
Avalia��o semestral 3
Exame final 5 
 */

package semana3;

import javax.swing.JOptionPane;

public class Notafinal {
	public static void main(String[] args) {
		double lab = Double.parseDouble(JOptionPane.showInputDialog("Digite nota do laboratorio: "));
		double av = Double.parseDouble(JOptionPane.showInputDialog("Digite nota da avalia��o semestral: "));
		double ex = Double.parseDouble(JOptionPane.showInputDialog("Digite nota do exame final: "));
		double total = ((lab * 2) + (av * 3) + (ex * 5)) / 10;
		JOptionPane.showMessageDialog(null, "Nota de laboratorio: " + lab + 
				"\nNota da avalia��o semestral: " + av + 
				"\nNota do exame final: " + ex + 
				"\nNota final: " + total);
	}
}
