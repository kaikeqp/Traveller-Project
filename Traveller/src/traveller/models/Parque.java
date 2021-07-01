package traveller.models;

public class Parque extends OpcaoComLocal{

	private long id;
	private String nome;
	private String horario;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	public void apresentarConteudo(){
		System.out.println("===================================");
		System.out.println("PARQUE");
		System.out.println("id: "+this.id);
		System.out.println("Horário: "+this.horario);
		System.out.println("Nome: "+this.nome);
		System.out.println("Descrição: "+this.descricao);
		System.out.println("Endereço do parque: "+this.comoChegar.getLocalOpcao());
		System.out.println("Endereço do Usuário: "+this.comoChegar.getLocalUsuario());
		System.out.println("Site: "+this.site);
		System.out.println("Avaliação dos Usuários: "+this.avaliacao);
		System.out.println("Quantidade de acessos: "+this.acessoQuant);
		System.out.println("Recomendação da cidade(0-5): "+this.avaliacaoGeral);
		System.out.println("===================================");
	}
	
}
