package model.bo;

import model.dao.AlunoDAO;
import model.vo.Aluno;

public class AlunoBO {
	
	private AlunoDAO aDAO = new AlunoDAO();
	/**
	 * Calcula a mÃ©dia final de um aluno
	 * @param o aluno com suas notas preenchidas
	 * @return a mÃ©dia aritmÃ©tica entre NP1 e NP2
	 * 
	 */
	public double calcularMediaFinal(Aluno aluno){
		return (aluno.getNotaProva1() + aluno.getNotaProva2());
	}
	
	/**
	 * Salva um aluno no banco
	 * 
	 * @param novoAluno o aluno que serÃ¡ cadastrado no banco
	 * 
	 * @return void nÃ£o retorna nada porque NUNCA DÃ� ERRO ;)
	 * 
	 */
	public void salvarAluno(Aluno novoAluno){
		this.aDAO.inserir(novoAluno);
	}
	
	
	
}
