package sistema_bancario;

public class Principal {

	public static void main(String[] args) {
		Gerente paulo = new Gerente("Paulo Gilberto", "123456"); // Gerente a ser cadastrado
		Gerente maria = new Gerente("Maria"); // Gerente a ser usado na busca

		ListaDeGerentes gerentes = new ListaDeGerentes();

		// Cadastrar o paulo na lista
		gerentes.cadastrar(paulo);

		// Buscar a maria na lista
		Gerente busca = gerentes.buscar(paulo);

		if (busca == null) {
			System.out.println("Gerente não localizado!!!");
		} else {
			System.out.printf("%s localizado!!!\n", busca.getNome());
		}

		gerentes.remover(paulo);

		// Buscar de novo o gerente paulo
		busca = gerentes.buscar(paulo);

		if (busca == null) {
			System.out.println("Gerente não localizado!!!");
		} else {
			System.out.printf("%s localizado!!!", busca.getNome());
		}
	}

}
