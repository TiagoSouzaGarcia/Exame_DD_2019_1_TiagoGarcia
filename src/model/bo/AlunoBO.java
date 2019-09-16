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
	public Aluno salvarAluno(Aluno novoAluno){
		this.aDAO.inserir(novoAluno);
		return novoAluno;
	}

	public static String verificarSoma(Aluno aluno) {
		double pesoprova = aluno.getPesoProva();
		double pesotrabalho = aluno.getPesoTrabalho();
		double soma = pesoprova+pesotrabalho;
		String mensagem = null;
		
		if (soma !=1) {
			mensagem = " A soma dos pesos deve ser igual a um.";
		}
		
		return mensagem;
	}

	 public double calcularNota(Aluno aluno) {
		double notaprova;
		double notatrabalho;
		double notafinal;
		
		notaprova = ((aluno.getNotaProva1()+aluno.getNotaProva2())*aluno.getPesoProva()/2);
		
		notatrabalho = ((aluno.getNotaTrabalho1()+aluno.getNotaTrabalho2())*aluno.getPesoTrabalho()/2);
		
		notafinal = notaprova+notatrabalho;
		
		return notafinal;
	}
	
	
	
}
