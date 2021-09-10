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
public class ListFactoryDefaultPagesInput {

    /**
     * O valor a ser pesquisado no campo nome da página.
     */
    public String searchValue;
    /**
     * As configurações de paginação da listagem. Não definido, retornará os 10 primeiros resultados.
     */
    public Pagination pagination;

}
