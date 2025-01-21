package com.albertobuituron.forohub.dto;

import com.albertobuituron.forohub.domain.topico.Topico;

import java.time.LocalDateTime;

public record DatosListadoTopicos(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fecha_Creacion,
        Boolean status,
        String autor,
        String curso) {

    public DatosListadoTopicos(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFecha_Creacion(), topico.getStatus(), topico.getAutor(), topico.getCurso());
    }
}
