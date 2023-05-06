package com.aeon.validation.entity;

import com.aeon.validation.enums.EstadoCivil;
import com.aeon.validation.enums.PessoaTipo;

import lombok.Data;

@Data
public class Pessoa {

	private String nomeRazao;

	private String cpfCpnj;
	
	private PessoaTipo pessoaTipo;
	
	private String dataNascimento;
	
	private EstadoCivil estadoCivil;
	
}
