package controller;

import model.bo.AlunoBO;


public class ControllerNotas {
	
	public static final String NIVEL_BASICO = "Básico";
	public static final String NIVEL_INTERMEDIARIO = "Intermediário";
	public static final String NIVEL_AVANCADO = "Avançado";
	
	private AlunoBO bo = new AlunoBO();
	
	public String validarCamposSalvar(String nomeDigitado, String sobrenomeDigitado, String matricula
			) {
		String mensagem = "";

		if (nomeDigitado.isEmpty() || nomeDigitado.trim().length() < 3) {
			mensagem += "Nome deve possuir pelo menos 3 letras \n";
		}

		if (sobrenomeDigitado.isEmpty() || sobrenomeDigitado.trim().length() < 3) {
			mensagem += "Sobrenome deve possuir pelo menos 3 letras \n";
		}

		if (matricula == null) {
			mensagem += "Informe a Matrícula \n";
		}

		return mensagem;
	}

}
