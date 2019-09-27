package br.com.c3web.ceps.services;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.c3web.ceps.responses.CepResponse;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CepServicesIntegrationTest {
	
	@Autowired
	private CepService service;
	
	@Test
	public void deveRetornarEndereco() {
		CepResponse endereco = service.getCep("01310200");
		assertThat(endereco).hasFieldOrPropertyWithValue("cidade", "São Paulo");
	}

}
