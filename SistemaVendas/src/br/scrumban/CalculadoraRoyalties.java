package br.scrumban;

import br.scrumban.dao.VendaRepository;

public class CalculadoraRoyalties {

	private CalculadoraComissao calculadoraComissao;
    private VendaRepository vendasDAO;

    public CalculadoraRoyalties(CalculadoraComissao comissao, VendaRepository dao){
    	calculadoraComissao = comissao;
    	vendasDAO = dao;
    }
    
     
	
	public double calcularRoyalties(double totalFaturamento){
		
		
		return 0;
	}
}
