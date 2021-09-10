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
    public String pageId;
    /**
     * Identificador do analytic
     */
    public String analyticId;
    /**
     * Filtros
     */
    public Expression filter;
    /**
     * A ordenação dos registros
     */
    public java.util.List<Order> order;
    /**
     * Filtros adicionais para o dataset do analytic
     */
    public AdditionalFilter additionalFilter;

    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public SetPageAnalyticFilterInput(String pageId, String analyticId) {
        this.pageId = pageId;
        this.analyticId = analyticId;
    }

}
