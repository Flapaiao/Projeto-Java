package Ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import Ecommerce.model.Produtos;
import Ecommerce.model.Virtual;


public class Menu {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int opcao;
		
		Produtos pf1 = new Produtos(1, "Shampoo", 39.99f, 10, "Fisico", 1);
		pf1.visualizar();
		pf1.retirar(2);
//		pf1.visualizar();
		pf1.adicionar(0);
//		pf1.visualizar();
		
		
		Virtual pv1 = new Virtual(1, "Shampoo", 59.99f, 100, "Fisico", "Crescimento");
		pv1.visualizar();
		pv1.retirar(5);
//		pv1.visualizar();
		pv1.adicionar(0);
//		pv1.visualizar();


		while (true) {

			System.out.println("\n*****************************************************");
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
			
			try {
				opcao = leia.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao=0;
			}

			if (opcao == 5) {
				System.out.println("\nEssência Cacheada - Produtos naturais para seus cachos!");
				sobre();
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Adicionar produtos\n\n");
					
					keyPress();
					break;
				case 2:
					System.out.println("Listar produtos\n\n");
					
					keyPress();
					break;
				case 3:
					System.out.println("Pesquisar produto por numero\n\n");
					
					keyPress();
					break;
				case 4:
					System.out.println("Apagar produto\n\n");
					
					keyPress();
					break;
				case 5:
					System.out.println("Sair do sistema\n\n");
					
					keyPress();
					break;
				default:
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
	
	public static void keyPress() {

		try {

			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}
