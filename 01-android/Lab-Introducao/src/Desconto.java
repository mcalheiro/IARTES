import java.util.Scanner;

public class Desconto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float valor = scan.nextFloat();
		scan.close();
		
		if (valor>=200.0) {
			valor = valor*0.95f;
		}
		
		System.out.printf("%.2f", valor);

	}

}
