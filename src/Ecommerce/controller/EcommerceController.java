package Ecommerce.controller;

import java.util.ArrayList;

import Ecommerce.Repository.EcommerceRepository;
import Ecommerce.model.Ecommerce;

public class EcommerceController implements EcommerceRepository {
	
	private ArrayList<Ecommerce> listaProdutos = new ArrayList<Ecommerce>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int idProduto) {
    var ecommerce = buscarNaCollection(idProduto);
		
		if (ecommerce != null)
			ecommerce.visualizar();
		else
			System.out.println("\nO produto id: " + idProduto + " não foi encontrada!");
		
	}

	@Override
	public void listarTodos() {
		for(var ecommerce : listaProdutos) {
			ecommerce.visualizar();
		}
	}

	@Override
	public void adicionar(Ecommerce ecommerce) {
		listaProdutos.add(ecommerce);
		System.out.println("Novo produto " + ecommerce.getProduto() + " foi adicionado!");
		
	}
	@Override
	public void deletar(int idProduto) {
		var ecommerce = buscarNaCollection(idProduto);

        if (ecommerce != null) {
            if (listaProdutos.remove(ecommerce) == true)
            System.out.println("\nO produto " + idProduto + " foi deletado com sucesso.");
        }
        else {
            System.out.println("\nO produto " + idProduto + " não foi encontrado.");
        }
		
	}
	public Ecommerce buscarNaCollection(int idProduto) {
		for (var ecommerce : listaProdutos) {
			if (ecommerce.getIdProduto() == idProduto) {
				return ecommerce;
			}
		}
		
		return null;
	}

}
