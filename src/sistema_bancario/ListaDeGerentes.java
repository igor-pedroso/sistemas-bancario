package sistema_bancario;

import java.util.ArrayList;

public class ListaDeGerentes {
	private ArrayList<Gerente> lista = new ArrayList<Gerente>();

	public void cadastrar(Gerente gerente) {
		if (gerente != null) {
			lista.add(gerente);
		}
	}

	public void remover(Gerente gerente) {
		lista.removeIf((elemento) -> elemento.getNome().equalsIgnoreCase(gerente.getNome()));
	}

	public Gerente buscar(Gerente gerente) {
		for (Gerente elemento : this.lista) {
			if (elemento.getNome().equalsIgnoreCase(gerente.getNome())) {
				return elemento;
			}
		}
		return null;
	}
	
	public void editar(Gerente gerente) {
		int indice = lista.indexOf(this.buscar(gerente)); // Elemento está na lista?
		if(indice != -1) { // Achou?
			lista.set(indice, gerente);
		}
	}	
}