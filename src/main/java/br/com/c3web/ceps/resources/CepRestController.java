package br.com.c3web.ceps.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.c3web.ceps.responses.CepResponse;
import br.com.c3web.ceps.services.CepService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/cep")
public class CepRestController {
	
	CepService cepService;
	
	@ResponseStatus()
	@RequestMapping(value = "/{cep}", method = RequestMethod.GET)
	public CepResponse getCep(@PathVariable("cep") String cep) {
		return cepService.getCep(cep);
	}

}
