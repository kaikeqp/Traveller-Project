package traveller.test;

import traveller.models.CarroAluguel;
import traveller.models.Dica;
import traveller.models.Local;
import traveller.models.Parque;

public class Teste {

	public static void main(String[] args) {
		
		Dica dica = new Dica();
		
		dica.setId(1);
		dica.setQuandoIr("Próximo ao fim do inverno");
		dica.setTempMedAnualCelsius(24.2);
		dica.setFusoHorario("GMT-3");
		dica.setTempPerman("Uma à duas semanas");
		dica.setIdioma("Português");
		dica.setVoltagem(220);
		dica.setTipoTomada("N");
		dica.setMoeda("BRL");
		dica.setDocumentos("Registro Nacional, Passaporte");
		dica.setBagagem("Adaptador de tomada e Guarda-Chuva;");
		dica.setLocomocao("Carro, Onibus");
		dica.setAcessoQuant(210);
		dica.setAvaliacaoGeral(4);
		
		dica.apresentarConteudo();
		
		
		Local local1 = new Local();
		local1.setLocalOpcao("Av. República do Líbano, 1111");
		local1.setLocalUsuario("Rua Pedro Alvares, 222");
		
		Local local2 = new Local();
		local2.setLocalOpcao("Av. São Miguel, 1500");
		local2.setLocalUsuario("Rua Joaquim Freitas, 42");
		
		Parque parque = new Parque();
		
		parque.setId(1);
		parque.setNome("Ibirapuera");
		parque.setHorario("Das 7:00 às 19:00");
		parque.setDescricao("O Ibirapuera é o mais importante parque urbano de São Paulo. Seus três lagos artificiais são interligados e ocupam 1,6 milhão de m2.");
		parque.setComoChegar(local1);
		parque.setSite("www.parqueibirapuera.com.br");
		parque.setAvaliacao(5);
		parque.setAcessoQuant(560);
		parque.setAvaliacaoGeral(4.8);
		
		parque.apresentarConteudo();
		
		
		CarroAluguel carro = new CarroAluguel();
		carro.setTipoCarro("Van");
		carro.setDescricao("Unidas é a melhor locadora do estado de São Paulo já fazem 8 anos.");
		carro.setComoChegar(local2);
		carro.setSite("www.unidas.com.br");
		carro.setAvaliacao(4.2);
		carro.setAcessoQuant(230);
		carro.setAvaliacaoGeral(4);
		
		carro.apresentarConteudo();
		
		//Testes validação
		System.out.println("TESTES VALIDAÇÃO");
		dica.setVoltagem(400);
		carro.setAvaliacao(7);
		carro.setAvaliacaoGeral(-2);
	}

}
