package calculomedia.classes;


/*Classe para representar aluno*/
public class Aluno {
	
	
	private int idade;
	private String dtNasc;
	private String rg;
	private  String cpf;
	private String nomeMae;
	private String nomePai;
	private String dtMatricula;
	private String nomeEscola;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(String dtNasc) {
		this.dtNasc = dtNasc;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getDtMatricula() {
		return dtMatricula;
	}
	public void setDtMatricula(String dtMatricula) {
		this.dtMatricula = dtMatricula;
	}
	public String getNomeEscola() {
		return nomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public double getNota4() {
		return nota4;
	}
	
	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	public double getMedia() {
		return (nota1+ nota2+nota3+nota4)/4;
		
	}   
	
	/*Metodo para verificar se o aluno esta aprovado*/
	
	public boolean getAprovacao() {
		double media = this.getMedia();
		
		if(media >=70) {
			return true;
		}else {
			return false;	
		}
	}
	/*Metodo para verificar se o aluno esta aprovado retornando uma string*/
	public String getAprovacaoStd() {
		double mediaStd = this.getMedia();
		if(mediaStd >= 70) {
			return "Aluno aprovado";
		}else {
			return "Aluno reprovado";
		}
	
		}
	
	
}
