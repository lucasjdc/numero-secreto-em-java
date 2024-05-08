import java.util.Scanner;

public class Advinhacao {
	public static void main(String[] arrs) {
		System.out.println("******************************************");
		System.out.println("* Bem vindo ao nosso jogo de adivinhação *");
		System.out.println("******************************************");
		
		int numeroSecreto = 42;
		int numeroDeTentativas = 1;
		int chute;
		String palavraTentativa = "tentativas";
		Scanner scanner = new Scanner(System.in);

		boolean ganhou = false;

		while (!ganhou) {
			System.out.println("Tentativa: " + numeroDeTentativas);
			System.out.print("Qual é o seu chute: ");
			chute = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Seu chute foi " + chute);

			if (chute < 0) {
				System.out.println("Você não pote chutar números negativos");				
				continue;
			}

			if (chute == numeroSecreto) {
				System.out.println("Parabéns! Você acertou");
				if (numeroDeTentativas == 1) {
					palavraTentativa = "tentativa";
				}
				System.out.println("Você precisou de " + numeroDeTentativas + " " + palavraTentativa + ".");
				System.out.println("Jogue de novo, você é um bom jogador!");
				ganhou = true;
			} 
			else if (chute > numeroSecreto) {
				System.out.println("Seu chute foi maior que o número secreto.");
			} else {
				System.out.println("Seu número foi menor que o número secreto.");
			}
			numeroDeTentativas++;
		}

		System.out.println("Fim de jogo!");
		scanner.close();
	}
}