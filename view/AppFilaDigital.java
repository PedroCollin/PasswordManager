package view;

import java.util.Scanner;

import controller.FilaController;

public class AppFilaDigital {
	
	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		int opcao_escolhida_menu;
		FilaController controller = new FilaController();
		
		System.out.println("### FILA DIGITAL ###");
		System.out.println("=========================");
		System.out.println("| 1 - Nova Senha         |");
		System.out.println("| 2 - Gerador Automatico |");
		System.out.println("| 3 - Chamar e Atender   |");
		System.out.println("| 0 - Sair               |");
		System.out.println("=========================");
		System.out.println("\nOpcao -> ");
		opcao_escolhida_menu = teclado.nextInt();
		
		while (opcao_escolhida_menu != 0) {
			
			switch (opcao_escolhida_menu) {
			case 1:
				int opcao_escolhida_confirmacao;
				
				System.out.println("### FILA DIGITAL ###");
				System.out.println("=========================");
				System.out.printf("XX segundos (estimado de espera)\n");
				System.out.printf("XX pessoas na fila \n");
				System.out.println("=========================");

				System.out.println("\n Para confirmar NOVA SENHA digite 1 ou 0 para voltar:\n");
				opcao_escolhida_confirmacao = teclado.nextInt();	
				
				if (opcao_escolhida_confirmacao == 1) {
					controller.novaSenha();
				}
				break;
			
			case 2:
				controller.gerarSenhaAutomaticamente();
				break;
			
			case 3:
				controller.atender();
				break;
			}
			
			System.out.println("### FILA DIGITAL ###");
			System.out.println("=========================");
			System.out.println("| 1 - Nova Senha         |");
			System.out.println("| 2 - Gerador Automatico |");
			System.out.println("| 3 - Chamar e Atender   |");
			System.out.println("| 0 - Sair               |");
			System.out.println("=========================");
			System.out.print("Opcao -> ");
			opcao_escolhida_menu = teclado.nextInt();
		}
		teclado.close();
	}
}
