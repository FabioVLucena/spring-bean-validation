package com.aeon.validation.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaRequestDTO {

	@NotEmpty(message = "Nome Razão não pode ser vazio.")
	@NotNull(message = "Nome Razão é um campo obrigatório.")
	private String nomeRazao;

	@CPF(message = "Informe um CPF válido.")
	@NotEmpty(message = "CPF é um campo obrigatório.")
	private String cpfCpnj;
	
	private String pessoaTipo;
	
	private String dataNascimento;
	
	private String estadoCivil;
	
}
