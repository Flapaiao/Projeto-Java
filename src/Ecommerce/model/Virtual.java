package Ecommerce.model;

public class Virtual extends Ecommerce{
	
	private String cuidados;

	public Virtual(int idProduto, String produto, float preco, int estoque, String tipo, String cuidados) {
		super(idProduto, produto, preco, estoque, tipo);
		this.cuidados = cuidados;
	}

      @Override
      public void visualizar() {
		
		String tipo = "";
		
		switch(this.cuidados) {
		case "Crescimento dos fios":
			tipo = "Cuidados para o crescimento saudável dos seus cachos!";
		break;
		case "Fortificação dos fios":
			tipo = "Cuidados para fortificar seus cachos!";
		break;
		}
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Produtos disponíveis: ");
		System.out.println("***********************************************************");
		System.out.println("Produto: Ebook de " + this.cuidados + " \n" + tipo);

	}
	
}
