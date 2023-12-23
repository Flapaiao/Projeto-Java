package Ecommerce.Repository;

import Ecommerce.model.Ecommerce;

public interface EcommerceRepository {
	
	    // CRUD da Conta
		public void procurarPorNumero(int idProduto);
		public void listarTodos();
		public void adicionar(Ecommerce ecommerce);
		public void deletar(int numero);
		
		//
		
}
