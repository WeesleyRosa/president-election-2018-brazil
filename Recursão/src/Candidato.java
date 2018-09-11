
public class Candidato {

	private String nome;
	private String partido;
	private int votos = 0;

	public Candidato() {
	}

	public Candidato(String nome, String partido, int votos) {
		super();
		this.nome = nome;
		this.partido = partido;
		this.votos = votos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public int getVotos() {
		return votos;
	}

	public void setVotos(int votos) {
		this.votos = votos;
	}

	@Override
	public String toString() {
		return "Candidato = " + nome + ", partido = " + partido + " e votos = " + votos + "";
	}

}
