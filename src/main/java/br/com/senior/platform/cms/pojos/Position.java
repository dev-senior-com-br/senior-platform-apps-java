package br.com.senior.platform.cms.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Posição onde inicia a exibição do widget
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Position {

    /**
     * Linha
     */
    public Long row;
    /**
     * Coluna
     */
    public Long column;

}
