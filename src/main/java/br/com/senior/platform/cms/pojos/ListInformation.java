package br.com.senior.platform.cms.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * As informações sobre os resultados de listagem realizada
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ListInformation {

    /**
     * Quantidade total de resultados encontrados
     */
    public Long totalElements;
    /**
     * Quantidade total de páginas encontradas
     */
    public Long totalPages;

}
