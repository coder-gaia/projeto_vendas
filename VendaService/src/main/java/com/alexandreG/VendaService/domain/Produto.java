/**
 * @author alexandre.gaia
 */

package com.alexandreG.VendaService.domain;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class Produto {

    private String id;

    @NotNull
    @Size(min = 2, max = 10)
    private String codigo;

    @NotNull
    @Size(min = 1, max = 50)
    private String nome;

    @NotNull
    @Size(min = 1, max = 50)
    private String descricao;

    @NotNull
    private BigDecimal valor;
}
