import funcionarios.Funcionario;
import funcionarios.FuncionarioController;
import funcionarios.FuncionarioDAO;

public class MainProgram {

	public static void main(String[] args) {
		FuncionarioDAO funcionarioDAO = new FuncionarioController();
		for (Funcionario f : funcionarioDAO.getAllFuncionarios()) {
			System.out.println(f.getNome() + " tem " + f.getIdade() + " anos.");
		}
		
		Funcionario augusto = funcionarioDAO.getFuncionario("Augusto");
		System.out.println("O Augusto tem " + augusto.getIdade() + " anos.");		
		
		augusto.setIdade(21);
		funcionarioDAO.updateFuncionario(augusto);		
		
		augusto = funcionarioDAO.getFuncionario("Augusto");
		System.out.println("O Augusto tem " + augusto.getIdade() + " anos.");
		
		Funcionario herry = new Funcionario("Herry", 16);
		
		try {
			funcionarioDAO.insertFuncionario(herry);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Funcionario marley = new Funcionario("Marley", 2);
		try {
			funcionarioDAO.insertFuncionario(marley);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (Funcionario f : funcionarioDAO.getAllFuncionarios()) {
			System.out.println(f.getNome() + " tem " + f.getIdade() + " anos.");
		}
	}
}
