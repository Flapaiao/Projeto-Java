package Ecommerce;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                Essência Cacheada                    ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar produtos                   ");
			System.out.println("            2 - Listar produtos                      ");
			System.out.println("            3 - Pesquisar produto por numero         ");
			System.out.println("            4 - Apagar produto                       ");
			System.out.println("            5 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 5) {
				System.out.println("\nEssência Cacheada - Produtos naturais para seus cachos!");
				sobre();
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Adicionar produtos\n\n");
					
					break;
				case 2:
					System.out.println("Listar produtos\n\n");

					break;
				case 3:
					System.out.println("Pesquisar produto por numero\n\n");

					break;
				case 4:
					System.out.println("Apagar produto\n\n");

					break;
				case 5:
					System.out.println("Sair do sistema\n\n");

					break;
			}
		}
	}
    
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Flavia R. Paião");
		System.out.println("github.com/Flapaiao");
		System.out.println("*********************************************************");
	}
}
