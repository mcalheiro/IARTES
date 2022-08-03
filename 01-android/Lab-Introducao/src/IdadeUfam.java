import java.util.Scanner;

public class IdadeUfam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ano_fundacao = 1909;
		int ano_atual = scan.nextInt();
		
		System.out.printf("A UFAM tem %d anos de fundacao", ano_atual - ano_fundacao);
		scan.close();
	}

}
