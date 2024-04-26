package lanchonete;

import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.areacliente.Cliente;
import lanchonete.atendimento.cozinha.Cozinheiro; 

public class Estabelecimento {
    public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		
		
		Almoxarife almoxarife = new Almoxarife();
	
		
		Atendente atendente = new Atendente();
		atendente.servindoMesa();
		atendente.receberPagamento();
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();	
	}
}
