package traveller.test;

import traveller.models.CarroAluguel;
import traveller.models.Dica;
import traveller.models.Local;
import traveller.models.Parque;

public class Teste {

	public static void main(String[] args) {
		
		Dica dica = new Dica();
		
		dica.setId(1);
		dica.setQuandoIr("Pr�ximo ao fim do inverno");
		dica.setTempMedAnualCelsius(24.2);
		dica.setFusoHorario("GMT-3");
		dica.setTempPerman("Uma � duas semanas");
		dica.setIdioma("Portugu�s");
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
		local1.setLocalOpcao("Av. Rep�blica do L�bano, 1111");
		local1.setLocalUsuario("Rua Pedro Alvares, 222");
		
		Local local2 = new Local();
		local2.setLocalOpcao("Av. S�o Miguel, 1500");
		local2.setLocalUsuario("Rua Joaquim Freitas, 42");
		
		Parque parque = new Parque();
		
		parque.setId(1);
		parque.setNome("Ibirapuera");
		parque.setHorario("Das 7:00 �s 19:00");
		parque.setDescricao("O Ibirapuera � o mais importante parque urbano de S�o Paulo. Seus tr�s lagos artificiais s�o interligados e ocupam 1,6 milh�o de m2.");
		parque.setComoChegar(local1);
		parque.setSite("www.parqueibirapuera.com.br");
		parque.setAvaliacao(5);
		parque.setAcessoQuant(560);
		parque.setAvaliacaoGeral(4.8);
		
		parque.apresentarConteudo();
		
		
		CarroAluguel carro = new CarroAluguel();
		carro.setTipoCarro("Van");
		carro.setDescricao("Unidas � a melhor locadora do estado de S�o Paulo j� fazem 8 anos.");
		carro.setComoChegar(local2);
		carro.setSite("www.unidas.com.br");
		carro.setAvaliacao(4.2);
		carro.setAcessoQuant(230);
		carro.setAvaliacaoGeral(4);
		
		carro.apresentarConteudo();
		
		//Testes valida��o
		System.out.println("TESTES VALIDA��O");
		dica.setVoltagem(400);
		carro.setAvaliacao(7);
		carro.setAvaliacaoGeral(-2);
	}

}
