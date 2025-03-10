package teste.umpraum;

import infra.DAO;
import modelo.composicao.Endereco;
import modelo.composicao.Fornecedor;
import modelo.composicao.Funcionario;

public class NovoEndereco {

	public static void main(String[] args) {
		
		Endereco endereco1 = new Endereco("Rua das Ortalicias", "Casa 1");
		Endereco endereco2 = new Endereco("Rua das Horticarias", "Casa 3");
		Endereco endereco3= new Endereco("Rua das Vinhetas", "Sem Complemento");
		Endereco endereco4= new Endereco("Rua dos Vitelos", "Corporate");
		
		
		Funcionario funcionario1 = new Funcionario ("Barbosa",endereco1);
		Funcionario funcionario2 = new Funcionario ("Francisco",endereco2);
		
		Fornecedor fornecedor1 = new Fornecedor("Gran Arvores", endereco3);
		Fornecedor fornecedor2 = new Fornecedor("Carns Top", endereco4);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirT().incluir(funcionario1).incluir(fornecedor1)
			.incluir(funcionario2).incluir(fornecedor2).fecharT().fechar();
	}
}
