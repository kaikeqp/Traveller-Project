package traveller.models;

public class CarroAluguel extends OpcaoComLocal{

	private String tipoCarro;

	public String getTipoCarro() {
		return tipoCarro;
	}

	public void setTipoCarro(String tipoCarro) {
		this.tipoCarro = tipoCarro;
	}
	
	public void apresentarConteudo(){
	System.out.println("===================================");
	System.out.println("ALGUE SEU CARRO");
	System.out.println("Tipo de carro: "+ this.tipoCarro);
	System.out.println("Descrição: "+this.descricao);
	System.out.println("Endereço da Locadora: "+ this.comoChegar.getLocalOpcao());
	System.out.println("Endereço do Usuário: "+this.comoChegar.getLocalUsuario());
	System.out.println("Site: "+this.site);
	System.out.println("Avaliação dos Usuários: "+this.avaliacao);
	System.out.println("Quantidade de acessos: "+this.acessoQuant);
	System.out.println("Recomendação da cidade(0-5): "+this.avaliacaoGeral);
	System.out.println("===================================");
	}
}
