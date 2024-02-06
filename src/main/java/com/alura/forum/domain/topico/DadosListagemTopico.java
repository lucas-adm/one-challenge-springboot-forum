package com.alura.forum.domain.topico;

public record DadosListagemTopico(
        Long id,

        String titulo,

        String mensagem,

        String dataCriacao,

        Status status,

        String autor,

        Curso curso) {

    public DadosListagemTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getDataBrasil(), topico.getStatus(), topico.getAutor(), topico.getCurso());
    }

}
