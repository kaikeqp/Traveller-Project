package traveller.models;

public class Opcao {

	protected long acessoQuant;
	protected double avaliacaoGeral;
	
	
	public long getAcessoQuant() {
		return acessoQuant;
	}
	public void setAcessoQuant(long acessoQuant) {
		this.acessoQuant = acessoQuant;
	}
	public double getAvaliacaoGeral() {
		return avaliacaoGeral;
	}
	public boolean setAvaliacaoGeral(double valor) {
		if(valor >= 0 && valor <= 5){
			this.avaliacaoGeral = valor;
			return true;
		}else{
			System.out.println("O valor atribuido para a avaliação deve ser de 0 a 5");
			return false;
			}
	}
	
}
