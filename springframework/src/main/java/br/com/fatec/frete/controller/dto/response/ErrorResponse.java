package br.com.fatec.frete.controller.dto.response;

import java.time.LocalDateTime;

public record ErrorResponse(
        LocalDateTime date,
        String path,
        Integer status,
        String error,
        String message
) {
}
