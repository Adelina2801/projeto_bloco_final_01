package projeto_final_bloco_01;

import java.util.Scanner;

public class LojaTShirtMasculina {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println("_________________________________________________________");
			System.out.println("                                                         ");
			System.out.println("                 Loja T-Shirt Masculina                  ");
			System.out.println("                                                         ");
			System.out.println("_________________________________________________________");
			System.out.println("                                                         ");
			System.out.println("                     1- Cadastrar                        ");
			System.out.println("                     2- Atualizar                        ");
			System.out.println("                     3- Listar                           ");
			System.out.println("                     4- Excluir                          ");
			System.out.println("                     5- Sair                             ");
			System.out.println("_________________________________________________________");
			System.out.println("                                                         ");
			System.out.println("                 Digite a opção desejada:                ");
			System.out.println("_________________________________________________________");

			opcao = leia.nextInt();

			if (opcao == 5) {
				System.out.println("Você finalizou o sistema, até mais!");
				sobre();

				leia.close();
				System.exit(0);

			}

			switch (opcao) {

			case 1:
				System.out.println("Cadastrar\n\n");
				break;

			case 2:
				System.out.println("Atualizar\n\n");
				break;

			case 3:
				System.out.println("Listar Produtos\n\n");
				break;

			case 4:
				System.out.println("Excluir\n\n");
				break;

			default:
				System.out.println("\nOpção Inválida!\n");
				break;

			}
		}
	}

	private static void sobre() {
		// TODO Auto-generated method stub

	}

}
