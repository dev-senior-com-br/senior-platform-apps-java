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
public class SetPageAnalyticFilterInput {

    /**
     * Identificador da página
     */
    private String pageId;
    /**
     * Identificador do analytic
     */
    private String analyticId;
    /**
     * Filtros
     */
    private Expression filter;
    /**
     * A ordenação dos registros
     */
    private java.util.List<Order> order;
    /**
     * Filtros adicionais para o dataset do analytic
     */
    private AdditionalFilter additionalFilter;

    /**
     * This convenience constructor allows initialization of all required fields.
     * 
     * @param pageId - Identificador da página
     * @param analyticId - Identificador do analytic
     * 
     */
    public SetPageAnalyticFilterInput(String pageId, String analyticId) {
        this.pageId = pageId;
        this.analyticId = analyticId;
    }

}
