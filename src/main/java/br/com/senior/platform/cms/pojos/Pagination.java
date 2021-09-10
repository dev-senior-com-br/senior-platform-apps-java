package br.com.senior.platform.cms.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * As configurações de paginação de uma listagem
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Pagination {

    /**
     * O número da página retornado. A primeira página corresponde ao índice 0
     */
    public Long pageNumber = 0L;
    /**
     * Quantidade de registros por página
     */
    public Long pageSize = 10L;

}
