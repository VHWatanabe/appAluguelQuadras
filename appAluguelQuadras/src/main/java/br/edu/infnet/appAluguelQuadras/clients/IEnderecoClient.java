package br.edu.infnet.appAluguelQuadras.clients;

import br.edu.infnet.appAluguelQuadras.model.domain.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://viacep.com.br/ws", name = "enderecoClient")
public interface IEnderecoClient {

    @GetMapping(value = "/{cep}/json/")
    public Endereco buscarCep (@PathVariable String cep);
}
