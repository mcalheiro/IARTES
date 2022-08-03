import java.util.Scanner;

public class Xadrez {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int linhas = scan.nextInt();
		scan.close();
		String linha = "";
		
		for (int i=0; i<linhas; i++ ) {
			linha = linha + "* ";
		}
		
		while(linhas>0) {
			if (linhas%2==0) {
				System.out.println(linha);
			}
			else {
				System.out.println(" " + linha);
			}
			linhas--;
		}

	}

}
