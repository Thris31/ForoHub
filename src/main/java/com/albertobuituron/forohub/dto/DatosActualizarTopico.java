package com.albertobuituron.forohub.dto;

public record DatosActualizarTopico(
        Long id,
        String titulo,
        String mensaje,
//        LocalDateTime fecha_Creacion,
//        Boolean status,
        String autor,
        String curso) {
}
