package traveller.models;

public class Dica extends Opcao{

	private long id;
	private String quandoIr;
	private double tempMedAnualCelsius;
	private String fusoHorario;
	private String tempPerman;
	private String idioma;
	private int voltagem;
	private String tipoTomada;
	private String moeda;
	private String documentos;
	private String bagagem;
	private String locomocao;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getQuandoIr() {
		return quandoIr;
	}
	public void setQuandoIr(String quandoIr) {
		this.quandoIr = quandoIr;
	}
	public double getTempMedAnualCelsius() {
		return tempMedAnualCelsius;
	}
	public void setTempMedAnualCelsius(double tempMedAnualCelsius) {
		this.tempMedAnualCelsius = tempMedAnualCelsius;
	}
	public String getFusoHorario() {
		return fusoHorario;
	}
	public void setFusoHorario(String fusoHorario) {
		this.fusoHorario = fusoHorario;
	}
	public String getTempPerman() {
		return tempPerman;
	}
	public void setTempPerman(String tempPerman) {
		this.tempPerman = tempPerman;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public int getVoltagem() {
		return voltagem;
	}
	public boolean setVoltagem(int valor) {
		if(valor >= 110 && valor <= 240){
			this.voltagem = valor;
			return true;
		}else
			System.out.println("Valor de voltagem inválido");
			return false;
	}
	public String getTipoTomada() {
		return tipoTomada;
	}
	public void setTipoTomada(String tipoTomada) {
		this.tipoTomada = tipoTomada;
	}
	public String getMoeda() {
		return moeda;
	}
	public void setMoeda(String moeda) {
		this.moeda = moeda;
	}
	public String getDocumentos() {
		return documentos;
	}
	public void setDocumentos(String documentos) {
		this.documentos = documentos;
	}
	public String getBagagem() {
		return bagagem;
	}
	public void setBagagem(String bagagem) {
		this.bagagem = bagagem;
	}
	public String getLocomocao() {
		return locomocao;
	}
	public void setLocomocao(String locomocao) {
		this.locomocao = locomocao;
	}
	
	public void apresentarConteudo() {
		System.out.println("===================================");
		System.out.println("DICAS ÚTEIS");
		System.out.println("id: "+this.id);
		System.out.println("Quando ir: "+this.quandoIr);
		System.out.println("Temperatura Média Anual (Celsius): "+this.tempMedAnualCelsius);
		System.out.println("Fuso Horário: "+this.fusoHorario);
		System.out.println("Tempo de permanencia recomendado: "+this.tempPerman);
		System.out.println("Idioma: "+this.idioma);
		System.out.println("Voltagem: "+ this.voltagem);
		System.out.println("Tipo de tomada: "+this.tipoTomada);
		System.out.println("Moeda: "+this.moeda);
		System.out.println("Documentos Necessários: "+this.documentos);
		System.out.println("Essencial para bagagem: "+this.bagagem);
		System.out.println("Locomoção: "+this.locomocao);
		System.out.println("Quantidade de acessos: "+this.acessoQuant);
		System.out.println("Recomendação da cidade(0-5): "+this.avaliacaoGeral);
		System.out.println("===================================");
	}
	
}
