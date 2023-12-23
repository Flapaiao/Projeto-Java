package Ecommerce.model;

public abstract class Ecommerce {
	protected int idProduto, estoque;
	protected String produto;
	protected String tipo;
	protected float preco;
	
	
public Ecommerce(int idProduto,  String produto, float preco, int estoque, String tipo) {
		this.idProduto = idProduto;
		this.produto = produto;
		this.preco = preco;
		this.estoque = estoque;
		this.tipo = tipo;
	}


public int getIdProduto() {
	return idProduto;
}

public void setIdProduto(int idProduto) {
	this.idProduto = idProduto;
}

public int getEstoque() {
	return estoque;
}

public void setEstoque(int estoque) {
	this.estoque = estoque;
}

public String getProduto() {
	return produto;
}

public void setProduto(String produto) {
	this.produto = produto;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public float getPreco() {
	return preco;
}

public void setPreco(float preco) {
	this.preco = preco;
}


public boolean retirar(int quantidade) { 
		
		if(this.getEstoque() <= 0) {
			System.out.println("\nEstoque insuficiente!");
			return false;
		}
			
		this.setEstoque(this.getEstoque() - quantidade);
		return true;
	}

public void adicionar(int quantidade) {

	this.setEstoque(this.getEstoque() + quantidade);

}

public void visualizar() {

	String tipo = "";
	
	switch(this.produto) {
	case "Ebook":
		tipo = "Virtual";
	break;
	case "Produtos":
		tipo = "Fisico";
	break;
	}
	
	System.out.println("\n\n***********************************************************");
	System.out.println("Produtos disponíveis: ");
	System.out.println("***********************************************************");
	System.out.println("Identificação do Produto: " + this.idProduto);
	System.out.println("Produto: " + this.produto);
	System.out.println("Preço do produto: " + this.preco);
	System.out.println("Estoque: " + this.estoque);

}
	
	
}
