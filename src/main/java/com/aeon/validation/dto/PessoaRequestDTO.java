package com.aeon.validation.dto;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaRequestDTO {

	@NotEmpty(message = "Nome Razão não pode ser vazio.")
	@NotNull(message = "Nome Razão é um campo obrigatório.")
	private String nomeRazao;

	@CPF(message = "Informe um CPF válido.")
	@NotEmpty(message = "CPF não pode ser vazio.")
	private String cpfCpnj;
	
	private String pessoaTipo;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataNascimento;
	
	private String estadoCivil;
	
}
