package br.com.senior.platform.cms.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Informações básicas de um analytic
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BasicAnalytic {

    /**
     * Identificador do analytics seguindo o padrão: analytic://tenantDomain/identificadorUnico
     */
    public String id;
    /**
     * Nome do widget
     */
    public String name;
    /**
     * Título a ser exibido podendo ser uma chave de tradução no padrão platform.cms.nome
     */
    public String title;
    /**
     * As tags associadas a esse analytic
     */
    public java.util.List<String> tags;
    /**
     * O tamanho preferido para melhor visualização
     */
    public PreferredSize preferredSize;
    /**
     * O tipo do gráfico
     */
    public ChartType chartType;
    /**
     * Criado por
     */
    public String createdBy;
    /**
     * Data de criação
     */
    public java.util.Date createdDate;

    /**
     * This convenience constructor allows initialization of all required fields.
     * 
     * @param id - Identificador do analytics seguindo o padrão: analytic://tenantDomain/identificadorUnico
     * @param name - Título a ser exibido podendo ser uma chave de tradução no padrão platform.cms.nome
     * @param chartType - O tamanho preferido para melhor visualização
     * @param createdBy - Criado por
     * @param createdDate - Data de criação
     * 
     */
    public BasicAnalytic(String id, String name, ChartType chartType, String createdBy, java.util.Date createdDate) {
        this.id = id;
        this.name = name;
        this.chartType = chartType;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
    }

}
