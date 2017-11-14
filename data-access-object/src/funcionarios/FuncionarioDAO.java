package funcionarios;
import java.util.List;

import funcionarios.Funcionario;

public interface FuncionarioDAO {
	public Funcionario getFuncionario(String nome);
	public List<Funcionario> getAllFuncionarios();
	public void updateFuncionario(Funcionario funcionario);
	public void insertFuncionario(Funcionario funcionario);
}
