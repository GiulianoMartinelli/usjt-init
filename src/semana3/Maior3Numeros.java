/* Fazer um programa que recebe três numeros
e mostra-os em ordem crescente */

package semana3;

import javax.swing.JOptionPane;

public class Maior3Numeros {
	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero: "));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero diferente: "));
		if (n1 > n2 && n1 > n3) {
			if (n2 > n3) {
				JOptionPane.showMessageDialog(null, "Em ordem crescente: " + n1 + ", " + n2 + ", " + n3);
			} else if (n3 > n2) {
				JOptionPane.showMessageDialog(null, "Em ordem crescente: " + n1 + ", " + n3 + ", " + n2);
			}
		} else if (n2 > n1 && n2 > n3) {
			if(n1 > n3) {
			} else if (n3 > n1) {
				JOptionPane.showMessageDialog(null, "Em ordem crescente: " + n2 + ", " + n3 + ", " + n1);
			}
		} else if (n3 > n1 && n3 > n2) {
			if (n1 > n2) {
				JOptionPane.showMessageDialog(null, "Em ordem crescente: " + n3 + ", " + n1 + ", " + n2);
			} else if (n2 > n1) {
				JOptionPane.showMessageDialog(null, "Em ordem crescente: " + n3 + ", " + n2 + ", " + n1);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Em ordem crescente: " + n1 + ", " + n2 + ", " + n3);
		}
	}
}
