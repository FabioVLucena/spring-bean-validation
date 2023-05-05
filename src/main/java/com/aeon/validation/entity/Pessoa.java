package com.aeon.validation.entity;

import lombok.Data;

@Data
public class Pessoa {

	private String nomeRazao;

	private String cpfCpnj;
	
	private String pessoaTipo;
	
	private String dataNascimento;
	
	private String estadoCivil;
	
}
