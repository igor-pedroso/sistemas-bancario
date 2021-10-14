package sistema_bancario;

import java.util.ArrayList;

public class listaDeCliente {
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public void cadastrar(Cliente cliente) {
		if(cliente != null) {
			clientes.add(cliente);
		}
	}
	
	public void remover(Cliente cliente) {
		clientes.removeIf((elemento)->elemento.getCPF().equalsIgnoreCase(cliente.getCPF()));
	}
	
	
}
