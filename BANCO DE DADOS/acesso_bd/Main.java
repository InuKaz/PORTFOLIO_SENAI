package acesso_bd;

public class Main {

	public static void main(String[] args) {
		
		Banco.criar_tabela("carro", "id serial primary key", "modelo varchar(50)", "marca varchar(30)");
		Banco.criar_tabela("pessoa", "cpf varchar(11) primary key", "id_carro integer REFERENCES carro(id)", "nome varchar(50)", "endereco varchar(50)", "telefone varchar(9)");

		Carro punto = new Carro("Fiat", "Punto 2021");
		Carro Bravo = new Carro("Volkswagen", "Bravo 2021");

		Pessoa pess1 = new Pessoa("43212356577", "1", "Pessoa1 Marcos Da Rocha", "Rua da Empada, Florianópolis", "84269503");
		Pessoa pess2 = new Pessoa("15312376843", "2", "Pessoa2 da Silva Campos", "Rua da Batata, Barra do Aririú", "91359352");
		
		Banco.salvar(punto);
		Banco.salvar(Bravo);
		Banco.salvar(pess1);
		Banco.salvar(pess2);

		Banco.visualiza_tabela("carro", "marca", "modelo");
		Banco.visualiza_tabela("pessoa", "cpf", "id_carro", "nome", "endereco", "telefone");

	}

}