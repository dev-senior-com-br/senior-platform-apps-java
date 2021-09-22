package br.com.senior.platform.cms.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Informações do chart e suas associações
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Chart {

    /**
     * Tipo do gráfico
     */
    private ChartType type;
    /**
     * Categoria, opcional para o tipo de gráfico GAUGE
     */
    private Column category;
    /**
     * Conjunto de valores a serem exibidos, se o tipo de gráfico for pizza, somente um conjunto é aceito
     */
    private java.util.List<Series> series;
    /**
     * Identificador do dataset que será vinculado ao gráfico
     */
    private String datasetId;
    /**
     * Filtros
     */
    private Expression filter;
    /**
     * A ordenação dos registros
     */
    private java.util.List<Order> order;

    /**
     * This convenience constructor allows initialization of all required fields.
     * 
     * @param type - Tipo do gráfico
     * @param series - Conjunto de valores a serem exibidos, se o tipo de gráfico for pizza, somente um conjunto é aceito
     * @param datasetId - Identificador do dataset que será vinculado ao gráfico
     * 
     */
    public Chart(ChartType type, java.util.List<Series> series, String datasetId) {
        this.type = type;
        this.series = series;
        this.datasetId = datasetId;
    }

}
