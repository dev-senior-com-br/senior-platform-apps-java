package br.com.senior.platform.cms.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Tamanho de preferência
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PreferredSize {

    /**
     * Altura, quando utilizada em uma página com valores absolutos, cada unidade representará 40 pixels
     */
    private Long height;
    /**
     * Largura
     */
    private Long width;

}
