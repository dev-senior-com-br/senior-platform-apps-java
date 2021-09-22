package br.com.senior.platform.cms.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ListFactoryDefaultWidgetsInput {

    /**
     * O valor a ser pesquisado nos campos internacionalizados e nas tags ignorando caracteres maiúsculos e minúsculos
     */
    private String searchValue;
    /**
     * As configurações de paginação da listagem. Não definido, retornará os 10 primeiros resultados.
     */
    private Pagination pagination;

}
