package traveller.models;

public class OpcaoComLocal extends Opcao{

	protected String descricao;
	protected Local comoChegar;
	protected String site;
	protected double avaliacao;
	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Local getComoChegar() {
		return comoChegar;
	}
	public void setComoChegar(Local comoChegar) {
		this.comoChegar = comoChegar;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public double getAvaliacao() {
		return avaliacao;
	}
	public boolean setAvaliacao(double valor) {
		if(valor >= 0 && valor <= 5){
			this.avaliacao= valor;
			return true;
		}else{
			System.out.println("O valor atribuido para a avaliação deve ser de 0 a 5");
			return false;
			}
	}
	
	
}
