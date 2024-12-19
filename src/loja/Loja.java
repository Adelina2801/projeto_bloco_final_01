package loja;

import java.util.Scanner;

public class Loja {


	public static void main(String[] args) {

		int opcao;


		Scanner leia = new Scanner(System.in);

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

			if (opcao == 4) {
				System.out.println("Você finalizou o sistema, até mais!");
				sobre();

				leia.close();
				System.exit(0);

			}

			switch (opcao) {

			case 1:
				System.out.println("Cadastrar\n\n");

				System.out.println("Digite o nome do produto: ");
				String produto = leia.next();
				
				
				System.out.println("Digite o tamanho do produto: ");
				int tamanho = leia.nextInt();
				
				break;

			case 2:
				System.out.println("Atualizar\n\n");

				break;

			case 3:
				System.out.println("Listar\n\n");
				break;

			case 4:
				System.out.println("Excluir\n");
				break;

			default:
				System.out.println("Opção Inválida!\n\n");

				break;

			}
		}
	}

	private void adicionar() {
		// TODO Auto-generated method stub

	}

	private void excluir() {
		// TODO Auto-generated method stub

	}

	private void visualizar() {
		// TODO Auto-generated method stub

	}

	private static void keyPress() {
		// TODO Auto-generated method stub

	}

	private static void sobre() {
		// TODO Auto-generated method stub

	}

}
