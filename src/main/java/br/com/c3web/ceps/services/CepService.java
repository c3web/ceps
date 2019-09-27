package br.com.c3web.ceps.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.c3web.ceps.responses.CepResponse;

@FeignClient(name = "cepService", url = "http://api.postmon.com.br", path = "/v1/cep")
public interface CepService {
	
	@RequestMapping(value = "/{cep}", method = RequestMethod.GET)
	CepResponse getCep(@PathVariable("cep") String cep);

}
