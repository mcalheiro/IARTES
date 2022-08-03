import java.util.Scanner;

public class ContaEnergia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int consumo = scan.nextInt();
		char tipo = scan.next().charAt(0);
		scan.close();
		
		
		switch (tipo) {
		case 'R':
			if (consumo>0 && consumo<=500) {
				System.out.printf("%.2f", consumo*0.40);
			}
			else if (consumo>500){
				System.out.printf("%.2f", consumo*0.65);
			}
			else {
				System.out.println(-1.00);
			}
			break;
		case 'C':
			if (consumo>0 && consumo<=1000) {
				System.out.printf("%.2f", consumo*0.55);
			}
			else if (consumo>1000){
				System.out.printf("%.2f", consumo*0.60);
			}
			else {
				System.out.println(-1.00);
			}
			break;
		case 'I':
			if (consumo>0 && consumo<=5000) {
				System.out.printf("%.2f", consumo*0.55);
			}
			else if (consumo>5000){
				System.out.printf("%.2f", consumo*0.60);
			}
			else {
				System.out.println(-1.00);
			}
			break;
		default:
			System.out.println(-1.00);
		}

	}

}
