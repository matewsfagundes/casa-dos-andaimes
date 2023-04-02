package br.com.casadosandaimes.casadosandaimes.cliente.application.service;

import br.com.casadosandaimes.casadosandaimes.cliente.application.api.ClienteRequest;
import br.com.casadosandaimes.casadosandaimes.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
}
