package com.aeon.validation.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aeon.validation.dto.PessoaRequestDTO;
import com.aeon.validation.dto.PessoaResponseDTO;
import com.aeon.validation.entity.Pessoa;

@RestController
@RequestMapping("/validar/pessoa")
public class PessoaController {

	@PostMapping("/entidade")
	public PessoaResponseDTO cadastrarPessoaEntidade(@RequestBody PessoaRequestDTO pessoaDTO) {
	
		String nomeRazao = pessoaDTO.getNomeRazao();
		
		PessoaResponseDTO response = new PessoaResponseDTO();
		response.setNomeRazao(nomeRazao);
		
		return response;
	}
	
	@PostMapping("/dto")
	public Pessoa cadastrarPessoaDTO(@RequestBody Pessoa pessoa) {
		return pessoa;
	}
	
}
