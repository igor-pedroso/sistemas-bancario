package sistema_bancario;

import java.util.ArrayList;

public class listaDeConta {
	private ArrayList<Conta> contas = new ArrayList<Conta>();
	
	public void cadastrar(Conta conta) {
		if(conta != null) {
			contas.add(conta);
		}
	}
	
	public void remover(Conta conta) {
		contas.removeIf((elemento)->elemento.getNumero() == conta.getNumero());
	}
}
