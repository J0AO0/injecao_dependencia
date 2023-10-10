package com.exemplo.service;

import com.exemplo.modelo.Cliente;
import com.exemplo.modelo.Produto;
import com.exemplo.notificacao.NotificadorEmail;

public class EmissaoNotaFiscalService {
	
	public void emitir(Cliente cliente, Produto produto) {
		// TODO emite a nota fiscal aqui...
		
		NotificadorEmail notificador = new NotificadorEmail();
		notificador.notificar(cliente, "Nota fiscal do protudo "
				+ produto.getNome() + " foi emitida!");
	}
}
