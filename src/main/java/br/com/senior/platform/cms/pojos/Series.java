package br.com.senior.platform.cms.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Conjunto de valores a serem exibidos no gráfico
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Series {

    /**
     * Coluna que o conjunto de dados será vinculado
     */
    private Column column;
    /**
     * Descrição do conjunto
     */
    private String label;

}
