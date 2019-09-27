package br.com.c3web.ceps.responses;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode @ToString
public class CepResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	@Getter @Setter
	private String logradouro;
	@Getter @Setter
	private String bairro;
	@Getter @Setter
	private String cidade;
	@Getter @Setter
	private String estado;

}
