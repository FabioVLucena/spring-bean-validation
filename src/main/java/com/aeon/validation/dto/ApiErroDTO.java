package com.aeon.validation.dto;

import java.util.Arrays;
import java.util.List;

import lombok.Getter;

public class ApiErroDTO {

	@Getter
	private List<String> erros;
	
	public ApiErroDTO(List<String> apiErroList) {
		this.erros = apiErroList;
	}
	
	public ApiErroDTO(String mensagemErro) {
		this.erros = Arrays.asList(mensagemErro);
	}
	
}
