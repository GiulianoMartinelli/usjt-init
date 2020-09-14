/*Ler o número total de eleitores de um município, o número de votos brancos,
nulos e válidos. Calcular e escrever o percentual que cada um representa
em relação ao total de eleitores.  */

package semana2;

import javax.swing.JOptionPane;

public class VotosValidos {
	public static void main(String[] args) {
		double eleitores = Double.parseDouble(JOptionPane.showInputDialog("Quantos eleitores tem? "));
		double nulo = Double.parseDouble(JOptionPane.showInputDialog("Quantos votos foram nulos? "));
		double branco = Double.parseDouble(JOptionPane.showInputDialog("Quantos votos foram brancos? "));
		double pnulo = (nulo / eleitores) * 100;
		double pbranco = (branco / eleitores) * 100;
		JOptionPane.showMessageDialog(null, "Votos nulos: " + pnulo + "% \nVotos brancos: " + pbranco + "% \nVotos validos: " + (100 - pnulo - pbranco) + "%");
	}
}
