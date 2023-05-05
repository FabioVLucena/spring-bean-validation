package com.aeon.validation.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaRequestDTO {

	private String nomeRazao;

	private String cpfCpnj;
	
	private String pessoaTipo;
	
	private String dataNascimento;
	
	private String estadoCivil;
	
}
