/* Escreva um programa que exibe os primeiros 100 números naturais.
Faça versões usando for, while e do/while. */

package semana04;

public class CemPrimeirosNum {
	public static void main(String[] args) {
		System.out.println("-------- For --------\n");
		for(int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		int i = 1;
		System.out.println("-------- While --------\n");
		while (i <= 100) {
			System.out.println(i);
			i++;
		}
		System.out.println("-------- Do While --------\n");
		i = 0;
		do {
			i ++;
			System.out.println(i);
		} while(i < 100);
	}
}