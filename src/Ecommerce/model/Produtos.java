package Ecommerce.model;

public class Produtos extends Ecommerce{

	public Produtos(int idProduto, String produto, float preco, int estoque, String tipo) {
		super(idProduto, produto, preco, estoque, tipo);
	}
	
	@Override
    public void visualizar() {
		System.out.println("Digite o id do produto: " + idProduto);
		System.out.println("Digite o nome do produto: " + produto);
		System.out.println("Digite o preço do produto: " + preco);
		System.out.println("Digite o estoque do produto: " + estoque);
		System.out.println("Digite o tipo do produto: " + tipo + "\n");

	}

}
