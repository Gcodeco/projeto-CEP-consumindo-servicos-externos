package com.java.aula04.dto;

import lombok.Data;

@Data
public class PessoaDTO {

    private String nome;

    private String email;

    private Boolean ativo;

    protected String cep;

    private EnderecoDTO enderecoDTO;

}