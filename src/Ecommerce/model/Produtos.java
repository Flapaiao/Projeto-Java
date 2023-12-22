package Ecommerce.model;

public class Produtos extends Ecommerce{
	
	private int tamanho;

	public Produtos(int idProduto, String produto, float preco, int estoque, String tipo, int tamanho) {
		super(idProduto, produto, preco, estoque, tipo);
		this.tamanho = tamanho;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	@Override
	public void visualizar() {
		
		int tipo = 0;
		
		switch(this.tamanho) {
		case 1:
			tipo = 300;
		break;
		case 2:
			tipo = 500;
		break;
		}
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Tamanhos disponíveis: ");
		System.out.println("***********************************************************");
		System.out.println("Produto do tamanho: " + tipo + "g");

	}

}
