import java.util.Scanner;

public class PorcentagemAcerto {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int notas[] = new int[50];
		int gabarito[] = new int[50];
		float total = 0.0f, acertos = 0.0f;
		
		
		// ler notas
		for (int i=0; i<notas.length; i++) {
			notas[i] = input.nextInt();
			if(notas[i]==-1) {
				break;
			}
			total ++;
		}
		
		// ler gabarito
		for (int i=0; i<gabarito.length; i++) {
			gabarito[i] = input.nextInt();
			if(gabarito[i]==-1) {
				break;
			}
		}
		
		// acertos
		for (int i=0; i<notas.length; i++) {
			if (notas[i] == -1) {
				break;
			}
			if (notas[i] == gabarito[i]) {
				acertos++;
			}
		}
		
		System.out.printf("%.2f", acertos/total*100);
		
		input.close();
	}

}
