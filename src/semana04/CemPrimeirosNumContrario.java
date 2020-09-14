/* Reimplemente o exercício 1, fazendo com que os valores
 sejam exibidos em ordem reversa. */

package semana04;

public class CemPrimeirosNumContrario {
	public static void main(String[] args) {
		System.out.println("-------- For --------\n");
		for(int i = 100; i >= 1; i--) {
			System.out.println(i);
		}
		int i = 100;
		System.out.println("-------- While --------\n");
		while (i >= 1) {
			System.out.println(i);
			i--;
		}
		System.out.println("-------- Do While --------\n");
		i = 100;
		do {
			i --;
			System.out.println(i);
		} while(i > 1);
	}
}