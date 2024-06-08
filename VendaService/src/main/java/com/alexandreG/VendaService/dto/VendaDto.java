/**
 * @author alexandre.gaia
 */

package com.alexandreG.VendaService.dto;

import java.time.Instant;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class VendaDto {

    @NotNull
    @Size(min = 2, max = 10)
    private String codigo;

    @NotNull
    private String clienteId;

    @NotNull
    private Instant dataVenda;

}
