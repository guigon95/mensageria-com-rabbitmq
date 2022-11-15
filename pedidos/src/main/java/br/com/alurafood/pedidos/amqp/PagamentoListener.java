package br.com.alurafood.pedidos.amqp;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import br.com.alurafood.pedidos.dto.PagamentoDto;

@Component
public class PagamentoListener {

	@RabbitListener(queues = "pagamentos.detalhes-pedido")
	public void recebeMensagem(PagamentoDto pagamento) {

		System.out.println("Recebi a mensagem: " + pagamento.getId());
		System.out.println("Número do pedido:"+ pagamento.getNumero());
		System.out.println("Valor R$:" + pagamento.getValor());
		System.out.println("Status:" + pagamento.getStatus());
	}
}
