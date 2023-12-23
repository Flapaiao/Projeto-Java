package Ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import Ecommerce.controller.EcommerceController;
import Ecommerce.model.Produtos;
import Ecommerce.model.Virtual;


public class Menu {
	public static void main(String[] args) {
		
		EcommerceController ecommerce = new EcommerceController();
		
		Scanner leia = new Scanner(System.in);

		int opcao, idProduto, estoque;
		String produto, tipo;
		float preco;
		
		System.out.println("\nAdicionar Produtos\n");

		Produtos pf1 = new Produtos(1, "Shampoo", 35.99f, 20, "Produto");
		ecommerce.adicionar(pf1);

		Produtos pf2 = new Produtos(2, "Condicionador", 39.99f, 20, "Produto");
		ecommerce.adicionar(pf2);

		Virtual pv1 = new Virtual(3, "Crescimento dos Fios", 49.99f, 20, "Ebook");
		ecommerce.adicionar(pv1);

		Virtual pv2 = new Virtual(4, "Fortalecimento dos Fios", 49.99f, 20, "Ebook");
		ecommerce.adicionar(pv2);

		ecommerce.listarTodos();

        
		while (true) {

			System.out.println("\n*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                Essência Cacheada                    ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar produtos                   ");
			System.out.println("            2 - Listar produtos                      ");
			System.out.println("            3 - Pesquisar produto por id             ");
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
					System.out.println("Digite o id do produto: ");
					idProduto = leia.nextInt();
					System.out.println("Digite o nome do produto: ");
					leia.skip("\\R?");
					produto = leia.nextLine();
					System.out.println("Digite o preço do produto: ");
					preco = leia.nextFloat();
					System.out.println("Digite o estoque do produto: ");
					estoque = leia.nextInt();
					System.out.println("Digite o tipo do produto: ");
					tipo = leia.nextLine();
					
					do {
						System.out.println("\nDigite o Tipo do produto (Ebook ou Produtos): ");
						tipo = leia.nextLine();
					} while (tipo == "Ebook" || tipo == "Produtos");
					
					ecommerce.adicionar(new Produtos(idProduto, produto, preco, estoque, tipo));					

					keyPress();
					break;
				case 2:
					System.out.println("Listar produtos\n\n");
					ecommerce.listarTodos();
					keyPress();
					break;
				case 3:
					System.out.println("Buscar Conta por número\n\n");

					System.out.println("Digite o número id do produto: ");
					idProduto = leia.nextInt();

					ecommerce.procurarPorNumero(idProduto);
					keyPress();
					break;
				case 4:
					System.out.println("Apagar produto\n\n");
					System.out.println("Digite o número de id: ");
					idProduto = leia.nextInt();
					
					ecommerce.deletar(idProduto);
					keyPress();
					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					keyPress();
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
	
	public static void keyPress() {

		try {

			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}
