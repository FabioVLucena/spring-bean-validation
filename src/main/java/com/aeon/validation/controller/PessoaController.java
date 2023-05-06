package com.aeon.validation.controller;

import javax.validation.Valid;

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

	@PostMapping("/dto")
	public PessoaResponseDTO cadastrarPessoaEntidade(@RequestBody @Valid PessoaRequestDTO pessoaDTO) {
	
		String nomeRazao = pessoaDTO.getNomeRazao();
		
		PessoaResponseDTO response = new PessoaResponseDTO();
		response.setNomeRazao(nomeRazao);
		
		return response;
	}
	
	@PostMapping("/entidade")
	public Pessoa cadastrarPessoaDTO(@RequestBody @Valid Pessoa pessoa) {
		return pessoa;
	}
	
}
