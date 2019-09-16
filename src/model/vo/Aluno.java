package model.vo;

public class Aluno {

	private int id;
	private String nome;
	private String sobrenome;
	private String matricula;
	private String nivel;
	private double notaProva1;
	private double notaProva2;
	private double notaTrabalho1;
	private double notaTrabalho2;
	private double media;
	private String situacao;
	private double pesoProva;
	private double pesoTrabalho;
	
	
	public Aluno(String nome, String sobrenome, String matricula, String nivel, double notaProva1,
			double notaProva2, double notaTrabalho1, double notaTrabalho2, String situacao,
			double pesoProva, double pesoTrabalho, double media) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.matricula = matricula;
		this.nivel = nivel;
		this.notaProva1 = notaProva1;
		this.notaProva2 = notaProva2;
		this.notaTrabalho1 = notaTrabalho1;
		this.notaTrabalho2 = notaTrabalho2;
		this.media = media;
		this.situacao = situacao;
		this.pesoProva = pesoProva;
		this.pesoTrabalho = pesoTrabalho;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getNivel() {
		return nivel;
	}


	public void setNivel(String nivel) {
		this.nivel = nivel;
	}


	public double getNotaProva1() {
		return notaProva1;
	}


	public void setNotaProva1(double notaProva1) {
		this.notaProva1 = notaProva1;
	}


	public double getNotaProva2() {
		return notaProva2;
	}


	public void setNotaProva2(double notaProva2) {
		this.notaProva2 = notaProva2;
	}


	public double getNotaTrabalho1() {
		return notaTrabalho1;
	}


	public void setNotaTrabalho1(double notaTrabalho1) {
		this.notaTrabalho1 = notaTrabalho1;
	}


	public double getNotaTrabalho2() {
		return notaTrabalho2;
	}


	public void setNotaTrabalho2(double notaTrabalho2) {
		this.notaTrabalho2 = notaTrabalho2;
	}


	public double getMedia() {
		return media;
	}


	public void setMedia(double media) {
		this.media = media;
	}


	public String getSituacao() {
		return situacao;
	}


	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}


	public double getPesoProva() {
		return pesoProva;
	}


	public void setPesoProva(double pesoProva) {
		this.pesoProva = pesoProva;
	}


	public double getPesoTrabalho() {
		return pesoTrabalho;
	}


	public void setPesoTrabalho(double pesoTrabalho) {
		this.pesoTrabalho = pesoTrabalho;
	}
	
	
	
	
	
	
}