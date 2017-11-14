package funcionarios;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioController extends Exception implements FuncionarioDAO {
	
	private List<Funcionario> funcionarios;
	
	public FuncionarioController() {
		 funcionarios = new ArrayList<Funcionario>();
		 funcionarios.add(new Funcionario("Augusto", 20));
		 funcionarios.add(new Funcionario("Snow", 1));
		 funcionarios.add(new Funcionario("André", 28));
	}

	@Override
	public Funcionario getFuncionario(String nome) {
		for (Funcionario funcionario  : funcionarios) {
			if (funcionario.getNome().equals(nome)) {
				return funcionario;
			}
		}
		return null;
	}

	@Override
	public List<Funcionario> getAllFuncionarios() {
		return funcionarios;
	}

	@Override
	public void updateFuncionario(Funcionario funcionario) {
		getFuncionario(funcionario.getNome()).setIdade(funcionario.getIdade());
	}

	@Override
	public void insertFuncionario(Funcionario funcionario) {
		if (funcionario.getIdade() < 16) {
			throw new IllegalArgumentException("Idade inferior a permitida.");
		}
		funcionarios.add(funcionario);
	}

}
