package br.com.senior.platform.cms.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Um componente, plugável a uma página, que provê a exibição de informações através de um gráfico
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Analytic {

    /**
     * Identificador do analytics seguindo o padrão: analytic://tenantDomain/identificadorUnico
     */
    public String id;
    /**
     * Nome do analytic
     */
    public String name;
    /**
     * Título a ser exibido podendo ser uma chave de tradução no padrão platform.cms.nome
     */
    public String title;
    /**
     * Informações do gráfico do analytic, se não informado será mantido o estado anterior.
     */
    public Chart chart;
    /**
     * O tamanho preferido para melhor visualização
     */
    public PreferredSize preferredSize;
    /**
     * As tags associadas a esse analytic
     */
    public java.util.List<String> tags;
    /**
     * Propriedades adicionais do painel.
     * Quando uma propriedade é omitida, a mesma é removida.
     */
    public java.util.List<Property> properties;
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
     * @param chart - O tamanho preferido para melhor visualização
     * @param createdBy - Criado por
     * @param createdDate - Data de criação
     * 
     */
    public Analytic(String id, String name, Chart chart, String createdBy, java.util.Date createdDate) {
        this.id = id;
        this.name = name;
        this.chart = chart;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
    }

}
