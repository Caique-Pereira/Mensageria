package com.aws.mensagaria.utils;

public enum MessageStatus {
	
	Enviando("Enviando Mensagem"),
	Error("Falha ao enviar mensagem"),
    Sucess("Mensagem Enviada");
	
	private final String descricao;

    MessageStatus(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
