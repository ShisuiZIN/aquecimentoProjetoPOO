package aquecimentoProjetoPOO;

public class Aluno {
	private String nome;
	private Sexo sexo;
	private String matricula;
	private String email;
	private String senha;
	public Aluno(String nome, String sexo, String matricula, String email, String senha) {
		this.nome=nome;
		this.sexo=Sexo.valueOf(sexo);
		this.matricula=matricula;
		this.email=email;
		this.senha=senha;
	}
	public String toString() {
		return nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getMatricula() {
		return matricula;
	}
	
}
